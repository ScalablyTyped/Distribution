package typings.pulumiAws.outputMod.imagebuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission extends js.Object {
  
  /**
    * Set of EC2 launch permission user groups.
    */
  var userGroups: js.Array[String] = js.native
  
  /**
    * Set of AWS Account identifiers.
    */
  var userIds: js.Array[String] = js.native
}
object GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
  
  @scala.inline
  def apply(userGroups: js.Array[String], userIds: js.Array[String]): GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission = {
    val __obj = js.Dynamic.literal(userGroups = userGroups.asInstanceOf[js.Any], userIds = userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission]
  }
  
  @scala.inline
  implicit class GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionOps[Self <: GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission] (val x: Self) extends AnyVal {
    
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
    def setUserGroupsVarargs(value: String*): Self = this.set("userGroups", js.Array(value :_*))
    
    @scala.inline
    def setUserGroups(value: js.Array[String]): Self = this.set("userGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsVarargs(value: String*): Self = this.set("userIds", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: js.Array[String]): Self = this.set("userIds", value.asInstanceOf[js.Any])
  }
}
