package typings.rxDashJquery

import typings.jquery.BaseJQueryEventObject
import typings.jquery.JQueryInputEventObject
import typings.jquery.JQueryKeyEventObject
import typings.jquery.JQueryMouseEventObject
import typings.rxDashLiteDashAggregates.RxNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def animateAsObservable(properties: js.Any, duration: Double): Observable[_] = js.native
  def animateAsObservable(properties: js.Any, duration: Double, easing: String): Observable[_] = js.native
  def bindAsObservable[T /* <: BaseJQueryEventObject */](eventType: String): Observable[T] = js.native
  def bindAsObservable[T /* <: BaseJQueryEventObject */](eventType: String, eventData: js.Any): Observable[T] = js.native
  //liveAsObservable<T extends BaseJQueryEventObject>(eventType: string, eventData?: any): Rx.Observable<T>;	// removed in jquery 1.9
  def changeAsObservable(): Observable[JQueryInputEventObject] = js.native
  def changeAsObservable(eventData: js.Any): Observable[JQueryInputEventObject] = js.native
  def clickAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def clickAsObservable(eventData: js.Any): Observable[JQueryMouseEventObject] = js.native
  def dblclickAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def dblclickAsObservable(eventData: js.Any): Observable[JQueryMouseEventObject] = js.native
  def delegateAsObservable[T /* <: BaseJQueryEventObject */](selector: String, eventType: String): Observable[T] = js.native
  def delegateAsObservable[T /* <: BaseJQueryEventObject */](selector: String, eventType: String, eventData: js.Any): Observable[T] = js.native
  def fadeInAsObservable(duration: Double): Observable[_] = js.native
  def fadeInAsObservable(duration: Double, easing: String): Observable[_] = js.native
  def fadeOutAsObservable(duration: Double): Observable[_] = js.native
  def fadeOutAsObservable(duration: Double, easing: String): Observable[_] = js.native
  def fadeToAsObservable(duration: Double, opacity: Double): Observable[_] = js.native
  def fadeToAsObservable(duration: Double, opacity: Double, easing: String): Observable[_] = js.native
  def fadeToggleAsObservable(duration: Double): Observable[_] = js.native
  def fadeToggleAsObservable(duration: Double, easing: String): Observable[_] = js.native
  def focusAsObservable(): Observable[JQueryInputEventObject] = js.native
  def focusAsObservable(eventData: js.Any): Observable[JQueryInputEventObject] = js.native
  def focusinAsObservable(): Observable[JQueryInputEventObject] = js.native
  def focusinAsObservable(eventData: js.Any): Observable[JQueryInputEventObject] = js.native
  def focusoutAsObservable(): Observable[JQueryInputEventObject] = js.native
  def focusoutAsObservable(eventData: js.Any): Observable[JQueryInputEventObject] = js.native
  def hideAsObservable(duration: Double): Observable[BaseJQueryEventObject] = js.native
  def keydownAsObservable(): Observable[JQueryKeyEventObject] = js.native
  def keydownAsObservable(eventData: js.Any): Observable[JQueryKeyEventObject] = js.native
  def keyupAsObservable(): Observable[JQueryKeyEventObject] = js.native
  def keyupAsObservable(eventData: js.Any): Observable[JQueryKeyEventObject] = js.native
  def loadAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def loadAsObservable(eventData: js.Any): Observable[BaseJQueryEventObject] = js.native
  def mousedownAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mousedownAsObservable(eventData: js.Any): Observable[JQueryMouseEventObject] = js.native
  def mouseenterAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseenterAsObservable(eventData: js.Any): Observable[JQueryMouseEventObject] = js.native
  def mouseleaveAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseleaveAsObservable(eventData: js.Any): Observable[JQueryMouseEventObject] = js.native
  def mousemoveAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mousemoveAsObservable(eventData: js.Any): Observable[JQueryMouseEventObject] = js.native
  def mouseoutAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseoutAsObservable(eventData: js.Any): Observable[JQueryMouseEventObject] = js.native
  def mouseoverAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseoverAsObservable(eventData: js.Any): Observable[JQueryMouseEventObject] = js.native
  def mouseupAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseupAsObservable(eventData: js.Any): Observable[JQueryMouseEventObject] = js.native
  def onAsObservable[T /* <: BaseJQueryEventObject */](events: String): Observable[T] = js.native
  def onAsObservable[T /* <: BaseJQueryEventObject */](events: String, selector: String): Observable[T] = js.native
  def onAsObservable[T /* <: BaseJQueryEventObject */](events: String, selector: String, eventData: js.Any): Observable[T] = js.native
  def readyAsObservable(): Observable[_] = js.native
  def resizeAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def resizeAsObservable(eventData: js.Any): Observable[BaseJQueryEventObject] = js.native
  def scrollAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def scrollAsObservable(eventData: js.Any): Observable[BaseJQueryEventObject] = js.native
  def selectAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def selectAsObservable(eventData: js.Any): Observable[BaseJQueryEventObject] = js.native
  def showAsObservable(duration: Double): Observable[BaseJQueryEventObject] = js.native
  def slideDownAsObservable(duration: Double): Observable[_] = js.native
  def slideToggleAsObservable(duration: Double): Observable[_] = js.native
  def slideUpAsObservable(duration: Double): Observable[_] = js.native
  def submitAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def submitAsObservable(eventData: js.Any): Observable[BaseJQueryEventObject] = js.native
  def toggleAsObservable(duration: Double): Observable[_] = js.native
  def unloadAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def unloadAsObservable(eventData: js.Any): Observable[BaseJQueryEventObject] = js.native
}

