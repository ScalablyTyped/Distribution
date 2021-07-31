package typings.reactUseMeasure

import org.scalablytyped.runtime.Instantiable1
import typings.reactUseMeasure.mod.ResizeObserver
import typings.reactUseMeasure.mod.ResizeObserverCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* cb */ ResizeObserverCallback, ResizeObserver]
  
  trait Resize extends StObject {
    
    var resize: Double
    
    var scroll: Double
  }
  object Resize {
    
    @scala.inline
    def apply(resize: Double, scroll: Double): Resize = {
      val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resize]
    }
    
    @scala.inline
    implicit class ResizeMutableBuilder[Self <: Resize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResize(value: Double): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScroll(value: Double): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    }
  }
}
