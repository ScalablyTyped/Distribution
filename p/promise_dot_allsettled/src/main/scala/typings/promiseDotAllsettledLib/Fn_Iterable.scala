package typings
package promiseDotAllsettledLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Iterable extends js.Object {
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: js.Array[_] */](iterable: promiseDotAllsettledLib.implementationMod.PromiseTuple[T]): js.Promise[promiseDotAllsettledLib.implementationMod.PromiseResultTuple[T]] = js.native
  def apply[T](iterable: stdLib.Iterable[T]): js.Promise[js.Array[T]] = js.native
}

