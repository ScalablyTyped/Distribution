package typings
package reactourLib.reactourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement]
}

object ArrowProps {
  @scala.inline
  def apply(
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLButtonElement],
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNode = null
  ): ArrowProps = {
    val __obj = js.Dynamic.literal(onClick = onClick)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowProps]
  }
}

