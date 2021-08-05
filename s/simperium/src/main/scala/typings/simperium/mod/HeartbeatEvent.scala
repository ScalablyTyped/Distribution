package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeartbeatEvent
  extends StObject
     with SimperiumEvent {
  
  def beat(count: Double): Unit
  
  def timeout(): Unit
}
object HeartbeatEvent {
  
  inline def apply(beat: Double => Unit, timeout: () => Unit): HeartbeatEvent = {
    val __obj = js.Dynamic.literal(beat = js.Any.fromFunction1(beat), timeout = js.Any.fromFunction0(timeout))
    __obj.asInstanceOf[HeartbeatEvent]
  }
  
  extension [Self <: HeartbeatEvent](x: Self) {
    
    inline def setBeat(value: Double => Unit): Self = StObject.set(x, "beat", js.Any.fromFunction1(value))
    
    inline def setTimeout(value: () => Unit): Self = StObject.set(x, "timeout", js.Any.fromFunction0(value))
  }
}
