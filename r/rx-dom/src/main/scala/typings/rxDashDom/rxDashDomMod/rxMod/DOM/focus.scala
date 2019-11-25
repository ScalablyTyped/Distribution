package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.std.Element
import typings.std.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.focus")
@js.native
object focus extends js.Object {
  def apply(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[FocusEvent] = js.native
  def apply(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[FocusEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[FocusEvent] = js.native
}

