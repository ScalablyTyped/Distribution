package typings
package reactDashRndLib.reactDashRndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleStyles extends js.Object {
  var bottom: js.UndefOr[reactDashRndLib.CSSProperties] = js.undefined
  var bottomLeft: js.UndefOr[reactDashRndLib.CSSProperties] = js.undefined
  var bottomRight: js.UndefOr[reactDashRndLib.CSSProperties] = js.undefined
  var left: js.UndefOr[reactDashRndLib.CSSProperties] = js.undefined
  var right: js.UndefOr[reactDashRndLib.CSSProperties] = js.undefined
  var top: js.UndefOr[reactDashRndLib.CSSProperties] = js.undefined
  var topLeft: js.UndefOr[reactDashRndLib.CSSProperties] = js.undefined
  var topRight: js.UndefOr[reactDashRndLib.CSSProperties] = js.undefined
}

object HandleStyles {
  @scala.inline
  def apply(
    bottom: reactDashRndLib.CSSProperties = null,
    bottomLeft: reactDashRndLib.CSSProperties = null,
    bottomRight: reactDashRndLib.CSSProperties = null,
    left: reactDashRndLib.CSSProperties = null,
    right: reactDashRndLib.CSSProperties = null,
    top: reactDashRndLib.CSSProperties = null,
    topLeft: reactDashRndLib.CSSProperties = null,
    topRight: reactDashRndLib.CSSProperties = null
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

