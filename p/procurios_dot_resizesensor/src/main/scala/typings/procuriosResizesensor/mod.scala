package typings.procuriosResizesensor

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("procurios.resizesensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(targetElement: HTMLElement, callback: js.Function1[/* dimensions */ Dimensions, Unit]): ResizeSensor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(targetElement.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ResizeSensor]
  
  trait Dimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Dimensions {
    
    inline def apply(height: Double, width: Double): Dimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeSensor extends StObject {
    
    def destroy(): Unit
  }
  object ResizeSensor {
    
    inline def apply(destroy: () => Unit): ResizeSensor = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[ResizeSensor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeSensor] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
