package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import typings.std.Element
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.resize")
@js.native
object resize extends js.Object {
  
  def apply(element: Element): Observable[UIEvent] = js.native
  def apply(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): Observable[UIEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[UIEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = js.native
}
