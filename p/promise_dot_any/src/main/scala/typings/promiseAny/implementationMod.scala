package typings.promiseAny

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  inline def apply[T](iterable: js.Array[T | js.Thenable[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def apply[T](iterable: js.Iterable[T | js.Thenable[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  @JSImport("promise.any/implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
