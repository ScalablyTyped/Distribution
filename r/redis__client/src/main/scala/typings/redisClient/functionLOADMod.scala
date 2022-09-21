package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionLOADMod {
  
  @JSImport("@redis/client/dist/lib/commands/FUNCTION_LOAD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(code: String): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(code.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(code: String, options: FunctionLoadOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
  
  trait FunctionLoadOptions extends StObject {
    
    var REPLACE: js.UndefOr[Boolean] = js.undefined
  }
  object FunctionLoadOptions {
    
    inline def apply(): FunctionLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionLoadOptions]
    }
    
    extension [Self <: FunctionLoadOptions](x: Self) {
      
      inline def setREPLACE(value: Boolean): Self = StObject.set(x, "REPLACE", value.asInstanceOf[js.Any])
      
      inline def setREPLACEUndefined: Self = StObject.set(x, "REPLACE", js.undefined)
    }
  }
}
