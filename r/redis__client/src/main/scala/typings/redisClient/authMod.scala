package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  @JSImport("@redis/client/dist/lib/commands/AUTH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(hasUsernamePassword: AuthOptions): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(hasUsernamePassword.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
  
  trait AuthOptions extends StObject {
    
    var password: RedisCommandArgument
    
    var username: js.UndefOr[RedisCommandArgument] = js.undefined
  }
  object AuthOptions {
    
    inline def apply(password: RedisCommandArgument): AuthOptions = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthOptions]
    }
    
    extension [Self <: AuthOptions](x: Self) {
      
      inline def setPassword(value: RedisCommandArgument): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: RedisCommandArgument): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
