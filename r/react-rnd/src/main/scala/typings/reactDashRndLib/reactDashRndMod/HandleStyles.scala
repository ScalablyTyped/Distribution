package typings
package reactDashRndLib.reactDashRndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleStyles extends js.Object {
  var bottom: js.UndefOr[CSSProperties] = js.undefined
  var bottomLeft: js.UndefOr[CSSProperties] = js.undefined
  var bottomRight: js.UndefOr[CSSProperties] = js.undefined
  var left: js.UndefOr[CSSProperties] = js.undefined
  var right: js.UndefOr[CSSProperties] = js.undefined
  var top: js.UndefOr[CSSProperties] = js.undefined
  var topLeft: js.UndefOr[CSSProperties] = js.undefined
  var topRight: js.UndefOr[CSSProperties] = js.undefined
}

object HandleStyles {
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
  ): HandleStyles = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft)
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft)
    if (topRight != null) __obj.updateDynamic("topRight")(topRight)
    __obj.asInstanceOf[HandleStyles]
  }
}

