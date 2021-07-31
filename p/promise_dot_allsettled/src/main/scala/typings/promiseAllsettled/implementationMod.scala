package typings.promiseAllsettled

import org.scalablytyped.runtime.TopLevel
import typings.promiseAllsettled.typesMod.PromiseResult
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  @scala.inline
  def apply(): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PromiseResultTuple[T]]]
  @scala.inline
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, js.Any]]] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PromiseResult[T, js.Any]]]]
  
  @JSImport("promise.allsettled/implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type PromiseResultTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseResultTuple & TopLevel[T]
  
  type PromiseTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]> | T[P]}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseTuple & TopLevel[js.Any]
}
