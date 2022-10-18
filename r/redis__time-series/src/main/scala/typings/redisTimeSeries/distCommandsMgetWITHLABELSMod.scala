package typings.redisTimeSeries

import typings.redisTimeSeries.distCommandsMgetMod.MGetRawReply
import typings.redisTimeSeries.distCommandsMgetMod.MGetReply
import typings.redisTimeSeries.distCommandsMod.Filter
import typings.redisTimeSeries.distCommandsMod.Labels
import typings.redisTimeSeries.distCommandsMod.SampleReply
import typings.redisTimeSeries.distCommandsMod.SelectedLabels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsMgetWITHLABELSMod {
  
  @JSImport("@redis/time-series/dist/commands/MGET_WITHLABELS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/MGET_WITHLABELS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(filter: Filter): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(filter: Filter, options: MGetWithLabelsOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: MGetRawReply): js.Array[MGetWithLabelsReply] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[MGetWithLabelsReply]]
  
  trait MGetWithLabelsOptions extends StObject {
    
    var SELECTED_LABELS: js.UndefOr[SelectedLabels] = js.undefined
  }
  object MGetWithLabelsOptions {
    
    inline def apply(): MGetWithLabelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MGetWithLabelsOptions]
    }
    
    extension [Self <: MGetWithLabelsOptions](x: Self) {
      
      inline def setSELECTED_LABELS(value: SelectedLabels): Self = StObject.set(x, "SELECTED_LABELS", value.asInstanceOf[js.Any])
      
      inline def setSELECTED_LABELSUndefined: Self = StObject.set(x, "SELECTED_LABELS", js.undefined)
      
      inline def setSELECTED_LABELSVarargs(value: String*): Self = StObject.set(x, "SELECTED_LABELS", js.Array(value*))
    }
  }
  
  trait MGetWithLabelsReply
    extends StObject
       with MGetReply {
    
    var labels: Labels
  }
  object MGetWithLabelsReply {
    
    inline def apply(key: String, labels: Labels, sample: SampleReply): MGetWithLabelsReply = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
      __obj.asInstanceOf[MGetWithLabelsReply]
    }
    
    extension [Self <: MGetWithLabelsReply](x: Self) {
      
      inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    }
  }
}
