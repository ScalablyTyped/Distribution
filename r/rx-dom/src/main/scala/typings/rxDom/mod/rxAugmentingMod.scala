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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object rxAugmentingMod {
  
  object DOM {
    
    @JSImport("rx", "DOM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ajax(settingsOrUrl: String): typings.rx.Rx.Observable[AjaxSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(settingsOrUrl.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[AjaxSuccessResponse]]
    // Ajax
    inline def ajax(settingsOrUrl: AjaxSettings): typings.rx.Rx.Observable[AjaxSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(settingsOrUrl.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[AjaxSuccessResponse]]
    
    // Event Shortcuts
    inline def blur(element: Element): typings.rx.Rx.Observable[FocusEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[FocusEvent]]
    inline def blur(element: Element, selector: js.Function): typings.rx.Rx.Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[FocusEvent]]
    inline def blur(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[FocusEvent]]
    inline def blur(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[FocusEvent]]
    
    inline def change(element: Element): typings.rx.Rx.Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def change(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    
    inline def click(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def click(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def click(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def click(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def contextmenu(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def contextmenu(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def contextmenu(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextmenu")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def dblclick(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def dblclick(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def dblclick(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def dblclick(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("dblclick")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def error(element: Element): typings.rx.Rx.Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def error(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def error(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def error(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    
    inline def focus(element: Element): typings.rx.Rx.Observable[FocusEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[FocusEvent]]
    inline def focus(element: Element, selector: js.Function): typings.rx.Rx.Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[FocusEvent]]
    inline def focus(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[FocusEvent]]
    inline def focus(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[FocusEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[FocusEvent]]
    
    inline def focusin(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def focusin(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def focusin(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def focusin(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusin")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def focusout(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def focusout(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def focusout(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def focusout(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    // Events
    inline def fromEvent[T](element: js.Any, eventName: String): typings.rx.Rx.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[T]]
    inline def fromEvent[T](element: js.Any, eventName: String, selector: js.Function): typings.rx.Rx.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[T]]
    inline def fromEvent[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[T]]
    inline def fromEvent[T](element: js.Any, eventName: String, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[T]]
    
    // Server-Sent Events
    inline def fromEventSource[T](url: String): typings.rx.Rx.Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEventSource")(url.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[T]]
    inline def fromEventSource[T](url: String, openObservable: typings.rx.Rx.Observer[T]): typings.rx.Rx.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventSource")(url.asInstanceOf[js.Any], openObservable.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[T]]
    
    // Mutation Observers
    inline def fromMutationObserver(target: Node, options: MutationObserverInit): typings.rx.Rx.Observable[MutationEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMutationObserver")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MutationEvent]]
    
    // Web Sockets
    inline def fromWebSocket(url: String, protocol: String): typings.rx.Rx.Subject[MessageEvent[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Subject[MessageEvent[js.Any]]]
    inline def fromWebSocket(
      url: String,
      protocol: String,
      openObserver: Unit,
      closingObserver: typings.rx.Rx.Observer[CloseEvent]
    ): typings.rx.Rx.Subject[MessageEvent[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], openObserver.asInstanceOf[js.Any], closingObserver.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Subject[MessageEvent[js.Any]]]
    inline def fromWebSocket(url: String, protocol: String, openObserver: typings.rx.Rx.Observer[Event]): typings.rx.Rx.Subject[MessageEvent[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], openObserver.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Subject[MessageEvent[js.Any]]]
    inline def fromWebSocket(
      url: String,
      protocol: String,
      openObserver: typings.rx.Rx.Observer[Event],
      closingObserver: typings.rx.Rx.Observer[CloseEvent]
    ): typings.rx.Rx.Subject[MessageEvent[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocket")(url.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], openObserver.asInstanceOf[js.Any], closingObserver.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Subject[MessageEvent[js.Any]]]
    
    // Web Workers
    inline def fromWebWorker(url: String): typings.rx.Rx.Subject[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebWorker")(url.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Subject[String]]
    
    // Geolocation
    object geolocation {
      
      @JSImport("rx", "DOM.geolocation")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getCurrentPosition(): typings.rx.Rx.Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPosition")().asInstanceOf[typings.rx.Rx.Observable[GeolocationPosition]]
      inline def getCurrentPosition(geolocationOptions: GeolocationOptions): typings.rx.Rx.Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPosition")(geolocationOptions.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[GeolocationPosition]]
      
      inline def watchPosition(): typings.rx.Rx.Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchPosition")().asInstanceOf[typings.rx.Rx.Observable[GeolocationPosition]]
      inline def watchPosition(geolocationOptions: GeolocationOptions): typings.rx.Rx.Observable[GeolocationPosition] = ^.asInstanceOf[js.Dynamic].applyDynamic("watchPosition")(geolocationOptions.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[GeolocationPosition]]
    }
    
    inline def get(url: String): typings.rx.Rx.Observable[AjaxSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[AjaxSuccessResponse]]
    
    inline def getJSON(url: String): typings.rx.Rx.Observable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSON")(url.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[String]]
    
    inline def jsonpRequest(settings: JsonpSettings): typings.rx.Rx.Observable[JsonpSuccessResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonpRequest")(settings.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[JsonpSuccessResponse]]
    inline def jsonpRequest(url: String): typings.rx.Rx.Observable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonpRequest")(url.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[String]]
    
    inline def keydown(element: Element): typings.rx.Rx.Observable[KeyboardEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    inline def keydown(element: Element, selector: js.Function): typings.rx.Rx.Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    inline def keydown(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    inline def keydown(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keydown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    
    inline def keypress(element: Element): typings.rx.Rx.Observable[KeyboardEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    inline def keypress(element: Element, selector: js.Function): typings.rx.Rx.Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    inline def keypress(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    inline def keypress(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keypress")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    
    inline def keyup(element: Element): typings.rx.Rx.Observable[KeyboardEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    inline def keyup(element: Element, selector: js.Function): typings.rx.Rx.Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    inline def keyup(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    inline def keyup(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[KeyboardEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[KeyboardEvent]]
    
    inline def load(element: Element): typings.rx.Rx.Observable[UIEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    inline def load(element: Element, selector: js.Function): typings.rx.Rx.Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    inline def load(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    inline def load(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    
    inline def mousedown(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mousedown(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mousedown(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mousedown(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousedown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def mouseenter(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseenter(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseenter(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def mouseleave(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseleave(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseleave(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def mousemove(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mousemove(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mousemove(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mousemove(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mousemove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def mouseout(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseout(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseout(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseout(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def mouseover(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseover(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseover(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseover(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    inline def mouseup(element: Element): typings.rx.Rx.Observable[MouseEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseup(element: Element, selector: js.Function): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseup(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    inline def mouseup(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[MouseEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("mouseup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[MouseEvent]]
    
    // Pointer Events
    inline def pointerdown(element: Element): typings.rx.Rx.Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerdown(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerdown(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerdown")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    
    inline def pointerenter(element: Element): typings.rx.Rx.Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerenter(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerenter(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerenter")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    
    inline def pointerleave(element: Element): typings.rx.Rx.Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerleave(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerleave(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerleave")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    
    inline def pointermove(element: Element): typings.rx.Rx.Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointermove(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointermove(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointermove(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointermove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    
    inline def pointerout(element: Element): typings.rx.Rx.Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerout(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerout(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerout(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerout")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    
    inline def pointerover(element: Element): typings.rx.Rx.Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerover(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerover(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerover(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerover")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    
    inline def pointerup(element: Element): typings.rx.Rx.Observable[PointerEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerup(element: Element, selector: js.Function): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerup(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    inline def pointerup(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[PointerEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerup")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[PointerEvent]]
    
    inline def post(url: String, body: js.Any): typings.rx.Rx.Observable[AjaxSuccessResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[AjaxSuccessResponse]]
    
    inline def ready(): typings.rx.Rx.Observable[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[typings.rx.Rx.Observable[js.Any]]
    
    inline def resize(element: Element): typings.rx.Rx.Observable[UIEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    inline def resize(element: Element, selector: js.Function): typings.rx.Rx.Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    inline def resize(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    inline def resize(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    
    inline def scroll(element: Element): typings.rx.Rx.Observable[UIEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    inline def scroll(element: Element, selector: js.Function): typings.rx.Rx.Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    inline def scroll(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    inline def scroll(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[UIEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[UIEvent]]
    
    inline def select(element: Element): typings.rx.Rx.Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def select(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def select(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def select(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    
    inline def submit(element: Element): typings.rx.Rx.Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def submit(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def submit(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def submit(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("submit")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    
    // Touch Events
    inline def touchcancel(element: Element): typings.rx.Rx.Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchcancel(element: Element, selector: js.Function): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchcancel(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchcancel")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    
    inline def touchend(element: Element): typings.rx.Rx.Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchend(element: Element, selector: js.Function): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchend(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchend(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchend")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    
    inline def touchmove(element: Element): typings.rx.Rx.Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchmove(element: Element, selector: js.Function): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchmove(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchmove(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchmove")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    
    inline def touchstart(element: Element): typings.rx.Rx.Observable[TouchEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchstart(element: Element, selector: js.Function): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchstart(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    inline def touchstart(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[TouchEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("touchstart")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[TouchEvent]]
    
    inline def unload(element: Element): typings.rx.Rx.Observable[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any]).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def unload(element: Element, selector: js.Function): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def unload(element: Element, selector: js.Function, useCapture: Boolean): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    inline def unload(element: Element, selector: Unit, useCapture: Boolean): typings.rx.Rx.Observable[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("unload")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[typings.rx.Rx.Observable[Event]]
    
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
      
      var headers: js.UndefOr[js.Any] = js.undefined
      
      var method: js.UndefOr[String] = js.undefined
      
      var password: js.UndefOr[String] = js.undefined
      
      var progressObserver: js.UndefOr[typings.rx.Rx.Observer[js.Any]] = js.undefined
      
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
        
        inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        inline def setProgressObserver(value: typings.rx.Rx.Observer[js.Any]): Self = StObject.set(x, "progressObserver", value.asInstanceOf[js.Any])
        
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
      
      var response: js.Any
      
      var responseType: String
      
      var status: Double
      
      var xhr: XMLHttpRequest
    }
    object AjaxSuccessResponse {
      
      inline def apply(originalEvent: Event, response: js.Any, responseType: String, status: Double, xhr: XMLHttpRequest): AjaxSuccessResponse = {
        val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
        __obj.asInstanceOf[AjaxSuccessResponse]
      }
      
      extension [Self <: AjaxSuccessResponse](x: Self) {
        
        inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
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
      
      var response: js.Any
      
      var responseType: String
      
      var status: Double
    }
    object JsonpSuccessResponse {
      
      inline def apply(originalEvent: Event, response: js.Any, responseType: String, status: Double): JsonpSuccessResponse = {
        val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[JsonpSuccessResponse]
      }
      
      extension [Self <: JsonpSuccessResponse](x: Self) {
        
        inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
  }
}
