package typings
package promiseDashDagLib.promiseDashDagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PromiseImplementation[P /* <: stdLib.PromiseLike[_] */] extends js.Object {
  def all(values: js.Array[_]): P
  def reject(value: js.Any): P
  def resolve(value: js.Any): P
}

