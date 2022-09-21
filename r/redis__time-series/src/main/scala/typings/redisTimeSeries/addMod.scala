package typings.redisTimeSeries

import typings.redisTimeSeries.commandsMod.Labels
import typings.redisTimeSeries.commandsMod.TimeSeriesDuplicatePolicies
import typings.redisTimeSeries.commandsMod.TimeSeriesEncoding
import typings.redisTimeSeries.commandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addMod {
  
  @JSImport("@redis/time-series/dist/commands/ADD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/ADD", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, timestamp: Timestamp, value: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, timestamp: Timestamp, value: Double, options: AddOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  trait AddOptions extends StObject {
    
    var CHUNK_SIZE: js.UndefOr[Double] = js.undefined
    
    var ENCODING: js.UndefOr[TimeSeriesEncoding] = js.undefined
    
    var LABELS: js.UndefOr[Labels] = js.undefined
    
    var ON_DUPLICATE: js.UndefOr[TimeSeriesDuplicatePolicies] = js.undefined
    
    var RETENTION: js.UndefOr[Double] = js.undefined
  }
  object AddOptions {
    
    inline def apply(): AddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddOptions]
    }
    
    extension [Self <: AddOptions](x: Self) {
      
      inline def setCHUNK_SIZE(value: Double): Self = StObject.set(x, "CHUNK_SIZE", value.asInstanceOf[js.Any])
      
      inline def setCHUNK_SIZEUndefined: Self = StObject.set(x, "CHUNK_SIZE", js.undefined)
      
      inline def setENCODING(value: TimeSeriesEncoding): Self = StObject.set(x, "ENCODING", value.asInstanceOf[js.Any])
      
      inline def setENCODINGUndefined: Self = StObject.set(x, "ENCODING", js.undefined)
      
      inline def setLABELS(value: Labels): Self = StObject.set(x, "LABELS", value.asInstanceOf[js.Any])
      
      inline def setLABELSUndefined: Self = StObject.set(x, "LABELS", js.undefined)
      
      inline def setON_DUPLICATE(value: TimeSeriesDuplicatePolicies): Self = StObject.set(x, "ON_DUPLICATE", value.asInstanceOf[js.Any])
      
      inline def setON_DUPLICATEUndefined: Self = StObject.set(x, "ON_DUPLICATE", js.undefined)
      
      inline def setRETENTION(value: Double): Self = StObject.set(x, "RETENTION", value.asInstanceOf[js.Any])
      
      inline def setRETENTIONUndefined: Self = StObject.set(x, "RETENTION", js.undefined)
    }
  }
}
