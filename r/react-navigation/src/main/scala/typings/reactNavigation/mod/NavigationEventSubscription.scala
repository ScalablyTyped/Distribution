package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationEventSubscription extends StObject {
  
  def remove(): Unit = js.native
}
object NavigationEventSubscription {
  
  @scala.inline
  def apply(remove: () => Unit): NavigationEventSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[NavigationEventSubscription]
  }
  
  @scala.inline
  implicit class NavigationEventSubscriptionMutableBuilder[Self <: NavigationEventSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
