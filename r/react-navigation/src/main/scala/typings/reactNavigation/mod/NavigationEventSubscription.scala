package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationEventSubscription extends StObject {
  
  def remove(): Unit
}
object NavigationEventSubscription {
  
  inline def apply(remove: () => Unit): NavigationEventSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[NavigationEventSubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationEventSubscription] (val x: Self) extends AnyVal {
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
