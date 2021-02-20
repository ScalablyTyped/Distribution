package typings.smoothScrollbar

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackMod {
  
  @js.native
  trait ScrollbarThumb extends StObject {
    
    def attachTo(track: HTMLElement): Unit = js.native
    
    var displaySize: Double = js.native
    
    val element: HTMLElement = js.native
    
    var offset: Double = js.native
    
    var realSize: Double = js.native
    
    def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
  }
  object ScrollbarThumb {
    
    @scala.inline
    def apply(
      attachTo: HTMLElement => Unit,
      displaySize: Double,
      element: HTMLElement,
      offset: Double,
      realSize: Double,
      update: (Double, Double, Double) => Unit
    ): ScrollbarThumb = {
      val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), displaySize = displaySize.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], realSize = realSize.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
      __obj.asInstanceOf[ScrollbarThumb]
    }
    
    @scala.inline
    implicit class ScrollbarThumbMutableBuilder[Self <: ScrollbarThumb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachTo(value: HTMLElement => Unit): Self = StObject.set(x, "attachTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisplaySize(value: Double): Self = StObject.set(x, "displaySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealSize(value: Double): Self = StObject.set(x, "realSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ScrollbarTrack extends StObject {
    
    def attachTo(container: HTMLElement): Unit = js.native
    
    val element: HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    val thumb: ScrollbarThumb = js.native
    
    def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
  }
  object ScrollbarTrack {
    
    @scala.inline
    def apply(
      attachTo: HTMLElement => Unit,
      element: HTMLElement,
      hide: () => Unit,
      show: () => Unit,
      thumb: ScrollbarThumb,
      update: (Double, Double, Double) => Unit
    ): ScrollbarTrack = {
      val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), element = element.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), thumb = thumb.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
      __obj.asInstanceOf[ScrollbarTrack]
    }
    
    @scala.inline
    implicit class ScrollbarTrackMutableBuilder[Self <: ScrollbarTrack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachTo(value: HTMLElement => Unit): Self = StObject.set(x, "attachTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setThumb(value: ScrollbarThumb): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait TrackController extends StObject {
    
    def autoHideOnIdle(): Unit = js.native
    
    def update(): Unit = js.native
    
    val xAxis: ScrollbarTrack = js.native
    
    val yAxis: ScrollbarTrack = js.native
  }
  object TrackController {
    
    @scala.inline
    def apply(autoHideOnIdle: () => Unit, update: () => Unit, xAxis: ScrollbarTrack, yAxis: ScrollbarTrack): TrackController = {
      val __obj = js.Dynamic.literal(autoHideOnIdle = js.Any.fromFunction0(autoHideOnIdle), update = js.Any.fromFunction0(update), xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackController]
    }
    
    @scala.inline
    implicit class TrackControllerMutableBuilder[Self <: TrackController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHideOnIdle(value: () => Unit): Self = StObject.set(x, "autoHideOnIdle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      @scala.inline
      def setXAxis(value: ScrollbarTrack): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYAxis(value: ScrollbarTrack): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    }
  }
}
