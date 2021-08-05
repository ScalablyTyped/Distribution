package typings.reactNativeMauron85BackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSubscription extends StObject {
  
  def remove(): Unit
}
object EventSubscription {
  
  inline def apply(remove: () => Unit): EventSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[EventSubscription]
  }
  
  extension [Self <: EventSubscription](x: Self) {
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
