package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guardduty {
  
  trait FilterFindingCriteria extends StObject {
    
    var criterions: Input[js.Array[Input[FilterFindingCriteriaCriterion]]]
  }
  object FilterFindingCriteria {
    
    @scala.inline
    def apply(criterions: Input[js.Array[Input[FilterFindingCriteriaCriterion]]]): FilterFindingCriteria = {
      val __obj = js.Dynamic.literal(criterions = criterions.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterFindingCriteria]
    }
    
    @scala.inline
    implicit class FilterFindingCriteriaMutableBuilder[Self <: FilterFindingCriteria] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCriterions(value: Input[js.Array[Input[FilterFindingCriteriaCriterion]]]): Self = StObject.set(x, "criterions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCriterionsVarargs(value: Input[FilterFindingCriteriaCriterion]*): Self = StObject.set(x, "criterions", js.Array(value :_*))
    }
  }
  
  trait FilterFindingCriteriaCriterion extends StObject {
    
    /**
      * List of string values to be evaluated.
      */
    @JSName("equals")
    var equals_FFilterFindingCriteriaCriterion: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
      */
    var field: Input[String]
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var greaterThan: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var greaterThanOrEqual: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var lessThan: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var lessThanOrEqual: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of string values to be evaluated.
      */
    var notEquals: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object FilterFindingCriteriaCriterion {
    
    @scala.inline
    def apply(field: Input[String]): FilterFindingCriteriaCriterion = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterFindingCriteriaCriterion]
    }
    
    @scala.inline
    implicit class FilterFindingCriteriaCriterionMutableBuilder[Self <: FilterFindingCriteriaCriterion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setEquals_Varargs(value: Input[String]*): Self = StObject.set(x, "equals", js.Array(value :_*))
      
      @scala.inline
      def setField(value: Input[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreaterThan(value: Input[String]): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreaterThanOrEqual(value: Input[String]): Self = StObject.set(x, "greaterThanOrEqual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreaterThanOrEqualUndefined: Self = StObject.set(x, "greaterThanOrEqual", js.undefined)
      
      @scala.inline
      def setGreaterThanUndefined: Self = StObject.set(x, "greaterThan", js.undefined)
      
      @scala.inline
      def setLessThan(value: Input[String]): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLessThanOrEqual(value: Input[String]): Self = StObject.set(x, "lessThanOrEqual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLessThanOrEqualUndefined: Self = StObject.set(x, "lessThanOrEqual", js.undefined)
      
      @scala.inline
      def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
      
      @scala.inline
      def setNotEquals(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "notEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotEqualsUndefined: Self = StObject.set(x, "notEquals", js.undefined)
      
      @scala.inline
      def setNotEqualsVarargs(value: Input[String]*): Self = StObject.set(x, "notEquals", js.Array(value :_*))
    }
  }
}
