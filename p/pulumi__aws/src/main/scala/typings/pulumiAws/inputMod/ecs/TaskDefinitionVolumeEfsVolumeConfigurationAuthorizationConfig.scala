package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig extends js.Object {
  
  /**
    * The access point ID to use. If an access point is specified, the root directory value will be relative to the directory set for the access point. If specified, transit encryption must be enabled in the EFSVolumeConfiguration.
    */
  var accessPointId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in the EFSVolumeConfiguration. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
    */
  var iam: js.UndefOr[Input[String]] = js.native
}
object TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig {
  
  @scala.inline
  def apply(): TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig]
  }
  
  @scala.inline
  implicit class TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigOps[Self <: TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig] (val x: Self) extends AnyVal {
    
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
    def setAccessPointId(value: Input[String]): Self = this.set("accessPointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPointId: Self = this.set("accessPointId", js.undefined)
    
    @scala.inline
    def setIam(value: Input[String]): Self = this.set("iam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIam: Self = this.set("iam", js.undefined)
  }
}
