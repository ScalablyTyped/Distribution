package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfigurationStatus represents the current state of a "request-priority".
  */
trait PriorityLevelConfigurationStatus extends StObject {
  
  /**
    * `conditions` is the current state of "request-priority".
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PriorityLevelConfigurationCondition]]]] = js.undefined
}
object PriorityLevelConfigurationStatus {
  
  inline def apply(): PriorityLevelConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriorityLevelConfigurationStatus]
  }
  
  extension [Self <: PriorityLevelConfigurationStatus](x: Self) {
    
    inline def setConditions(value: Input[js.Array[Input[PriorityLevelConfigurationCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[PriorityLevelConfigurationCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
  }
}
