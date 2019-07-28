package typings.reactDashNativeDashNavigation.libDistInterfacesEventSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSubscription extends js.Object {
  def remove(): Unit
}

object EventSubscription {
  @scala.inline
  def apply(remove: () => Unit): EventSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[EventSubscription]
  }
}

