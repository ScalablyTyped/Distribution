package typings.pulumiAws.inputMod.imagebuilder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission extends js.Object {
  
  /**
    * Set of EC2 launch permission user groups to assign. Use `all` to distribute a public AMI.
    */
  var userGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Set of AWS Account identifiers to assign.
    */
  var userIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
  
  @scala.inline
  def apply(): DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission]
  }
  
  @scala.inline
  implicit class DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionOps[Self <: DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission] (val x: Self) extends AnyVal {
    
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
    def setUserGroupsVarargs(value: Input[String]*): Self = this.set("userGroups", js.Array(value :_*))
    
    @scala.inline
    def setUserGroups(value: Input[js.Array[Input[String]]]): Self = this.set("userGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGroups: Self = this.set("userGroups", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: Input[String]*): Self = this.set("userIds", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: Input[js.Array[Input[String]]]): Self = this.set("userIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIds: Self = this.set("userIds", js.undefined)
  }
}
