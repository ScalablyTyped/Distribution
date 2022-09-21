package typings.redisJson

import typings.redisJson.commandsMod.RedisJSON
import typings.redisJson.redisJsonBooleans.`true`
import typings.redisJson.redisJsonStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMod {
  
  @JSImport("@redis/json/dist/commands/SET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/json/dist/commands/SET", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, path: String, json: RedisJSON): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: String, json: RedisJSON, options: NX): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: String, json: RedisJSON, options: XX): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK | Null]
  
  trait NX extends StObject {
    
    var NX: `true`
  }
  object NX {
    
    inline def apply(): NX = {
      val __obj = js.Dynamic.literal(NX = true)
      __obj.asInstanceOf[NX]
    }
    
    extension [Self <: NX](x: Self) {
      
      inline def setNX(value: `true`): Self = StObject.set(x, "NX", value.asInstanceOf[js.Any])
    }
  }
  
  trait XX extends StObject {
    
    var XX: `true`
  }
  object XX {
    
    inline def apply(): XX = {
      val __obj = js.Dynamic.literal(XX = true)
      __obj.asInstanceOf[XX]
    }
    
    extension [Self <: XX](x: Self) {
      
      inline def setXX(value: `true`): Self = StObject.set(x, "XX", value.asInstanceOf[js.Any])
    }
  }
}
