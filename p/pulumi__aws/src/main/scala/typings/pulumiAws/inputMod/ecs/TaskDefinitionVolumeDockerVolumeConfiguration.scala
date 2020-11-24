package typings.pulumiAws.inputMod.ecs

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionVolumeDockerVolumeConfiguration extends js.Object {
  
  /**
    * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
    */
  var autoprovision: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
    */
  var driver: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of Docker driver specific options.
    */
  var driverOpts: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map of custom metadata to add to your Docker volume.
    */
  var labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are `scoped` as shared persist after the task stops.
    */
  var scope: js.UndefOr[Input[String]] = js.native
}
object TaskDefinitionVolumeDockerVolumeConfiguration {
  
  @scala.inline
  def apply(): TaskDefinitionVolumeDockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionVolumeDockerVolumeConfiguration]
  }
  
  @scala.inline
  implicit class TaskDefinitionVolumeDockerVolumeConfigurationOps[Self <: TaskDefinitionVolumeDockerVolumeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAutoprovision(value: Input[Boolean]): Self = this.set("autoprovision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoprovision: Self = this.set("autoprovision", js.undefined)
    
    @scala.inline
    def setDriver(value: Input[String]): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    
    @scala.inline
    def setDriverOpts(value: Input[StringDictionary[Input[String]]]): Self = this.set("driverOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriverOpts: Self = this.set("driverOpts", js.undefined)
    
    @scala.inline
    def setLabels(value: Input[StringDictionary[Input[String]]]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setScope(value: Input[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
