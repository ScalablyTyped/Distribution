package typings
package streamtestLib.streamtestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("streamtest", "v2")
@js.native
object v2Ns extends js.Object {
  /**
    * Create a readable stream streaming 'chunks' each after 'timeout'
    * milliseconds and then end. Useful for testing buffer based streams.
    * @param chunks The input chunks for the readable stream
    * @param timeout The timeout (in milliseconds) used to space chunks.
    * Defaults to 0.
    * @returns A new readable stream
    */
  def fromChunks(chunks: js.Array[streamtestLib.streamtestMod.Chunk]): nodeLib.streamMod.Readable = js.native
  def fromChunks(chunks: js.Array[streamtestLib.streamtestMod.Chunk], timeout: scala.Double): nodeLib.streamMod.Readable = js.native
  /**
    * Create a readable stream streaming 'chunks' each after 'timeout'
    * milliseconds, emit 'err,' and then end. Useful for testing buffer based
    * streams.
    * @param err The error to emit
    * @param chunks The input objects for the readable stream
    * @param timeout The timeout (in milliseconds) used to space chunks.
    * Defaults to 0.
    * @returns A new readable stream
    */
  def fromErroredChunks(err: stdLib.Error, chunks: js.Array[streamtestLib.streamtestMod.Chunk]): nodeLib.streamMod.Readable = js.native
  def fromErroredChunks(err: stdLib.Error, chunks: js.Array[streamtestLib.streamtestMod.Chunk], timeout: scala.Double): nodeLib.streamMod.Readable = js.native
  /**
    * Create a readable stream streaming 'objects' each after 'timeout'
    * milliseconds, emit 'err,' and then end. Useful for testing objectMode
    * based streams.
    * @param err The error to emit
    * @param chunks The input objects for the readable stream
    * @param timeout The timeout (in milliseconds) used to space chunks.
    * Defaults to 0.
    * @returns A new readable stream
    */
  def fromErroredObjects(err: stdLib.Error, objects: js.Array[streamtestLib.streamtestMod.NonNull]): nodeLib.streamMod.Readable = js.native
  def fromErroredObjects(err: stdLib.Error, objects: js.Array[streamtestLib.streamtestMod.NonNull], timeout: scala.Double): nodeLib.streamMod.Readable = js.native
  /**
    * Create a readable stream streaming 'objects' each after 'timeout'
    * milliseconds and then end. Useful for testing objectMode based streams.
    * @param chunks The input objects for the readable stream
    * @param timeout The timeout (in milliseconds) used to space chunks.
    * Defaults to 0.
    * @returns A new readable stream
    */
  def fromObjects(objects: js.Array[streamtestLib.streamtestMod.NonNull]): nodeLib.streamMod.Readable = js.native
  def fromObjects(objects: js.Array[streamtestLib.streamtestMod.NonNull], timeout: scala.Double): nodeLib.streamMod.Readable = js.native
  /**
    * Create a new readable stream
    * @param options The options used to create the stream
    * @returns A new readable stream
    */
  def readable(): nodeLib.streamMod.Readable = js.native
  def readable(options: nodeLib.streamMod.internalNs.ReadableOptions): nodeLib.streamMod.Readable = js.native
  /**
    * Write chunks to a stream synchronously and emit an error when done
    * @param stream The stream to write to
    * @param err The error to emit
    * @param chunks The chunks to write
    */
  def syncError(
    stream: nodeLib.streamMod.Writable,
    err: stdLib.Error,
    chunks: js.Array[streamtestLib.streamtestMod.Chunk]
  ): scala.Unit = js.native
  /**
    * Create a synchronous PassThrough stream
    * @returns A PassThrough stream
    */
  def syncReadableChunks(): nodeLib.streamMod.PassThrough = js.native
  /**
    * Create a synchronous PassThrough stream in object mode
    * @returns A PassThrough stream
    */
  def syncReadableObjects(): nodeLib.streamMod.PassThrough = js.native
  /**
    * Write chunks to a stream synchronously
    * @param stream The stream to write to
    * @param chunks The chunks to write
    */
  def syncWrite(stream: nodeLib.streamMod.Writable, chunks: js.Array[streamtestLib.streamtestMod.Chunk]): scala.Unit = js.native
  /**
    * Create a writable stream collecting written chunks and call the passed
    * callback function when it finishes.
    * @param cb The callback function. Takes an error as its first argument and
    * an array of chunks as its second
    * @returns A new writable stream
    */
  def toChunks(
    cb: js.Function2[/* err */ stdLib.Error, /* chunks */ js.Array[streamtestLib.streamtestMod.Chunk], _]
  ): nodeLib.streamMod.Writable = js.native
  /**
    * Create a writable stream collecting written chunks and call the passed
    * callback function when it finishes.
    * @param cb The callback function. Takes an error as its first argument and
    * an array of objects as its second
    * @returns A new writable stream
    */
  def toObjects(
    cb: js.Function2[
      /* err */ stdLib.Error, 
      /* objects */ js.Array[streamtestLib.streamtestMod.NonNull], 
      _
    ]
  ): nodeLib.streamMod.Writable = js.native
  /**
    * Create a writable stream collecting written chunks and call the passed
    * callback function when it finishes.
    * @param cb The callback function. Takes an error as its first argument and
    * an string as its second
    * @returns A new writable stream
    */
  def toText(cb: js.Function2[/* err */ stdLib.Error, /* text */ java.lang.String, _]): nodeLib.streamMod.Writable = js.native
  /**
    * Create a new writable stream
    * @param options The options used to create the stream
    * @returns A new writable stream
    */
  def writable(): nodeLib.streamMod.Writable = js.native
  def writable(options: nodeLib.streamMod.internalNs.WritableOptions): nodeLib.streamMod.Writable = js.native
}

