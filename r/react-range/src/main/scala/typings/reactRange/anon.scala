package typings.reactRange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait DraggedThumbIndex extends StObject {
    
    var draggedThumbIndex: Double
    
    var draggedTrackPos: js.Array[Double]
    
    var isChanged: Boolean
    
    var markOffsets: js.Array[scala.Nothing]
    
    var thumbZIndexes: js.Array[Double]
  }
  object DraggedThumbIndex {
    
    inline def apply(
      draggedThumbIndex: Double,
      draggedTrackPos: js.Array[Double],
      isChanged: Boolean,
      markOffsets: js.Array[scala.Nothing],
      thumbZIndexes: js.Array[Double]
    ): DraggedThumbIndex = {
      val __obj = js.Dynamic.literal(draggedThumbIndex = draggedThumbIndex.asInstanceOf[js.Any], draggedTrackPos = draggedTrackPos.asInstanceOf[js.Any], isChanged = isChanged.asInstanceOf[js.Any], markOffsets = markOffsets.asInstanceOf[js.Any], thumbZIndexes = thumbZIndexes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggedThumbIndex]
    }
    
    extension [Self <: DraggedThumbIndex](x: Self) {
      
      inline def setDraggedThumbIndex(value: Double): Self = StObject.set(x, "draggedThumbIndex", value.asInstanceOf[js.Any])
      
      inline def setDraggedTrackPos(value: js.Array[Double]): Self = StObject.set(x, "draggedTrackPos", value.asInstanceOf[js.Any])
      
      inline def setDraggedTrackPosVarargs(value: Double*): Self = StObject.set(x, "draggedTrackPos", js.Array(value*))
      
      inline def setIsChanged(value: Boolean): Self = StObject.set(x, "isChanged", value.asInstanceOf[js.Any])
      
      inline def setMarkOffsets(value: js.Array[scala.Nothing]): Self = StObject.set(x, "markOffsets", value.asInstanceOf[js.Any])
      
      inline def setMarkOffsetsVarargs(value: scala.Nothing*): Self = StObject.set(x, "markOffsets", js.Array(value*))
      
      inline def setThumbZIndexes(value: js.Array[Double]): Self = StObject.set(x, "thumbZIndexes", value.asInstanceOf[js.Any])
      
      inline def setThumbZIndexesVarargs(value: Double*): Self = StObject.set(x, "thumbZIndexes", js.Array(value*))
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
