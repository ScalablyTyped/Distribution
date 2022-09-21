package typings.redisClient

import typings.redisClient.anon.RequiredAuthOptions
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helloMod {
  
  @JSImport("@redis/client/dist/lib/commands/HELLO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  inline def transformArguments(options: HelloOptions): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(options.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: HelloRawReply): HelloTransformedReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[HelloTransformedReply]
  
  trait HelloOptions extends StObject {
    
    var auth: js.UndefOr[RequiredAuthOptions] = js.undefined
    
    var clientName: js.UndefOr[String] = js.undefined
    
    var protover: Double
  }
  object HelloOptions {
    
    inline def apply(protover: Double): HelloOptions = {
      val __obj = js.Dynamic.literal(protover = protover.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloOptions]
    }
    
    extension [Self <: HelloOptions](x: Self) {
      
      inline def setAuth(value: RequiredAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
      
      inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
      
      inline def setProtover(value: Double): Self = StObject.set(x, "protover", value.asInstanceOf[js.Any])
    }
  }
  
  type HelloRawReply = js.Tuple14[
    /* _ */ scala.Nothing, 
    /* server */ RedisCommandArgument, 
    /* _ */ scala.Nothing, 
    /* version */ RedisCommandArgument, 
    /* _ */ scala.Nothing, 
    /* proto */ Double, 
    /* _ */ scala.Nothing, 
    /* id */ Double, 
    /* _ */ scala.Nothing, 
    /* mode */ RedisCommandArgument, 
    /* _ */ scala.Nothing, 
    /* role */ RedisCommandArgument, 
    /* _ */ scala.Nothing, 
    /* modules */ js.Array[RedisCommandArgument]
  ]
  
  trait HelloTransformedReply extends StObject {
    
    var id: Double
    
    var mode: RedisCommandArgument
    
    var modules: js.Array[RedisCommandArgument]
    
    var proto: Double
    
    var role: RedisCommandArgument
    
    var server: RedisCommandArgument
    
    var version: RedisCommandArgument
  }
  object HelloTransformedReply {
    
    inline def apply(
      id: Double,
      mode: RedisCommandArgument,
      modules: js.Array[RedisCommandArgument],
      proto: Double,
      role: RedisCommandArgument,
      server: RedisCommandArgument,
      version: RedisCommandArgument
    ): HelloTransformedReply = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelloTransformedReply]
    }
    
    extension [Self <: HelloTransformedReply](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMode(value: RedisCommandArgument): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModules(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setProto(value: Double): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      inline def setRole(value: RedisCommandArgument): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setServer(value: RedisCommandArgument): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: RedisCommandArgument): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
