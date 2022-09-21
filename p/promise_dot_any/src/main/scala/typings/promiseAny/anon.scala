package typings.promiseAny

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](iterable: js.Array[T | js.Thenable[T]]): js.Promise[T] = js.native
    def apply[T](iterable: js.Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
  }
}
