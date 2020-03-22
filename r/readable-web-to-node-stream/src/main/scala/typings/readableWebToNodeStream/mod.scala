package typings.readableWebToNodeStream

import typings.node.streamMod.Readable
import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readable-web-to-node-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ReadableWebToNodeStream protected () extends Readable {
    /**
      *
      * @param stream Readable​Stream: https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream
      */
    def this(stream: ReadableStream[_]) = this()
    var bytesRead: Double = js.native
    var pendingRead: js.Any = js.native
    /**
      * Default web API stream reader
      * https://developer.mozilla.org/en-US/docs/Web/API/ReadableStreamDefaultReader
      */
    var reader: js.Any = js.native
    var released: Boolean = js.native
    var syncAndRelease: js.Any = js.native
    /**
      * Implementation of readable._read(size).
      * When readable._read() is called, if data is available from the resource,
      * the implementation should begin pushing that data into the read queue
      * https://nodejs.org/api/stream.html#stream_readable_read_size_1
      */
    def _read(): js.Promise[Unit] = js.native
    /**
      * Close wrapper
      */
    def close(): js.Promise[Unit] = js.native
    /**
      * If there is no unresolved read call to Web-API Readable​Stream immediately returns;
      * otherwise will wait until the read is resolved.
      */
    def waitForReadToComplete(): js.Promise[Unit] = js.native
  }
  
}

