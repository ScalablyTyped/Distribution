package typings.rxDom.mod

import typings.std.CloseEvent
import typings.std.Element
import typings.std.Event
import typings.std.FocusEvent
import typings.std.GeolocationPosition
import typings.std.KeyboardEvent
import typings.std.MessageEvent
import typings.std.MouseEvent
import typings.std.MutationEvent
import typings.std.MutationObserverInit
import typings.std.Node
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.UIEvent
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object rxAugmentingMod {
  
  object DOM {
    
    @JSImport("rx", "DOM.ajax")
    @js.native
    def ajax(settingsOrUrl: String): typings.rx.Rx.Observable[AjaxSuccessResponse] = js.native
    // Ajax
    @JSImport("rx", "DOM.ajax")
    @js.native
    def ajax(settingsOrUrl: AjaxSettings): typings.rx.Rx.Observable[AjaxSuccessResponse] = js.native
    
    // Event Shortcuts
    @JSImport("rx", "DOM.blur")
    @js.native
    def blur(element: Element): typings.rx.Rx.Observable[FocusEvent] = js.native
    @JSImport("rx", "DOM.blur")
    @js.native
    def blur(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[FocusEvent] = js.native
    @JSImport("rx", "DOM.blur")
    @js.native
    def blur(element: Element, selector: js.Function): typings.rx.Rx.Observable[FocusEvent] = js.native
    @JSImport("rx", "DOM.blur")
    @js.native
    def blur(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[FocusEvent] = js.native
    
    @JSImport("rx", "DOM.change")
    @js.native
    def change(element: Element): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.change")
    @js.native
    def change(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = js.native
    
    @JSImport("rx", "DOM.click")
    @js.native
    def click(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.click")
    @js.native
    def click(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.click")
    @js.native
    def click(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.click")
    @js.native
    def click(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.contextmenu")
    @js.native
    def contextmenu(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.contextmenu")
    @js.native
    def contextmenu(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.contextmenu")
    @js.native
    def contextmenu(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.contextmenu")
    @js.native
    def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.dblclick")
    @js.native
    def dblclick(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.dblclick")
    @js.native
    def dblclick(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.dblclick")
    @js.native
    def dblclick(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.dblclick")
    @js.native
    def dblclick(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.error")
    @js.native
    def error(element: Element): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.error")
    @js.native
    def error(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.error")
    @js.native
    def error(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.error")
    @js.native
    def error(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[Event] = js.native
    
    @JSImport("rx", "DOM.focus")
    @js.native
    def focus(element: Element): typings.rx.Rx.Observable[FocusEvent] = js.native
    @JSImport("rx", "DOM.focus")
    @js.native
    def focus(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[FocusEvent] = js.native
    @JSImport("rx", "DOM.focus")
    @js.native
    def focus(element: Element, selector: js.Function): typings.rx.Rx.Observable[FocusEvent] = js.native
    @JSImport("rx", "DOM.focus")
    @js.native
    def focus(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[FocusEvent] = js.native
    
    @JSImport("rx", "DOM.focusin")
    @js.native
    def focusin(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.focusin")
    @js.native
    def focusin(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.focusin")
    @js.native
    def focusin(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.focusin")
    @js.native
    def focusin(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.focusout")
    @js.native
    def focusout(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.focusout")
    @js.native
    def focusout(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.focusout")
    @js.native
    def focusout(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.focusout")
    @js.native
    def focusout(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    // Events
    @JSImport("rx", "DOM.fromEvent")
    @js.native
    def fromEvent[T](element: js.Any, eventName: String): typings.rx.Rx.Observable[T] = js.native
    @JSImport("rx", "DOM.fromEvent")
    @js.native
    def fromEvent[T](element: js.Any, eventName: String, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[T] = js.native
    @JSImport("rx", "DOM.fromEvent")
    @js.native
    def fromEvent[T](element: js.Any, eventName: String, selector: js.Function): typings.rx.Rx.Observable[T] = js.native
    @JSImport("rx", "DOM.fromEvent")
    @js.native
    def fromEvent[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[T] = js.native
    
    // Server-Sent Events
    @JSImport("rx", "DOM.fromEventSource")
    @js.native
    def fromEventSource[T](url: String): typings.rx.Rx.Observable[T] = js.native
    @JSImport("rx", "DOM.fromEventSource")
    @js.native
    def fromEventSource[T](url: String, openObservable: typings.rx.Rx.Observer[T]): typings.rx.Rx.Observable[T] = js.native
    
    // Mutation Observers
    @JSImport("rx", "DOM.fromMutationObserver")
    @js.native
    def fromMutationObserver(target: Node, options: MutationObserverInit): typings.rx.Rx.Observable[MutationEvent] = js.native
    
    // Web Sockets
    @JSImport("rx", "DOM.fromWebSocket")
    @js.native
    def fromWebSocket(url: String, protocol: String): typings.rx.Rx.Subject[MessageEvent[_]] = js.native
    @JSImport("rx", "DOM.fromWebSocket")
    @js.native
    def fromWebSocket(
      url: String,
      protocol: String,
      openObserver: js.UndefOr[scala.Nothing],
      closingObserver: typings.rx.Rx.Observer[CloseEvent]
    ): typings.rx.Rx.Subject[MessageEvent[_]] = js.native
    @JSImport("rx", "DOM.fromWebSocket")
    @js.native
    def fromWebSocket(url: String, protocol: String, openObserver: typings.rx.Rx.Observer[Event]): typings.rx.Rx.Subject[MessageEvent[_]] = js.native
    @JSImport("rx", "DOM.fromWebSocket")
    @js.native
    def fromWebSocket(
      url: String,
      protocol: String,
      openObserver: typings.rx.Rx.Observer[Event],
      closingObserver: typings.rx.Rx.Observer[CloseEvent]
    ): typings.rx.Rx.Subject[MessageEvent[_]] = js.native
    
    // Web Workers
    @JSImport("rx", "DOM.fromWebWorker")
    @js.native
    def fromWebWorker(url: String): typings.rx.Rx.Subject[String] = js.native
    
    // Geolocation
    object geolocation {
      
      @JSImport("rx", "DOM.geolocation.getCurrentPosition")
      @js.native
      def getCurrentPosition(): typings.rx.Rx.Observable[GeolocationPosition] = js.native
      @JSImport("rx", "DOM.geolocation.getCurrentPosition")
      @js.native
      def getCurrentPosition(geolocationOptions: GeolocationOptions): typings.rx.Rx.Observable[GeolocationPosition] = js.native
      
      @JSImport("rx", "DOM.geolocation.watchPosition")
      @js.native
      def watchPosition(): typings.rx.Rx.Observable[GeolocationPosition] = js.native
      @JSImport("rx", "DOM.geolocation.watchPosition")
      @js.native
      def watchPosition(geolocationOptions: GeolocationOptions): typings.rx.Rx.Observable[GeolocationPosition] = js.native
    }
    
    @JSImport("rx", "DOM.get")
    @js.native
    def get(url: String): typings.rx.Rx.Observable[AjaxSuccessResponse] = js.native
    
    @JSImport("rx", "DOM.getJSON")
    @js.native
    def getJSON(url: String): typings.rx.Rx.Observable[String] = js.native
    
    @JSImport("rx", "DOM.jsonpRequest")
    @js.native
    def jsonpRequest(settings: JsonpSettings): typings.rx.Rx.Observable[JsonpSuccessResponse] = js.native
    @JSImport("rx", "DOM.jsonpRequest")
    @js.native
    def jsonpRequest(url: String): typings.rx.Rx.Observable[String] = js.native
    
    @JSImport("rx", "DOM.keydown")
    @js.native
    def keydown(element: Element): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    @JSImport("rx", "DOM.keydown")
    @js.native
    def keydown(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    @JSImport("rx", "DOM.keydown")
    @js.native
    def keydown(element: Element, selector: js.Function): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    @JSImport("rx", "DOM.keydown")
    @js.native
    def keydown(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    
    @JSImport("rx", "DOM.keypress")
    @js.native
    def keypress(element: Element): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    @JSImport("rx", "DOM.keypress")
    @js.native
    def keypress(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    @JSImport("rx", "DOM.keypress")
    @js.native
    def keypress(element: Element, selector: js.Function): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    @JSImport("rx", "DOM.keypress")
    @js.native
    def keypress(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    
    @JSImport("rx", "DOM.keyup")
    @js.native
    def keyup(element: Element): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    @JSImport("rx", "DOM.keyup")
    @js.native
    def keyup(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    @JSImport("rx", "DOM.keyup")
    @js.native
    def keyup(element: Element, selector: js.Function): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    @JSImport("rx", "DOM.keyup")
    @js.native
    def keyup(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = js.native
    
    @JSImport("rx", "DOM.load")
    @js.native
    def load(element: Element): typings.rx.Rx.Observable[UIEvent] = js.native
    @JSImport("rx", "DOM.load")
    @js.native
    def load(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = js.native
    @JSImport("rx", "DOM.load")
    @js.native
    def load(element: Element, selector: js.Function): typings.rx.Rx.Observable[UIEvent] = js.native
    @JSImport("rx", "DOM.load")
    @js.native
    def load(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = js.native
    
    @JSImport("rx", "DOM.mousedown")
    @js.native
    def mousedown(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mousedown")
    @js.native
    def mousedown(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mousedown")
    @js.native
    def mousedown(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mousedown")
    @js.native
    def mousedown(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.mouseenter")
    @js.native
    def mouseenter(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseenter")
    @js.native
    def mouseenter(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseenter")
    @js.native
    def mouseenter(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseenter")
    @js.native
    def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.mouseleave")
    @js.native
    def mouseleave(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseleave")
    @js.native
    def mouseleave(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseleave")
    @js.native
    def mouseleave(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseleave")
    @js.native
    def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.mousemove")
    @js.native
    def mousemove(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mousemove")
    @js.native
    def mousemove(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mousemove")
    @js.native
    def mousemove(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mousemove")
    @js.native
    def mousemove(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.mouseout")
    @js.native
    def mouseout(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseout")
    @js.native
    def mouseout(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseout")
    @js.native
    def mouseout(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseout")
    @js.native
    def mouseout(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.mouseover")
    @js.native
    def mouseover(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseover")
    @js.native
    def mouseover(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseover")
    @js.native
    def mouseover(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseover")
    @js.native
    def mouseover(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    @JSImport("rx", "DOM.mouseup")
    @js.native
    def mouseup(element: Element): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseup")
    @js.native
    def mouseup(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseup")
    @js.native
    def mouseup(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = js.native
    @JSImport("rx", "DOM.mouseup")
    @js.native
    def mouseup(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = js.native
    
    // Pointer Events
    @JSImport("rx", "DOM.pointerdown")
    @js.native
    def pointerdown(element: Element): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerdown")
    @js.native
    def pointerdown(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerdown")
    @js.native
    def pointerdown(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerdown")
    @js.native
    def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    
    @JSImport("rx", "DOM.pointerenter")
    @js.native
    def pointerenter(element: Element): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerenter")
    @js.native
    def pointerenter(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerenter")
    @js.native
    def pointerenter(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerenter")
    @js.native
    def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    
    @JSImport("rx", "DOM.pointerleave")
    @js.native
    def pointerleave(element: Element): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerleave")
    @js.native
    def pointerleave(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerleave")
    @js.native
    def pointerleave(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerleave")
    @js.native
    def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    
    @JSImport("rx", "DOM.pointermove")
    @js.native
    def pointermove(element: Element): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointermove")
    @js.native
    def pointermove(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointermove")
    @js.native
    def pointermove(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointermove")
    @js.native
    def pointermove(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    
    @JSImport("rx", "DOM.pointerout")
    @js.native
    def pointerout(element: Element): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerout")
    @js.native
    def pointerout(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerout")
    @js.native
    def pointerout(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerout")
    @js.native
    def pointerout(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    
    @JSImport("rx", "DOM.pointerover")
    @js.native
    def pointerover(element: Element): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerover")
    @js.native
    def pointerover(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerover")
    @js.native
    def pointerover(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerover")
    @js.native
    def pointerover(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    
    @JSImport("rx", "DOM.pointerup")
    @js.native
    def pointerup(element: Element): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerup")
    @js.native
    def pointerup(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerup")
    @js.native
    def pointerup(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = js.native
    @JSImport("rx", "DOM.pointerup")
    @js.native
    def pointerup(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = js.native
    
    @JSImport("rx", "DOM.post")
    @js.native
    def post(url: String, body: js.Any): typings.rx.Rx.Observable[AjaxSuccessResponse] = js.native
    
    @JSImport("rx", "DOM.ready")
    @js.native
    def ready(): typings.rx.Rx.Observable[_] = js.native
    
    @JSImport("rx", "DOM.resize")
    @js.native
    def resize(element: Element): typings.rx.Rx.Observable[UIEvent] = js.native
    @JSImport("rx", "DOM.resize")
    @js.native
    def resize(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = js.native
    @JSImport("rx", "DOM.resize")
    @js.native
    def resize(element: Element, selector: js.Function): typings.rx.Rx.Observable[UIEvent] = js.native
    @JSImport("rx", "DOM.resize")
    @js.native
    def resize(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = js.native
    
    @JSImport("rx", "DOM.scroll")
    @js.native
    def scroll(element: Element): typings.rx.Rx.Observable[UIEvent] = js.native
    @JSImport("rx", "DOM.scroll")
    @js.native
    def scroll(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = js.native
    @JSImport("rx", "DOM.scroll")
    @js.native
    def scroll(element: Element, selector: js.Function): typings.rx.Rx.Observable[UIEvent] = js.native
    @JSImport("rx", "DOM.scroll")
    @js.native
    def scroll(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = js.native
    
    @JSImport("rx", "DOM.select")
    @js.native
    def select(element: Element): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.select")
    @js.native
    def select(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.select")
    @js.native
    def select(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.select")
    @js.native
    def select(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[Event] = js.native
    
    @JSImport("rx", "DOM.submit")
    @js.native
    def submit(element: Element): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.submit")
    @js.native
    def submit(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.submit")
    @js.native
    def submit(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.submit")
    @js.native
    def submit(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[Event] = js.native
    
    // Touch Events
    @JSImport("rx", "DOM.touchcancel")
    @js.native
    def touchcancel(element: Element): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchcancel")
    @js.native
    def touchcancel(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchcancel")
    @js.native
    def touchcancel(element: Element, selector: js.Function): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchcancel")
    @js.native
    def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = js.native
    
    @JSImport("rx", "DOM.touchend")
    @js.native
    def touchend(element: Element): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchend")
    @js.native
    def touchend(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchend")
    @js.native
    def touchend(element: Element, selector: js.Function): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchend")
    @js.native
    def touchend(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = js.native
    
    @JSImport("rx", "DOM.touchmove")
    @js.native
    def touchmove(element: Element): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchmove")
    @js.native
    def touchmove(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchmove")
    @js.native
    def touchmove(element: Element, selector: js.Function): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchmove")
    @js.native
    def touchmove(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = js.native
    
    @JSImport("rx", "DOM.touchstart")
    @js.native
    def touchstart(element: Element): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchstart")
    @js.native
    def touchstart(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchstart")
    @js.native
    def touchstart(element: Element, selector: js.Function): typings.rx.Rx.Observable[TouchEvent] = js.native
    @JSImport("rx", "DOM.touchstart")
    @js.native
    def touchstart(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = js.native
    
    @JSImport("rx", "DOM.unload")
    @js.native
    def unload(element: Element): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.unload")
    @js.native
    def unload(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.unload")
    @js.native
    def unload(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = js.native
    @JSImport("rx", "DOM.unload")
    @js.native
    def unload(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[Event] = js.native
    
    @js.native
    trait AjaxErrorResponse extends StObject {
      
      var originalEvent: Event = js.native
      
      var status: Double = js.native
      
      var `type`: String = js.native
      
      var xhr: XMLHttpRequest = js.native
    }
    object AjaxErrorResponse {
      
      @scala.inline
      def apply(originalEvent: Event, status: Double, `type`: String, xhr: XMLHttpRequest): AjaxErrorResponse = {
        val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[AjaxErrorResponse]
      }
      
      @scala.inline
      implicit class AjaxErrorResponseMutableBuilder[Self <: AjaxErrorResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait AjaxSettings extends StObject {
      
      var async: js.UndefOr[Boolean] = js.native
      
      var body: js.UndefOr[String] = js.native
      
      // This options does not seem to be used in the code yet
      // contentType?: string;
      var crossDomain: js.UndefOr[Boolean] = js.native
      
      var headers: js.UndefOr[js.Any] = js.native
      
      var method: js.UndefOr[String] = js.native
      
      var password: js.UndefOr[String] = js.native
      
      var progressObserver: js.UndefOr[typings.rx.Rx.Observer[_]] = js.native
      
      var responseType: js.UndefOr[String] = js.native
      
      var url: js.UndefOr[String] = js.native
      
      var user: js.UndefOr[String] = js.native
    }
    object AjaxSettings {
      
      @scala.inline
      def apply(): AjaxSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AjaxSettings]
      }
      
      @scala.inline
      implicit class AjaxSettingsMutableBuilder[Self <: AjaxSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        @scala.inline
        def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        @scala.inline
        def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
        
        @scala.inline
        def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        @scala.inline
        def setProgressObserver(value: typings.rx.Rx.Observer[_]): Self = StObject.set(x, "progressObserver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProgressObserverUndefined: Self = StObject.set(x, "progressObserver", js.undefined)
        
        @scala.inline
        def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        
        @scala.inline
        def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    @js.native
    trait AjaxSuccessResponse extends StObject {
      
      var originalEvent: Event = js.native
      
      var response: js.Any = js.native
      
      var responseType: String = js.native
      
      var status: Double = js.native
      
      var xhr: XMLHttpRequest = js.native
    }
    object AjaxSuccessResponse {
      
      @scala.inline
      def apply(originalEvent: Event, response: js.Any, responseType: String, status: Double, xhr: XMLHttpRequest): AjaxSuccessResponse = {
        val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
        __obj.asInstanceOf[AjaxSuccessResponse]
      }
      
      @scala.inline
      implicit class AjaxSuccessResponseMutableBuilder[Self <: AjaxSuccessResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait GeolocationOptions extends StObject {
      
      var enableHighAccuracy: js.UndefOr[Boolean] = js.native
      
      var maximumAge: js.UndefOr[Double] = js.native
      
      var timeout: js.UndefOr[Double] = js.native
    }
    object GeolocationOptions {
      
      @scala.inline
      def apply(): GeolocationOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GeolocationOptions]
      }
      
      @scala.inline
      implicit class GeolocationOptionsMutableBuilder[Self <: GeolocationOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
        
        @scala.inline
        def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    @js.native
    trait JsonpErrorResponse extends StObject {
      
      var originalEvent: Event = js.native
      
      var status: Double = js.native
      
      var `type`: String = js.native
    }
    object JsonpErrorResponse {
      
      @scala.inline
      def apply(originalEvent: Event, status: Double, `type`: String): JsonpErrorResponse = {
        val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[JsonpErrorResponse]
      }
      
      @scala.inline
      implicit class JsonpErrorResponseMutableBuilder[Self <: JsonpErrorResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait JsonpSettings extends StObject {
      
      var async: js.UndefOr[Boolean] = js.native
      
      var jsonp: js.UndefOr[String] = js.native
      
      var jsonpCallback: js.UndefOr[String] = js.native
      
      var url: js.UndefOr[String] = js.native
    }
    object JsonpSettings {
      
      @scala.inline
      def apply(): JsonpSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JsonpSettings]
      }
      
      @scala.inline
      implicit class JsonpSettingsMutableBuilder[Self <: JsonpSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        @scala.inline
        def setJsonp(value: String): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJsonpCallback(value: String): Self = StObject.set(x, "jsonpCallback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJsonpCallbackUndefined: Self = StObject.set(x, "jsonpCallback", js.undefined)
        
        @scala.inline
        def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait JsonpSuccessResponse extends StObject {
      
      var originalEvent: Event = js.native
      
      var response: js.Any = js.native
      
      var responseType: String = js.native
      
      var status: Double = js.native
    }
    object JsonpSuccessResponse {
      
      @scala.inline
      def apply(originalEvent: Event, response: js.Any, responseType: String, status: Double): JsonpSuccessResponse = {
        val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[JsonpSuccessResponse]
      }
      
      @scala.inline
      implicit class JsonpSuccessResponseMutableBuilder[Self <: JsonpSuccessResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
  }
}
