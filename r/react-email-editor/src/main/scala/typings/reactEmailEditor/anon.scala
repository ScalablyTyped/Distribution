package typings.reactEmailEditor

import typings.reactEmailEditor.mod.DockPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dock extends StObject {
    
    val dock: DockPosition
  }
  object Dock {
    
    @scala.inline
    def apply(dock: DockPosition): Dock = {
      val __obj = js.Dynamic.literal(dock = dock.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dock]
    }
    
    @scala.inline
    implicit class DockMutableBuilder[Self <: Dock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDock(value: DockPosition): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rows extends StObject {
    
    val rows: js.Array[js.Object]
    
    val values: js.UndefOr[js.Object] = js.undefined
  }
  object Rows {
    
    @scala.inline
    def apply(rows: js.Array[js.Object]): Rows = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rows]
    }
    
    @scala.inline
    implicit class RowsMutableBuilder[Self <: Rows] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRows(value: js.Array[js.Object]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: js.Object*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait Tools extends StObject {
    
    val tools: js.UndefOr[Dock] = js.undefined
  }
  object Tools {
    
    @scala.inline
    def apply(): Tools = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tools]
    }
    
    @scala.inline
    implicit class ToolsMutableBuilder[Self <: Tools] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTools(value: Dock): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    }
  }
}
