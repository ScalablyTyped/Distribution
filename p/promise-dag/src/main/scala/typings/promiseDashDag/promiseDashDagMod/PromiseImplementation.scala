package typings.promiseDashDag.promiseDashDagMod

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
  def apply[P /* <: js.Thenable[_] */](all: js.Array[_] => P, reject: js.Any => P, resolve: js.Any => P): PromiseImplementation[P] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[PromiseImplementation[P]]
  }
}

