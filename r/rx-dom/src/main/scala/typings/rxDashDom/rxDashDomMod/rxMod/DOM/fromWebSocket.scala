package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.std.CloseEvent
import typings.std.Event
import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromWebSocket")
@js.native
object fromWebSocket extends js.Object {
  // Web Sockets
  def apply(url: String, protocol: String): typings.rxDashCoreDashBinding.Rx.Subject[MessageEvent] = js.native
  def apply(url: String, protocol: String, openObserver: typings.rxDashCore.Rx.Observer[Event]): typings.rxDashCoreDashBinding.Rx.Subject[MessageEvent] = js.native
  def apply(
    url: String,
    protocol: String,
    openObserver: typings.rxDashCore.Rx.Observer[Event],
    closingObserver: typings.rxDashCore.Rx.Observer[CloseEvent]
  ): typings.rxDashCoreDashBinding.Rx.Subject[MessageEvent] = js.native
}

