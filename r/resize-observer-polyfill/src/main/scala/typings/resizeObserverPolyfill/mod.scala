package typings.resizeObserverPolyfill

import typings.resizeObserverPolyfill.mod.global.ResizeObserverCallback
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("resize-observer-polyfill", JSImport.Default)
  @js.native
  class defaultCls protected ()
    extends StObject
       with ResizeObserver {
    def this(callback: ResizeObserverCallback) = this()
    
    /* CompleteClass */
    override def disconnect(): Unit = js.native
    
    /* CompleteClass */
    override def observe(target: Element): Unit = js.native
    
    /* CompleteClass */
    override def unobserve(target: Element): Unit = js.native
  }
  
  trait DOMRectReadOnly extends StObject {
    
    val bottom: Double
    
    val height: Double
    
    val left: Double
    
    val right: Double
    
    val top: Double
    
    val width: Double
    
    val x: Double
    
    val y: Double
  }
  object DOMRectReadOnly {
    
    inline def apply(
      bottom: Double,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): DOMRectReadOnly = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMRectReadOnly]
    }
    
    extension [Self <: DOMRectReadOnly](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeObserver extends StObject {
    
    def disconnect(): Unit
    
    def observe(target: Element): Unit
    
    def unobserve(target: Element): Unit
  }
  object ResizeObserver {
    
    inline def apply(disconnect: () => Unit, observe: Element => Unit, unobserve: Element => Unit): ResizeObserver = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), unobserve = js.Any.fromFunction1(unobserve))
      __obj.asInstanceOf[ResizeObserver]
    }
    
    extension [Self <: ResizeObserver](x: Self) {
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setObserve(value: Element => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
      
      inline def setUnobserve(value: Element => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
    }
  }
  
  object global {
    
    trait ResizeObserver extends StObject {
      
      def disconnect(): Unit
      
      def observe(target: Element): Unit
      
      def unobserve(target: Element): Unit
    }
    object ResizeObserver {
      
      inline def apply(disconnect: () => Unit, observe: Element => Unit, unobserve: Element => Unit): typings.resizeObserverPolyfill.mod.global.ResizeObserver = {
        val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), unobserve = js.Any.fromFunction1(unobserve))
        __obj.asInstanceOf[typings.resizeObserverPolyfill.mod.global.ResizeObserver]
      }
      
      extension [Self <: typings.resizeObserverPolyfill.mod.global.ResizeObserver](x: Self) {
        
        inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
        
        inline def setObserve(value: Element => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
        
        inline def setUnobserve(value: Element => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
      }
    }
    
    type ResizeObserverCallback = js.Function2[
        /* entries */ js.Array[ResizeObserverEntry], 
        /* observer */ typings.resizeObserverPolyfill.mod.global.ResizeObserver, 
        Unit
      ]
    
    trait ResizeObserverEntry extends StObject {
      
      val contentRect: DOMRectReadOnly
      
      val target: Element
    }
    object ResizeObserverEntry {
      
      inline def apply(contentRect: DOMRectReadOnly, target: Element): ResizeObserverEntry = {
        val __obj = js.Dynamic.literal(contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResizeObserverEntry]
      }
      
      extension [Self <: ResizeObserverEntry](x: Self) {
        
        inline def setContentRect(value: DOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
        
        inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
  }
}
