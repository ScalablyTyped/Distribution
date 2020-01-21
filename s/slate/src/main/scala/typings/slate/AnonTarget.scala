package typings.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var target: js.UndefOr[Double] = js.undefined
}

object AnonTarget {
  @scala.inline
  def apply(target: Int | Double = null): AnonTarget = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTarget]
  }
}

