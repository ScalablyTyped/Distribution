package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reject extends StObject {
  
  var args: js.Array[RedisCommandArgument]
  
  var channelsCounter: Double
  
  def reject(): Unit
  
  def resolve(): Double
}
object Reject {
  
  inline def apply(
    args: js.Array[RedisCommandArgument],
    channelsCounter: Double,
    reject: () => Unit,
    resolve: () => Double
  ): Reject = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], channelsCounter = channelsCounter.asInstanceOf[js.Any], reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[Reject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reject] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setChannelsCounter(value: Double): Self = StObject.set(x, "channelsCounter", value.asInstanceOf[js.Any])
    
    inline def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
    
    inline def setResolve(value: () => Double): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
  }
}
