package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guardduty {
  
  trait FilterFindingCriteria extends StObject {
    
    var criterions: js.Array[FilterFindingCriteriaCriterion]
  }
  object FilterFindingCriteria {
    
    inline def apply(criterions: js.Array[FilterFindingCriteriaCriterion]): FilterFindingCriteria = {
      val __obj = js.Dynamic.literal(criterions = criterions.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterFindingCriteria]
    }
    
    extension [Self <: FilterFindingCriteria](x: Self) {
      
      inline def setCriterions(value: js.Array[FilterFindingCriteriaCriterion]): Self = StObject.set(x, "criterions", value.asInstanceOf[js.Any])
      
      inline def setCriterionsVarargs(value: FilterFindingCriteriaCriterion*): Self = StObject.set(x, "criterions", js.Array(value :_*))
    }
  }
  
  trait FilterFindingCriteriaCriterion extends StObject {
    
    /**
      * List of string values to be evaluated.
      */
    @JSName("equals")
    var equals_FFilterFindingCriteriaCriterion: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
      */
    var field: String
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var greaterThan: js.UndefOr[String] = js.undefined
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var greaterThanOrEqual: js.UndefOr[String] = js.undefined
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var lessThan: js.UndefOr[String] = js.undefined
    
    /**
      * A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
      */
    var lessThanOrEqual: js.UndefOr[String] = js.undefined
    
    /**
      * List of string values to be evaluated.
      */
    var notEquals: js.UndefOr[js.Array[String]] = js.undefined
  }
  object FilterFindingCriteriaCriterion {
    
    inline def apply(field: String): FilterFindingCriteriaCriterion = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterFindingCriteriaCriterion]
    }
    
    extension [Self <: FilterFindingCriteriaCriterion](x: Self) {
      
      inline def setEquals_(value: js.Array[String]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setEquals_Varargs(value: String*): Self = StObject.set(x, "equals", js.Array(value :_*))
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setGreaterThan(value: String): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
      
      inline def setGreaterThanOrEqual(value: String): Self = StObject.set(x, "greaterThanOrEqual", value.asInstanceOf[js.Any])
      
      inline def setGreaterThanOrEqualUndefined: Self = StObject.set(x, "greaterThanOrEqual", js.undefined)
      
      inline def setGreaterThanUndefined: Self = StObject.set(x, "greaterThan", js.undefined)
      
      inline def setLessThan(value: String): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
      
      inline def setLessThanOrEqual(value: String): Self = StObject.set(x, "lessThanOrEqual", value.asInstanceOf[js.Any])
      
      inline def setLessThanOrEqualUndefined: Self = StObject.set(x, "lessThanOrEqual", js.undefined)
      
      inline def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
      
      inline def setNotEquals(value: js.Array[String]): Self = StObject.set(x, "notEquals", value.asInstanceOf[js.Any])
      
      inline def setNotEqualsUndefined: Self = StObject.set(x, "notEquals", js.undefined)
      
      inline def setNotEqualsVarargs(value: String*): Self = StObject.set(x, "notEquals", js.Array(value :_*))
    }
  }
}
