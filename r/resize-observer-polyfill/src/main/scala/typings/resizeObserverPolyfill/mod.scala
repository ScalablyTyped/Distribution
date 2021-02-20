package typings.resizeObserverPolyfill

import typings.resizeObserverPolyfill.mod.global.ResizeObserverCallback
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("resize-observer-polyfill", JSImport.Default)
  @js.native
  class defaultCls protected () extends ResizeObserver {
    def this(callback: ResizeObserverCallback) = this()
  }
  
  @js.native
  trait DOMRectReadOnly extends StObject {
    
    val bottom: Double = js.native
    
    val height: Double = js.native
    
    val left: Double = js.native
    
    val right: Double = js.native
    
    val top: Double = js.native
    
    val width: Double = js.native
    
    val x: Double = js.native
    
    val y: Double = js.native
  }
  object DOMRectReadOnly {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DOMRectReadOnlyMutableBuilder[Self <: DOMRectReadOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResizeObserver extends StObject {
    
    def disconnect(): Unit = js.native
    
    def observe(target: Element): Unit = js.native
    
    def unobserve(target: Element): Unit = js.native
  }
  object ResizeObserver {
    
    @scala.inline
    def apply(disconnect: () => Unit, observe: Element => Unit, unobserve: Element => Unit): ResizeObserver = {
      val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), unobserve = js.Any.fromFunction1(unobserve))
      __obj.asInstanceOf[ResizeObserver]
    }
    
    @scala.inline
    implicit class ResizeObserverMutableBuilder[Self <: ResizeObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setObserve(value: Element => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnobserve(value: Element => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
    }
  }
  
  object global {
    
    @js.native
    trait ResizeObserver extends StObject {
      
      def disconnect(): Unit = js.native
      
      def observe(target: Element): Unit = js.native
      
      def unobserve(target: Element): Unit = js.native
    }
    object ResizeObserver {
      
      @scala.inline
      def apply(disconnect: () => Unit, observe: Element => Unit, unobserve: Element => Unit): typings.resizeObserverPolyfill.mod.global.ResizeObserver = {
        val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), unobserve = js.Any.fromFunction1(unobserve))
        __obj.asInstanceOf[typings.resizeObserverPolyfill.mod.global.ResizeObserver]
      }
      
      @scala.inline
      implicit class ResizeObserverMutableBuilder[Self <: typings.resizeObserverPolyfill.mod.global.ResizeObserver] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
        
        @scala.inline
        def setObserve(value: Element => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUnobserve(value: Element => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
      }
    }
    
    type ResizeObserverCallback = js.Function2[
        /* entries */ js.Array[ResizeObserverEntry], 
        /* observer */ typings.resizeObserverPolyfill.mod.global.ResizeObserver, 
        Unit
      ]
    
    @js.native
    trait ResizeObserverEntry extends StObject {
      
      val contentRect: DOMRectReadOnly = js.native
      
      val target: Element = js.native
    }
    object ResizeObserverEntry {
      
      @scala.inline
      def apply(contentRect: DOMRectReadOnly, target: Element): ResizeObserverEntry = {
        val __obj = js.Dynamic.literal(contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResizeObserverEntry]
      }
      
      @scala.inline
      implicit class ResizeObserverEntryMutableBuilder[Self <: ResizeObserverEntry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentRect(value: DOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
  }
}
