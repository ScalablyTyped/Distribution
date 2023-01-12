package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommand
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibLuaScriptMod {
  
  @JSImport("@redis/client/dist/lib/lua-script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defineScript[S /* <: RedisScriptConfig */](script: S): S & SHA1 = ^.asInstanceOf[js.Dynamic].applyDynamic("defineScript")(script.asInstanceOf[js.Any]).asInstanceOf[S & SHA1]
  
  inline def scriptSha1(script: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("scriptSha1")(script.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait RedisScriptConfig
    extends StObject
       with RedisCommand {
    
    var NUMBER_OF_KEYS: js.UndefOr[Double] = js.undefined
    
    var SCRIPT: String
  }
  object RedisScriptConfig {
    
    inline def apply(SCRIPT: String, transformArguments: /* repeated */ Any => RedisCommandArguments): RedisScriptConfig = {
      val __obj = js.Dynamic.literal(SCRIPT = SCRIPT.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments))
      __obj.asInstanceOf[RedisScriptConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisScriptConfig] (val x: Self) extends AnyVal {
      
      inline def setNUMBER_OF_KEYS(value: Double): Self = StObject.set(x, "NUMBER_OF_KEYS", value.asInstanceOf[js.Any])
      
      inline def setNUMBER_OF_KEYSUndefined: Self = StObject.set(x, "NUMBER_OF_KEYS", js.undefined)
      
      inline def setSCRIPT(value: String): Self = StObject.set(x, "SCRIPT", value.asInstanceOf[js.Any])
    }
  }
  
  trait SHA1 extends StObject {
    
    var SHA1: String
  }
  object SHA1 {
    
    inline def apply(SHA1: String): SHA1 = {
      val __obj = js.Dynamic.literal(SHA1 = SHA1.asInstanceOf[js.Any])
      __obj.asInstanceOf[SHA1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SHA1] (val x: Self) extends AnyVal {
      
      inline def setSHA1(value: String): Self = StObject.set(x, "SHA1", value.asInstanceOf[js.Any])
    }
  }
}
