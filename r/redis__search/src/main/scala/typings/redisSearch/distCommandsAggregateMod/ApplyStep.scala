package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateSteps.APPLY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyStep
  extends StObject
     with AggregateStep[APPLY] {
  
  var AS: String
  
  var expression: String
}
object ApplyStep {
  
  inline def apply(AS: String, expression: String, `type`: APPLY): ApplyStep = {
    val __obj = js.Dynamic.literal(AS = AS.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyStep]
  }
  
  extension [Self <: ApplyStep](x: Self) {
    
    inline def setAS(value: String): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
