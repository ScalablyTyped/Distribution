package typings
package rxDashDomLib.rxDashDomMod.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom/rx", "DOM")
@js.native
object DOMNs extends js.Object {
  trait AjaxErrorResponse extends js.Object {
    var originalEvent: stdLib.Event
    var status: scala.Double
    var `type`: java.lang.String
    var xhr: stdLib.XMLHttpRequest
  }
  
  trait AjaxSettings extends js.Object {
    var async: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String] = js.undefined
    // This options does not seem to be used in the code yet
    // contentType?: string;
    var crossDomain: js.UndefOr[scala.Boolean] = js.undefined
    var headers: js.UndefOr[js.Any] = js.undefined
    var method: js.UndefOr[java.lang.String] = js.undefined
    var password: js.UndefOr[java.lang.String] = js.undefined
    var progressObserver: js.UndefOr[rxDashCoreLib.RxNs.Observer[_]] = js.undefined
    var responseType: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[java.lang.String] = js.undefined
    var user: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait AjaxSuccessResponse extends js.Object {
    var originalEvent: stdLib.Event
    var response: js.Any
    var responseType: java.lang.String
    var status: scala.Double
    var xhr: stdLib.XMLHttpRequest
  }
  
  trait GeolocationOptions extends js.Object {
    var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
    var maximumAge: js.UndefOr[scala.Double] = js.undefined
    var timeout: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait JsonpErrorResponse extends js.Object {
    var originalEvent: stdLib.Event
    var status: scala.Double
    var `type`: java.lang.String
  }
  
  trait JsonpSettings extends js.Object {
    var async: js.UndefOr[scala.Boolean] = js.undefined
    var jsonp: js.UndefOr[java.lang.String] = js.undefined
    var jsonpCallback: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait JsonpSuccessResponse extends js.Object {
    var originalEvent: stdLib.Event
    var response: js.Any
    var responseType: java.lang.String
    var status: scala.Double
  }
  
  def ajax(settingsOrUrl: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[AjaxSuccessResponse] = js.native
  // Ajax
  def ajax(settingsOrUrl: AjaxSettings): rxDashLiteDashAggregatesLib.RxNs.Observable[AjaxSuccessResponse] = js.native
  // Event Shortcuts
  def blur(element: stdLib.Element): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.FocusEvent] = js.native
  def blur(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.FocusEvent] = js.native
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
  def fromEvent[T](element: js.Any, eventName: java.lang.String, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: java.lang.String, selector: js.Function, useCapture: scala.Boolean): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  // Server-Sent Events
  def fromEventSource[T](url: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  def fromEventSource[T](url: java.lang.String, openObservable: rxDashCoreLib.RxNs.Observer[T]): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  // Mutation Observers
  def fromMutationObserver(target: stdLib.Node, options: stdLib.MutationObserverInit): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.MutationEvent] = js.native
  // Web Sockets
  def fromWebSocket(url: java.lang.String, protocol: java.lang.String): rxDashCoreDashBindingLib.RxNs.Subject[stdLib.MessageEvent] = js.native
  def fromWebSocket(
    url: java.lang.String,
    protocol: java.lang.String,
    openObserver: rxDashCoreLib.RxNs.Observer[stdLib.Event]
  ): rxDashCoreDashBindingLib.RxNs.Subject[stdLib.MessageEvent] = js.native
  def fromWebSocket(
    url: java.lang.String,
    protocol: java.lang.String,
    openObserver: rxDashCoreLib.RxNs.Observer[stdLib.Event],
    closingObserver: rxDashCoreLib.RxNs.Observer[stdLib.CloseEvent]
  ): rxDashCoreDashBindingLib.RxNs.Subject[stdLib.MessageEvent] = js.native
  // Web Workers
  def fromWebWorker(url: java.lang.String): rxDashCoreDashBindingLib.RxNs.Subject[java.lang.String] = js.native
  def get(url: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[AjaxSuccessResponse] = js.native
  def getJSON(url: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[java.lang.String] = js.native
  def jsonpRequest(settings: JsonpSettings): rxDashLiteDashAggregatesLib.RxNs.Observable[JsonpSuccessResponse] = js.native
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
  def pointerdown(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.PointerEvent] = js.native
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
  def post(url: java.lang.String, body: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[AjaxSuccessResponse] = js.native
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
  def touchcancel(element: stdLib.Element, selector: js.Function): rxDashLiteDashAggregatesLib.RxNs.Observable[stdLib.TouchEvent] = js.native
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

