package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.rxDashLiteDashAggregates.Rx.Observable
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.click")
@js.native
object click extends js.Object {
  def apply(element: Element): Observable[MouseEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
}

