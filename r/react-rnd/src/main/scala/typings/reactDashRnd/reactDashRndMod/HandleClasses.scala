package typings.reactDashRnd.reactDashRndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleClasses extends js.Object {
  var bottom: js.UndefOr[String] = js.undefined
  var bottomLeft: js.UndefOr[String] = js.undefined
  var bottomRight: js.UndefOr[String] = js.undefined
  var left: js.UndefOr[String] = js.undefined
  var right: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[String] = js.undefined
  var topLeft: js.UndefOr[String] = js.undefined
  var topRight: js.UndefOr[String] = js.undefined
}

object HandleClasses {
  @scala.inline
  def apply(
    bottom: String = null,
    bottomLeft: String = null,
    bottomRight: String = null,
    left: String = null,
    right: String = null,
    top: String = null,
    topLeft: String = null,
    topRight: String = null
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

