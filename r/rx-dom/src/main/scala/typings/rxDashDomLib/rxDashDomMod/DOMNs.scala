package typings
package rxDashDomLib.rxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "DOM")
@js.native
object DOMNs extends js.Object {
  // Ajax
  def ajax(settingsOrUrl: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[rxDashDomLib.rxDashDomMod.rxMod.DOMNs.AjaxSuccessResponse] = js.native
  // Ajax
  def ajax(settingsOrUrl: rxDashDomLib.rxDashDomMod.rxMod.DOMNs.AjaxSettings): rxDashLiteDashAggregatesLib.RxNs.Observable[rxDashDomLib.rxDashDomMod.rxMod.DOMNs.AjaxSuccessResponse] = js.native
  // Event Shortcuts
  def blur(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.FocusEvent] = js.native
  // Event Shortcuts
  def blur(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.FocusEvent] = js.native
  // Event Shortcuts
  def blur(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.FocusEvent] = js.native
  def change(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def change(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def click(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def click(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def click(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def contextmenu(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def contextmenu(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def contextmenu(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def dblclick(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def dblclick(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def dblclick(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def error(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def error(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def error(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def focus(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.FocusEvent] = js.native
  def focus(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.FocusEvent] = js.native
  def focus(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.FocusEvent] = js.native
  def focusin(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def focusin(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def focusin(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def focusout(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def focusout(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def focusout(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  // Events
  def fromEvent[T](element: js.Any, eventName: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  // Events
  def fromEvent[T](element: js.Any, eventName: java.lang.String, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  // Events
  def fromEvent[T](element: js.Any, eventName: java.lang.String, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  // Server-Sent Events
  def fromEventSource[T](url: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  // Server-Sent Events
  def fromEventSource[T](url: java.lang.String, openObservable: rxDashCoreLib.RxNs.Observer[T]): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  // Mutation Observers
  def fromMutationObserver(target: stdLib.Node, options: stdLib.MutationObserverInit): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MutationEvent] = js.native
  // Web Sockets
  def fromWebSocket(url: java.lang.String, protocol: java.lang.String): rxDashCoreDashBindingLib.RxNs.Subject[stdLib.MessageEvent] = js.native
  // Web Sockets
  def fromWebSocket(
    url: java.lang.String,
    protocol: java.lang.String,
    openObserver: rxDashCoreLib.RxNs.Observer[stdLib.Event]
  ): rxDashCoreDashBindingLib.RxNs.Subject[stdLib.MessageEvent] = js.native
  // Web Sockets
  def fromWebSocket(
    url: java.lang.String,
    protocol: java.lang.String,
    openObserver: rxDashCoreLib.RxNs.Observer[stdLib.Event],
    closingObserver: rxDashCoreLib.RxNs.Observer[stdLib.CloseEvent]
  ): rxDashCoreDashBindingLib.RxNs.Subject[stdLib.MessageEvent] = js.native
  // Web Workers
  def fromWebWorker(url: java.lang.String): rxDashCoreDashBindingLib.RxNs.Subject[java.lang.String] = js.native
  def get(url: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[rxDashDomLib.rxDashDomMod.rxMod.DOMNs.AjaxSuccessResponse] = js.native
  def getJSON(url: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[java.lang.String] = js.native
  def jsonpRequest(settings: rxDashDomLib.rxDashDomMod.rxMod.DOMNs.JsonpSettings): rxDashLiteDashAggregatesLib.RxNs.Observable[rxDashDomLib.rxDashDomMod.rxMod.DOMNs.JsonpSuccessResponse] = js.native
  def jsonpRequest(url: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[java.lang.String] = js.native
  def keydown(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.KeyboardEvent] = js.native
  def keydown(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.KeyboardEvent] = js.native
  def keydown(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.KeyboardEvent] = js.native
  def keypress(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.KeyboardEvent] = js.native
  def keypress(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.KeyboardEvent] = js.native
  def keypress(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.KeyboardEvent] = js.native
  def keyup(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.KeyboardEvent] = js.native
  def keyup(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.KeyboardEvent] = js.native
  def keyup(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.KeyboardEvent] = js.native
  def load(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.UIEvent] = js.native
  def load(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.UIEvent] = js.native
  def load(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.UIEvent] = js.native
  def mousedown(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mousedown(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mousedown(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseenter(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseenter(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseenter(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseleave(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseleave(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseleave(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mousemove(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mousemove(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mousemove(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseout(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseout(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseout(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseover(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseover(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseover(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseup(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseup(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  def mouseup(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MouseEvent] = js.native
  // Pointer Events
  def pointerdown(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  // Pointer Events
  def pointerdown(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  // Pointer Events
  def pointerdown(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerenter(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerenter(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerenter(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerleave(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerleave(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerleave(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointermove(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointermove(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointermove(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerout(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerout(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerout(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerover(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerover(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerover(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerup(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerup(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def pointerup(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
  def post(url: java.lang.String, body: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[rxDashDomLib.rxDashDomMod.rxMod.DOMNs.AjaxSuccessResponse] = js.native
  def ready(): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def resize(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.UIEvent] = js.native
  def resize(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.UIEvent] = js.native
  def resize(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.UIEvent] = js.native
  def scroll(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.UIEvent] = js.native
  def scroll(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.UIEvent] = js.native
  def scroll(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.UIEvent] = js.native
  def select(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def select(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def select(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def submit(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def submit(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def submit(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  // Touch Events
  def touchcancel(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  // Touch Events
  def touchcancel(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  // Touch Events
  def touchcancel(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def touchend(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def touchend(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def touchend(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def touchmove(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def touchmove(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def touchmove(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def touchstart(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def touchstart(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def touchstart(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
  def unload(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def unload(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  def unload(element: stdLib.Element, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Event] = js.native
  // Geolocation
  @JSName("geolocation")
  @js.native
  object geolocationNs extends js.Object {
    def getCurrentPosition(): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Position] = js.native
    def getCurrentPosition(geolocationOptions: rxDashDomLib.rxDashDomMod.rxMod.DOMNs.GeolocationOptions): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Position] = js.native
    def watchPosition(): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Position] = js.native
    def watchPosition(geolocationOptions: rxDashDomLib.rxDashDomMod.rxMod.DOMNs.GeolocationOptions): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.Position] = js.native
  }
  
}

