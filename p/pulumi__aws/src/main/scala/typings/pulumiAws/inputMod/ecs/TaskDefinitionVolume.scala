package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionVolume extends StObject {
  
  /**
    * Used to configure a docker volume
    */
  var dockerVolumeConfiguration: js.UndefOr[Input[TaskDefinitionVolumeDockerVolumeConfiguration]] = js.undefined
  
  /**
    * Used to configure a EFS volume.
    */
  var efsVolumeConfiguration: js.UndefOr[Input[TaskDefinitionVolumeEfsVolumeConfiguration]] = js.undefined
  
  /**
    * The path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
    */
  var hostPath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the volume. This name is referenced in the `sourceVolume`
    * parameter of container definition in the `mountPoints` section.
    */
  var name: Input[String]
}
object TaskDefinitionVolume {
  
  inline def apply(name: Input[String]): TaskDefinitionVolume = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolume]
  }
  
  extension [Self <: TaskDefinitionVolume](x: Self) {
    
    inline def setDockerVolumeConfiguration(value: Input[TaskDefinitionVolumeDockerVolumeConfiguration]): Self = StObject.set(x, "dockerVolumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDockerVolumeConfigurationUndefined: Self = StObject.set(x, "dockerVolumeConfiguration", js.undefined)
    
    inline def setEfsVolumeConfiguration(value: Input[TaskDefinitionVolumeEfsVolumeConfiguration]): Self = StObject.set(x, "efsVolumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEfsVolumeConfigurationUndefined: Self = StObject.set(x, "efsVolumeConfiguration", js.undefined)
    
    inline def setHostPath(value: Input[String]): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    inline def setHostPathUndefined: Self = StObject.set(x, "hostPath", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
