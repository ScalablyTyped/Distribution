package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import typings.reactDashOnsenui.reactDashOnsenuiMod.SpeedDialDirection
import typings.reactDashOnsenui.reactDashOnsenuiMod.SpeedDialPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   position ? :react-onsenui.react-onsenui.SpeedDialPosition,   direction ? :react-onsenui.react-onsenui.SpeedDialDirection,   disabled ? :boolean} */
trait HTMLAttributesidclassNamestylemodifierstringpositi extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[SpeedDialDirection] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[SpeedDialPosition] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNamestylemodifierstringpositi {
  @scala.inline
  def apply(
    className: String = null,
    direction: SpeedDialDirection = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    modifier: String = null,
    position: SpeedDialPosition = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylemodifierstringpositi = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (position != null) __obj.updateDynamic("position")(position)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HTMLAttributesidclassNamestylemodifierstringpositi]
  }
}

