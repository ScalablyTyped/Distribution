package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationEventSubscription extends js.Object {
  def remove(): Unit = js.native
}

object NavigationEventSubscription {
  @scala.inline
  def apply(remove: () => Unit): NavigationEventSubscription = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[NavigationEventSubscription]
  }
  @scala.inline
  implicit class NavigationEventSubscriptionOps[Self <: NavigationEventSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

