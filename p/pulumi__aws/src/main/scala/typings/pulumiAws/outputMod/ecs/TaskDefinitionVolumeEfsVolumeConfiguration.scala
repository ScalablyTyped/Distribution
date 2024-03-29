package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionVolumeEfsVolumeConfiguration extends StObject {
  
  /**
    * The authorization configuration details for the Amazon EFS file system.
    */
  var authorizationConfig: js.UndefOr[TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig] = js.undefined
  
  /**
    * The ID of the EFS File System.
    */
  var fileSystemId: String
  
  /**
    * The directory within the Amazon EFS file system to mount as the root directory inside the host. If this parameter is omitted, the root of the Amazon EFS volume will be used. Specifying / will have the same effect as omitting this parameter. This argument is ignored when using `authorizationConfig`.
    */
  var rootDirectory: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
    */
  var transitEncryption: js.UndefOr[String] = js.undefined
  
  /**
    * The port to use for transit encryption. If you do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
    */
  var transitEncryptionPort: js.UndefOr[Double] = js.undefined
}
object TaskDefinitionVolumeEfsVolumeConfiguration {
  
  inline def apply(fileSystemId: String): TaskDefinitionVolumeEfsVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolumeEfsVolumeConfiguration]
  }
  
  extension [Self <: TaskDefinitionVolumeEfsVolumeConfiguration](x: Self) {
    
    inline def setAuthorizationConfig(value: TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig): Self = StObject.set(x, "authorizationConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationConfigUndefined: Self = StObject.set(x, "authorizationConfig", js.undefined)
    
    inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
    
    inline def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
    
    inline def setTransitEncryption(value: String): Self = StObject.set(x, "transitEncryption", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionPort(value: Double): Self = StObject.set(x, "transitEncryptionPort", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionPortUndefined: Self = StObject.set(x, "transitEncryptionPort", js.undefined)
    
    inline def setTransitEncryptionUndefined: Self = StObject.set(x, "transitEncryption", js.undefined)
  }
}
