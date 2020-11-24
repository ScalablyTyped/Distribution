package typings.storybookAddonKnobs.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsKnobOptions extends js.Object {
  
  var display: OptionsKnobOptionsDisplay = js.native
}
object OptionsKnobOptions {
  
  @scala.inline
  def apply(display: OptionsKnobOptionsDisplay): OptionsKnobOptions = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsKnobOptions]
  }
  
  @scala.inline
  implicit class OptionsKnobOptionsOps[Self <: OptionsKnobOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplay(value: OptionsKnobOptionsDisplay): Self = this.set("display", value.asInstanceOf[js.Any])
  }
}
