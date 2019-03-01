package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusNavigationOrigin extends js.Object {
  var originHeight: js.UndefOr[scala.Double] = js.undefined
  var originLeft: js.UndefOr[scala.Double] = js.undefined
  var originTop: js.UndefOr[scala.Double] = js.undefined
  var originWidth: js.UndefOr[scala.Double] = js.undefined
}

object FocusNavigationOrigin {
  @scala.inline
  def apply(
    originHeight: scala.Int | scala.Double = null,
    originLeft: scala.Int | scala.Double = null,
    originTop: scala.Int | scala.Double = null,
    originWidth: scala.Int | scala.Double = null
  ): FocusNavigationOrigin = {
    val __obj = js.Dynamic.literal()
    if (originHeight != null) __obj.updateDynamic("originHeight")(originHeight.asInstanceOf[js.Any])
    if (originLeft != null) __obj.updateDynamic("originLeft")(originLeft.asInstanceOf[js.Any])
    if (originTop != null) __obj.updateDynamic("originTop")(originTop.asInstanceOf[js.Any])
    if (originWidth != null) __obj.updateDynamic("originWidth")(originWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNavigationOrigin]
  }
}

