package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@redis/client.@redis/client/dist/lib/commands/AUTH.AuthOptions> */
trait RequiredAuthOptions extends StObject {
  
  var password: RedisCommandArgument
  
  var username: RedisCommandArgument
}
object RequiredAuthOptions {
  
  inline def apply(password: RedisCommandArgument, username: RedisCommandArgument): RequiredAuthOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredAuthOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredAuthOptions] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: RedisCommandArgument): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: RedisCommandArgument): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
