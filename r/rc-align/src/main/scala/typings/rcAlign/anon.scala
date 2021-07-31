package typings.rcAlign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdjustX extends StObject {
    
    var adjustX: js.UndefOr[Boolean | Double] = js.undefined
    
    var adjustY: js.UndefOr[Boolean | Double] = js.undefined
  }
  object AdjustX {
    
    @scala.inline
    def apply(): AdjustX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustX]
    }
    
    @scala.inline
    implicit class AdjustXMutableBuilder[Self <: AdjustX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustX(value: Boolean | Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
      
      @scala.inline
      def setAdjustY(value: Boolean | Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
    }
  }
  
  trait AdjustY extends StObject {
    
    var adjustX: Boolean | Double
    
    var adjustY: Boolean | Double
  }
  object AdjustY {
    
    @scala.inline
    def apply(adjustX: Boolean | Double, adjustY: Boolean | Double): AdjustY = {
      val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjustY]
    }
    
    @scala.inline
    implicit class AdjustYMutableBuilder[Self <: AdjustY] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustX(value: Boolean | Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustY(value: Boolean | Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
    }
  }
}
