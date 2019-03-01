package typings
package reactDashColorLib.libComponentsCommonColorWrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportedColorProps extends js.Object {
  var color: js.UndefOr[reactDashColorLib.reactDashColorMod.Color] = js.undefined
  var onChange: js.UndefOr[reactDashColorLib.reactDashColorMod.ColorChangeHandler] = js.undefined
  var onChangeComplete: js.UndefOr[reactDashColorLib.reactDashColorMod.ColorChangeHandler] = js.undefined
}

object ExportedColorProps {
  @scala.inline
  def apply(
    color: reactDashColorLib.reactDashColorMod.Color = null,
    onChange: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null,
    onChangeComplete: reactDashColorLib.reactDashColorMod.ColorChangeHandler = null
  ): ExportedColorProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(onChangeComplete)
    __obj.asInstanceOf[ExportedColorProps]
  }
}

