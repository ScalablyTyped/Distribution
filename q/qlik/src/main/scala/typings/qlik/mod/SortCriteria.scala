package typings.qlik.mod

import typings.qlik.qlikInts.`-1`
import typings.qlik.qlikInts.`0`
import typings.qlik.qlikInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCriteria extends StObject {
  
  var qExpression: ValueExpr
  
  var qSortByAscii: `-1` | `0` | `1`
  
  var qSortByExpression: `-1` | `0` | `1`
  
  var qSortByFrequency: `-1` | `0` | `1`
  
  var qSortByLoadOrder: `-1` | `0` | `1`
  
  var qSortByNumeric: `-1` | `0` | `1`
  
  var qSortByState: `-1` | `0` | `1`
}
object SortCriteria {
  
  inline def apply(
    qExpression: ValueExpr,
    qSortByAscii: `-1` | `0` | `1`,
    qSortByExpression: `-1` | `0` | `1`,
    qSortByFrequency: `-1` | `0` | `1`,
    qSortByLoadOrder: `-1` | `0` | `1`,
    qSortByNumeric: `-1` | `0` | `1`,
    qSortByState: `-1` | `0` | `1`
  ): SortCriteria = {
    val __obj = js.Dynamic.literal(qExpression = qExpression.asInstanceOf[js.Any], qSortByAscii = qSortByAscii.asInstanceOf[js.Any], qSortByExpression = qSortByExpression.asInstanceOf[js.Any], qSortByFrequency = qSortByFrequency.asInstanceOf[js.Any], qSortByLoadOrder = qSortByLoadOrder.asInstanceOf[js.Any], qSortByNumeric = qSortByNumeric.asInstanceOf[js.Any], qSortByState = qSortByState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortCriteria] (val x: Self) extends AnyVal {
    
    inline def setQExpression(value: ValueExpr): Self = StObject.set(x, "qExpression", value.asInstanceOf[js.Any])
    
    inline def setQSortByAscii(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByAscii", value.asInstanceOf[js.Any])
    
    inline def setQSortByExpression(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByExpression", value.asInstanceOf[js.Any])
    
    inline def setQSortByFrequency(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByFrequency", value.asInstanceOf[js.Any])
    
    inline def setQSortByLoadOrder(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByLoadOrder", value.asInstanceOf[js.Any])
    
    inline def setQSortByNumeric(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByNumeric", value.asInstanceOf[js.Any])
    
    inline def setQSortByState(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByState", value.asInstanceOf[js.Any])
  }
}
