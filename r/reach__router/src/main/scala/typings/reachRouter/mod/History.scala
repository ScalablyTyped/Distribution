package typings.reachRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  val location: HistoryLocation = js.native
  var navigate: NavigateFn = js.native
  val transitioning: Boolean = js.native
  def listen(listener: HistoryListener): HistoryUnsubscribe = js.native
}

object History {
  @scala.inline
  def apply(
    listen: HistoryListener => HistoryUnsubscribe,
    location: HistoryLocation,
    navigate: NavigateFn,
    transitioning: Boolean
  ): History = {
    val __obj = js.Dynamic.literal(listen = js.Any.fromFunction1(listen), location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], transitioning = transitioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
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
    def setListen(value: HistoryListener => HistoryUnsubscribe): Self = this.set("listen", js.Any.fromFunction1(value))
    @scala.inline
    def setLocation(value: HistoryLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigate(value: NavigateFn): Self = this.set("navigate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitioning(value: Boolean): Self = this.set("transitioning", value.asInstanceOf[js.Any])
  }
  
}

