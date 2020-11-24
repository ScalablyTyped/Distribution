package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionVolumeEfsVolumeConfiguration extends js.Object {
  
  /**
    * The authorization configuration details for the Amazon EFS file system.
    */
  var authorizationConfig: js.UndefOr[TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig] = js.native
  
  /**
    * The ID of the EFS File System.
    */
  var fileSystemId: String = js.native
  
  /**
    * The directory within the Amazon EFS file system to mount as the root directory inside the host. If this parameter is omitted, the root of the Amazon EFS volume will be used. Specifying / will have the same effect as omitting this parameter. This argument is ignored when using `authorizationConfig`.
    */
  var rootDirectory: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
    */
  var transitEncryption: js.UndefOr[String] = js.native
  
  /**
    * The port to use for transit encryption. If you do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
    */
  var transitEncryptionPort: js.UndefOr[Double] = js.native
}
object TaskDefinitionVolumeEfsVolumeConfiguration {
  
  @scala.inline
  def apply(fileSystemId: String): TaskDefinitionVolumeEfsVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolumeEfsVolumeConfiguration]
  }
  
  @scala.inline
  implicit class TaskDefinitionVolumeEfsVolumeConfigurationOps[Self <: TaskDefinitionVolumeEfsVolumeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationConfig(value: TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig): Self = this.set("authorizationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationConfig: Self = this.set("authorizationConfig", js.undefined)
    
    @scala.inline
    def setRootDirectory(value: String): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDirectory: Self = this.set("rootDirectory", js.undefined)
    
    @scala.inline
    def setTransitEncryption(value: String): Self = this.set("transitEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitEncryption: Self = this.set("transitEncryption", js.undefined)
    
    @scala.inline
    def setTransitEncryptionPort(value: Double): Self = this.set("transitEncryptionPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitEncryptionPort: Self = this.set("transitEncryptionPort", js.undefined)
  }
}
