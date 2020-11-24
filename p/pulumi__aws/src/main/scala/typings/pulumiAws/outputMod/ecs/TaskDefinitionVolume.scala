package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionVolume extends js.Object {
  
  /**
    * Used to configure a docker volume
    */
  var dockerVolumeConfiguration: js.UndefOr[TaskDefinitionVolumeDockerVolumeConfiguration] = js.native
  
  /**
    * Used to configure a EFS volume.
    */
  var efsVolumeConfiguration: js.UndefOr[TaskDefinitionVolumeEfsVolumeConfiguration] = js.native
  
  /**
    * The path on the host container instance that is presented to the container. If not set, ECS will create a nonpersistent data volume that starts empty and is deleted after the task has finished.
    */
  var hostPath: js.UndefOr[String] = js.native
  
  /**
    * The name of the volume. This name is referenced in the `sourceVolume`
    * parameter of container definition in the `mountPoints` section.
    */
  var name: String = js.native
}
object TaskDefinitionVolume {
  
  @scala.inline
  def apply(name: String): TaskDefinitionVolume = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolume]
  }
  
  @scala.inline
  implicit class TaskDefinitionVolumeOps[Self <: TaskDefinitionVolume] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerVolumeConfiguration(value: TaskDefinitionVolumeDockerVolumeConfiguration): Self = this.set("dockerVolumeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerVolumeConfiguration: Self = this.set("dockerVolumeConfiguration", js.undefined)
    
    @scala.inline
    def setEfsVolumeConfiguration(value: TaskDefinitionVolumeEfsVolumeConfiguration): Self = this.set("efsVolumeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEfsVolumeConfiguration: Self = this.set("efsVolumeConfiguration", js.undefined)
    
    @scala.inline
    def setHostPath(value: String): Self = this.set("hostPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPath: Self = this.set("hostPath", js.undefined)
  }
}
