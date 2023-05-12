package typings.redisClient.anon

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listener extends StObject {
  
  def listener(): Unit
  
  var signal: AbortSignal
}
object Listener {
  
  inline def apply(listener: () => Unit, signal: AbortSignal): Listener = {
    val __obj = js.Dynamic.literal(listener = js.Any.fromFunction0(listener), signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
    
    inline def setListener(value: () => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction0(value))
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
