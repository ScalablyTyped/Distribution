package typings.rxDashDom.rxDashDomMod

import typings.rxDashCore.Rx.Observer
import typings.rxDashCoreDashBinding.Rx.Subject
import typings.rxDashDom.rxDashDomMod.rxMod.DOM.AjaxSettings
import typings.rxDashDom.rxDashDomMod.rxMod.DOM.AjaxSuccessResponse
import typings.rxDashDom.rxDashDomMod.rxMod.DOM.GeolocationOptions
import typings.rxDashDom.rxDashDomMod.rxMod.DOM.JsonpSettings
import typings.rxDashDom.rxDashDomMod.rxMod.DOM.JsonpSuccessResponse
import typings.rxDashLiteDashAggregates.Rx.Observable
import typings.std.CloseEvent
import typings.std.Element
import typings.std.Event
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MessageEvent
import typings.std.MouseEvent
import typings.std.MutationEvent
import typings.std.MutationObserverInit
import typings.std.Node
import typings.std.PointerEvent
import typings.std.Position
import typings.std.TouchEvent
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "DOM")
@js.native
object DOM extends js.Object {
  def ajax(settingsOrUrl: String): Observable[AjaxSuccessResponse] = js.native
  // Ajax
  def ajax(settingsOrUrl: AjaxSettings): Observable[AjaxSuccessResponse] = js.native
  // Event Shortcuts
  def blur(element: Element): Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function): Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function, useCapture: Boolean): Observable[FocusEvent] = js.native
  def change(element: Element): Observable[Event] = js.native
  def change(element: Element, selector: js.Function): Observable[Event] = js.native
  def click(element: Element): Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def contextmenu(element: Element): Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def dblclick(element: Element): Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def error(element: Element): Observable[Event] = js.native
  def error(element: Element, selector: js.Function): Observable[Event] = js.native
  def error(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = js.native
  def focus(element: Element): Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function): Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function, useCapture: Boolean): Observable[FocusEvent] = js.native
  def focusin(element: Element): Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def focusout(element: Element): Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  // Events
  def fromEvent[T](element: js.Any, eventName: String): Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function): Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): Observable[T] = js.native
  // Server-Sent Events
  def fromEventSource[T](url: String): Observable[T] = js.native
  def fromEventSource[T](url: String, openObservable: Observer[T]): Observable[T] = js.native
  // Mutation Observers
  def fromMutationObserver(target: Node, options: MutationObserverInit): Observable[MutationEvent] = js.native
  // Web Sockets
  def fromWebSocket(url: String, protocol: String): Subject[MessageEvent] = js.native
  def fromWebSocket(url: String, protocol: String, openObserver: Observer[Event]): Subject[MessageEvent] = js.native
  def fromWebSocket(
    url: String,
    protocol: String,
    openObserver: Observer[Event],
    closingObserver: Observer[CloseEvent]
  ): Subject[MessageEvent] = js.native
  // Web Workers
  def fromWebWorker(url: String): Subject[String] = js.native
  def get(url: String): Observable[AjaxSuccessResponse] = js.native
  def getJSON(url: String): Observable[String] = js.native
  def jsonpRequest(settings: JsonpSettings): Observable[JsonpSuccessResponse] = js.native
  def jsonpRequest(url: String): Observable[String] = js.native
  def keydown(element: Element): Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function): Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = js.native
  def keypress(element: Element): Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function): Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = js.native
  def keyup(element: Element): Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function): Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = js.native
  def load(element: Element): Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function): Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = js.native
  def mousedown(element: Element): Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def mouseenter(element: Element): Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def mouseleave(element: Element): Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def mousemove(element: Element): Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def mouseout(element: Element): Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def mouseover(element: Element): Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  def mouseup(element: Element): Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
  // Pointer Events
  def pointerdown(element: Element): Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
  def pointerenter(element: Element): Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
  def pointerleave(element: Element): Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
  def pointermove(element: Element): Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
  def pointerout(element: Element): Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
  def pointerover(element: Element): Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
  def pointerup(element: Element): Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
  def post(url: String, body: js.Any): Observable[AjaxSuccessResponse] = js.native
  def ready(): Observable[_] = js.native
  def resize(element: Element): Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function): Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = js.native
  def scroll(element: Element): Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function): Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = js.native
  def select(element: Element): Observable[Event] = js.native
  def select(element: Element, selector: js.Function): Observable[Event] = js.native
  def select(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = js.native
  def submit(element: Element): Observable[Event] = js.native
  def submit(element: Element, selector: js.Function): Observable[Event] = js.native
  def submit(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = js.native
  // Touch Events
  def touchcancel(element: Element): Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function): Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = js.native
  def touchend(element: Element): Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function): Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = js.native
  def touchmove(element: Element): Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function): Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = js.native
  def touchstart(element: Element): Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function): Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = js.native
  def unload(element: Element): Observable[Event] = js.native
  def unload(element: Element, selector: js.Function): Observable[Event] = js.native
  def unload(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = js.native
  // Geolocation
  @js.native
  object geolocation extends js.Object {
    def getCurrentPosition(): Observable[Position] = js.native
    def getCurrentPosition(geolocationOptions: GeolocationOptions): Observable[Position] = js.native
    def watchPosition(): Observable[Position] = js.native
    def watchPosition(geolocationOptions: GeolocationOptions): Observable[Position] = js.native
  }
  
}

