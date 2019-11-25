package typings.reactDashBootstrap.libToggleButtonMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButtonProps
  extends AllHTMLAttributes[ToggleButton]
     with ClassAttributes[ToggleButton] {
  @JSName("value")
  var value_ToggleButtonProps: Double | String
}

object ToggleButtonProps {
  @scala.inline
  def apply(
    value: Double | String,
    AllHTMLAttributes: AllHTMLAttributes[ToggleButton] = null,
    ClassAttributes: ClassAttributes[ToggleButton] = null
  ): ToggleButtonProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[ToggleButtonProps]
  }
}

