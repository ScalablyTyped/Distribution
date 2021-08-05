package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowSchemaStatus represents the current state of a FlowSchema.
  */
trait FlowSchemaStatus extends StObject {
  
  /**
    * `conditions` is a list of the current states of FlowSchema.
    */
  var conditions: js.Array[FlowSchemaCondition]
}
object FlowSchemaStatus {
  
  inline def apply(conditions: js.Array[FlowSchemaCondition]): FlowSchemaStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaStatus]
  }
  
  extension [Self <: FlowSchemaStatus](x: Self) {
    
    inline def setConditions(value: js.Array[FlowSchemaCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: FlowSchemaCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
  }
}
