package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.CSSProperties
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  @JSName("children")
  val children_ButtonProps: js.UndefOr[js.Any] = js.undefined
  val secondary: js.UndefOr[Boolean] = js.undefined
  val size: js.UndefOr[ButtonSize] = js.undefined
  val text: js.UndefOr[String] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: ButtonHTMLAttributes[HTMLButtonElement] = null,
    children: js.Any = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    size: ButtonSize = null,
    style: CSSProperties = null,
    text: String = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    if (children != null) __obj.updateDynamic("children")(children)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ButtonProps]
  }
}

