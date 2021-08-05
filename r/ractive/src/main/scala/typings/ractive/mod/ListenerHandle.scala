package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerHandle extends StObject {
  
  /**
  	 * Removes the listener from the event.j
  	 */
  def cancel(): Unit
}
object ListenerHandle {
  
  inline def apply(cancel: () => Unit): ListenerHandle = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[ListenerHandle]
  }
  
  extension [Self <: ListenerHandle](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
