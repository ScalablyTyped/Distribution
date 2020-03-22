package typings.reactOnsenui

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  color ? :string,   background ? :string,   disabled ? :boolean,   modifier ? :string} */
trait HTMLAttributesidclassNameBackground extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameBackground {
  @scala.inline
  def apply(
    background: String = null,
    className: String = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    modifier: String = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNameBackground = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameBackground]
  }
}

