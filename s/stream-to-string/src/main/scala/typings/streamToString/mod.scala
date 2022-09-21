package typings.streamToString

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: ReadableStream[Any]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("stream-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
