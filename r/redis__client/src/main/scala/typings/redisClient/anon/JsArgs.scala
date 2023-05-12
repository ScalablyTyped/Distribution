package typings.redisClient.anon

import typings.redisClient.distLibCommandOptionsMod.CommandOptions_
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsArgs[T] extends StObject {
  
  var args: RedisCommandArguments
  
  var jsArgs: js.Array[Any]
  
  var options: js.UndefOr[CommandOptions_[T]] = js.undefined
}
object JsArgs {
  
  inline def apply[T](args: RedisCommandArguments, jsArgs: js.Array[Any]): JsArgs[T] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], jsArgs = jsArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsArgs[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsArgs[?], T] (val x: Self & JsArgs[T]) extends AnyVal {
    
    inline def setArgs(value: RedisCommandArguments): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setJsArgs(value: js.Array[Any]): Self = StObject.set(x, "jsArgs", value.asInstanceOf[js.Any])
    
    inline def setJsArgsVarargs(value: Any*): Self = StObject.set(x, "jsArgs", js.Array(value*))
    
    inline def setOptions(value: CommandOptions_[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
