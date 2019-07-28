package typings.reactDashColor.libComponentsCommonColorWrapMod

import typings.reactDashColor.reactDashColorMod.Color
import typings.reactDashColor.reactDashColorMod.ColorChangeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportedColorProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var onChange: js.UndefOr[ColorChangeHandler] = js.undefined
  var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.undefined
}

object ExportedColorProps {
  @scala.inline
  def apply(
    color: Color = null,
    onChange: ColorChangeHandler = null,
    onChangeComplete: ColorChangeHandler = null
  ): ExportedColorProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    __obj.asInstanceOf[ExportedColorProps]
  }
}

