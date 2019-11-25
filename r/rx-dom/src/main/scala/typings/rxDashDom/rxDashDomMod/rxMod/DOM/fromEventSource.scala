package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromEventSource")
@js.native
object fromEventSource extends js.Object {
  // Server-Sent Events
  def apply[T](url: String): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
  def apply[T](url: String, openObservable: typings.rxDashCore.Rx.Observer[T]): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
}

