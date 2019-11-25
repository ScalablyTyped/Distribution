package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromEvent")
@js.native
object fromEvent extends js.Object {
  // Events
  def apply[T](element: js.Any, eventName: String): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
  def apply[T](element: js.Any, eventName: String, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
  def apply[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
}

