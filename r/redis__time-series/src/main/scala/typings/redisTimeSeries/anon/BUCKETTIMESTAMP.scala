package typings.redisTimeSeries.anon

import typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType
import typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp
import typings.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BUCKETTIMESTAMP extends StObject {
  
  var BUCKETTIMESTAMP: js.UndefOr[TimeSeriesBucketTimestamp] = js.undefined
  
  var EMPTY: js.UndefOr[Boolean] = js.undefined
  
  var timeBucket: Timestamp
  
  var `type`: TimeSeriesAggregationType
}
object BUCKETTIMESTAMP {
  
  inline def apply(timeBucket: Timestamp, `type`: TimeSeriesAggregationType): BUCKETTIMESTAMP = {
    val __obj = js.Dynamic.literal(timeBucket = timeBucket.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BUCKETTIMESTAMP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BUCKETTIMESTAMP] (val x: Self) extends AnyVal {
    
    inline def setBUCKETTIMESTAMP(value: TimeSeriesBucketTimestamp): Self = StObject.set(x, "BUCKETTIMESTAMP", value.asInstanceOf[js.Any])
    
    inline def setBUCKETTIMESTAMPUndefined: Self = StObject.set(x, "BUCKETTIMESTAMP", js.undefined)
    
    inline def setEMPTY(value: Boolean): Self = StObject.set(x, "EMPTY", value.asInstanceOf[js.Any])
    
    inline def setEMPTYUndefined: Self = StObject.set(x, "EMPTY", js.undefined)
    
    inline def setTimeBucket(value: Timestamp): Self = StObject.set(x, "timeBucket", value.asInstanceOf[js.Any])
    
    inline def setType(value: TimeSeriesAggregationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
