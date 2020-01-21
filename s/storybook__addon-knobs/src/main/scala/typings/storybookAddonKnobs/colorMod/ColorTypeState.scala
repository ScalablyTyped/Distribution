package typings.storybookAddonKnobs.colorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorTypeState extends js.Object {
  var displayColorPicker: Boolean
}

object ColorTypeState {
  @scala.inline
  def apply(displayColorPicker: Boolean): ColorTypeState = {
    val __obj = js.Dynamic.literal(displayColorPicker = displayColorPicker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorTypeState]
  }
}

