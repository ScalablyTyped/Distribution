package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.rxDashCore.Rx.Observer
import typings.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromEventSource")
@js.native
object fromEventSource extends js.Object {
  // Server-Sent Events
  def apply[T](url: String): Observable[T] = js.native
  def apply[T](url: String, openObservable: Observer[T]): Observable[T] = js.native
}

