package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateSteps.LIMIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitStep
  extends StObject
     with AggregateStep[LIMIT] {
  
  var from: Double
  
  var size: Double
}
object LimitStep {
  
  inline def apply(from: Double, size: Double, `type`: LIMIT): LimitStep = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LimitStep] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
