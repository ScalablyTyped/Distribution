package typings.redisJson

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisJson.distCommandsMod.RedisJSON
import typings.redisJson.redisJsonBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsGetMod {
  
  @JSImport("@redis/json/dist/commands/GET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/json/dist/commands/GET", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/json/dist/commands/GET", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: String, options: GetOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisJSON | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisJSON | Null]
  inline def transformReply(json: String): RedisJSON | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(json.asInstanceOf[js.Any]).asInstanceOf[RedisJSON | Null]
  
  trait GetOptions extends StObject {
    
    var INDENT: js.UndefOr[String] = js.undefined
    
    var NEWLINE: js.UndefOr[String] = js.undefined
    
    var NOESCAPE: js.UndefOr[`true`] = js.undefined
    
    var SPACE: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object GetOptions {
    
    inline def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
      
      inline def setINDENT(value: String): Self = StObject.set(x, "INDENT", value.asInstanceOf[js.Any])
      
      inline def setINDENTUndefined: Self = StObject.set(x, "INDENT", js.undefined)
      
      inline def setNEWLINE(value: String): Self = StObject.set(x, "NEWLINE", value.asInstanceOf[js.Any])
      
      inline def setNEWLINEUndefined: Self = StObject.set(x, "NEWLINE", js.undefined)
      
      inline def setNOESCAPE(value: `true`): Self = StObject.set(x, "NOESCAPE", value.asInstanceOf[js.Any])
      
      inline def setNOESCAPEUndefined: Self = StObject.set(x, "NOESCAPE", js.undefined)
      
      inline def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setSPACE(value: String): Self = StObject.set(x, "SPACE", value.asInstanceOf[js.Any])
      
      inline def setSPACEUndefined: Self = StObject.set(x, "SPACE", js.undefined)
    }
  }
}
