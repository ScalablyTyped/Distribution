package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guardduty {
  
  @js.native
  trait FilterFindingCriteria extends StObject {
    
    var criterions: js.Array[FilterFindingCriteriaCriterion] = js.native
  }
  object FilterFindingCriteria {
    
    @scala.inline
    def apply(criterions: js.Array[FilterFindingCriteriaCriterion]): FilterFindingCriteria = {
      val __obj = js.Dynamic.literal(criterions = criterions.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterFindingCriteria]
    }
    
    @scala.inline
    implicit class FilterFindingCriteriaMutableBuilder[Self <: FilterFindingCriteria] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCriterions(value: js.Array[FilterFindingCriteriaCriterion]): Self = StObject.set(x, "criterions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCriterionsVarargs(value: FilterFindingCriteriaCriterion*): Self = StObject.set(x, "criterions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FilterFindingCriteriaCriterion extends StObject {
    
    /**
      * List of string values to be evaluated.
      */
    @JSName("equals")
    var equals_FFilterFindingCriteriaCriterion: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
      */
    var field: String = js.native
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var greaterThan: js.UndefOr[String] = js.native
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var greaterThanOrEqual: js.UndefOr[String] = js.native
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var lessThan: js.UndefOr[String] = js.native
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var lessThanOrEqual: js.UndefOr[String] = js.native
    
    /**
      * List of string values to be evaluated.
      */
    var notEquals: js.UndefOr[js.Array[String]] = js.native
  }
  object FilterFindingCriteriaCriterion {
    
    @scala.inline
    def apply(field: String): FilterFindingCriteriaCriterion = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterFindingCriteriaCriterion]
    }
    
    @scala.inline
    implicit class FilterFindingCriteriaCriterionMutableBuilder[Self <: FilterFindingCriteriaCriterion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: js.Array[String]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setEquals_Varargs(value: String*): Self = StObject.set(x, "equals", js.Array(value :_*))
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreaterThan(value: String): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreaterThanOrEqual(value: String): Self = StObject.set(x, "greaterThanOrEqual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreaterThanOrEqualUndefined: Self = StObject.set(x, "greaterThanOrEqual", js.undefined)
      
      @scala.inline
      def setGreaterThanUndefined: Self = StObject.set(x, "greaterThan", js.undefined)
      
      @scala.inline
      def setLessThan(value: String): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLessThanOrEqual(value: String): Self = StObject.set(x, "lessThanOrEqual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLessThanOrEqualUndefined: Self = StObject.set(x, "lessThanOrEqual", js.undefined)
      
      @scala.inline
      def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
      
      @scala.inline
      def setNotEquals(value: js.Array[String]): Self = StObject.set(x, "notEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEqualsUndefined: Self = StObject.set(x, "notEquals", js.undefined)
      
      @scala.inline
      def setNotEqualsVarargs(value: String*): Self = StObject.set(x, "notEquals", js.Array(value :_*))
    }
  }
}
