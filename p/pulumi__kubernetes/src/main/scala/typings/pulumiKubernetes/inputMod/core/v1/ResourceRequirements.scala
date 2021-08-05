package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceRequirements describes the compute resource requirements.
  */
trait ResourceRequirements extends StObject {
  
  /**
    * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var limits: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var requests: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}
object ResourceRequirements {
  
  inline def apply(): ResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRequirements]
  }
  
  extension [Self <: ResourceRequirements](x: Self) {
    
    inline def setLimits(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setRequests(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
  }
}
