package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  var limits: StringDictionary[String]
  
  /**
    * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var requests: StringDictionary[String]
}
object ResourceRequirements {
  
  @scala.inline
  def apply(limits: StringDictionary[String], requests: StringDictionary[String]): ResourceRequirements = {
    val __obj = js.Dynamic.literal(limits = limits.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirements]
  }
  
  @scala.inline
  implicit class ResourceRequirementsMutableBuilder[Self <: ResourceRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimits(value: StringDictionary[String]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequests(value: StringDictionary[String]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
  }
}
