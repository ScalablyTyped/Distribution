package typings.pulumiAws.outputMod.autoscalingplans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanApplicationSourceTagFilter extends js.Object {
  
  /**
    * The tag key.
    */
  var key: String = js.native
  
  /**
    * The tag values.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object ScalingPlanApplicationSourceTagFilter {
  
  @scala.inline
  def apply(key: String): ScalingPlanApplicationSourceTagFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlanApplicationSourceTagFilter]
  }
  
  @scala.inline
  implicit class ScalingPlanApplicationSourceTagFilterOps[Self <: ScalingPlanApplicationSourceTagFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
