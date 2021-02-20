package typings.qrcodeGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CellSize extends StObject {
    
    var cellSize: js.UndefOr[Double] = js.native
    
    var margin: js.UndefOr[Double] = js.native
    
    var scalable: js.UndefOr[Boolean] = js.native
  }
  object CellSize {
    
    @scala.inline
    def apply(): CellSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSize]
    }
    
    @scala.inline
    implicit class CellSizeMutableBuilder[Self <: CellSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSizeUndefined: Self = StObject.set(x, "cellSize", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalableUndefined: Self = StObject.set(x, "scalable", js.undefined)
    }
  }
}
