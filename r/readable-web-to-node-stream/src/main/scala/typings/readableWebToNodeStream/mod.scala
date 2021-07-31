package typings.readableWebToNodeStream

import typings.readableStream.mod.Readable
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("readable-web-to-node-stream", "ReadableWebToNodeStream")
  @js.native
  class ReadableWebToNodeStream protected () extends Readable {
    /**
      *
      * @param stream Readable​Stream: https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream
      */
    def this(stream: ReadableStream[js.Any]) = this()
    
    /**
      * Implementation of readable._read(size).
      * When readable._read() is called, if data is available from the resource,
      * the implementation should begin pushing that data into the read queue
      * https://nodejs.org/api/stream.html#stream_readable_read_size_1
      */
    def _read(): js.Promise[Unit] = js.native
    
    var bytesRead: Double = js.native
    
    /**
      * Close wrapper
      */
    def close(): js.Promise[Unit] = js.native
    
    var pendingRead: js.Any = js.native
    
    /**
      * Default web API stream reader
      * https://developer.mozilla.org/en-US/docs/Web/API/ReadableStreamDefaultReader
      */
    var reader: js.Any = js.native
    
    var released: Boolean = js.native
    
    var syncAndRelease: js.Any = js.native
    
    /**
      * If there is no unresolved read call to Web-API Readable​Stream immediately returns;
      * otherwise will wait until the read is resolved.
      */
    def waitForReadToComplete(): js.Promise[Unit] = js.native
  }
}
