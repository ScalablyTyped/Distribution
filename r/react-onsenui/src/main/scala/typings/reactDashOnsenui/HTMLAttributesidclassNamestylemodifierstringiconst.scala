package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import typings.reactDashOnsenui.reactDashOnsenuiMod.Modifiers_number
import typings.reactDashOnsenui.reactDashOnsenuiMod.Modifiers_string
import typings.reactDashOnsenui.reactDashOnsenuiNumbers.`180`
import typings.reactDashOnsenui.reactDashOnsenuiNumbers.`270`
import typings.reactDashOnsenui.reactDashOnsenuiNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   icon ? :string | react-onsenui.react-onsenui.Modifiers_string,   size ? :number | react-onsenui.react-onsenui.Modifiers_number,   rotate ? :90 | 180 | 270,   fixedWidth ? :boolean,   spin ? :boolean} */
trait HTMLAttributesidclassNamestylemodifierstringiconst extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String | Modifiers_string] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.undefined
  var size: js.UndefOr[Double | Modifiers_number] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNamestylemodifierstringiconst {
  @scala.inline
  def apply(
    className: String = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    icon: String | Modifiers_string = null,
    id: String = null,
    modifier: String = null,
    rotate: `90` | `180` | `270` = null,
    size: Double | Modifiers_number = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylemodifierstringiconst = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HTMLAttributesidclassNamestylemodifierstringiconst]
  }
}

