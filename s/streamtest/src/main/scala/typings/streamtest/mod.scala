package typings.streamtest

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object v1 {
    
    @JSImport("streamtest", "v1")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a readable stream streaming 'chunks' each after 'timeout'
      * milliseconds and then end. Useful for testing buffer based streams.
      * @param chunks The input chunks for the readable stream
      * @param timeout The timeout (in milliseconds) used to space chunks.
      * Defaults to 0.
      * @returns A new readable stream
      */
    inline def fromChunks(chunks: js.Array[Chunk]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromChunks")(chunks.asInstanceOf[js.Any]).asInstanceOf[Readable]
    inline def fromChunks(chunks: js.Array[Chunk], timeout: Double): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromChunks")(chunks.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
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
    inline def fromErroredChunks(err: js.Error, chunks: js.Array[Chunk]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromErroredChunks")(err.asInstanceOf[js.Any], chunks.asInstanceOf[js.Any])).asInstanceOf[Readable]
    inline def fromErroredChunks(err: js.Error, chunks: js.Array[Chunk], timeout: Double): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromErroredChunks")(err.asInstanceOf[js.Any], chunks.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
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
    inline def fromErroredObjects(err: js.Error, objects: js.Array[NonNull]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromErroredObjects")(err.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[Readable]
    inline def fromErroredObjects(err: js.Error, objects: js.Array[NonNull], timeout: Double): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromErroredObjects")(err.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
    /**
      * Create a readable stream streaming 'objects' each after 'timeout'
      * milliseconds and then end. Useful for testing objectMode based streams.
      * @param chunks The input objects for the readable stream
      * @param timeout The timeout (in milliseconds) used to space chunks.
      * Defaults to 0.
      * @returns A new readable stream
      */
    inline def fromObjects(objects: js.Array[NonNull]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObjects")(objects.asInstanceOf[js.Any]).asInstanceOf[Readable]
    inline def fromObjects(objects: js.Array[NonNull], timeout: Double): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObjects")(objects.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
    /**
      * Create a new readable stream
      * @param options The options used to create the stream
      * @returns A new readable stream
      */
    inline def readable(): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")().asInstanceOf[Readable]
    inline def readable(options: ReadableOptions): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")(options.asInstanceOf[js.Any]).asInstanceOf[Readable]
    
    /**
      * Write chunks to a stream synchronously and emit an error when done
      * @param stream The stream to write to
      * @param err The error to emit
      * @param chunks The chunks to write
      */
    inline def syncError(stream: Writable, err: js.Error, chunks: js.Array[Chunk]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncError")(stream.asInstanceOf[js.Any], err.asInstanceOf[js.Any], chunks.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Create a synchronous PassThrough stream
      * @returns A PassThrough stream
      */
    inline def syncReadableChunks(): PassThrough = ^.asInstanceOf[js.Dynamic].applyDynamic("syncReadableChunks")().asInstanceOf[PassThrough]
    
    /**
      * Create a synchronous PassThrough stream in object mode
      * @returns A PassThrough stream
      */
    inline def syncReadableObjects(): PassThrough = ^.asInstanceOf[js.Dynamic].applyDynamic("syncReadableObjects")().asInstanceOf[PassThrough]
    
    /**
      * Write chunks to a stream synchronously
      * @param stream The stream to write to
      * @param chunks The chunks to write
      */
    inline def syncWrite(stream: Writable, chunks: js.Array[Chunk]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncWrite")(stream.asInstanceOf[js.Any], chunks.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an array of chunks as its second
      * @returns A new writable stream
      */
    inline def toChunks(cb: js.Function2[/* err */ js.Error, /* chunks */ js.Array[Chunk], Any]): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("toChunks")(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an array of objects as its second
      * @returns A new writable stream
      */
    inline def toObjects(cb: js.Function2[/* err */ js.Error, /* objects */ js.Array[NonNull], Any]): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("toObjects")(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an string as its second
      * @returns A new writable stream
      */
    inline def toText(cb: js.Function2[/* err */ js.Error, /* text */ String, Any]): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("toText")(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
    
    /**
      * Create a new writable stream
      * @param options The options used to create the stream
      * @returns A new writable stream
      */
    inline def writable(): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")().asInstanceOf[Writable]
    inline def writable(options: WritableOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
  }
  
  object v2 {
    
    @JSImport("streamtest", "v2")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a readable stream streaming 'chunks' each after 'timeout'
      * milliseconds and then end. Useful for testing buffer based streams.
      * @param chunks The input chunks for the readable stream
      * @param timeout The timeout (in milliseconds) used to space chunks.
      * Defaults to 0.
      * @returns A new readable stream
      */
    inline def fromChunks(chunks: js.Array[Chunk]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromChunks")(chunks.asInstanceOf[js.Any]).asInstanceOf[Readable]
    inline def fromChunks(chunks: js.Array[Chunk], timeout: Double): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromChunks")(chunks.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
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
    inline def fromErroredChunks(err: js.Error, chunks: js.Array[Chunk]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromErroredChunks")(err.asInstanceOf[js.Any], chunks.asInstanceOf[js.Any])).asInstanceOf[Readable]
    inline def fromErroredChunks(err: js.Error, chunks: js.Array[Chunk], timeout: Double): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromErroredChunks")(err.asInstanceOf[js.Any], chunks.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
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
    inline def fromErroredObjects(err: js.Error, objects: js.Array[NonNull]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromErroredObjects")(err.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[Readable]
    inline def fromErroredObjects(err: js.Error, objects: js.Array[NonNull], timeout: Double): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromErroredObjects")(err.asInstanceOf[js.Any], objects.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
    /**
      * Create a readable stream streaming 'objects' each after 'timeout'
      * milliseconds and then end. Useful for testing objectMode based streams.
      * @param chunks The input objects for the readable stream
      * @param timeout The timeout (in milliseconds) used to space chunks.
      * Defaults to 0.
      * @returns A new readable stream
      */
    inline def fromObjects(objects: js.Array[NonNull]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObjects")(objects.asInstanceOf[js.Any]).asInstanceOf[Readable]
    inline def fromObjects(objects: js.Array[NonNull], timeout: Double): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObjects")(objects.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
    /**
      * Create a new readable stream
      * @param options The options used to create the stream
      * @returns A new readable stream
      */
    inline def readable(): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")().asInstanceOf[Readable]
    inline def readable(options: ReadableOptions): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")(options.asInstanceOf[js.Any]).asInstanceOf[Readable]
    
    /**
      * Write chunks to a stream synchronously and emit an error when done
      * @param stream The stream to write to
      * @param err The error to emit
      * @param chunks The chunks to write
      */
    inline def syncError(stream: Writable, err: js.Error, chunks: js.Array[Chunk]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncError")(stream.asInstanceOf[js.Any], err.asInstanceOf[js.Any], chunks.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Create a synchronous PassThrough stream
      * @returns A PassThrough stream
      */
    inline def syncReadableChunks(): PassThrough = ^.asInstanceOf[js.Dynamic].applyDynamic("syncReadableChunks")().asInstanceOf[PassThrough]
    
    /**
      * Create a synchronous PassThrough stream in object mode
      * @returns A PassThrough stream
      */
    inline def syncReadableObjects(): PassThrough = ^.asInstanceOf[js.Dynamic].applyDynamic("syncReadableObjects")().asInstanceOf[PassThrough]
    
    /**
      * Write chunks to a stream synchronously
      * @param stream The stream to write to
      * @param chunks The chunks to write
      */
    inline def syncWrite(stream: Writable, chunks: js.Array[Chunk]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncWrite")(stream.asInstanceOf[js.Any], chunks.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an array of chunks as its second
      * @returns A new writable stream
      */
    inline def toChunks(cb: js.Function2[/* err */ js.Error, /* chunks */ js.Array[Chunk], Any]): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("toChunks")(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an array of objects as its second
      * @returns A new writable stream
      */
    inline def toObjects(cb: js.Function2[/* err */ js.Error, /* objects */ js.Array[NonNull], Any]): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("toObjects")(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
    
    /**
      * Create a writable stream collecting written chunks and call the passed
      * callback function when it finishes.
      * @param cb The callback function. Takes an error as its first argument and
      * an string as its second
      * @returns A new writable stream
      */
    inline def toText(cb: js.Function2[/* err */ js.Error, /* text */ String, Any]): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("toText")(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
    
    /**
      * Create a new writable stream
      * @param options The options used to create the stream
      * @returns A new writable stream
      */
    inline def writable(): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")().asInstanceOf[Writable]
    inline def writable(options: WritableOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
  }
  
  @JSImport("streamtest", "versions")
  @js.native
  val versions: js.Array[VersionName] = js.native
  
  type Chunk = String | Buffer | js.typedarray.Uint8Array
  
  type NonNull = js.UndefOr[js.Object]
  
  /* Rewritten from type alias, can be one of: 
    - typings.streamtest.streamtestStrings.v1
    - typings.streamtest.streamtestStrings.v2
  */
  trait VersionName extends StObject
  object VersionName {
    
    inline def v1: typings.streamtest.streamtestStrings.v1 = "v1".asInstanceOf[typings.streamtest.streamtestStrings.v1]
    
    inline def v2: typings.streamtest.streamtestStrings.v2 = "v2".asInstanceOf[typings.streamtest.streamtestStrings.v2]
  }
}
