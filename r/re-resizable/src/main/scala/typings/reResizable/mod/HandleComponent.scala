package typings.reResizable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleComponent extends js.Object {
  var bottom: js.UndefOr[ReactElement] = js.undefined
  var bottomLeft: js.UndefOr[ReactElement] = js.undefined
  var bottomRight: js.UndefOr[ReactElement] = js.undefined
  var left: js.UndefOr[ReactElement] = js.undefined
  var right: js.UndefOr[ReactElement] = js.undefined
  var top: js.UndefOr[ReactElement] = js.undefined
  var topLeft: js.UndefOr[ReactElement] = js.undefined
  var topRight: js.UndefOr[ReactElement] = js.undefined
}

object HandleComponent {
  @scala.inline
  def apply(
    bottom: ReactElement = null,
    bottomLeft: ReactElement = null,
    bottomRight: ReactElement = null,
    left: ReactElement = null,
    right: ReactElement = null,
    top: ReactElement = null,
    topLeft: ReactElement = null,
    topRight: ReactElement = null
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

