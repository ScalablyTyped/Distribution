package typings.seleniumWebdriver.anon

import typings.seleniumWebdriver.capabilitiesMod.Capabilities
import typings.seleniumWebdriver.mod.CreateSessionCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Desired extends CreateSessionCapabilities {
  
  var desired: js.UndefOr[Capabilities] = js.native
  
  var required: js.UndefOr[Capabilities] = js.native
}
object Desired {
  
  @scala.inline
  def apply(): Desired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desired]
  }
  
  @scala.inline
  implicit class DesiredOps[Self <: Desired] (val x: Self) extends AnyVal {
    
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
    def setDesired(value: Capabilities): Self = this.set("desired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesired: Self = this.set("desired", js.undefined)
    
    @scala.inline
    def setRequired(value: Capabilities): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}
