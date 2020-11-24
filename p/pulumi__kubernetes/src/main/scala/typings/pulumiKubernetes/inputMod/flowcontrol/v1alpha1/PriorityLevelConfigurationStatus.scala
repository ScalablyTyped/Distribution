package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfigurationStatus represents the current state of a "request-priority".
  */
@js.native
trait PriorityLevelConfigurationStatus extends js.Object {
  
  /**
    * `conditions` is the current state of "request-priority".
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PriorityLevelConfigurationCondition]]]] = js.native
}
object PriorityLevelConfigurationStatus {
  
  @scala.inline
  def apply(): PriorityLevelConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriorityLevelConfigurationStatus]
  }
  
  @scala.inline
  implicit class PriorityLevelConfigurationStatusOps[Self <: PriorityLevelConfigurationStatus] (val x: Self) extends AnyVal {
    
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
    def setConditionsVarargs(value: Input[PriorityLevelConfigurationCondition]*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[PriorityLevelConfigurationCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
  }
}
