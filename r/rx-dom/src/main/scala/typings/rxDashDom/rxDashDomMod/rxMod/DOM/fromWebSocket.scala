package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.rxDashCore.Rx.Observer
import typings.rxDashCoreDashBinding.Rx.Subject
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
  def apply(url: String, protocol: String): Subject[MessageEvent] = js.native
  def apply(url: String, protocol: String, openObserver: Observer[Event]): Subject[MessageEvent] = js.native
  def apply(
    url: String,
    protocol: String,
    openObserver: Observer[Event],
    closingObserver: Observer[CloseEvent]
  ): Subject[MessageEvent] = js.native
}

