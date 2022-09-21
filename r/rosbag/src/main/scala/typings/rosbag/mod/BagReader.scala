package typings.rosbag.mod

import typings.node.bufferMod.global.Buffer
import typings.rosbag.anon.ChunkInfos
import typings.rosbag.anon.Opcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BagReader is a lower level interface for reading specific sections & chunks
  * from a rosbag file - generally it is consumed through the Bag class, but
  * can be useful to use directly for efficiently accessing raw pieces from
  * within the bag
  */
@JSImport("rosbag", "BagReader")
@js.native
open class BagReader protected () extends StObject {
  def this(filelike: Filelike) = this()
  
  var _file: Filelike = js.native
  
  var _lastChunkInfo: js.UndefOr[ChunkInfo] = js.native
  
  var _lastReadResult: ChunkReadResult = js.native
  
  /**
    * Reads a single chunk record && its index records given a chunkInfo
    * @param chunkInfo
    * @param decompress
    * @param callback
    */
  def readChunk(chunkInfo: ChunkInfo, decompress: Decompress, callback: Callback[ChunkReadResult]): Unit = js.native
  
  def readChunkMessages(
    chunkInfo: ChunkInfo,
    connections: js.Array[Double],
    startTime: Null,
    endTime: Null,
    decompress: Decompress,
    callback: Callback[js.Array[MessageData]]
  ): Unit = js.native
  def readChunkMessages(
    chunkInfo: ChunkInfo,
    connections: js.Array[Double],
    startTime: Null,
    endTime: Time,
    decompress: Decompress,
    callback: Callback[js.Array[MessageData]]
  ): Unit = js.native
  def readChunkMessages(
    chunkInfo: ChunkInfo,
    connections: js.Array[Double],
    startTime: Time,
    endTime: Null,
    decompress: Decompress,
    callback: Callback[js.Array[MessageData]]
  ): Unit = js.native
  /**
    * read individual raw messages from the bag at a given chunk
    * filters to a specific set of connection ids, start time, & end time
    * generally the records will be of type MessageData
    * @param chunkInfo
    * @param connections
    * @param startTime
    * @param endTime
    * @param decompress
    * @param callback
    */
  def readChunkMessages(
    chunkInfo: ChunkInfo,
    connections: js.Array[Double],
    startTime: Time,
    endTime: Time,
    decompress: Decompress,
    callback: Callback[js.Array[MessageData]]
  ): Unit = js.native
  
  /**
    * Promisified version of readChunkMessages
    * @param chunkInfo
    * @param connections
    * @param startTime
    * @param endTime
    * @param decompress
    */
  def readChunkMessagesAsync(
    chunkInfo: ChunkInfo,
    connections: js.Array[Double],
    startTime: Time,
    endTime: Time,
    decompress: Decompress
  ): js.Promise[js.Array[MessageData]] = js.native
  
  /**
    * reads connection and chunk information from the bag
    * you'll generally call this after reading the header so you can get
    * connection metadata and chunkInfos which allow you to seek to individual
    * chunks & read them
    * @param fileOffset
    * @param connectionCount
    * @param chunkCount
    * @param callback
    */
  def readConnectionsAndChunkInfo(fileOffset: Double, connectionCount: Double, chunkCount: Double, callback: Callback[ChunkInfos]): Unit = js.native
  
  /**
    * Promisified version of readConnectionsAndChunkInfo
    * @param fileOffset
    * @param connectionCount
    * @param chunkCount
    */
  def readConnectionsAndChunkInfoAsync(fileOffset: Double, connectionCount: Double, chunkCount: Double): js.Promise[ChunkInfos] = js.native
  
  /**
    * reads the header block from the rosbag file
    * generally you call this first
    * because you need the header information to call readConnectionsAndChunkInfo
    * @param callback
    */
  def readHeader(callback: Callback[BagHeader]): Unit = js.native
  
  /**
    * Promisified version of readHeader
    */
  def readHeaderAsync(): js.Promise[BagHeader] = js.native
  
  /**
    * Reads an individual record from a buffer
    * @param buffer
    * @param fileOffset
    * @param cls
    */
  def readRecordFromBuffer[T /* <: Record */](buffer: Buffer, fileOffset: Double, cls: T & Opcode): T = js.native
  
  /**
    * Reads count records from a buffer starting at fileOffset
    * @param buffer
    * @param count
    * @param fileOffset
    * @param cls
    */
  def readRecordsFromBuffer[T /* <: Record */](buffer: Buffer, count: Double, fileOffset: Double, cls: T & Opcode): js.Array[T] = js.native
  
  def verifyBagHeader(callback: Callback[BagHeader], next: js.Function0[Unit]): Unit = js.native
}
