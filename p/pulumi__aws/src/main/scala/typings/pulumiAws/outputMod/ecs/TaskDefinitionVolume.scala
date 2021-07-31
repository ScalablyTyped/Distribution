package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionVolume extends StObject {
  
  /**
    * Used to configure a docker volume
    */
  var dockerVolumeConfiguration: js.UndefOr[TaskDefinitionVolumeDockerVolumeConfiguration] = js.undefined
  
  /**
    * Used to configure a EFS volume.
    */
  var efsVolumeConfiguration: js.UndefOr[TaskDefinitionVolumeEfsVolumeConfiguration] = js.undefined
  
  /**
    * The path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
    */
  var hostPath: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the volume. This name is referenced in the `sourceVolume`
    * parameter of container definition in the `mountPoints` section.
    */
  var name: String
}
object TaskDefinitionVolume {
  
  @scala.inline
  def apply(name: String): TaskDefinitionVolume = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolume]
  }
  
  @scala.inline
  implicit class TaskDefinitionVolumeMutableBuilder[Self <: TaskDefinitionVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDockerVolumeConfiguration(value: TaskDefinitionVolumeDockerVolumeConfiguration): Self = StObject.set(x, "dockerVolumeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerVolumeConfigurationUndefined: Self = StObject.set(x, "dockerVolumeConfiguration", js.undefined)
    
    @scala.inline
    def setEfsVolumeConfiguration(value: TaskDefinitionVolumeEfsVolumeConfiguration): Self = StObject.set(x, "efsVolumeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEfsVolumeConfigurationUndefined: Self = StObject.set(x, "efsVolumeConfiguration", js.undefined)
    
    @scala.inline
    def setHostPath(value: String): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPathUndefined: Self = StObject.set(x, "hostPath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
