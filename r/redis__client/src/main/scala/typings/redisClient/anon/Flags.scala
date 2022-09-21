package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flags extends StObject {
  
  var flags: RedisCommandArguments
  
  var key: RedisCommandArgument
}
object Flags {
  
  inline def apply(flags: RedisCommandArguments, key: RedisCommandArgument): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  
  extension [Self <: Flags](x: Self) {
    
    inline def setFlags(value: RedisCommandArguments): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setKey(value: RedisCommandArgument): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
