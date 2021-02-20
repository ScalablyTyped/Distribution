package typings.reactSortablePane

import typings.reactSortablePane.paneMod.PaneSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClassName extends StObject {
    
    var className: String = js.native
    
    var grid: js.Array[Double] = js.native
    
    var maxHeight: js.UndefOr[scala.Nothing] = js.native
    
    var maxWidth: js.UndefOr[scala.Nothing] = js.native
    
    var minHeight: Double = js.native
    
    var minWidth: Double = js.native
    
    var resizable: X = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(className: String, grid: js.Array[Double], minHeight: Double, minWidth: Double, resizable: X): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value :_*))
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizable(value: X): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: js.UndefOr[PaneSize] = js.native
    
    var width: js.UndefOr[PaneSize] = js.native
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: PaneSize): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: PaneSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Next extends StObject {
    
    var next: Double = js.native
    
    var previous: Double = js.native
  }
  object Next {
    
    @scala.inline
    def apply(next: Double, previous: Double): Next = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
      __obj.asInstanceOf[Next]
    }
    
    @scala.inline
    implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageX extends StObject {
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
  }
  object PageX {
    
    @scala.inline
    def apply(pageX: Double, pageY: Double): PageX = {
      val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageX]
    }
    
    @scala.inline
    implicit class PageXMutableBuilder[Self <: PageX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Boolean = js.native
    
    var xy: Boolean = js.native
    
    var y: Boolean = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Boolean, xy: Boolean, y: Boolean): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXy(value: Boolean): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
