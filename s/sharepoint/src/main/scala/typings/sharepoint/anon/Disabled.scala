package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled extends js.Object {
  
  var disabled: Double = js.native
  
  var enabled: Double = js.native
  
  var hidden: Double = js.native
}
object Disabled {
  
  @scala.inline
  def apply(disabled: Double, enabled: Double, hidden: Double): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Double): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Double): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Double): Self = this.set("hidden", value.asInstanceOf[js.Any])
  }
}
