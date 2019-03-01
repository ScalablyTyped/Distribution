package typings
package reactDashRndLib.reactDashRndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleClasses extends js.Object {
  var bottom: js.UndefOr[java.lang.String] = js.undefined
  var bottomLeft: js.UndefOr[java.lang.String] = js.undefined
  var bottomRight: js.UndefOr[java.lang.String] = js.undefined
  var left: js.UndefOr[java.lang.String] = js.undefined
  var right: js.UndefOr[java.lang.String] = js.undefined
  var top: js.UndefOr[java.lang.String] = js.undefined
  var topLeft: js.UndefOr[java.lang.String] = js.undefined
  var topRight: js.UndefOr[java.lang.String] = js.undefined
}

object HandleClasses {
  @scala.inline
  def apply(
    bottom: java.lang.String = null,
    bottomLeft: java.lang.String = null,
    bottomRight: java.lang.String = null,
    left: java.lang.String = null,
    right: java.lang.String = null,
    top: java.lang.String = null,
    topLeft: java.lang.String = null,
    topRight: java.lang.String = null
  ): HandleClasses = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft)
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft)
    if (topRight != null) __obj.updateDynamic("topRight")(topRight)
    __obj.asInstanceOf[HandleClasses]
  }
}

