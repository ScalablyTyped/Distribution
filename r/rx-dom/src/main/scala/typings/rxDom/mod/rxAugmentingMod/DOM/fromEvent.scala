package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.fromEvent")
@js.native
object fromEvent extends js.Object {
  
  // Events
  def apply[T](element: js.Any, eventName: String): Observable[T] = js.native
  def apply[T](element: js.Any, eventName: String, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): Observable[T] = js.native
  def apply[T](element: js.Any, eventName: String, selector: js.Function): Observable[T] = js.native
  def apply[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): Observable[T] = js.native
}
