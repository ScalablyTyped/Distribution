package typings.rxDom

import typings.rxCore.Rx.Observer
import typings.rxCoreBinding.Rx.Subject
import typings.rxDom.mod.rxAugmentingMod.DOM.AjaxSettings
import typings.rxDom.mod.rxAugmentingMod.DOM.AjaxSuccessResponse
import typings.rxDom.mod.rxAugmentingMod.DOM.GeolocationOptions
import typings.rxDom.mod.rxAugmentingMod.DOM.JsonpSettings
import typings.rxDom.mod.rxAugmentingMod.DOM.JsonpSuccessResponse
import typings.rxLiteAggregates.Rx.Observable
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object DOM {
    
    @JSImport("rx-dom", "DOM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ajax(settingsOrUrl: String): Observable[AjaxSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(settingsOrUrl.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxSuccessResponse]]
    // Ajax
    inline def ajax(settingsOrUrl: AjaxSettings): Observable[AjaxSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(settingsOrUrl.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxSuccessResponse]]
    
    // Event Shortcuts
    inline def blur(element: Element): Observable[FocusEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[FocusEvent]]
    inline def blur(element: Element, selector: js.Function): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
    inline def blur(element: Element, selector: js.Function, useCapture: Boolean): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
    inline def blur(element: Element, selector: Unit, useCapture: Boolean): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
    
    inline def change(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
    inline def change(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    
    inline def click(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def click(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def click(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def click(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def contextmenu(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def contextmenu(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def contextmenu(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def dblclick(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def dblclick(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def dblclick(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def dblclick(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def error(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
    inline def error(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    inline def error(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    inline def error(element: Element, selector: Unit, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    
    inline def focus(element: Element): Observable[FocusEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[FocusEvent]]
    inline def focus(element: Element, selector: js.Function): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
    inline def focus(element: Element, selector: js.Function, useCapture: Boolean): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
    inline def focus(element: Element, selector: Unit, useCapture: Boolean): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
    
    inline def focusin(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def focusin(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def focusin(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def focusin(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def focusout(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def focusout(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def focusout(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def focusout(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    // Events
    inline def fromEvent[T](element: Any, eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    inline def fromEvent[T](element: Any, eventName: String, selector: js.Function): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    inline def fromEvent[T](element: Any, eventName: String, selector: js.Function, useCapture: Boolean): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    inline def fromEvent[T](element: Any, eventName: String, selector: Unit, useCapture: Boolean): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    
    // Server-Sent Events
    inline def fromEventSource[T](url: String): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEventSource")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
    inline def fromEventSource[T](url: String, openObservable: Observer[T]): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventSource")(url.asInstanceOf[js.Any], openObservable.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
    
    // Mutation Observers
    inline def fromMutationObserver(target: Node, options: MutationObserverInit): Observable[MutationEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMutationObserver")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[MutationEvent]]
    
    // Web Sockets
    inline def fromWebSocket(url: String, protocol: String): Subject[MessageEvent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Subject[MessageEvent[Any]]]
    inline def fromWebSocket(url: String, protocol: String, openObserver: Unit, closingObserver: Observer[CloseEvent]): Subject[MessageEvent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], openObserver.asInstanceOf[js.Any], closingObserver.asInstanceOf[js.Any])).asInstanceOf[Subject[MessageEvent[Any]]]
    inline def fromWebSocket(url: String, protocol: String, openObserver: Observer[Event]): Subject[MessageEvent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], openObserver.asInstanceOf[js.Any])).asInstanceOf[Subject[MessageEvent[Any]]]
    inline def fromWebSocket(
      url: String,
      protocol: String,
      openObserver: Observer[Event],
      closingObserver: Observer[CloseEvent]
    ): Subject[MessageEvent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], openObserver.asInstanceOf[js.Any], closingObserver.asInstanceOf[js.Any])).asInstanceOf[Subject[MessageEvent[Any]]]
    
    // Web Workers
    inline def fromWebWorker(url: String): Subject[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebWorker")(url.asInstanceOf[js.Any]).asInstanceOf[Subject[String]]
    
    // Geolocation
    object geolocation {
      
      @JSImport("rx-dom", "DOM.geolocation")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getCurrentPosition(): Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPosition")().asInstanceOf[Observable[GeolocationPosition]]
      inline def getCurrentPosition(geolocationOptions: GeolocationOptions): Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPosition")(geolocationOptions.asInstanceOf[js.Any]).asInstanceOf[Observable[GeolocationPosition]]
      
      inline def watchPosition(): Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchPosition")().asInstanceOf[Observable[GeolocationPosition]]
      inline def watchPosition(geolocationOptions: GeolocationOptions): Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchPosition")(geolocationOptions.asInstanceOf[js.Any]).asInstanceOf[Observable[GeolocationPosition]]
    }
    
    inline def get(url: String): Observable[AjaxSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxSuccessResponse]]
    
    inline def getJSON(url: String): Observable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSON")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[String]]
    
    inline def jsonpRequest(settings: JsonpSettings): Observable[JsonpSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonpRequest")(settings.asInstanceOf[js.Any]).asInstanceOf[Observable[JsonpSuccessResponse]]
    inline def jsonpRequest(url: String): Observable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonpRequest")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[String]]
    
    inline def keydown(element: Element): Observable[KeyboardEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[KeyboardEvent]]
    inline def keydown(element: Element, selector: js.Function): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
    inline def keydown(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
    inline def keydown(element: Element, selector: Unit, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
    
    inline def keypress(element: Element): Observable[KeyboardEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[KeyboardEvent]]
    inline def keypress(element: Element, selector: js.Function): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
    inline def keypress(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
    inline def keypress(element: Element, selector: Unit, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
    
    inline def keyup(element: Element): Observable[KeyboardEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[KeyboardEvent]]
    inline def keyup(element: Element, selector: js.Function): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
    inline def keyup(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
    inline def keyup(element: Element, selector: Unit, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
    
    inline def load(element: Element): Observable[UIEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[UIEvent]]
    inline def load(element: Element, selector: js.Function): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
    inline def load(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
    inline def load(element: Element, selector: Unit, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
    
    inline def mousedown(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def mousedown(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mousedown(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mousedown(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def mouseenter(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def mouseenter(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseenter(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def mouseleave(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def mouseleave(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseleave(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def mousemove(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def mousemove(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mousemove(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mousemove(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def mouseout(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def mouseout(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseout(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseout(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def mouseover(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def mouseover(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseover(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseover(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    inline def mouseup(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
    inline def mouseup(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseup(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    inline def mouseup(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
    
    // Pointer Events
    inline def pointerdown(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
    inline def pointerdown(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerdown(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    
    inline def pointerenter(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
    inline def pointerenter(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerenter(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    
    inline def pointerleave(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
    inline def pointerleave(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerleave(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    
    inline def pointermove(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
    inline def pointermove(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointermove(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointermove(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    
    inline def pointerout(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
    inline def pointerout(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerout(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerout(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    
    inline def pointerover(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
    inline def pointerover(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerover(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerover(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    
    inline def pointerup(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
    inline def pointerup(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerup(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    inline def pointerup(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
    
    inline def post(url: String, body: Any): Observable[AjaxSuccessResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxSuccessResponse]]
    
    inline def ready(): Observable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[Observable[Any]]
    
    inline def resize(element: Element): Observable[UIEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[UIEvent]]
    inline def resize(element: Element, selector: js.Function): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
    inline def resize(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
    inline def resize(element: Element, selector: Unit, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
    
    inline def scroll(element: Element): Observable[UIEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[UIEvent]]
    inline def scroll(element: Element, selector: js.Function): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
    inline def scroll(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
    inline def scroll(element: Element, selector: Unit, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
    
    inline def select(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
    inline def select(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    inline def select(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    inline def select(element: Element, selector: Unit, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    
    inline def submit(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
    inline def submit(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    inline def submit(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    inline def submit(element: Element, selector: Unit, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    
    // Touch Events
    inline def touchcancel(element: Element): Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[TouchEvent]]
    inline def touchcancel(element: Element, selector: js.Function): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    inline def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    inline def touchcancel(element: Element, selector: Unit, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    
    inline def touchend(element: Element): Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[TouchEvent]]
    inline def touchend(element: Element, selector: js.Function): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    inline def touchend(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    inline def touchend(element: Element, selector: Unit, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    
    inline def touchmove(element: Element): Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[TouchEvent]]
    inline def touchmove(element: Element, selector: js.Function): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    inline def touchmove(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    inline def touchmove(element: Element, selector: Unit, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    
    inline def touchstart(element: Element): Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[TouchEvent]]
    inline def touchstart(element: Element, selector: js.Function): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    inline def touchstart(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    inline def touchstart(element: Element, selector: Unit, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
    
    inline def unload(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
    inline def unload(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    inline def unload(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
    inline def unload(element: Element, selector: Unit, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
  }
  
  /* augmented module */
  object rxAugmentingMod {
    
    object DOM {
      
      @JSImport("rx", "DOM")
      @js.native
      val ^ : js.Any = js.native
      
      inline def ajax(settingsOrUrl: String): Observable[AjaxSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(settingsOrUrl.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxSuccessResponse]]
      // Ajax
      inline def ajax(settingsOrUrl: AjaxSettings): Observable[AjaxSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(settingsOrUrl.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxSuccessResponse]]
      
      // Event Shortcuts
      inline def blur(element: Element): Observable[FocusEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[FocusEvent]]
      inline def blur(element: Element, selector: js.Function): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
      inline def blur(element: Element, selector: js.Function, useCapture: Boolean): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
      inline def blur(element: Element, selector: Unit, useCapture: Boolean): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
      
      inline def change(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
      inline def change(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      
      inline def click(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def click(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def click(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def click(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def contextmenu(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def contextmenu(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def contextmenu(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def dblclick(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def dblclick(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def dblclick(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def dblclick(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def error(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
      inline def error(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      inline def error(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      inline def error(element: Element, selector: Unit, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      
      inline def focus(element: Element): Observable[FocusEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[FocusEvent]]
      inline def focus(element: Element, selector: js.Function): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
      inline def focus(element: Element, selector: js.Function, useCapture: Boolean): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
      inline def focus(element: Element, selector: Unit, useCapture: Boolean): Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[FocusEvent]]
      
      inline def focusin(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def focusin(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def focusin(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def focusin(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def focusout(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def focusout(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def focusout(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def focusout(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      // Events
      inline def fromEvent[T](element: Any, eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
      inline def fromEvent[T](element: Any, eventName: String, selector: js.Function): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
      inline def fromEvent[T](element: Any, eventName: String, selector: js.Function, useCapture: Boolean): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
      inline def fromEvent[T](element: Any, eventName: String, selector: Unit, useCapture: Boolean): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
      
      // Server-Sent Events
      inline def fromEventSource[T](url: String): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEventSource")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
      inline def fromEventSource[T](url: String, openObservable: Observer[T]): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventSource")(url.asInstanceOf[js.Any], openObservable.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
      
      // Mutation Observers
      inline def fromMutationObserver(target: Node, options: MutationObserverInit): Observable[MutationEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMutationObserver")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[MutationEvent]]
      
      // Web Sockets
      inline def fromWebSocket(url: String, protocol: String): Subject[MessageEvent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Subject[MessageEvent[Any]]]
      inline def fromWebSocket(url: String, protocol: String, openObserver: Unit, closingObserver: Observer[CloseEvent]): Subject[MessageEvent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], openObserver.asInstanceOf[js.Any], closingObserver.asInstanceOf[js.Any])).asInstanceOf[Subject[MessageEvent[Any]]]
      inline def fromWebSocket(url: String, protocol: String, openObserver: Observer[Event]): Subject[MessageEvent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], openObserver.asInstanceOf[js.Any])).asInstanceOf[Subject[MessageEvent[Any]]]
      inline def fromWebSocket(
        url: String,
        protocol: String,
        openObserver: Observer[Event],
        closingObserver: Observer[CloseEvent]
      ): Subject[MessageEvent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], openObserver.asInstanceOf[js.Any], closingObserver.asInstanceOf[js.Any])).asInstanceOf[Subject[MessageEvent[Any]]]
      
      // Web Workers
      inline def fromWebWorker(url: String): Subject[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebWorker")(url.asInstanceOf[js.Any]).asInstanceOf[Subject[String]]
      
      // Geolocation
      object geolocation {
        
        @JSImport("rx", "DOM.geolocation")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getCurrentPosition(): Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPosition")().asInstanceOf[Observable[GeolocationPosition]]
        inline def getCurrentPosition(geolocationOptions: GeolocationOptions): Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPosition")(geolocationOptions.asInstanceOf[js.Any]).asInstanceOf[Observable[GeolocationPosition]]
        
        inline def watchPosition(): Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchPosition")().asInstanceOf[Observable[GeolocationPosition]]
        inline def watchPosition(geolocationOptions: GeolocationOptions): Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchPosition")(geolocationOptions.asInstanceOf[js.Any]).asInstanceOf[Observable[GeolocationPosition]]
      }
      
      inline def get(url: String): Observable[AjaxSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxSuccessResponse]]
      
      inline def getJSON(url: String): Observable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSON")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[String]]
      
      inline def jsonpRequest(settings: JsonpSettings): Observable[JsonpSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonpRequest")(settings.asInstanceOf[js.Any]).asInstanceOf[Observable[JsonpSuccessResponse]]
      inline def jsonpRequest(url: String): Observable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonpRequest")(url.asInstanceOf[js.Any]).asInstanceOf[Observable[String]]
      
      inline def keydown(element: Element): Observable[KeyboardEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[KeyboardEvent]]
      inline def keydown(element: Element, selector: js.Function): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
      inline def keydown(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
      inline def keydown(element: Element, selector: Unit, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
      
      inline def keypress(element: Element): Observable[KeyboardEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[KeyboardEvent]]
      inline def keypress(element: Element, selector: js.Function): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
      inline def keypress(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
      inline def keypress(element: Element, selector: Unit, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
      
      inline def keyup(element: Element): Observable[KeyboardEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[KeyboardEvent]]
      inline def keyup(element: Element, selector: js.Function): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
      inline def keyup(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
      inline def keyup(element: Element, selector: Unit, useCapture: Boolean): Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[KeyboardEvent]]
      
      inline def load(element: Element): Observable[UIEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[UIEvent]]
      inline def load(element: Element, selector: js.Function): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
      inline def load(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
      inline def load(element: Element, selector: Unit, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
      
      inline def mousedown(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def mousedown(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mousedown(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mousedown(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def mouseenter(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def mouseenter(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseenter(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def mouseleave(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def mouseleave(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseleave(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def mousemove(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def mousemove(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mousemove(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mousemove(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def mouseout(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def mouseout(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseout(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseout(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def mouseover(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def mouseover(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseover(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseover(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      inline def mouseup(element: Element): Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[MouseEvent]]
      inline def mouseup(element: Element, selector: js.Function): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseup(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      inline def mouseup(element: Element, selector: Unit, useCapture: Boolean): Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[MouseEvent]]
      
      // Pointer Events
      inline def pointerdown(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
      inline def pointerdown(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerdown(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      
      inline def pointerenter(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
      inline def pointerenter(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerenter(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      
      inline def pointerleave(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
      inline def pointerleave(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerleave(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      
      inline def pointermove(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
      inline def pointermove(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointermove(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointermove(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      
      inline def pointerout(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
      inline def pointerout(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerout(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerout(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      
      inline def pointerover(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
      inline def pointerover(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerover(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerover(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      
      inline def pointerup(element: Element): Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[PointerEvent]]
      inline def pointerup(element: Element, selector: js.Function): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerup(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      inline def pointerup(element: Element, selector: Unit, useCapture: Boolean): Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[PointerEvent]]
      
      inline def post(url: String, body: Any): Observable[AjaxSuccessResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Observable[AjaxSuccessResponse]]
      
      inline def ready(): Observable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[Observable[Any]]
      
      inline def resize(element: Element): Observable[UIEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[UIEvent]]
      inline def resize(element: Element, selector: js.Function): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
      inline def resize(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
      inline def resize(element: Element, selector: Unit, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
      
      inline def scroll(element: Element): Observable[UIEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[UIEvent]]
      inline def scroll(element: Element, selector: js.Function): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
      inline def scroll(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
      inline def scroll(element: Element, selector: Unit, useCapture: Boolean): Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[UIEvent]]
      
      inline def select(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
      inline def select(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      inline def select(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      inline def select(element: Element, selector: Unit, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      
      inline def submit(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
      inline def submit(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      inline def submit(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      inline def submit(element: Element, selector: Unit, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      
      // Touch Events
      inline def touchcancel(element: Element): Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[TouchEvent]]
      inline def touchcancel(element: Element, selector: js.Function): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      inline def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      inline def touchcancel(element: Element, selector: Unit, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      
      inline def touchend(element: Element): Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[TouchEvent]]
      inline def touchend(element: Element, selector: js.Function): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      inline def touchend(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      inline def touchend(element: Element, selector: Unit, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      
      inline def touchmove(element: Element): Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[TouchEvent]]
      inline def touchmove(element: Element, selector: js.Function): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      inline def touchmove(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      inline def touchmove(element: Element, selector: Unit, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      
      inline def touchstart(element: Element): Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[TouchEvent]]
      inline def touchstart(element: Element, selector: js.Function): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      inline def touchstart(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      inline def touchstart(element: Element, selector: Unit, useCapture: Boolean): Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[TouchEvent]]
      
      inline def unload(element: Element): Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any]).asInstanceOf[Observable[Event]]
      inline def unload(element: Element, selector: js.Function): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      inline def unload(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      inline def unload(element: Element, selector: Unit, useCapture: Boolean): Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Observable[Event]]
      
      trait AjaxErrorResponse extends StObject {
        
        var originalEvent: Event
        
        var status: Double
        
        var `type`: String
        
        var xhr: XMLHttpRequest
      }
      object AjaxErrorResponse {
        
        inline def apply(originalEvent: Event, status: Double, `type`: String, xhr: XMLHttpRequest): AjaxErrorResponse = {
          val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[AjaxErrorResponse]
        }
        
        extension [Self <: AjaxErrorResponse](x: Self) {
          
          inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
          
          inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
        }
      }
      
      trait AjaxSettings extends StObject {
        
        var async: js.UndefOr[Boolean] = js.undefined
        
        var body: js.UndefOr[String] = js.undefined
        
        // This options does not seem to be used in the code yet
        // contentType?: string;
        var crossDomain: js.UndefOr[Boolean] = js.undefined
        
        var headers: js.UndefOr[Any] = js.undefined
        
        var method: js.UndefOr[String] = js.undefined
        
        var password: js.UndefOr[String] = js.undefined
        
        var progressObserver: js.UndefOr[Observer[Any]] = js.undefined
        
        var responseType: js.UndefOr[String] = js.undefined
        
        var url: js.UndefOr[String] = js.undefined
        
        var user: js.UndefOr[String] = js.undefined
      }
      object AjaxSettings {
        
        inline def apply(): AjaxSettings = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AjaxSettings]
        }
        
        extension [Self <: AjaxSettings](x: Self) {
          
          inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
          
          inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
          
          inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
          
          inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
          
          inline def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
          
          inline def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
          
          inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
          
          inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
          
          inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
          
          inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
          
          inline def setProgressObserver(value: Observer[Any]): Self = StObject.set(x, "progressObserver", value.asInstanceOf[js.Any])
          
          inline def setProgressObserverUndefined: Self = StObject.set(x, "progressObserver", js.undefined)
          
          inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
          
          inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
          
          inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
          
          inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        }
      }
      
      trait AjaxSuccessResponse extends StObject {
        
        var originalEvent: Event
        
        var response: Any
        
        var responseType: String
        
        var status: Double
        
        var xhr: XMLHttpRequest
      }
      object AjaxSuccessResponse {
        
        inline def apply(originalEvent: Event, response: Any, responseType: String, status: Double, xhr: XMLHttpRequest): AjaxSuccessResponse = {
          val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
          __obj.asInstanceOf[AjaxSuccessResponse]
        }
        
        extension [Self <: AjaxSuccessResponse](x: Self) {
          
          inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
          
          inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
          
          inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
          
          inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
          
          inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
        }
      }
      
      trait GeolocationOptions extends StObject {
        
        var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
        
        var maximumAge: js.UndefOr[Double] = js.undefined
        
        var timeout: js.UndefOr[Double] = js.undefined
      }
      object GeolocationOptions {
        
        inline def apply(): GeolocationOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GeolocationOptions]
        }
        
        extension [Self <: GeolocationOptions](x: Self) {
          
          inline def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
          
          inline def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
          
          inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
          
          inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
          
          inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
          
          inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        }
      }
      
      trait JsonpErrorResponse extends StObject {
        
        var originalEvent: Event
        
        var status: Double
        
        var `type`: String
      }
      object JsonpErrorResponse {
        
        inline def apply(originalEvent: Event, status: Double, `type`: String): JsonpErrorResponse = {
          val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[JsonpErrorResponse]
        }
        
        extension [Self <: JsonpErrorResponse](x: Self) {
          
          inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
          
          inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      trait JsonpSettings extends StObject {
        
        var async: js.UndefOr[Boolean] = js.undefined
        
        var jsonp: js.UndefOr[String] = js.undefined
        
        var jsonpCallback: js.UndefOr[String] = js.undefined
        
        var url: js.UndefOr[String] = js.undefined
      }
      object JsonpSettings {
        
        inline def apply(): JsonpSettings = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[JsonpSettings]
        }
        
        extension [Self <: JsonpSettings](x: Self) {
          
          inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
          
          inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
          
          inline def setJsonp(value: String): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
          
          inline def setJsonpCallback(value: String): Self = StObject.set(x, "jsonpCallback", value.asInstanceOf[js.Any])
          
          inline def setJsonpCallbackUndefined: Self = StObject.set(x, "jsonpCallback", js.undefined)
          
          inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      trait JsonpSuccessResponse extends StObject {
        
        var originalEvent: Event
        
        var response: Any
        
        var responseType: String
        
        var status: Double
      }
      object JsonpSuccessResponse {
        
        inline def apply(originalEvent: Event, response: Any, responseType: String, status: Double): JsonpSuccessResponse = {
          val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
          __obj.asInstanceOf[JsonpSuccessResponse]
        }
        
        extension [Self <: JsonpSuccessResponse](x: Self) {
          
          inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
          
          inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
          
          inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
          
          inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
