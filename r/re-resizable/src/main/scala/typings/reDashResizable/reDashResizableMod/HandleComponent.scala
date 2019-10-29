package typings.reDashResizable.reDashResizableMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleComponent extends js.Object {
  var bottom: js.UndefOr[ReactNode] = js.undefined
  var bottomLeft: js.UndefOr[ReactNode] = js.undefined
  var bottomRight: js.UndefOr[ReactNode] = js.undefined
  var left: js.UndefOr[ReactNode] = js.undefined
  var right: js.UndefOr[ReactNode] = js.undefined
  var top: js.UndefOr[ReactNode] = js.undefined
  var topLeft: js.UndefOr[ReactNode] = js.undefined
  var topRight: js.UndefOr[ReactNode] = js.undefined
}

object HandleComponent {
  @scala.inline
  def apply(
    bottom: ReactNode = null,
    bottomLeft: ReactNode = null,
    bottomRight: ReactNode = null,
    left: ReactNode = null,
    right: ReactNode = null,
    top: ReactNode = null,
    topLeft: ReactNode = null,
    topRight: ReactNode = null
  ): HandleComponent = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleComponent]
  }
}

