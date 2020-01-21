package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rxLiteAggregates.Rx.Observable
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.unload")
@js.native
object unload extends js.Object {
  def apply(element: Element): Observable[Event_] = js.native
  def apply(element: Element, selector: js.Function): Observable[Event_] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event_] = js.native
}

