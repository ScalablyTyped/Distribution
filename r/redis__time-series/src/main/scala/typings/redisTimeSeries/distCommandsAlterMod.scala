package typings.redisTimeSeries

import typings.redisTimeSeries.distCommandsMod.Labels
import typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies
import typings.redisTimeSeries.redisTimeSeriesStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsAlterMod {
  
  @JSImport("@redis/time-series/dist/commands/ALTER", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/ALTER", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, options: AlterOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait AlterOptions extends StObject {
    
    var CHUNK_SIZE: js.UndefOr[Double] = js.undefined
    
    var DUPLICATE_POLICY: js.UndefOr[TimeSeriesDuplicatePolicies] = js.undefined
    
    var LABELS: js.UndefOr[Labels] = js.undefined
    
    var RETENTION: js.UndefOr[Double] = js.undefined
  }
  object AlterOptions {
    
    inline def apply(): AlterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlterOptions] (val x: Self) extends AnyVal {
      
      inline def setCHUNK_SIZE(value: Double): Self = StObject.set(x, "CHUNK_SIZE", value.asInstanceOf[js.Any])
      
      inline def setCHUNK_SIZEUndefined: Self = StObject.set(x, "CHUNK_SIZE", js.undefined)
      
      inline def setDUPLICATE_POLICY(value: TimeSeriesDuplicatePolicies): Self = StObject.set(x, "DUPLICATE_POLICY", value.asInstanceOf[js.Any])
      
      inline def setDUPLICATE_POLICYUndefined: Self = StObject.set(x, "DUPLICATE_POLICY", js.undefined)
      
      inline def setLABELS(value: Labels): Self = StObject.set(x, "LABELS", value.asInstanceOf[js.Any])
      
      inline def setLABELSUndefined: Self = StObject.set(x, "LABELS", js.undefined)
      
      inline def setRETENTION(value: Double): Self = StObject.set(x, "RETENTION", value.asInstanceOf[js.Any])
      
      inline def setRETENTIONUndefined: Self = StObject.set(x, "RETENTION", js.undefined)
    }
  }
}
