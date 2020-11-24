package typings.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupIngress extends js.Object {
  
  /**
    * The CIDR block to accept
    */
  var cidr: js.UndefOr[String] = js.native
  
  /**
    * The ID of the security group to authorize
    */
  var securityGroupId: String = js.native
  
  /**
    * The name of the security group to authorize
    */
  var securityGroupName: String = js.native
  
  /**
    * The owner Id of the security group provided
    * by `securityGroupName`.
    */
  var securityGroupOwnerId: String = js.native
}
object SecurityGroupIngress {
  
  @scala.inline
  def apply(securityGroupId: String, securityGroupName: String, securityGroupOwnerId: String): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal(securityGroupId = securityGroupId.asInstanceOf[js.Any], securityGroupName = securityGroupName.asInstanceOf[js.Any], securityGroupOwnerId = securityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupIngress]
  }
  
  @scala.inline
  implicit class SecurityGroupIngressOps[Self <: SecurityGroupIngress] (val x: Self) extends AnyVal {
    
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
    def setSecurityGroupId(value: String): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupName(value: String): Self = this.set("securityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupOwnerId(value: String): Self = this.set("securityGroupOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidr(value: String): Self = this.set("cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidr: Self = this.set("cidr", js.undefined)
  }
}
