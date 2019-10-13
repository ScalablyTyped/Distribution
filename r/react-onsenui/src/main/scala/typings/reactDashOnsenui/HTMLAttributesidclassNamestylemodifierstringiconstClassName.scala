package typings.reactDashOnsenui

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   icon ? :string,   onClick ? :(e ? : react.react.MouseEvent<std.HTMLElement, react.NativeMouseEvent>): void} */
trait HTMLAttributesidclassNamestylemodifierstringiconstClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNamestylemodifierstringiconstClassName {
  @scala.inline
  def apply(
    className: String = null,
    icon: String = null,
    id: String = null,
    modifier: String = null,
    onClick: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylemodifierstringiconstClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HTMLAttributesidclassNamestylemodifierstringiconstClassName]
  }
}

