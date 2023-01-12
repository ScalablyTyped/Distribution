package typings.redisSearch.distCommandsAggregateMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateStep[?], T /* <: AggregateSteps */] (val x: Self & AggregateStep[T]) extends AnyVal {
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
