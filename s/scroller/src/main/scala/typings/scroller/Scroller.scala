package typings.scroller

import typings.scroller.anon.Left
import typings.scroller.anon.PageX
import typings.scroller.anon.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def scrollTo(left: Double, top: Double, animate: js.UndefOr[scala.Nothing], zoom: Double): Unit = js.native
  def scrollTo(left: Double, top: Double, animate: Boolean): Unit = js.native
  def scrollTo(left: Double, top: Double, animate: Boolean, zoom: Double): Unit = js.native
  
  def setDimensions(clientWidth: Double, clientHeight: Double, contentWidth: Double, contentHeight: Double): Unit = js.native
  
  def setPosition(clientLeft: Double, clientTop: Double): Unit = js.native
  
  def setSnapSize(width: Double, height: Double): Unit = js.native
  
  def zoomBy(factor: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double
  ): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: js.UndefOr[scala.Nothing], originLeft: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: Double,
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: js.UndefOr[scala.Nothing], originLeft: Double, originTop: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: js.UndefOr[scala.Nothing],
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: js.UndefOr[scala.Nothing], originTop: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomBy(factor: Double, animate: Boolean, originLeft: Double, originTop: Double): Unit = js.native
  def zoomBy(
    factor: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  
  def zoomTo(level: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double
  ): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: js.UndefOr[scala.Nothing], originLeft: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: Double,
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: js.UndefOr[scala.Nothing], originLeft: Double, originTop: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: js.UndefOr[scala.Nothing],
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: Boolean): Unit = js.native
  def zoomTo(
    level: Double,
    animate: Boolean,
    originLeft: js.UndefOr[scala.Nothing],
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: js.UndefOr[scala.Nothing], originTop: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: Boolean,
    originLeft: js.UndefOr[scala.Nothing],
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def zoomTo(level: Double, animate: Boolean, originLeft: Double, originTop: Double): Unit = js.native
  def zoomTo(
    level: Double,
    animate: Boolean,
    originLeft: Double,
    originTop: Double,
    callback: js.Function0[Unit]
  ): Unit = js.native
}
object Scroller {
  
  @js.native
  trait Options extends StObject {
    
    var animating: js.UndefOr[Boolean] = js.native
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var bouncing: js.UndefOr[Boolean] = js.native
    
    var locking: js.UndefOr[Boolean] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
    
    var paging: js.UndefOr[Boolean] = js.native
    
    var scrollingX: js.UndefOr[Boolean] = js.native
    
    var scrollingY: js.UndefOr[Boolean] = js.native
    
    var snapping: js.UndefOr[Boolean] = js.native
    
    var zooming: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBouncing(value: Boolean): Self = StObject.set(x, "bouncing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBouncingUndefined: Self = StObject.set(x, "bouncing", js.undefined)
      
      @scala.inline
      def setLocking(value: Boolean): Self = StObject.set(x, "locking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockingUndefined: Self = StObject.set(x, "locking", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
      
      @scala.inline
      def setScrollingX(value: Boolean): Self = StObject.set(x, "scrollingX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingXUndefined: Self = StObject.set(x, "scrollingX", js.undefined)
      
      @scala.inline
      def setScrollingY(value: Boolean): Self = StObject.set(x, "scrollingY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingYUndefined: Self = StObject.set(x, "scrollingY", js.undefined)
      
      @scala.inline
      def setSnapping(value: Boolean): Self = StObject.set(x, "snapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnappingUndefined: Self = StObject.set(x, "snapping", js.undefined)
      
      @scala.inline
      def setZooming(value: Double): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
    }
  }
}
