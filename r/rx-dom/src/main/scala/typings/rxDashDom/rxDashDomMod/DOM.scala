package typings.rxDashDom.rxDashDomMod

import typings.rxDashDom.rxDashDomMod.rxMod.DOM.AjaxSettings
import typings.rxDashDom.rxDashDomMod.rxMod.DOM.AjaxSuccessResponse
import typings.rxDashDom.rxDashDomMod.rxMod.DOM.GeolocationOptions
import typings.rxDashDom.rxDashDomMod.rxMod.DOM.JsonpSettings
import typings.rxDashDom.rxDashDomMod.rxMod.DOM.JsonpSuccessResponse
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
  def ajax(settingsOrUrl: String): typings.rxDashLiteDashAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  // Ajax
  def ajax(settingsOrUrl: AjaxSettings): typings.rxDashLiteDashAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  // Event Shortcuts
  def blur(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[FocusEvent] = js.native
  def change(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def change(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def click(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def error(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def error(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def error(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def focus(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[FocusEvent] = js.native
  def focusin(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  // Events
  def fromEvent[T](element: js.Any, eventName: String): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
  // Server-Sent Events
  def fromEventSource[T](url: String): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
  def fromEventSource[T](url: String, openObservable: typings.rxDashCore.Rx.Observer[T]): typings.rxDashLiteDashAggregates.Rx.Observable[T] = js.native
  // Mutation Observers
  def fromMutationObserver(target: Node, options: MutationObserverInit): typings.rxDashLiteDashAggregates.Rx.Observable[MutationEvent] = js.native
  // Web Sockets
  def fromWebSocket(url: String, protocol: String): typings.rxDashCoreDashBinding.Rx.Subject[MessageEvent] = js.native
  def fromWebSocket(url: String, protocol: String, openObserver: typings.rxDashCore.Rx.Observer[Event]): typings.rxDashCoreDashBinding.Rx.Subject[MessageEvent] = js.native
  def fromWebSocket(
    url: String,
    protocol: String,
    openObserver: typings.rxDashCore.Rx.Observer[Event],
    closingObserver: typings.rxDashCore.Rx.Observer[CloseEvent]
  ): typings.rxDashCoreDashBinding.Rx.Subject[MessageEvent] = js.native
  // Web Workers
  def fromWebWorker(url: String): typings.rxDashCoreDashBinding.Rx.Subject[String] = js.native
  def get(url: String): typings.rxDashLiteDashAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  def getJSON(url: String): typings.rxDashLiteDashAggregates.Rx.Observable[String] = js.native
  def jsonpRequest(settings: JsonpSettings): typings.rxDashLiteDashAggregates.Rx.Observable[JsonpSuccessResponse] = js.native
  def jsonpRequest(url: String): typings.rxDashLiteDashAggregates.Rx.Observable[String] = js.native
  def keydown(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[KeyboardEvent] = js.native
  def load(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[UIEvent] = js.native
  def mousedown(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[MouseEvent] = js.native
  // Pointer Events
  def pointerdown(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[PointerEvent] = js.native
  def post(url: String, body: js.Any): typings.rxDashLiteDashAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  def ready(): typings.rxDashLiteDashAggregates.Rx.Observable[_] = js.native
  def resize(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[UIEvent] = js.native
  def select(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def select(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def select(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def submit(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def submit(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def submit(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  // Touch Events
  def touchcancel(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[TouchEvent] = js.native
  def unload(element: Element): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def unload(element: Element, selector: js.Function): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  def unload(element: Element, selector: js.Function, useCapture: Boolean): typings.rxDashLiteDashAggregates.Rx.Observable[Event] = js.native
  // Geolocation
  @js.native
  object geolocation extends js.Object {
    def getCurrentPosition(): typings.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
    def getCurrentPosition(geolocationOptions: GeolocationOptions): typings.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
    def watchPosition(): typings.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
    def watchPosition(geolocationOptions: GeolocationOptions): typings.rxDashLiteDashAggregates.Rx.Observable[Position] = js.native
  }
  
}

