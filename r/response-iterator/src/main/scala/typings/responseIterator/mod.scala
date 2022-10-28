package typings.responseIterator

import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("response-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](response: Any): AsyncIterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(response.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[T]]
}
