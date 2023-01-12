package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsAclLOGMod {
  
  @JSImport("@redis/client/dist/lib/commands/ACL_LOG", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  inline def transformArguments(count: Double): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(count.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[AclLogRawReply]): js.Array[AclLog] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[AclLog]]
  
  trait AclLog extends StObject {
    
    var ageSeconds: Double
    
    var clientInfo: RedisCommandArgument
    
    var context: RedisCommandArgument
    
    var count: Double
    
    var `object`: RedisCommandArgument
    
    var reason: RedisCommandArgument
    
    var username: RedisCommandArgument
  }
  object AclLog {
    
    inline def apply(
      ageSeconds: Double,
      clientInfo: RedisCommandArgument,
      context: RedisCommandArgument,
      count: Double,
      `object`: RedisCommandArgument,
      reason: RedisCommandArgument,
      username: RedisCommandArgument
    ): AclLog = {
      val __obj = js.Dynamic.literal(ageSeconds = ageSeconds.asInstanceOf[js.Any], clientInfo = clientInfo.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AclLog]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AclLog] (val x: Self) extends AnyVal {
      
      inline def setAgeSeconds(value: Double): Self = StObject.set(x, "ageSeconds", value.asInstanceOf[js.Any])
      
      inline def setClientInfo(value: RedisCommandArgument): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
      
      inline def setContext(value: RedisCommandArgument): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setObject(value: RedisCommandArgument): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setReason(value: RedisCommandArgument): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: RedisCommandArgument): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  type AclLogRawReply = js.Tuple14[
    /* _ */ RedisCommandArgument, 
    /* count */ Double, 
    /* _ */ RedisCommandArgument, 
    /* reason */ RedisCommandArgument, 
    /* _ */ RedisCommandArgument, 
    /* context */ RedisCommandArgument, 
    /* _ */ RedisCommandArgument, 
    /* object */ RedisCommandArgument, 
    /* _ */ RedisCommandArgument, 
    /* username */ RedisCommandArgument, 
    /* _ */ RedisCommandArgument, 
    /* ageSeconds */ RedisCommandArgument, 
    /* _ */ RedisCommandArgument, 
    /* clientInfo */ RedisCommandArgument
  ]
}
