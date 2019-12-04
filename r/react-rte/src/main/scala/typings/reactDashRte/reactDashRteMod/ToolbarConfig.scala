package typings.reactDashRte.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarConfig extends js.Object {
  var BLOCK_TYPE_BUTTONS: StyleConfigList
  var BLOCK_TYPE_DROPDOWN: StyleConfigList
  var INLINE_STYLE_BUTTONS: StyleConfigList
  var display: js.Array[GroupName]
  var extraProps: js.UndefOr[js.Object] = js.undefined
}

object ToolbarConfig {
  @scala.inline
  def apply(
    BLOCK_TYPE_BUTTONS: StyleConfigList,
    BLOCK_TYPE_DROPDOWN: StyleConfigList,
    INLINE_STYLE_BUTTONS: StyleConfigList,
    display: js.Array[GroupName],
    extraProps: js.Object = null
  ): ToolbarConfig = {
    val __obj = js.Dynamic.literal(BLOCK_TYPE_BUTTONS = BLOCK_TYPE_BUTTONS.asInstanceOf[js.Any], BLOCK_TYPE_DROPDOWN = BLOCK_TYPE_DROPDOWN.asInstanceOf[js.Any], INLINE_STYLE_BUTTONS = INLINE_STYLE_BUTTONS.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarConfig]
  }
}

