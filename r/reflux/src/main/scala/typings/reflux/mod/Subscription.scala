package typings.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  var listenable: Listenable = js.native
  var stop: js.Function = js.native
}

object Subscription {
  @scala.inline
  def apply(listenable: Listenable, stop: js.Function): Subscription = {
    val __obj = js.Dynamic.literal(listenable = listenable.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
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
    def setListenable(value: Listenable): Self = this.set("listenable", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: js.Function): Self = this.set("stop", value.asInstanceOf[js.Any])
  }
  
}

