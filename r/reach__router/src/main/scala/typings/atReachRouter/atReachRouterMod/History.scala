package typings.atReachRouter.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  val location: HistoryLocation
  var navigate: NavigateFn
  val transitioning: Boolean
  def listen(listener: HistoryListener): HistoryUnsubscribe
}

object History {
  @scala.inline
  def apply(
    listen: HistoryListener => HistoryUnsubscribe,
    location: HistoryLocation,
    navigate: NavigateFn,
    transitioning: Boolean
  ): History = {
    val __obj = js.Dynamic.literal(listen = js.Any.fromFunction1(listen), location = location, navigate = navigate, transitioning = transitioning)
  
    __obj.asInstanceOf[History]
  }
}

