package typings.rxDom.mod

import typings.rxDom.mod.rxAugmentingMod.DOM.AjaxSettings
import typings.rxDom.mod.rxAugmentingMod.DOM.AjaxSuccessResponse
import typings.rxDom.mod.rxAugmentingMod.DOM.GeolocationOptions
import typings.rxDom.mod.rxAugmentingMod.DOM.JsonpSettings
import typings.rxDom.mod.rxAugmentingMod.DOM.JsonpSuccessResponse
import typings.std.CloseEvent
import typings.std.Element
import typings.std.Event_
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
  def ajax(settingsOrUrl: String): typings.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  // Ajax
  def ajax(settingsOrUrl: AjaxSettings): typings.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  // Event Shortcuts
  def blur(element: Element): typings.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def change(element: Element): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def change(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def click(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def error(element: Element): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def error(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def error(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def focus(element: Element): typings.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def focusin(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  // Events
  def fromEvent[T](element: js.Any, eventName: String): typings.rxLiteAggregates.Rx.Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[T] = js.native
  // Server-Sent Events
  def fromEventSource[T](url: String): typings.rxLiteAggregates.Rx.Observable[T] = js.native
  def fromEventSource[T](url: String, openObservable: typings.rxCore.Rx.Observer[T]): typings.rxLiteAggregates.Rx.Observable[T] = js.native
  // Mutation Observers
  def fromMutationObserver(target: Node, options: MutationObserverInit): typings.rxLiteAggregates.Rx.Observable[MutationEvent] = js.native
  // Web Sockets
  def fromWebSocket(url: String, protocol: String): typings.rxCoreBinding.Rx.Subject[MessageEvent] = js.native
  def fromWebSocket(url: String, protocol: String, openObserver: typings.rxCore.Rx.Observer[Event_]): typings.rxCoreBinding.Rx.Subject[MessageEvent] = js.native
  def fromWebSocket(
    url: String,
    protocol: String,
    openObserver: typings.rxCore.Rx.Observer[Event_],
    closingObserver: typings.rxCore.Rx.Observer[CloseEvent]
  ): typings.rxCoreBinding.Rx.Subject[MessageEvent] = js.native
  // Web Workers
  def fromWebWorker(url: String): typings.rxCoreBinding.Rx.Subject[String] = js.native
  def get(url: String): typings.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  def getJSON(url: String): typings.rxLiteAggregates.Rx.Observable[String] = js.native
  def jsonpRequest(settings: JsonpSettings): typings.rxLiteAggregates.Rx.Observable[JsonpSuccessResponse] = js.native
  def jsonpRequest(url: String): typings.rxLiteAggregates.Rx.Observable[String] = js.native
  def keydown(element: Element): typings.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element): typings.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element): typings.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def load(element: Element): typings.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def mousedown(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  // Pointer Events
  def pointerdown(element: Element): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def post(url: String, body: js.Any): typings.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  def ready(): typings.rxLiteAggregates.Rx.Observable[_] = js.native
  def resize(element: Element): typings.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element): typings.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def select(element: Element): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def select(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def select(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def submit(element: Element): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def submit(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def submit(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  // Touch Events
  def touchcancel(element: Element): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def unload(element: Element): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def unload(element: Element, selector: js.Function): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def unload(element: Element, selector: js.Function, useCapture: Boolean): typings.rxLiteAggregates.Rx.Observable[Event_] = js.native
  // Geolocation
  @js.native
  object geolocation extends js.Object {
    def getCurrentPosition(): typings.rxLiteAggregates.Rx.Observable[Position] = js.native
    def getCurrentPosition(geolocationOptions: GeolocationOptions): typings.rxLiteAggregates.Rx.Observable[Position] = js.native
    def watchPosition(): typings.rxLiteAggregates.Rx.Observable[Position] = js.native
    def watchPosition(geolocationOptions: GeolocationOptions): typings.rxLiteAggregates.Rx.Observable[Position] = js.native
  }
  
}

