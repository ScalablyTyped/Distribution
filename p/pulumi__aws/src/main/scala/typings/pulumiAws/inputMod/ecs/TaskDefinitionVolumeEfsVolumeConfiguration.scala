package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionVolumeEfsVolumeConfiguration extends StObject {
  
  /**
    * The authorization configuration details for the Amazon EFS file system.
    */
  var authorizationConfig: js.UndefOr[Input[TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig]] = js.undefined
  
  /**
    * The ID of the EFS File System.
    */
  var fileSystemId: Input[String]
  
  /**
    * The directory within the Amazon EFS file system to mount as the root directory inside the host. If this parameter is omitted, the root of the Amazon EFS volume will be used. Specifying / will have the same effect as omitting this parameter. This argument is ignored when using `authorizationConfig`.
    */
  var rootDirectory: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
    */
  var transitEncryption: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The port to use for transit encryption. If you do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
    */
  var transitEncryptionPort: js.UndefOr[Input[Double]] = js.undefined
}
object TaskDefinitionVolumeEfsVolumeConfiguration {
  
  @scala.inline
  def apply(fileSystemId: Input[String]): TaskDefinitionVolumeEfsVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolumeEfsVolumeConfiguration]
  }
  
  @scala.inline
  implicit class TaskDefinitionVolumeEfsVolumeConfigurationMutableBuilder[Self <: TaskDefinitionVolumeEfsVolumeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationConfig(value: Input[TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig]): Self = StObject.set(x, "authorizationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationConfigUndefined: Self = StObject.set(x, "authorizationConfig", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: Input[String]): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDirectory(value: Input[String]): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
    
    @scala.inline
    def setTransitEncryption(value: Input[String]): Self = StObject.set(x, "transitEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitEncryptionPort(value: Input[Double]): Self = StObject.set(x, "transitEncryptionPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitEncryptionPortUndefined: Self = StObject.set(x, "transitEncryptionPort", js.undefined)
    
    @scala.inline
    def setTransitEncryptionUndefined: Self = StObject.set(x, "transitEncryption", js.undefined)
  }
}
