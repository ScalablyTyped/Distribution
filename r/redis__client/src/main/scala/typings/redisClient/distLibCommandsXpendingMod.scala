package typings.redisClient

import typings.redisClient.anon.DeliveriesCounter
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXpendingMod {
  
  @JSImport("@redis/client/dist/lib/commands/XPENDING", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XPENDING", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XPENDING", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, group: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: XPendingRawReply): XPendingReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[XPendingReply]
  
  type XPendingRawReply = js.Tuple4[
    /* pending */ Double, 
    /* firstId */ RedisCommandArgument | Null, 
    /* lastId */ RedisCommandArgument | Null, 
    /* consumers */ (js.Array[
      js.Tuple2[/* name */ RedisCommandArgument, /* deliveriesCounter */ RedisCommandArgument]
    ]) | Null
  ]
  
  trait XPendingReply extends StObject {
    
    var consumers: js.Array[DeliveriesCounter] | Null
    
    var firstId: RedisCommandArgument | Null
    
    var lastId: RedisCommandArgument | Null
    
    var pending: Double
  }
  object XPendingReply {
    
    inline def apply(pending: Double): XPendingReply = {
      val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], consumers = null, firstId = null, lastId = null)
      __obj.asInstanceOf[XPendingReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XPendingReply] (val x: Self) extends AnyVal {
      
      inline def setConsumers(value: js.Array[DeliveriesCounter]): Self = StObject.set(x, "consumers", value.asInstanceOf[js.Any])
      
      inline def setConsumersNull: Self = StObject.set(x, "consumers", null)
      
      inline def setConsumersVarargs(value: DeliveriesCounter*): Self = StObject.set(x, "consumers", js.Array(value*))
      
      inline def setFirstId(value: RedisCommandArgument): Self = StObject.set(x, "firstId", value.asInstanceOf[js.Any])
      
      inline def setFirstIdNull: Self = StObject.set(x, "firstId", null)
      
      inline def setLastId(value: RedisCommandArgument): Self = StObject.set(x, "lastId", value.asInstanceOf[js.Any])
      
      inline def setLastIdNull: Self = StObject.set(x, "lastId", null)
      
      inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    }
  }
}
