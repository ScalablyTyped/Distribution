package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodReadinessGate contains the reference to a pod condition
  */
trait PodReadinessGate extends StObject {
  
  /**
    * ConditionType refers to a condition in the pod's condition list with matching type.
    */
  var conditionType: String
}
object PodReadinessGate {
  
  inline def apply(conditionType: String): PodReadinessGate = {
    val __obj = js.Dynamic.literal(conditionType = conditionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodReadinessGate]
  }
  
  extension [Self <: PodReadinessGate](x: Self) {
    
    inline def setConditionType(value: String): Self = StObject.set(x, "conditionType", value.asInstanceOf[js.Any])
  }
}
