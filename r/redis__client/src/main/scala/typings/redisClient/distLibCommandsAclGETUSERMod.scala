package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.channels
import typings.redisClient.redisClientStrings.commands
import typings.redisClient.redisClientStrings.flags
import typings.redisClient.redisClientStrings.keys
import typings.redisClient.redisClientStrings.passwords
import typings.redisClient.redisClientStrings.selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsAclGETUSERMod {
  
  @JSImport("@redis/client/dist/lib/commands/ACL_GETUSER", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(username: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(username.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: AclGetUserRawReply): AclUser = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[AclUser]
  
  type AclGetUserRawReply = js.Tuple12[
    flags, 
    js.Array[RedisCommandArgument], 
    passwords, 
    js.Array[RedisCommandArgument], 
    commands, 
    RedisCommandArgument, 
    keys, 
    js.Array[RedisCommandArgument] | RedisCommandArgument, 
    channels, 
    js.Array[RedisCommandArgument] | RedisCommandArgument, 
    js.UndefOr[selectors], 
    js.UndefOr[js.Array[js.Array[String]]]
  ]
  
  trait AclUser extends StObject {
    
    var channels: js.Array[RedisCommandArgument] | RedisCommandArgument
    
    var commands: RedisCommandArgument
    
    var flags: js.Array[RedisCommandArgument]
    
    var keys: js.Array[RedisCommandArgument] | RedisCommandArgument
    
    var passwords: js.Array[RedisCommandArgument]
    
    var selectors: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  }
  object AclUser {
    
    inline def apply(
      channels: js.Array[RedisCommandArgument] | RedisCommandArgument,
      commands: RedisCommandArgument,
      flags: js.Array[RedisCommandArgument],
      keys: js.Array[RedisCommandArgument] | RedisCommandArgument,
      passwords: js.Array[RedisCommandArgument]
    ): AclUser = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], passwords = passwords.asInstanceOf[js.Any])
      __obj.asInstanceOf[AclUser]
    }
    
    extension [Self <: AclUser](x: Self) {
      
      inline def setChannels(value: js.Array[RedisCommandArgument] | RedisCommandArgument): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "channels", js.Array(value*))
      
      inline def setCommands(value: RedisCommandArgument): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "flags", js.Array(value*))
      
      inline def setKeys(value: js.Array[RedisCommandArgument] | RedisCommandArgument): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setPasswords(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "passwords", value.asInstanceOf[js.Any])
      
      inline def setPasswordsVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "passwords", js.Array(value*))
      
      inline def setSelectors(value: js.Array[js.Array[String]]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setSelectorsVarargs(value: js.Array[String]*): Self = StObject.set(x, "selectors", js.Array(value*))
    }
  }
}
