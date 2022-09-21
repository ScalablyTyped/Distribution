package typings.streamToPromise

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: Readable): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def apply(stream: Writable): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Return a promise which resolves when the input stream ends
    * @param stream The input stream
    * @returns A promise containing the stream output as a buffer
    */
  inline def apply(stream: ReadableStream[Any]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  /**
    * Return s promise which resolves when the input stream ends
    * @param stream The input stream
    */
  inline def apply(stream: WritableStream[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("stream-to-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
