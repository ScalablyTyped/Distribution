package typings.pulumiAws.outputMod.guardduty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterFindingCriteria extends js.Object {
  
  var criterions: js.Array[FilterFindingCriteriaCriterion] = js.native
}
object FilterFindingCriteria {
  
  @scala.inline
  def apply(criterions: js.Array[FilterFindingCriteriaCriterion]): FilterFindingCriteria = {
    val __obj = js.Dynamic.literal(criterions = criterions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterFindingCriteria]
  }
  
  @scala.inline
  implicit class FilterFindingCriteriaOps[Self <: FilterFindingCriteria] (val x: Self) extends AnyVal {
    
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
    def setCriterionsVarargs(value: FilterFindingCriteriaCriterion*): Self = this.set("criterions", js.Array(value :_*))
    
    @scala.inline
    def setCriterions(value: js.Array[FilterFindingCriteriaCriterion]): Self = this.set("criterions", value.asInstanceOf[js.Any])
  }
}
