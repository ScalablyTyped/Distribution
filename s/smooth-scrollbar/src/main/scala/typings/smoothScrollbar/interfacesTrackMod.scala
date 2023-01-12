package typings.smoothScrollbar

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesTrackMod {
  
  trait ScrollbarThumb extends StObject {
    
    def attachTo(track: HTMLElement): Unit
    
    var displaySize: Double
    
    val element: HTMLElement
    
    var offset: Double
    
    var realSize: Double
    
    def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit
  }
  object ScrollbarThumb {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ScrollbarThumb] (val x: Self) extends AnyVal {
      
      inline def setAttachTo(value: HTMLElement => Unit): Self = StObject.set(x, "attachTo", js.Any.fromFunction1(value))
      
      inline def setDisplaySize(value: Double): Self = StObject.set(x, "displaySize", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setRealSize(value: Double): Self = StObject.set(x, "realSize", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
  
  trait ScrollbarTrack extends StObject {
    
    def attachTo(container: HTMLElement): Unit
    
    val element: HTMLElement
    
    def hide(): Unit
    
    def show(): Unit
    
    val thumb: ScrollbarThumb
    
    def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit
  }
  object ScrollbarTrack {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ScrollbarTrack] (val x: Self) extends AnyVal {
      
      inline def setAttachTo(value: HTMLElement => Unit): Self = StObject.set(x, "attachTo", js.Any.fromFunction1(value))
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setThumb(value: ScrollbarThumb): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    }
  }
  
  trait TrackController extends StObject {
    
    def autoHideOnIdle(): Unit
    
    def update(): Unit
    
    val xAxis: ScrollbarTrack
    
    val yAxis: ScrollbarTrack
  }
  object TrackController {
    
    inline def apply(autoHideOnIdle: () => Unit, update: () => Unit, xAxis: ScrollbarTrack, yAxis: ScrollbarTrack): TrackController = {
      val __obj = js.Dynamic.literal(autoHideOnIdle = js.Any.fromFunction0(autoHideOnIdle), update = js.Any.fromFunction0(update), xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackController]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrackController] (val x: Self) extends AnyVal {
      
      inline def setAutoHideOnIdle(value: () => Unit): Self = StObject.set(x, "autoHideOnIdle", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setXAxis(value: ScrollbarTrack): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
      
      inline def setYAxis(value: ScrollbarTrack): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    }
  }
}
