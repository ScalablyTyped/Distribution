package typings.qrcodeGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CellSize extends StObject {
    
    var cellSize: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var scalable: js.UndefOr[Boolean] = js.undefined
  }
  object CellSize {
    
    inline def apply(): CellSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellSize] (val x: Self) extends AnyVal {
      
      inline def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      inline def setCellSizeUndefined: Self = StObject.set(x, "cellSize", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
      
      inline def setScalableUndefined: Self = StObject.set(x, "scalable", js.undefined)
    }
  }
}
