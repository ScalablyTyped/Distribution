package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import typings.std.Element
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.keypress")
@js.native
object keypress extends js.Object {
  
  def apply(element: Element): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = js.native
}
