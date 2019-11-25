package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.std.Element
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.touchcancel")
@js.native
object touchcancel extends js.Object {
  // Touch Events
  def apply(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
}

