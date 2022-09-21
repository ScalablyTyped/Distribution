package typings.redisSearch.aggregateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateStep[T /* <: AggregateSteps */] extends StObject {
  
  var `type`: T
}
object AggregateStep {
  
  inline def apply[T /* <: AggregateSteps */](`type`: T): AggregateStep[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateStep[T]]
  }
  
  extension [Self <: AggregateStep[?], T /* <: AggregateSteps */](x: Self & AggregateStep[T]) {
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
