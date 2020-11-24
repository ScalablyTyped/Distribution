package typings.pulumiAws.inputMod.workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDirectoryWorkspaceCreationProperties extends js.Object {
  
  /**
    * The identifier of your custom security group. Should relate to the same VPC, where workspaces reside in.
    */
  var customSecurityGroupId: js.UndefOr[String] = js.native
  
  /**
    * The default organizational unit (OU) for your WorkSpace directories.
    */
  var defaultOu: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether internet access is enabled for your WorkSpaces.
    */
  var enableInternetAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see [WorkSpace Maintenance](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspace-maintenance.html).
    */
  var enableMaintenanceMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether users are local administrators of their WorkSpaces.
    */
  var userEnabledAsLocalAdministrator: js.UndefOr[Boolean] = js.native
}
object GetDirectoryWorkspaceCreationProperties {
  
  @scala.inline
  def apply(): GetDirectoryWorkspaceCreationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDirectoryWorkspaceCreationProperties]
  }
  
  @scala.inline
  implicit class GetDirectoryWorkspaceCreationPropertiesOps[Self <: GetDirectoryWorkspaceCreationProperties] (val x: Self) extends AnyVal {
    
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
    def setCustomSecurityGroupId(value: String): Self = this.set("customSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSecurityGroupId: Self = this.set("customSecurityGroupId", js.undefined)
    
    @scala.inline
    def setDefaultOu(value: String): Self = this.set("defaultOu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOu: Self = this.set("defaultOu", js.undefined)
    
    @scala.inline
    def setEnableInternetAccess(value: Boolean): Self = this.set("enableInternetAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInternetAccess: Self = this.set("enableInternetAccess", js.undefined)
    
    @scala.inline
    def setEnableMaintenanceMode(value: Boolean): Self = this.set("enableMaintenanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMaintenanceMode: Self = this.set("enableMaintenanceMode", js.undefined)
    
    @scala.inline
    def setUserEnabledAsLocalAdministrator(value: Boolean): Self = this.set("userEnabledAsLocalAdministrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEnabledAsLocalAdministrator: Self = this.set("userEnabledAsLocalAdministrator", js.undefined)
  }
}
