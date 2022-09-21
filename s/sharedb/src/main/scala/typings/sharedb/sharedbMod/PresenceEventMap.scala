package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresenceEventMap[T] extends StObject {
  
  def error(error: Error): Unit
  
  def receive(id: String, value: T): Unit
  @JSName("receive")
  var receive_Original: ReceivePresenceListener[T]
}
object PresenceEventMap {
  
  inline def apply[T](error: Error => Unit, receive: (/* id */ String, T) => Unit): PresenceEventMap[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), receive = js.Any.fromFunction2(receive))
    __obj.asInstanceOf[PresenceEventMap[T]]
  }
  
  extension [Self <: PresenceEventMap[?], T](x: Self & PresenceEventMap[T]) {
    
    inline def setError(value: Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setReceive(value: (/* id */ String, T) => Unit): Self = StObject.set(x, "receive", js.Any.fromFunction2(value))
  }
}
