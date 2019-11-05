package typings.reactDashRnd.reactDashRndMod

import typings.react.reactMod.ReactElement
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
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft)
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft)
    if (topRight != null) __obj.updateDynamic("topRight")(topRight)
    __obj.asInstanceOf[HandleComponent]
  }
}

