package typings.responseIterator

import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPromiseMod {
  
  @JSImport("response-iterator/dist/types/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](promise: Any): AsyncIterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[T]]
}
