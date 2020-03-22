package typings.reactOnsenui

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.SpeedDialDirection
import typings.reactOnsenui.mod.SpeedDialPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   position ? :react-onsenui.react-onsenui.SpeedDialPosition,   direction ? :react-onsenui.react-onsenui.SpeedDialDirection,   disabled ? :boolean} */
trait HTMLAttributesidclassNameDirection extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[SpeedDialDirection] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[SpeedDialPosition] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameDirection {
  @scala.inline
  def apply(
    className: String = null,
    direction: SpeedDialDirection = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    modifier: String = null,
    position: SpeedDialPosition = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNameDirection = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameDirection]
  }
}

