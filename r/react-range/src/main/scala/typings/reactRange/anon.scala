package typings.reactRange

import typings.react.mod.ReactNode
import typings.reactRange.typesMod.IMarkProps
import typings.reactRange.typesMod.IThumbProps
import typings.reactRange.typesMod.ITrackProps
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
  
  trait Children extends StObject {
    
    var children: ReactNode
    
    var disabled: Boolean
    
    var isDragged: Boolean
    
    var props: ITrackProps
  }
  object Children {
    
    inline def apply(disabled: Boolean, isDragged: Boolean, props: ITrackProps): Children = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      inline def setProps(value: ITrackProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
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
      
      inline def setDraggedTrackPosVarargs(value: Double*): Self = StObject.set(x, "draggedTrackPos", js.Array(value :_*))
      
      inline def setIsChanged(value: Boolean): Self = StObject.set(x, "isChanged", value.asInstanceOf[js.Any])
      
      inline def setMarkOffsets(value: js.Array[scala.Nothing]): Self = StObject.set(x, "markOffsets", value.asInstanceOf[js.Any])
      
      inline def setMarkOffsetsVarargs(value: scala.Nothing*): Self = StObject.set(x, "markOffsets", js.Array(value :_*))
      
      inline def setThumbZIndexes(value: js.Array[Double]): Self = StObject.set(x, "thumbZIndexes", value.asInstanceOf[js.Any])
      
      inline def setThumbZIndexesVarargs(value: Double*): Self = StObject.set(x, "thumbZIndexes", js.Array(value :_*))
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var props: IMarkProps
  }
  object Index {
    
    inline def apply(index: Double, props: IMarkProps): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setProps(value: IMarkProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsDragged extends StObject {
    
    var index: Double
    
    var isDragged: Boolean
    
    var props: IThumbProps
    
    var value: Double
  }
  object IsDragged {
    
    inline def apply(index: Double, isDragged: Boolean, props: IThumbProps, value: Double): IsDragged = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDragged]
    }
    
    extension [Self <: IsDragged](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      inline def setProps(value: IThumbProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
