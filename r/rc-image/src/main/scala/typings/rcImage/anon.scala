package typings.rcImage

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    var close: js.UndefOr[ReactNode] = js.undefined
    
    var left: js.UndefOr[ReactNode] = js.undefined
    
    var right: js.UndefOr[ReactNode] = js.undefined
    
    var rotateLeft: js.UndefOr[ReactNode] = js.undefined
    
    var rotateRight: js.UndefOr[ReactNode] = js.undefined
    
    var zoomIn: js.UndefOr[ReactNode] = js.undefined
    
    var zoomOut: js.UndefOr[ReactNode] = js.undefined
  }
  object Close {
    
    inline def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: ReactNode): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setLeft(value: ReactNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: ReactNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRotateLeft(value: ReactNode): Self = StObject.set(x, "rotateLeft", value.asInstanceOf[js.Any])
      
      inline def setRotateLeftUndefined: Self = StObject.set(x, "rotateLeft", js.undefined)
      
      inline def setRotateRight(value: ReactNode): Self = StObject.set(x, "rotateRight", value.asInstanceOf[js.Any])
      
      inline def setRotateRightUndefined: Self = StObject.set(x, "rotateRight", js.undefined)
      
      inline def setZoomIn(value: ReactNode): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
      
      inline def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
      
      inline def setZoomOut(value: ReactNode): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
      
      inline def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
