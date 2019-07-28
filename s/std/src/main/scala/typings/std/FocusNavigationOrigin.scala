package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusNavigationOrigin extends js.Object {
  var originHeight: js.UndefOr[Double] = js.undefined
  var originLeft: js.UndefOr[Double] = js.undefined
  var originTop: js.UndefOr[Double] = js.undefined
  var originWidth: js.UndefOr[Double] = js.undefined
}

object FocusNavigationOrigin {
  @scala.inline
  def apply(
    originHeight: Int | Double = null,
    originLeft: Int | Double = null,
    originTop: Int | Double = null,
    originWidth: Int | Double = null
  ): FocusNavigationOrigin = {
    val __obj = js.Dynamic.literal()
    if (originHeight != null) __obj.updateDynamic("originHeight")(originHeight.asInstanceOf[js.Any])
    if (originLeft != null) __obj.updateDynamic("originLeft")(originLeft.asInstanceOf[js.Any])
    if (originTop != null) __obj.updateDynamic("originTop")(originTop.asInstanceOf[js.Any])
    if (originWidth != null) __obj.updateDynamic("originWidth")(originWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNavigationOrigin]
  }
}

