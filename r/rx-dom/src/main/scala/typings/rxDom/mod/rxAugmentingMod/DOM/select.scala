package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rxLiteAggregates.Rx.Observable
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.select")
@js.native
object select extends js.Object {
  def apply(element: Element): Observable[Event] = js.native
  def apply(element: Element, selector: js.Function): Observable[Event] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = js.native
}

