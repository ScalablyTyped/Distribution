package typings.pulumiAws.inputMod.storagegateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewaySmbActiveDirectorySettings extends js.Object {
  
  /**
    * The name of the domain that you want the gateway to join.
    */
  var domainName: Input[String] = js.native
  
  /**
    * The password of the user who has permission to add the gateway to the Active Directory domain.
    */
  var password: Input[String] = js.native
  
  /**
    * The user name of user who has permission to add the gateway to the Active Directory domain.
    */
  var username: Input[String] = js.native
}
object GatewaySmbActiveDirectorySettings {
  
  @scala.inline
  def apply(domainName: Input[String], password: Input[String], username: Input[String]): GatewaySmbActiveDirectorySettings = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewaySmbActiveDirectorySettings]
  }
  
  @scala.inline
  implicit class GatewaySmbActiveDirectorySettingsOps[Self <: GatewaySmbActiveDirectorySettings] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
