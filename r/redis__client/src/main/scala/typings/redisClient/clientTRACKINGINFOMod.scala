package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.flags
import typings.redisClient.redisClientStrings.prefixes
import typings.redisClient.redisClientStrings.redirect
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientTRACKINGINFOMod {
  
  @JSImport("@redis/client/dist/lib/commands/CLIENT_TRACKINGINFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: RawReply): Reply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Reply]
  
  type RawReply = js.Tuple6[flags, js.Array[String], redirect, Double, prefixes, js.Array[String]]
  
  trait Reply extends StObject {
    
    var flags: Set[String]
    
    var prefixes: js.Array[String]
    
    var redirect: Double
  }
  object Reply {
    
    inline def apply(flags: Set[String], prefixes: js.Array[String], redirect: Double): Reply = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reply]
    }
    
    extension [Self <: Reply](x: Self) {
      
      inline def setFlags(value: Set[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value*))
      
      inline def setRedirect(value: Double): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    }
  }
}
