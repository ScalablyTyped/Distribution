package typings.redisClient.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolve extends StObject {
  
  var args: js.Array[String | Buffer]
  
  var channelsCounter: Double
  
  def reject(): Unit
  
  def resolve(): Double
}
object Resolve {
  
  inline def apply(
    args: js.Array[String | Buffer],
    channelsCounter: Double,
    reject: () => Unit,
    resolve: () => Double
  ): Resolve = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], channelsCounter = channelsCounter.asInstanceOf[js.Any], reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[Resolve]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resolve] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String | Buffer]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: (String | Buffer)*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setChannelsCounter(value: Double): Self = StObject.set(x, "channelsCounter", value.asInstanceOf[js.Any])
    
    inline def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
    
    inline def setResolve(value: () => Double): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
  }
}
