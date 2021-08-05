package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
  */
trait HPAScalingRules extends StObject {
  
  /**
    * policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
    */
  var policies: js.Array[HPAScalingPolicy]
  
  /**
    * selectPolicy is used to specify which policy should be used. If not set, the default value MaxPolicySelect is used.
    */
  var selectPolicy: String
  
  /**
    * StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
    */
  var stabilizationWindowSeconds: Double
}
object HPAScalingRules {
  
  inline def apply(policies: js.Array[HPAScalingPolicy], selectPolicy: String, stabilizationWindowSeconds: Double): HPAScalingRules = {
    val __obj = js.Dynamic.literal(policies = policies.asInstanceOf[js.Any], selectPolicy = selectPolicy.asInstanceOf[js.Any], stabilizationWindowSeconds = stabilizationWindowSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPAScalingRules]
  }
  
  extension [Self <: HPAScalingRules](x: Self) {
    
    inline def setPolicies(value: js.Array[HPAScalingPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesVarargs(value: HPAScalingPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
    
    inline def setSelectPolicy(value: String): Self = StObject.set(x, "selectPolicy", value.asInstanceOf[js.Any])
    
    inline def setStabilizationWindowSeconds(value: Double): Self = StObject.set(x, "stabilizationWindowSeconds", value.asInstanceOf[js.Any])
  }
}
