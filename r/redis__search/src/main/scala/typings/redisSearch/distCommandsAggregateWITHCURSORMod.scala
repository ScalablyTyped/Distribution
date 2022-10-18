package typings.redisSearch

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.distCommandsAggregateMod.AggregateOptions
import typings.redisSearch.distCommandsAggregateMod.AggregateRawReply
import typings.redisSearch.distCommandsAggregateMod.AggregateReply
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsAggregateWITHCURSORMod {
  
  @JSImport("@redis/search/dist/commands/AGGREGATE_WITHCURSOR", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/AGGREGATE_WITHCURSOR", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/search/dist/commands/AGGREGATE_WITHCURSOR", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(index: String, query: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(index: String, query: String, options: AggregateWithCursorOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: AggregateWithCursorRawReply): AggregateWithCursorReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[AggregateWithCursorReply]
  
  trait AggregateWithCursorOptions
    extends StObject
       with AggregateOptions {
    
    var COUNT: js.UndefOr[Double] = js.undefined
  }
  object AggregateWithCursorOptions {
    
    inline def apply(): AggregateWithCursorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AggregateWithCursorOptions]
    }
    
    extension [Self <: AggregateWithCursorOptions](x: Self) {
      
      inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
      
      inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
    }
  }
  
  type AggregateWithCursorRawReply = js.Tuple2[/* result */ AggregateRawReply, /* cursor */ Double]
  
  trait AggregateWithCursorReply
    extends StObject
       with AggregateReply {
    
    var cursor: Double
  }
  object AggregateWithCursorReply {
    
    inline def apply(cursor: Double, results: js.Array[Record[String, RedisCommandArgument]], total: Double): AggregateWithCursorReply = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[AggregateWithCursorReply]
    }
    
    extension [Self <: AggregateWithCursorReply](x: Self) {
      
      inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    }
  }
}
