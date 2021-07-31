package typings.reactWindow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align extends StObject {
    
    var align: js.UndefOr[typings.reactWindow.mod.Align] = js.undefined
    
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    var rowIndex: js.UndefOr[Double] = js.undefined
  }
  object Align {
    
    @scala.inline
    def apply(): Align = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: typings.reactWindow.mod.Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  trait ColumnIndex extends StObject {
    
    var columnIndex: Double
    
    var data: js.Any
    
    var rowIndex: Double
  }
  object ColumnIndex {
    
    @scala.inline
    def apply(columnIndex: Double, data: js.Any, rowIndex: Double): ColumnIndex = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnIndex]
    }
    
    @scala.inline
    implicit class ColumnIndexMutableBuilder[Self <: ColumnIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props[P, S] extends StObject {
    
    var props: P
    
    var state: S
  }
  object Props {
    
    @scala.inline
    def apply[P, S](props: P, state: S): Props[P, S] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[P, S]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[?, ?], P, S] (val x: Self & (Props[P, S])) extends AnyVal {
      
      @scala.inline
      def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowIndex extends StObject {
    
    var columnIndex: Double
    
    var rowIndex: Double
    
    var shouldForceUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object RowIndex {
    
    @scala.inline
    def apply(columnIndex: Double, rowIndex: Double): RowIndex = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowIndex]
    }
    
    @scala.inline
    implicit class RowIndexMutableBuilder[Self <: RowIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldForceUpdate(value: Boolean): Self = StObject.set(x, "shouldForceUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldForceUpdateUndefined: Self = StObject.set(x, "shouldForceUpdate", js.undefined)
    }
  }
  
  trait ScrollLeft extends StObject {
    
    var scrollLeft: Double
    
    var scrollTop: Double
  }
  object ScrollLeft {
    
    @scala.inline
    def apply(scrollLeft: Double, scrollTop: Double): ScrollLeft = {
      val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollLeft]
    }
    
    @scala.inline
    implicit class ScrollLeftMutableBuilder[Self <: ScrollLeft] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
}
