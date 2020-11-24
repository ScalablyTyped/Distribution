package typings.pulumiAws.inputMod.guardduty

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterFindingCriteriaCriterion extends js.Object {
  
  /**
    * List of string values to be evaluated.
    */
  @JSName("equals")
  var equals_FFilterFindingCriteriaCriterion: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
    */
  var field: Input[String] = js.native
  
  /**
    * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
    */
  var greaterThan: js.UndefOr[Input[String]] = js.native
  
  /**
    * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
    */
  var greaterThanOrEqual: js.UndefOr[Input[String]] = js.native
  
  /**
    * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
    */
  var lessThan: js.UndefOr[Input[String]] = js.native
  
  /**
    * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
    */
  var lessThanOrEqual: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of string values to be evaluated.
    */
  var notEquals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object FilterFindingCriteriaCriterion {
  
  @scala.inline
  def apply(field: Input[String]): FilterFindingCriteriaCriterion = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterFindingCriteriaCriterion]
  }
  
  @scala.inline
  implicit class FilterFindingCriteriaCriterionOps[Self <: FilterFindingCriteriaCriterion] (val x: Self) extends AnyVal {
    
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
    def setField(value: Input[String]): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualsVarargs(value: Input[String]*): Self = this.set("equals", js.Array(value :_*))
    
    @scala.inline
    def setEquals(value: Input[js.Array[Input[String]]]): Self = this.set("equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setGreaterThan(value: Input[String]): Self = this.set("greaterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreaterThan: Self = this.set("greaterThan", js.undefined)
    
    @scala.inline
    def setGreaterThanOrEqual(value: Input[String]): Self = this.set("greaterThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreaterThanOrEqual: Self = this.set("greaterThanOrEqual", js.undefined)
    
    @scala.inline
    def setLessThan(value: Input[String]): Self = this.set("lessThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLessThan: Self = this.set("lessThan", js.undefined)
    
    @scala.inline
    def setLessThanOrEqual(value: Input[String]): Self = this.set("lessThanOrEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLessThanOrEqual: Self = this.set("lessThanOrEqual", js.undefined)
    
    @scala.inline
    def setNotEqualsVarargs(value: Input[String]*): Self = this.set("notEquals", js.Array(value :_*))
    
    @scala.inline
    def setNotEquals(value: Input[js.Array[Input[String]]]): Self = this.set("notEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotEquals: Self = this.set("notEquals", js.undefined)
  }
}
