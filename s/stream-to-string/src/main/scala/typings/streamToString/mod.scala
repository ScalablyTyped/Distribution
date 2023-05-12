package typings.streamToString

import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: ReadableStream): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(stream: ReadableStream, cb: Callback): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(stream: ReadableStream, enc: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(stream: ReadableStream, enc: String, cb: Callback): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], enc.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("stream-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* error */ js.UndefOr[js.Error], /* str */ String, Unit]
}
