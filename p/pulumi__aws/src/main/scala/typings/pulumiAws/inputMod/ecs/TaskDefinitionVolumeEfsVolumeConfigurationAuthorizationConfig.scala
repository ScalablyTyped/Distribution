package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig extends StObject {
  
  /**
    * The access point ID to use. If an access point is specified, the root directory value will be relative to the directory set for the access point. If specified, transit encryption must be enabled in the EFSVolumeConfiguration.
    */
  var accessPointId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in the EFSVolumeConfiguration. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
    */
  var iam: js.UndefOr[Input[String]] = js.undefined
}
object TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig {
  
  inline def apply(): TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig]
  }
  
  extension [Self <: TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig](x: Self) {
    
    inline def setAccessPointId(value: Input[String]): Self = StObject.set(x, "accessPointId", value.asInstanceOf[js.Any])
    
    inline def setAccessPointIdUndefined: Self = StObject.set(x, "accessPointId", js.undefined)
    
    inline def setIam(value: Input[String]): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
    
    inline def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
  }
}
