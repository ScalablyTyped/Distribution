package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateSteps.FILTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterStep
  extends StObject
     with AggregateStep[FILTER] {
  
  var expression: String
}
object FilterStep {
  
  inline def apply(expression: String, `type`: FILTER): FilterStep = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterStep]
  }
  
  extension [Self <: FilterStep](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
