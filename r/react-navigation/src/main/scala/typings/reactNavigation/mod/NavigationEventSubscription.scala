package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationEventSubscription extends js.Object {
  def remove(): Unit
}

object NavigationEventSubscription {
  @scala.inline
  def apply(remove: () => Unit): NavigationEventSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[NavigationEventSubscription]
  }
}

