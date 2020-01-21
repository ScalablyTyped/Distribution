package typings.reduxActionUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-action-utils", "actionCreator")
@js.native
object actionCreator extends js.Object {
  def apply[T](`type`: String, props: String*): ActionCreator_[T] = js.native
  def apply[T](`type`: String, props: js.Array[String]): ActionCreator_[T] = js.native
}

