package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowSchemaStatus represents the current state of a FlowSchema.
  */
@js.native
trait FlowSchemaStatus extends StObject {
  
  /**
    * `conditions` is a list of the current states of FlowSchema.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[FlowSchemaCondition]]]] = js.native
}
object FlowSchemaStatus {
  
  @scala.inline
  def apply(): FlowSchemaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowSchemaStatus]
  }
  
  @scala.inline
  implicit class FlowSchemaStatusMutableBuilder[Self <: FlowSchemaStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[FlowSchemaCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Input[FlowSchemaCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
  }
}
