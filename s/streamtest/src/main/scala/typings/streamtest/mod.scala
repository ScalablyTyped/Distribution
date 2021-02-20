package typings.streamtest

import typings.node.Buffer
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object v1 {
    
    /**
      * Create a readable stream streaming 'chunks' each after 'timeout'
      * milliseconds and then end. Useful for testing buffer based streams.
      * @param chunks The input chunks for the readable stream
      * @param timeout The timeout (in milliseconds) used to space chunks.
      * Defaults to 0.
      * @returns A new readable stream
      */
    @JSImport("streamtest", "v1.fromChunks")
    @js.native
    def fromChunks(chunks: js.Array[Chunk]): Readable = js.native
    @JSImport("streamtest", "v1.fromChunks")
    @js.native
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
    @JSImport("streamtest", "v1.fromErroredChunks")
    @js.native
    def fromErroredChunks(err: Error, chunks: js.Array[Chunk]): Readable = js.native
    @JSImport("streamtest", "v1.fromErroredChunks")
    @js.native
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
    @JSImport("streamtest", "v1.fromErroredObjects")
    @js.native
    def fromErroredObjects(err: Error, objects: js.Array[NonNull]): Readable = js.native
    @JSImport("streamtest", "v1.fromErroredObjects")
    @js.native
    def fromErroredObjects(err: Error, objects: js.Array[NonNull], timeout: Double): Readable = js.native
    
    /**
      * Create a readable stream streaming 'objects' each after 'timeout'
      * milliseconds and then end. Useful for testing objectMode based streams.
      * @param chunks The input objects for the readable stream
      * @param timeout The timeout (in milliseconds) used to space chunks.
      * Defaults to 0.
      * @returns A new readable stream
      */
    @JSImport("streamtest", "v1.fromObjects")
    @js.native
    def fromObjects(objects: js.Array[NonNull]): Readable = js.native
    @JSImport("streamtest", "v1.fromObjects")
    @js.native
    def fromObjects(objects: js.Array[NonNull], timeout: Double): Readable = js.native
    
    /**
      * Create a new readable stream
      * @param options The options used to create the stream
      * @returns A new readable stream
      */
    @JSImport("streamtest", "v1.readable")
    @js.native
    def readable(): Readable = js.native
    @JSImport("streamtest", "v1.readable")
    @js.native
    def readable(options: ReadableOptions): Readable = js.native
    
    /**
      * Write chunks to a stream synchronously and emit an error when done
      * @param stream The stream to write to
      * @param err The error to emit
      * @param chunks The chunks to write
      */
    @JSImport("streamtest", "v1.syncError")
    @js.native
    def syncError(stream: Writable, err: Error, chunks: js.Array[Chunk]): Unit = js.native
    
    /**
      * Create a synchronous PassThrough stream
      * @returns A PassThrough stream
      */
    @JSImport("streamtest", "v1.syncReadableChunks")
    @js.native
    def syncReadableChunks(): PassThrough = js.native
    
    /**
      * Create a synchronous PassThrough stream in object mode
      * @returns A PassThrough stream
      */
    @JSImport("streamtest", "v1.syncReadableObjects")
    @js.native
    def syncReadableObjects(): PassThrough = js.native
    
    /**
      * Write chunks to a stream synchronously
      * @param stream The stream to write to
      * @param chunks The chunks to write
      */
    @JSImport("streamtest", "v1.syncWrite")
    @js.native
    def syncWrite(stream: Writable, chunks: js.Array[Chunk]): Unit = js.native
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an array of chunks as its second
      * @returns A new writable stream
      */
    @JSImport("streamtest", "v1.toChunks")
    @js.native
    def toChunks(cb: js.Function2[/* err */ Error, /* chunks */ js.Array[Chunk], _]): Writable = js.native
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an array of objects as its second
      * @returns A new writable stream
      */
    @JSImport("streamtest", "v1.toObjects")
    @js.native
    def toObjects(cb: js.Function2[/* err */ Error, /* objects */ js.Array[NonNull], _]): Writable = js.native
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an string as its second
      * @returns A new writable stream
      */
    @JSImport("streamtest", "v1.toText")
    @js.native
    def toText(cb: js.Function2[/* err */ Error, /* text */ String, _]): Writable = js.native
    
    /**
      * Create a new writable stream
      * @param options The options used to create the stream
      * @returns A new writable stream
      */
    @JSImport("streamtest", "v1.writable")
    @js.native
    def writable(): Writable = js.native
    @JSImport("streamtest", "v1.writable")
    @js.native
    def writable(options: WritableOptions): Writable = js.native
  }
  
  object v2 {
    
    /**
      * Create a readable stream streaming 'chunks' each after 'timeout'
      * milliseconds and then end. Useful for testing buffer based streams.
      * @param chunks The input chunks for the readable stream
      * @param timeout The timeout (in milliseconds) used to space chunks.
      * Defaults to 0.
      * @returns A new readable stream
      */
    @JSImport("streamtest", "v2.fromChunks")
    @js.native
    def fromChunks(chunks: js.Array[Chunk]): Readable = js.native
    @JSImport("streamtest", "v2.fromChunks")
    @js.native
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
    @JSImport("streamtest", "v2.fromErroredChunks")
    @js.native
    def fromErroredChunks(err: Error, chunks: js.Array[Chunk]): Readable = js.native
    @JSImport("streamtest", "v2.fromErroredChunks")
    @js.native
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
    @JSImport("streamtest", "v2.fromErroredObjects")
    @js.native
    def fromErroredObjects(err: Error, objects: js.Array[NonNull]): Readable = js.native
    @JSImport("streamtest", "v2.fromErroredObjects")
    @js.native
    def fromErroredObjects(err: Error, objects: js.Array[NonNull], timeout: Double): Readable = js.native
    
    /**
      * Create a readable stream streaming 'objects' each after 'timeout'
      * milliseconds and then end. Useful for testing objectMode based streams.
      * @param chunks The input objects for the readable stream
      * @param timeout The timeout (in milliseconds) used to space chunks.
      * Defaults to 0.
      * @returns A new readable stream
      */
    @JSImport("streamtest", "v2.fromObjects")
    @js.native
    def fromObjects(objects: js.Array[NonNull]): Readable = js.native
    @JSImport("streamtest", "v2.fromObjects")
    @js.native
    def fromObjects(objects: js.Array[NonNull], timeout: Double): Readable = js.native
    
    /**
      * Create a new readable stream
      * @param options The options used to create the stream
      * @returns A new readable stream
      */
    @JSImport("streamtest", "v2.readable")
    @js.native
    def readable(): Readable = js.native
    @JSImport("streamtest", "v2.readable")
    @js.native
    def readable(options: ReadableOptions): Readable = js.native
    
    /**
      * Write chunks to a stream synchronously and emit an error when done
      * @param stream The stream to write to
      * @param err The error to emit
      * @param chunks The chunks to write
      */
    @JSImport("streamtest", "v2.syncError")
    @js.native
    def syncError(stream: Writable, err: Error, chunks: js.Array[Chunk]): Unit = js.native
    
    /**
      * Create a synchronous PassThrough stream
      * @returns A PassThrough stream
      */
    @JSImport("streamtest", "v2.syncReadableChunks")
    @js.native
    def syncReadableChunks(): PassThrough = js.native
    
    /**
      * Create a synchronous PassThrough stream in object mode
      * @returns A PassThrough stream
      */
    @JSImport("streamtest", "v2.syncReadableObjects")
    @js.native
    def syncReadableObjects(): PassThrough = js.native
    
    /**
      * Write chunks to a stream synchronously
      * @param stream The stream to write to
      * @param chunks The chunks to write
      */
    @JSImport("streamtest", "v2.syncWrite")
    @js.native
    def syncWrite(stream: Writable, chunks: js.Array[Chunk]): Unit = js.native
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an array of chunks as its second
      * @returns A new writable stream
      */
    @JSImport("streamtest", "v2.toChunks")
    @js.native
    def toChunks(cb: js.Function2[/* err */ Error, /* chunks */ js.Array[Chunk], _]): Writable = js.native
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an array of objects as its second
      * @returns A new writable stream
      */
    @JSImport("streamtest", "v2.toObjects")
    @js.native
    def toObjects(cb: js.Function2[/* err */ Error, /* objects */ js.Array[NonNull], _]): Writable = js.native
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an string as its second
      * @returns A new writable stream
      */
    @JSImport("streamtest", "v2.toText")
    @js.native
    def toText(cb: js.Function2[/* err */ Error, /* text */ String, _]): Writable = js.native
    
    /**
      * Create a new writable stream
      * @param options The options used to create the stream
      * @returns A new writable stream
      */
    @JSImport("streamtest", "v2.writable")
    @js.native
    def writable(): Writable = js.native
    @JSImport("streamtest", "v2.writable")
    @js.native
    def writable(options: WritableOptions): Writable = js.native
  }
  
  @JSImport("streamtest", "versions")
  @js.native
  val versions: js.Array[VersionName] = js.native
  
  type Chunk = String | Buffer | Uint8Array
  
  type NonNull = js.UndefOr[js.Object]
  
  /* Rewritten from type alias, can be one of: 
    - typings.streamtest.streamtestStrings.v1
    - typings.streamtest.streamtestStrings.v2
  */
  trait VersionName extends StObject
  object VersionName {
    
    @scala.inline
    def v1: typings.streamtest.streamtestStrings.v1 = "v1".asInstanceOf[typings.streamtest.streamtestStrings.v1]
    
    @scala.inline
    def v2: typings.streamtest.streamtestStrings.v2 = "v2".asInstanceOf[typings.streamtest.streamtestStrings.v2]
  }
}
