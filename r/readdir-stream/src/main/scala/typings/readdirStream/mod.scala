package typings.readdirStream

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dir: String): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
  
  @JSImport("readdir-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
