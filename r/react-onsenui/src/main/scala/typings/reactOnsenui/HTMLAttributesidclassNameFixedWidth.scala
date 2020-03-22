package typings.reactOnsenui

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.ModifiersNumber
import typings.reactOnsenui.mod.ModifiersString
import typings.reactOnsenui.reactOnsenuiNumbers.`180`
import typings.reactOnsenui.reactOnsenuiNumbers.`270`
import typings.reactOnsenui.reactOnsenuiNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   icon ? :string | react-onsenui.react-onsenui.Modifiers_string,   size ? :number | react-onsenui.react-onsenui.Modifiers_number,   rotate ? :90 | 180 | 270,   fixedWidth ? :boolean,   spin ? :boolean} */
trait HTMLAttributesidclassNameFixedWidth extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String | ModifiersString] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.undefined
  var size: js.UndefOr[Double | ModifiersNumber] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameFixedWidth {
  @scala.inline
  def apply(
    className: String = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    icon: String | ModifiersString = null,
    id: String = null,
    modifier: String = null,
    rotate: `90` | `180` | `270` = null,
    size: Double | ModifiersNumber = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): HTMLAttributesidclassNameFixedWidth = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameFixedWidth]
  }
}

