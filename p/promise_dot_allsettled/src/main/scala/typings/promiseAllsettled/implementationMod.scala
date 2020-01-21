package typings.promiseAllsettled

import typings.promiseAllsettled.typesMod.PromiseResult
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise.allsettled/implementation", JSImport.Namespace)
@js.native
object implementationMod extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: PromiseTuple[T]): js.Promise[PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[PromiseResult[T, _]]] = js.native
  type PromiseResultTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseResultTuple with T
  type PromiseTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]> | T[P]}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseTuple with js.Any
}

