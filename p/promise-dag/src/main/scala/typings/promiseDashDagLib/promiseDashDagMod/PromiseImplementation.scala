package typings
package promiseDashDagLib.promiseDashDagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseImplementation[P /* <: js.Thenable[_] */] extends js.Object {
  def all(values: js.Array[_]): P
  def reject(value: js.Any): P
  def resolve(value: js.Any): P
}

object PromiseImplementation {
  @scala.inline
  def apply[P /* <: js.Thenable[_] */](
    all: js.Function1[js.Array[_], P],
    reject: js.Function1[js.Any, P],
    resolve: js.Function1[js.Any, P]
  ): PromiseImplementation[P] = {
    val __obj = js.Dynamic.literal(all = all, reject = reject, resolve = resolve)
  
    __obj.asInstanceOf[PromiseImplementation[P]]
  }
}

