package typings.redisClient

import typings.redisClient.anon.Command
import typings.redisClient.anon.FunctionsCount
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.command
import typings.redisClient.redisClientStrings.duration_ms
import typings.redisClient.redisClientStrings.engines
import typings.redisClient.redisClientStrings.name
import typings.redisClient.redisClientStrings.running_script
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsFunctionSTATSMod {
  
  @JSImport("@redis/client/dist/lib/commands/FUNCTION_STATS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: FunctionStatsRawReply): FunctionStatsReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[FunctionStatsReply]
  
  type FunctionStatsRawReply = js.Tuple4[
    running_script, 
    Null | (js.Tuple6[name, String, command, String, duration_ms, Double]), 
    engines, 
    js.Array[Any]
  ]
  
  trait FunctionStatsReply extends StObject {
    
    var engines: Record[String, FunctionsCount]
    
    var runningScript: Null | Command
  }
  object FunctionStatsReply {
    
    inline def apply(engines: Record[String, FunctionsCount]): FunctionStatsReply = {
      val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any], runningScript = null)
      __obj.asInstanceOf[FunctionStatsReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionStatsReply] (val x: Self) extends AnyVal {
      
      inline def setEngines(value: Record[String, FunctionsCount]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setRunningScript(value: Command): Self = StObject.set(x, "runningScript", value.asInstanceOf[js.Any])
      
      inline def setRunningScriptNull: Self = StObject.set(x, "runningScript", null)
    }
  }
}
