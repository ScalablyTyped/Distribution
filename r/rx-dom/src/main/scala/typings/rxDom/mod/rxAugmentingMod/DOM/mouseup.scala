package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.mouseup")
@js.native
object mouseup extends js.Object {
  def apply(element: Element): Observable[MouseEvent] = js.native
  def apply(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): Observable[MouseEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
}

