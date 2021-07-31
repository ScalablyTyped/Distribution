package typings.promiseAllsettled

import typings.promiseAllsettled.implementationMod.PromiseResultTuple
import typings.promiseAllsettled.implementationMod.PromiseTuple
import typings.promiseAllsettled.typesMod.PromiseResult
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Promise[js.Array[js.Any]] = js.native
    def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
    def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, js.Any]]] = js.native
  }
}
