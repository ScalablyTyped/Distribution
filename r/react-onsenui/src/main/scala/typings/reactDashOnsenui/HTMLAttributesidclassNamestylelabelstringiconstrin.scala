package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  label ? :string,   icon ? :string} */
trait HTMLAttributesidclassNamestylelabelstringiconstrin extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNamestylelabelstringiconstrin {
  @scala.inline
  def apply(
    className: String = null,
    icon: String = null,
    id: String = null,
    label: String = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylelabelstringiconstrin = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HTMLAttributesidclassNamestylelabelstringiconstrin]
  }
}

