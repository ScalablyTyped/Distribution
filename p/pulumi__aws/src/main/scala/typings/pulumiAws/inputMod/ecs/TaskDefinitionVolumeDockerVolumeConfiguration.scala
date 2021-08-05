package typings.pulumiAws.inputMod.ecs

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionVolumeDockerVolumeConfiguration extends StObject {
  
  /**
    * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
    */
  var autoprovision: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
    */
  var driver: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A map of Docker driver specific options.
    */
  var driverOpts: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * A map of custom metadata to add to your Docker volume.
    */
  var labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * The scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are `scoped` as shared persist after the task stops.
    */
  var scope: js.UndefOr[Input[String]] = js.undefined
}
object TaskDefinitionVolumeDockerVolumeConfiguration {
  
  inline def apply(): TaskDefinitionVolumeDockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionVolumeDockerVolumeConfiguration]
  }
  
  extension [Self <: TaskDefinitionVolumeDockerVolumeConfiguration](x: Self) {
    
    inline def setAutoprovision(value: Input[Boolean]): Self = StObject.set(x, "autoprovision", value.asInstanceOf[js.Any])
    
    inline def setAutoprovisionUndefined: Self = StObject.set(x, "autoprovision", js.undefined)
    
    inline def setDriver(value: Input[String]): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverOpts(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "driverOpts", value.asInstanceOf[js.Any])
    
    inline def setDriverOptsUndefined: Self = StObject.set(x, "driverOpts", js.undefined)
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setLabels(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
