package typings.redisTimeSeries

import typings.redisTimeSeries.commandsMod.Labels
import typings.redisTimeSeries.commandsMod.TimeSeriesDuplicatePolicies
import typings.redisTimeSeries.commandsMod.TimeSeriesEncoding
import typings.redisTimeSeries.redisTimeSeriesStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMod {
  
  @JSImport("@redis/time-series/dist/commands/CREATE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/CREATE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, options: CreateOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait CreateOptions extends StObject {
    
    var CHUNK_SIZE: js.UndefOr[Double] = js.undefined
    
    var DUPLICATE_POLICY: js.UndefOr[TimeSeriesDuplicatePolicies] = js.undefined
    
    var ENCODING: js.UndefOr[TimeSeriesEncoding] = js.undefined
    
    var LABELS: js.UndefOr[Labels] = js.undefined
    
    var RETENTION: js.UndefOr[Double] = js.undefined
  }
  object CreateOptions {
    
    inline def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    extension [Self <: CreateOptions](x: Self) {
      
      inline def setCHUNK_SIZE(value: Double): Self = StObject.set(x, "CHUNK_SIZE", value.asInstanceOf[js.Any])
      
      inline def setCHUNK_SIZEUndefined: Self = StObject.set(x, "CHUNK_SIZE", js.undefined)
      
      inline def setDUPLICATE_POLICY(value: TimeSeriesDuplicatePolicies): Self = StObject.set(x, "DUPLICATE_POLICY", value.asInstanceOf[js.Any])
      
      inline def setDUPLICATE_POLICYUndefined: Self = StObject.set(x, "DUPLICATE_POLICY", js.undefined)
      
      inline def setENCODING(value: TimeSeriesEncoding): Self = StObject.set(x, "ENCODING", value.asInstanceOf[js.Any])
      
      inline def setENCODINGUndefined: Self = StObject.set(x, "ENCODING", js.undefined)
      
      inline def setLABELS(value: Labels): Self = StObject.set(x, "LABELS", value.asInstanceOf[js.Any])
      
      inline def setLABELSUndefined: Self = StObject.set(x, "LABELS", js.undefined)
      
      inline def setRETENTION(value: Double): Self = StObject.set(x, "RETENTION", value.asInstanceOf[js.Any])
      
      inline def setRETENTIONUndefined: Self = StObject.set(x, "RETENTION", js.undefined)
    }
  }
}
