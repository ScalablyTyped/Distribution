package typings.reResizable

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var bottom: js.UndefOr[CSSProperties] = js.undefined
  var bottomLeft: js.UndefOr[CSSProperties] = js.undefined
  var bottomRight: js.UndefOr[CSSProperties] = js.undefined
  var left: js.UndefOr[CSSProperties] = js.undefined
  var right: js.UndefOr[CSSProperties] = js.undefined
  var top: js.UndefOr[CSSProperties] = js.undefined
  var topLeft: js.UndefOr[CSSProperties] = js.undefined
  var topRight: js.UndefOr[CSSProperties] = js.undefined
}

object AnonBottom {
  @scala.inline
  def apply(
    bottom: CSSProperties = null,
    bottomLeft: CSSProperties = null,
    bottomRight: CSSProperties = null,
    left: CSSProperties = null,
    right: CSSProperties = null,
    top: CSSProperties = null,
    topLeft: CSSProperties = null,
    topRight: CSSProperties = null
  ): AnonBottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

