package typings.pulumiPulumi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDone[T] extends js.Object {
  var done: Boolean
  var value: js.UndefOr[T] = js.undefined
}

object AnonDone {
  @scala.inline
  def apply[T](done: Boolean, value: T = null): AnonDone[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDone[T]]
  }
}

