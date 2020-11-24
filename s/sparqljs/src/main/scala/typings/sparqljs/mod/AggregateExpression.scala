package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.aggregate
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
  implicit class AggregateExpressionOps[Self <: AggregateExpression] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: String): Self = this.set("aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: aggregate): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
