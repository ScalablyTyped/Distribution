package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SortCriteria...
  */
trait ISortCriteria extends StObject {
  
  /**
    * Sort by expression.
    */
  var qExpression: js.UndefOr[IValueExpr] = js.undefined
  
  /**
    * Sorts the field by alphabetical order.
    */
  var qSortByAscii: js.UndefOr[TypeSortDirection] = js.undefined
  
  /**
    * Sorts the field by expression.
    */
  var qSortByExpression: js.UndefOr[TypeSortDirection] = js.undefined
  
  /**
    * Sorts the field values by frequency
    * (number of occurrences in the field).
    */
  var qSortByFrequency: js.UndefOr[TypeSortDirection] = js.undefined
  
  /**
    * no / empty docu
    */
  var qSortByGreyness: js.UndefOr[TypeSortDirection] = js.undefined
  
  /**
    * Sorts the field values by the initial load order.
    */
  var qSortByLoadOrder: js.UndefOr[TypeSortDirection] = js.undefined
  
  /**
    * Sorts the field values by numeric value.
    */
  var qSortByNumeric: js.UndefOr[TypeSortDirection] = js.undefined
  
  /**
    * Sorts the field values according to their logical state
    * (selected, optional, alternative or excluded).
    */
  var qSortByState: js.UndefOr[TypeSortDirection] = js.undefined
}
object ISortCriteria {
  
  inline def apply(): ISortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISortCriteria] (val x: Self) extends AnyVal {
    
    inline def setQExpression(value: IValueExpr): Self = StObject.set(x, "qExpression", value.asInstanceOf[js.Any])
    
    inline def setQExpressionUndefined: Self = StObject.set(x, "qExpression", js.undefined)
    
    inline def setQSortByAscii(value: TypeSortDirection): Self = StObject.set(x, "qSortByAscii", value.asInstanceOf[js.Any])
    
    inline def setQSortByAsciiUndefined: Self = StObject.set(x, "qSortByAscii", js.undefined)
    
    inline def setQSortByExpression(value: TypeSortDirection): Self = StObject.set(x, "qSortByExpression", value.asInstanceOf[js.Any])
    
    inline def setQSortByExpressionUndefined: Self = StObject.set(x, "qSortByExpression", js.undefined)
    
    inline def setQSortByFrequency(value: TypeSortDirection): Self = StObject.set(x, "qSortByFrequency", value.asInstanceOf[js.Any])
    
    inline def setQSortByFrequencyUndefined: Self = StObject.set(x, "qSortByFrequency", js.undefined)
    
    inline def setQSortByGreyness(value: TypeSortDirection): Self = StObject.set(x, "qSortByGreyness", value.asInstanceOf[js.Any])
    
    inline def setQSortByGreynessUndefined: Self = StObject.set(x, "qSortByGreyness", js.undefined)
    
    inline def setQSortByLoadOrder(value: TypeSortDirection): Self = StObject.set(x, "qSortByLoadOrder", value.asInstanceOf[js.Any])
    
    inline def setQSortByLoadOrderUndefined: Self = StObject.set(x, "qSortByLoadOrder", js.undefined)
    
    inline def setQSortByNumeric(value: TypeSortDirection): Self = StObject.set(x, "qSortByNumeric", value.asInstanceOf[js.Any])
    
    inline def setQSortByNumericUndefined: Self = StObject.set(x, "qSortByNumeric", js.undefined)
    
    inline def setQSortByState(value: TypeSortDirection): Self = StObject.set(x, "qSortByState", value.asInstanceOf[js.Any])
    
    inline def setQSortByStateUndefined: Self = StObject.set(x, "qSortByState", js.undefined)
  }
}
