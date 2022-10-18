package typings.reactSortablePane

import typings.reactSortablePane.libPaneMod.PaneSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    var className: String
    
    var grid: js.Array[Double]
    
    var maxHeight: Unit
    
    var maxWidth: Unit
    
    var minHeight: Double
    
    var minWidth: Double
    
    var resizable: X
  }
  object ClassName {
    
    inline def apply(
      className: String,
      grid: js.Array[Double],
      maxHeight: Unit,
      maxWidth: Unit,
      minHeight: Double,
      minWidth: Double,
      resizable: X
    ): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value*))
      
      inline def setMaxHeight(value: Unit): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Unit): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setResizable(value: X): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[PaneSize] = js.undefined
    
    var width: js.UndefOr[PaneSize] = js.undefined
  }
  object Height {
    
    inline def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: PaneSize): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: PaneSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Next extends StObject {
    
    var next: Double
    
    var previous: Double
  }
  object Next {
    
    inline def apply(next: Double, previous: Double): Next = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
      __obj.asInstanceOf[Next]
    }
    
    extension [Self <: Next](x: Self) {
      
      inline def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageX extends StObject {
    
    var pageX: Double
    
    var pageY: Double
  }
  object PageX {
    
    inline def apply(pageX: Double, pageY: Double): PageX = {
      val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageX]
    }
    
    extension [Self <: PageX](x: Self) {
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Boolean
    
    var xy: Boolean
    
    var y: Boolean
  }
  object X {
    
    inline def apply(x: Boolean, xy: Boolean, y: Boolean): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXy(value: Boolean): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
      
      inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
