package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.rxDashLiteDashAggregates.Rx.Observable
import typings.std.Element
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.scroll")
@js.native
object scroll extends js.Object {
  def apply(element: Element): Observable[UIEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[UIEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = js.native
}

