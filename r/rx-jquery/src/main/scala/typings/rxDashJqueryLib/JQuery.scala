package typings
package rxDashJqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def animateAsObservable(properties: js.Any, duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def animateAsObservable(properties: js.Any, duration: scala.Double, easing: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def bindAsObservable[T /* <: jqueryLib.BaseJQueryEventObject */](eventType: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  def bindAsObservable[T /* <: jqueryLib.BaseJQueryEventObject */](eventType: java.lang.String, eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  //liveAsObservable<T extends BaseJQueryEventObject>(eventType: string, eventData?: any): Rx.Observable<T>;	// removed in jquery 1.9
  def changeAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryInputEventObject] = js.native
  def changeAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryInputEventObject] = js.native
  def clickAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def clickAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def dblclickAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def dblclickAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def delegateAsObservable[T /* <: jqueryLib.BaseJQueryEventObject */](selector: java.lang.String, eventType: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  def delegateAsObservable[T /* <: jqueryLib.BaseJQueryEventObject */](selector: java.lang.String, eventType: java.lang.String, eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  def fadeInAsObservable(duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def fadeInAsObservable(duration: scala.Double, easing: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def fadeOutAsObservable(duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def fadeOutAsObservable(duration: scala.Double, easing: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def fadeToAsObservable(duration: scala.Double, opacity: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def fadeToAsObservable(duration: scala.Double, opacity: scala.Double, easing: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def fadeToggleAsObservable(duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def fadeToggleAsObservable(duration: scala.Double, easing: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def focusAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryInputEventObject] = js.native
  def focusAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryInputEventObject] = js.native
  def focusinAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryInputEventObject] = js.native
  def focusinAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryInputEventObject] = js.native
  def focusoutAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryInputEventObject] = js.native
  def focusoutAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryInputEventObject] = js.native
  def hideAsObservable(duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def keydownAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryKeyEventObject] = js.native
  def keydownAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryKeyEventObject] = js.native
  def keyupAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryKeyEventObject] = js.native
  def keyupAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryKeyEventObject] = js.native
  def loadAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def loadAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def mousedownAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mousedownAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseenterAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseenterAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseleaveAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseleaveAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mousemoveAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mousemoveAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseoutAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseoutAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseoverAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseoverAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseupAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def mouseupAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.JQueryMouseEventObject] = js.native
  def onAsObservable[T /* <: jqueryLib.BaseJQueryEventObject */](events: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  def onAsObservable[T /* <: jqueryLib.BaseJQueryEventObject */](events: java.lang.String, selector: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  def onAsObservable[T /* <: jqueryLib.BaseJQueryEventObject */](events: java.lang.String, selector: java.lang.String, eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[T] = js.native
  def readyAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def resizeAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def resizeAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def scrollAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def scrollAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def selectAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def selectAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def showAsObservable(duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def slideDownAsObservable(duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def slideToggleAsObservable(duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def slideUpAsObservable(duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def submitAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def submitAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def toggleAsObservable(duration: scala.Double): rxDashLiteDashAggregatesLib.RxNs.Observable[_] = js.native
  def unloadAsObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
  def unloadAsObservable(eventData: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[jqueryLib.BaseJQueryEventObject] = js.native
}

