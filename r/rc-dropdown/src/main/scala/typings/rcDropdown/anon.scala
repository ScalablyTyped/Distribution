package typings.rcDropdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdjustX extends StObject {
    
    var adjustX: Double
    
    var adjustY: Double
  }
  object AdjustX {
    
    inline def apply(adjustX: Double, adjustY: Double): AdjustX = {
      val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjustX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdjustX] (val x: Self) extends AnyVal {
      
      inline def setAdjustX(value: Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      inline def setAdjustY(value: Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Offset
    
    var bottomLeft: Offset
    
    var bottomRight: Offset
    
    var top: Offset
    
    var topLeft: Offset
    
    var topRight: Offset
  }
  object Bottom {
    
    inline def apply(
      bottom: Offset,
      bottomLeft: Offset,
      bottomRight: Offset,
      top: Offset,
      topLeft: Offset,
      topRight: Offset
    ): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Offset): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomLeft(value: Offset): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomRight(value: Offset): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Offset): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: Offset): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopRight(value: Offset): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  trait Offset extends StObject {
    
    var offset: js.Array[Double]
    
    var overflow: AdjustX
    
    var points: js.Array[String]
    
    var targetOffset: js.Array[Double]
  }
  object Offset {
    
    inline def apply(
      offset: js.Array[Double],
      overflow: AdjustX,
      points: js.Array[String],
      targetOffset: js.Array[Double]
    ): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], targetOffset = targetOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: String*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setTargetOffset(value: js.Array[Double]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      inline def setTargetOffsetVarargs(value: Double*): Self = StObject.set(x, "targetOffset", js.Array(value*))
    }
  }
}
