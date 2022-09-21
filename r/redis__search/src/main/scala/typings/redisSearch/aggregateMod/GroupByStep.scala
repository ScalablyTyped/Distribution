package typings.redisSearch.aggregateMod

import typings.redisSearch.aggregateMod.AggregateSteps.GROUPBY
import typings.redisSearch.commandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupByStep
  extends StObject
     with AggregateStep[GROUPBY] {
  
  var REDUCE: GroupByReducers | js.Array[GroupByReducers]
  
  var properties: js.UndefOr[PropertyName | js.Array[PropertyName]] = js.undefined
}
object GroupByStep {
  
  inline def apply(REDUCE: GroupByReducers | js.Array[GroupByReducers], `type`: GROUPBY): GroupByStep = {
    val __obj = js.Dynamic.literal(REDUCE = REDUCE.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupByStep]
  }
  
  extension [Self <: GroupByStep](x: Self) {
    
    inline def setProperties(value: PropertyName | js.Array[PropertyName]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: PropertyName*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setREDUCE(value: GroupByReducers | js.Array[GroupByReducers]): Self = StObject.set(x, "REDUCE", value.asInstanceOf[js.Any])
    
    inline def setREDUCEVarargs(value: GroupByReducers*): Self = StObject.set(x, "REDUCE", js.Array(value*))
  }
}
