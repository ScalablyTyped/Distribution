package typings.redisSearch.aggregateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupByReducer[T /* <: AggregateGroupByReducers */] extends StObject {
  
  var AS: js.UndefOr[String] = js.undefined
  
  var `type`: T
}
object GroupByReducer {
  
  inline def apply[T /* <: AggregateGroupByReducers */](`type`: T): GroupByReducer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupByReducer[T]]
  }
  
  extension [Self <: GroupByReducer[?], T /* <: AggregateGroupByReducers */](x: Self & GroupByReducer[T]) {
    
    inline def setAS(value: String): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
    
    inline def setASUndefined: Self = StObject.set(x, "AS", js.undefined)
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
