package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.aggregate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateExpression
  extends BaseExpression
     with _Expression {
  
  var aggregation: String = js.native
  
  var expression: Expression = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_AggregateExpression: aggregate = js.native
}
object AggregateExpression {
  
  @scala.inline
  def apply(aggregation: String, expression: Expression, `type`: aggregate): AggregateExpression = {
    val __obj = js.Dynamic.literal(aggregation = aggregation.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateExpression]
  }
  
  @scala.inline
  implicit class AggregateExpressionMutableBuilder[Self <: AggregateExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setType(value: aggregate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
