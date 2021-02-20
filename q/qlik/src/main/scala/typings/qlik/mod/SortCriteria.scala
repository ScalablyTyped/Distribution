package typings.qlik.mod

import typings.qlik.qlikNumbers.`-1`
import typings.qlik.qlikNumbers.`0`
import typings.qlik.qlikNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortCriteria extends StObject {
  
  var qExpression: ValueExpr = js.native
  
  var qSortByAscii: `-1` | `0` | `1` = js.native
  
  var qSortByExpression: `-1` | `0` | `1` = js.native
  
  var qSortByFrequency: `-1` | `0` | `1` = js.native
  
  var qSortByLoadOrder: `-1` | `0` | `1` = js.native
  
  var qSortByNumeric: `-1` | `0` | `1` = js.native
  
  var qSortByState: `-1` | `0` | `1` = js.native
}
object SortCriteria {
  
  @scala.inline
  def apply(
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
  implicit class SortCriteriaMutableBuilder[Self <: SortCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQExpression(value: ValueExpr): Self = StObject.set(x, "qExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortByAscii(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByAscii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortByExpression(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortByFrequency(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortByLoadOrder(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByLoadOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortByNumeric(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortByState(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByState", value.asInstanceOf[js.Any])
  }
}
