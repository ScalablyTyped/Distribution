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
    
    inline def apply(dock: DockPosition): Dock = {
      val __obj = js.Dynamic.literal(dock = dock.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dock]
    }
    
    extension [Self <: Dock](x: Self) {
      
      inline def setDock(value: DockPosition): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rows extends StObject {
    
    val rows: js.Array[js.Object]
    
    val values: js.UndefOr[js.Object] = js.undefined
  }
  object Rows {
    
    inline def apply(rows: js.Array[js.Object]): Rows = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rows]
    }
    
    extension [Self <: Rows](x: Self) {
      
      inline def setRows(value: js.Array[js.Object]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: js.Object*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait Tools extends StObject {
    
    val tools: js.UndefOr[Dock] = js.undefined
  }
  object Tools {
    
    inline def apply(): Tools = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tools]
    }
    
    extension [Self <: Tools](x: Self) {
      
      inline def setTools(value: Dock): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
