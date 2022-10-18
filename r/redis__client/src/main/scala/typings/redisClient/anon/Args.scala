package typings.redisClient.anon

import typings.redisClient.distLibCommandOptionsMod.CommandOptions_
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args[T] extends StObject {
  
  var args: RedisCommandArguments
  
  var options: js.UndefOr[CommandOptions_[T]] = js.undefined
}
object Args {
  
  inline def apply[T](args: RedisCommandArguments): Args[T] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args[T]]
  }
  
  extension [Self <: Args[?], T](x: Self & Args[T]) {
    
    inline def setArgs(value: RedisCommandArguments): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: CommandOptions_[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
