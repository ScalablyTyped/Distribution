package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateSteps.SORTBY
import typings.redisSearch.distCommandsMod.SortByProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortStep
  extends StObject
     with AggregateStep[SORTBY] {
  
  var BY: SortByProperty | js.Array[SortByProperty]
  
  var MAX: js.UndefOr[Double] = js.undefined
}
object SortStep {
  
  inline def apply(BY: SortByProperty | js.Array[SortByProperty], `type`: SORTBY): SortStep = {
    val __obj = js.Dynamic.literal(BY = BY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortStep]
  }
  
  extension [Self <: SortStep](x: Self) {
    
    inline def setBY(value: SortByProperty | js.Array[SortByProperty]): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
    
    inline def setBYVarargs(value: SortByProperty*): Self = StObject.set(x, "BY", js.Array(value*))
    
    inline def setMAX(value: Double): Self = StObject.set(x, "MAX", value.asInstanceOf[js.Any])
    
    inline def setMAXUndefined: Self = StObject.set(x, "MAX", js.undefined)
  }
}
