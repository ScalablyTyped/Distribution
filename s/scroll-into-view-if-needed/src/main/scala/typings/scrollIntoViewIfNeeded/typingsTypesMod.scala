package typings.scrollIntoViewIfNeeded

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsTypesMod {
  
  trait CustomScrollAction extends StObject {
    
    var el: Element
    
    var left: Double
    
    var top: Double
  }
  object CustomScrollAction {
    
    inline def apply(el: Element, left: Double, top: Double): CustomScrollAction = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomScrollAction]
    }
    
    extension [Self <: CustomScrollAction](x: Self) {
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomScrollBehaviorCallback[T] = js.Function1[/* actions */ js.Array[CustomScrollAction], T]
  
  type CustomScrollBoundary = Element | CustomScrollBoundaryCallback | Null
  
  type CustomScrollBoundaryCallback = js.Function1[/* parent */ Element, Boolean]
  
  trait Options extends StObject {
    
    var block: js.UndefOr[ScrollLogicalPosition] = js.undefined
    
    var boundary: js.UndefOr[CustomScrollBoundary] = js.undefined
    
    var `inline`: js.UndefOr[ScrollLogicalPosition] = js.undefined
    
    var scrollMode: js.UndefOr[ScrollMode] = js.undefined
    
    var skipOverflowHiddenElements: js.UndefOr[SkipOverflowHiddenElements] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBlock(value: ScrollLogicalPosition): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setBoundary(value: CustomScrollBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryFunction1(value: /* parent */ Element => Boolean): Self = StObject.set(x, "boundary", js.Any.fromFunction1(value))
      
      inline def setBoundaryNull: Self = StObject.set(x, "boundary", null)
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setInline(value: ScrollLogicalPosition): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      inline def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      inline def setSkipOverflowHiddenElements(value: SkipOverflowHiddenElements): Self = StObject.set(x, "skipOverflowHiddenElements", value.asInstanceOf[js.Any])
      
      inline def setSkipOverflowHiddenElementsUndefined: Self = StObject.set(x, "skipOverflowHiddenElements", js.undefined)
    }
  }
  
  object ScrollBehavior {
    
    inline def auto: "auto" = "auto".asInstanceOf["auto"]
    
    inline def smooth: "smooth" = "smooth".asInstanceOf["smooth"]
  }
  type ScrollBehavior = "auto" | "smooth"
  
  object ScrollLogicalPosition {
    
    inline def center: "center" = "center".asInstanceOf["center"]
    
    inline def end: "end" = "end".asInstanceOf["end"]
    
    inline def nearest: "nearest" = "nearest".asInstanceOf["nearest"]
    
    inline def start: "start" = "start".asInstanceOf["start"]
  }
  type ScrollLogicalPosition = "start" | "center" | "end" | "nearest"
  
  object ScrollMode {
    
    inline def always: "always" = "always".asInstanceOf["always"]
    
    inline def `if-needed`: "if-needed" = "if-needed".asInstanceOf["if-needed"]
  }
  type ScrollMode = "always" | "if-needed"
  
  type SkipOverflowHiddenElements = Boolean
}
