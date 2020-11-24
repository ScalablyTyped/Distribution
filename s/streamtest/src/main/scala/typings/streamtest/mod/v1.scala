package typings.streamtest.mod

import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streamtest", "v1")
@js.native
object v1 extends js.Object {
  
  /**
    * Create a readable stream streaming 'chunks' each after 'timeout'
    * milliseconds and then end. Useful for testing buffer based streams.
    * @param chunks The input chunks for the readable stream
    * @param timeout The timeout (in milliseconds) used to space chunks.
    * Defaults to 0.
    * @returns A new readable stream
    */
  def fromChunks(chunks: js.Array[Chunk]): Readable = js.native
  def fromChunks(chunks: js.Array[Chunk], timeout: Double): Readable = js.native
  
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
  def fromErroredChunks(err: Error, chunks: js.Array[Chunk]): Readable = js.native
  def fromErroredChunks(err: Error, chunks: js.Array[Chunk], timeout: Double): Readable = js.native
  
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
  def fromErroredObjects(err: Error, objects: js.Array[NonNull]): Readable = js.native
  def fromErroredObjects(err: Error, objects: js.Array[NonNull], timeout: Double): Readable = js.native
  
  /**
    * Create a readable stream streaming 'objects' each after 'timeout'
    * milliseconds and then end. Useful for testing objectMode based streams.
    * @param chunks The input objects for the readable stream
    * @param timeout The timeout (in milliseconds) used to space chunks.
    * Defaults to 0.
    * @returns A new readable stream
    */
  def fromObjects(objects: js.Array[NonNull]): Readable = js.native
  def fromObjects(objects: js.Array[NonNull], timeout: Double): Readable = js.native
  
  /**
    * Create a new readable stream
    * @param options The options used to create the stream
    * @returns A new readable stream
    */
  def readable(): Readable = js.native
  def readable(options: ReadableOptions): Readable = js.native
  
  /**
    * Write chunks to a stream synchronously and emit an error when done
    * @param stream The stream to write to
    * @param err The error to emit
    * @param chunks The chunks to write
    */
  def syncError(stream: Writable, err: Error, chunks: js.Array[Chunk]): Unit = js.native
  
  /**
    * Create a synchronous PassThrough stream
    * @returns A PassThrough stream
    */
  def syncReadableChunks(): PassThrough = js.native
  
  /**
    * Create a synchronous PassThrough stream in object mode
    * @returns A PassThrough stream
    */
  def syncReadableObjects(): PassThrough = js.native
  
  /**
    * Write chunks to a stream synchronously
    * @param stream The stream to write to
    * @param chunks The chunks to write
    */
  def syncWrite(stream: Writable, chunks: js.Array[Chunk]): Unit = js.native
  
  /**
    * Create a writable stream collecting written chunks and call the passed
    * callback function when it finishes.
    * @param cb The callback function. Takes an error as its first argument and
    * an array of chunks as its second
    * @returns A new writable stream
    */
  def toChunks(cb: js.Function2[/* err */ Error, /* chunks */ js.Array[Chunk], _]): Writable = js.native
  
  /**
    * Create a writable stream collecting written chunks and call the passed
    * callback function when it finishes.
    * @param cb The callback function. Takes an error as its first argument and
    * an array of objects as its second
    * @returns A new writable stream
    */
  def toObjects(cb: js.Function2[/* err */ Error, /* objects */ js.Array[NonNull], _]): Writable = js.native
  
  /**
    * Create a writable stream collecting written chunks and call the passed
    * callback function when it finishes.
    * @param cb The callback function. Takes an error as its first argument and
    * an string as its second
    * @returns A new writable stream
    */
  def toText(cb: js.Function2[/* err */ Error, /* text */ String, _]): Writable = js.native
  
  /**
    * Create a new writable stream
    * @param options The options used to create the stream
    * @returns A new writable stream
    */
  def writable(): Writable = js.native
  def writable(options: WritableOptions): Writable = js.native
}
