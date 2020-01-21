package typings.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var left: js.UndefOr[AnonMax] = js.undefined
  var right: js.UndefOr[AnonMax] = js.undefined
}

object AnonLeft {
  @scala.inline
  def apply(left: AnonMax = null, right: AnonMax = null): AnonLeft = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

