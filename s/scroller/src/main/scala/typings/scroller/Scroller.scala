package typings.scroller

import typings.scroller.anon.Left
import typings.scroller.anon.PageX
import typings.scroller.anon.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scroller extends StObject {
  
  def activatePullToRefresh(
    height: Double,
    activate: js.Function0[Unit],
    deactivate: js.Function0[Unit],
    start: js.Function0[Unit]
  ): Unit = js.native
  
  def doMouseZoom(wheelData: Double, timeStamp: Double, pageX: Double, pageY: Double): Unit = js.native
  
  def doTouchEnd(timeStamp: Double): Unit = js.native
  
  def doTouchMove(touches: js.Array[PageX], timeStamp: Double): Unit = js.native
  def doTouchMove(touches: js.Array[PageX], timeStamp: Double, scale: Double): Unit = js.native
  
  def doTouchStart(touches: js.Array[PageX], timeStamp: Double): Unit = js.native
  
  def finishPullToRefresh(): Unit = js.native
  
  def getScrollMax(): Top = js.native
  
  def getValues(): Left = js.native
  
  def scrollBy(leftOffset: Double, topOffset: Double): Unit = js.native
  def scrollBy(leftOffset: Double, topOffset: Double, animate: Boolean): Unit = js.native
  
  def scrollTo(left: Double, top: Double): Unit = js.native
  def scrollTo(left: Double, top: Double, animate: Boolean): Unit = js.native
  def scrollTo(left: Double, top: Double, animate: Boolean, zoom: Double): Unit = js.native
  def scrollTo(left: Double, top: Double, animate: Unit, zoom: Double): Unit = js.native
  
  def setDimensions(clientWidth: Double, clientHeight: Double, contentWidth: Double, contentHeight: Double): Unit = js.native
  
  def setPosition(clientLeft: Double, clientTop: Double): Unit = js.native
  
  def setSnapSize(width: Double, height: Double): Unit = js.native
  
  def zoomBy(factor: Double): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: Double): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: Double, originTop: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: Unit,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: Unit, originTop: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: Unit,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: Unit, originTop: Unit, callback: js.Function0[Unit]): Unit = js.native
  def zoomBy(factor: Double, animate: Unit, originLeft: Double): Unit = js.native
  def zoomBy(factor: Double, animate: Unit, originLeft: Double, originTop: Double): Unit = js.native
  def zoomBy(factor: Double, animate: Unit, originLeft: Double, originTop: Double, callback: js.Function0[Unit]): Unit = js.native
  def zoomBy(factor: Double, animate: Unit, originLeft: Double, originTop: Unit, callback: js.Function0[Unit]): Unit = js.native
  def zoomBy(factor: Double, animate: Unit, originLeft: Unit, originTop: Double): Unit = js.native
  def zoomBy(factor: Double, animate: Unit, originLeft: Unit, originTop: Double, callback: js.Function0[Unit]): Unit = js.native
  def zoomBy(factor: Double, animate: Unit, originLeft: Unit, originTop: Unit, callback: js.Function0[Unit]): Unit = js.native
  
  def zoomTo(level: Double): Unit = js.native
  def zoomTo(level: Double, animate: Boolean): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Double): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Double, originTop: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Double, originTop: Unit, callback: js.Function0[Unit]): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Unit, originTop: Double): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Unit, originTop: Double, callback: js.Function0[Unit]): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Unit, originTop: Unit, callback: js.Function0[Unit]): Unit = js.native
  def zoomTo(level: Double, animate: Unit, originLeft: Double): Unit = js.native
  def zoomTo(level: Double, animate: Unit, originLeft: Double, originTop: Double): Unit = js.native
  def zoomTo(level: Double, animate: Unit, originLeft: Double, originTop: Double, callback: js.Function0[Unit]): Unit = js.native
  def zoomTo(level: Double, animate: Unit, originLeft: Double, originTop: Unit, callback: js.Function0[Unit]): Unit = js.native
  def zoomTo(level: Double, animate: Unit, originLeft: Unit, originTop: Double): Unit = js.native
  def zoomTo(level: Double, animate: Unit, originLeft: Unit, originTop: Double, callback: js.Function0[Unit]): Unit = js.native
  def zoomTo(level: Double, animate: Unit, originLeft: Unit, originTop: Unit, callback: js.Function0[Unit]): Unit = js.native
}
object Scroller {
  
  trait Options extends StObject {
    
    var animating: js.UndefOr[Boolean] = js.undefined
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var bouncing: js.UndefOr[Boolean] = js.undefined
    
    var locking: js.UndefOr[Boolean] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var paging: js.UndefOr[Boolean] = js.undefined
    
    var scrollingX: js.UndefOr[Boolean] = js.undefined
    
    var scrollingY: js.UndefOr[Boolean] = js.undefined
    
    var snapping: js.UndefOr[Boolean] = js.undefined
    
    var zooming: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBouncing(value: Boolean): Self = StObject.set(x, "bouncing", value.asInstanceOf[js.Any])
      
      inline def setBouncingUndefined: Self = StObject.set(x, "bouncing", js.undefined)
      
      inline def setLocking(value: Boolean): Self = StObject.set(x, "locking", value.asInstanceOf[js.Any])
      
      inline def setLockingUndefined: Self = StObject.set(x, "locking", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
      
      inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
      
      inline def setScrollingX(value: Boolean): Self = StObject.set(x, "scrollingX", value.asInstanceOf[js.Any])
      
      inline def setScrollingXUndefined: Self = StObject.set(x, "scrollingX", js.undefined)
      
      inline def setScrollingY(value: Boolean): Self = StObject.set(x, "scrollingY", value.asInstanceOf[js.Any])
      
      inline def setScrollingYUndefined: Self = StObject.set(x, "scrollingY", js.undefined)
      
      inline def setSnapping(value: Boolean): Self = StObject.set(x, "snapping", value.asInstanceOf[js.Any])
      
      inline def setSnappingUndefined: Self = StObject.set(x, "snapping", js.undefined)
      
      inline def setZooming(value: Double): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
      
      inline def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
    }
  }
}
