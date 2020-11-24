package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainAdvancedSecurityOption extends js.Object {
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * Whether the internal user database is enabled.
    */
  var internalUserDatabaseEnabled: Boolean = js.native
}
object GetDomainAdvancedSecurityOption {
  
  @scala.inline
  def apply(enabled: Boolean, internalUserDatabaseEnabled: Boolean): GetDomainAdvancedSecurityOption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], internalUserDatabaseEnabled = internalUserDatabaseEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainAdvancedSecurityOption]
  }
  
  @scala.inline
  implicit class GetDomainAdvancedSecurityOptionOps[Self <: GetDomainAdvancedSecurityOption] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUserDatabaseEnabled(value: Boolean): Self = this.set("internalUserDatabaseEnabled", value.asInstanceOf[js.Any])
  }
}
