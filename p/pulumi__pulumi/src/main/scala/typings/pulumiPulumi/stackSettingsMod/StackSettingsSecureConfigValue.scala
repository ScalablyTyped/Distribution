package typings.pulumiPulumi.stackSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSettingsSecureConfigValue extends js.Object {
  
  var secure: String = js.native
}
object StackSettingsSecureConfigValue {
  
  @scala.inline
  def apply(secure: String): StackSettingsSecureConfigValue = {
    val __obj = js.Dynamic.literal(secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSettingsSecureConfigValue]
  }
  
  @scala.inline
  implicit class StackSettingsSecureConfigValueOps[Self <: StackSettingsSecureConfigValue] (val x: Self) extends AnyVal {
    
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
    def setSecure(value: String): Self = this.set("secure", value.asInstanceOf[js.Any])
  }
}
