package typings.pulumiKubernetes.inputMod.apiregistration.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * APIServiceStatus contains derived information about an API server
  */
@js.native
trait APIServiceStatus extends js.Object {
  
  /**
    * Current service state of apiService.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[APIServiceCondition]]]] = js.native
}
object APIServiceStatus {
  
  @scala.inline
  def apply(): APIServiceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIServiceStatus]
  }
  
  @scala.inline
  implicit class APIServiceStatusOps[Self <: APIServiceStatus] (val x: Self) extends AnyVal {
    
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
    def setConditionsVarargs(value: Input[APIServiceCondition]*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[APIServiceCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
  }
}
