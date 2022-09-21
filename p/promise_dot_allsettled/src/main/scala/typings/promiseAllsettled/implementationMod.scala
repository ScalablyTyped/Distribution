package typings.promiseAllsettled

import org.scalablytyped.runtime.TopLevel
import typings.promiseAllsettled.typesMod.PromiseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  inline def apply(): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.Array[Any]]]
  inline def apply[T](iterable: js.Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, Any]]] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PromiseResult[T, Any]]]]
  inline def apply[T /* <: Array[Any] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PromiseResultTuple[T]]]
  
  @JSImport("promise.allsettled/implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type PromiseResultTuple[T /* <: Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseResultTuple & TopLevel[T]
  
  type PromiseTuple[T /* <: Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]> | T[P]}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseTuple & TopLevel[Any]
}
