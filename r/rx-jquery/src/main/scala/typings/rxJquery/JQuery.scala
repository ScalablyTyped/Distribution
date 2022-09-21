package typings.rxJquery

import typings.jquery.BaseJQueryEventObject
import typings.jquery.JQueryInputEventObject
import typings.jquery.JQueryKeyEventObject
import typings.jquery.JQueryMouseEventObject
import typings.rxLiteAggregates.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def animateAsObservable(properties: Any, duration: Double): Observable[Any] = js.native
  def animateAsObservable(properties: Any, duration: Double, easing: String): Observable[Any] = js.native
  
  def bindAsObservable[T /* <: BaseJQueryEventObject */](eventType: String): Observable[T] = js.native
  def bindAsObservable[T /* <: BaseJQueryEventObject */](eventType: String, eventData: Any): Observable[T] = js.native
  
  //liveAsObservable<T extends BaseJQueryEventObject>(eventType: string, eventData?: any): Rx.Observable<T>;    // removed in jquery 1.9
  def changeAsObservable(): Observable[JQueryInputEventObject] = js.native
  def changeAsObservable(eventData: Any): Observable[JQueryInputEventObject] = js.native
  
  def clickAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def clickAsObservable(eventData: Any): Observable[JQueryMouseEventObject] = js.native
  
  def dblclickAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def dblclickAsObservable(eventData: Any): Observable[JQueryMouseEventObject] = js.native
  
  def delegateAsObservable[T /* <: BaseJQueryEventObject */](selector: String, eventType: String): Observable[T] = js.native
  def delegateAsObservable[T /* <: BaseJQueryEventObject */](selector: String, eventType: String, eventData: Any): Observable[T] = js.native
  
  def fadeInAsObservable(duration: Double): Observable[Any] = js.native
  def fadeInAsObservable(duration: Double, easing: String): Observable[Any] = js.native
  
  def fadeOutAsObservable(duration: Double): Observable[Any] = js.native
  def fadeOutAsObservable(duration: Double, easing: String): Observable[Any] = js.native
  
  def fadeToAsObservable(duration: Double, opacity: Double): Observable[Any] = js.native
  def fadeToAsObservable(duration: Double, opacity: Double, easing: String): Observable[Any] = js.native
  
  def fadeToggleAsObservable(duration: Double): Observable[Any] = js.native
  def fadeToggleAsObservable(duration: Double, easing: String): Observable[Any] = js.native
  
  def focusAsObservable(): Observable[JQueryInputEventObject] = js.native
  def focusAsObservable(eventData: Any): Observable[JQueryInputEventObject] = js.native
  
  def focusinAsObservable(): Observable[JQueryInputEventObject] = js.native
  def focusinAsObservable(eventData: Any): Observable[JQueryInputEventObject] = js.native
  
  def focusoutAsObservable(): Observable[JQueryInputEventObject] = js.native
  def focusoutAsObservable(eventData: Any): Observable[JQueryInputEventObject] = js.native
  
  def hideAsObservable(duration: Double): Observable[BaseJQueryEventObject] = js.native
  
  def keydownAsObservable(): Observable[JQueryKeyEventObject] = js.native
  def keydownAsObservable(eventData: Any): Observable[JQueryKeyEventObject] = js.native
  
  def keyupAsObservable(): Observable[JQueryKeyEventObject] = js.native
  def keyupAsObservable(eventData: Any): Observable[JQueryKeyEventObject] = js.native
  
  def loadAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def loadAsObservable(eventData: Any): Observable[BaseJQueryEventObject] = js.native
  
  def mousedownAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mousedownAsObservable(eventData: Any): Observable[JQueryMouseEventObject] = js.native
  
  def mouseenterAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseenterAsObservable(eventData: Any): Observable[JQueryMouseEventObject] = js.native
  
  def mouseleaveAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseleaveAsObservable(eventData: Any): Observable[JQueryMouseEventObject] = js.native
  
  def mousemoveAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mousemoveAsObservable(eventData: Any): Observable[JQueryMouseEventObject] = js.native
  
  def mouseoutAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseoutAsObservable(eventData: Any): Observable[JQueryMouseEventObject] = js.native
  
  def mouseoverAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseoverAsObservable(eventData: Any): Observable[JQueryMouseEventObject] = js.native
  
  def mouseupAsObservable(): Observable[JQueryMouseEventObject] = js.native
  def mouseupAsObservable(eventData: Any): Observable[JQueryMouseEventObject] = js.native
  
  def onAsObservable[T /* <: BaseJQueryEventObject */](events: String): Observable[T] = js.native
  def onAsObservable[T /* <: BaseJQueryEventObject */](events: String, selector: String): Observable[T] = js.native
  def onAsObservable[T /* <: BaseJQueryEventObject */](events: String, selector: String, eventData: Any): Observable[T] = js.native
  def onAsObservable[T /* <: BaseJQueryEventObject */](events: String, selector: Unit, eventData: Any): Observable[T] = js.native
  
  def readyAsObservable(): Observable[Any] = js.native
  
  def resizeAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def resizeAsObservable(eventData: Any): Observable[BaseJQueryEventObject] = js.native
  
  def scrollAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def scrollAsObservable(eventData: Any): Observable[BaseJQueryEventObject] = js.native
  
  def selectAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def selectAsObservable(eventData: Any): Observable[BaseJQueryEventObject] = js.native
  
  def showAsObservable(duration: Double): Observable[BaseJQueryEventObject] = js.native
  
  def slideDownAsObservable(duration: Double): Observable[Any] = js.native
  
  def slideToggleAsObservable(duration: Double): Observable[Any] = js.native
  
  def slideUpAsObservable(duration: Double): Observable[Any] = js.native
  
  def submitAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def submitAsObservable(eventData: Any): Observable[BaseJQueryEventObject] = js.native
  
  def toggleAsObservable(duration: Double): Observable[Any] = js.native
  
  def unloadAsObservable(): Observable[BaseJQueryEventObject] = js.native
  def unloadAsObservable(eventData: Any): Observable[BaseJQueryEventObject] = js.native
}
