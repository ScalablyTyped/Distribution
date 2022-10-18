package typings.redisTimeSeries

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.distCommandsMod.Filter
import typings.redisTimeSeries.distCommandsMod.RawLabels
import typings.redisTimeSeries.distCommandsMod.SampleRawReply
import typings.redisTimeSeries.distCommandsMod.SampleReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsMgetMod {
  
  @JSImport("@redis/time-series/dist/commands/MGET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/MGET", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(filter: Filter): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(filter.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: MGetRawReply): js.Array[MGetReply] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[MGetReply]]
  
  type MGetRawReply = js.Array[js.Tuple3[/* key */ String, /* labels */ RawLabels, /* sample */ SampleRawReply]]
  
  trait MGetReply extends StObject {
    
    var key: String
    
    var sample: SampleReply
  }
  object MGetReply {
    
    inline def apply(key: String, sample: SampleReply): MGetReply = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
      __obj.asInstanceOf[MGetReply]
    }
    
    extension [Self <: MGetReply](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSample(value: SampleReply): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    }
  }
}
