package typings.redisSearch.distCommandsAggregateMod

import typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE
import typings.redisSearch.distCommandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomSampleReducer
  extends StObject
     with GroupByReducer[RANDOM_SAMPLE]
     with _GroupByReducers {
  
  var property: PropertyName
  
  var sampleSize: Double
}
object RandomSampleReducer {
  
  inline def apply(property: PropertyName, sampleSize: Double, `type`: RANDOM_SAMPLE): RandomSampleReducer = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], sampleSize = sampleSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomSampleReducer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RandomSampleReducer] (val x: Self) extends AnyVal {
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
  }
}
