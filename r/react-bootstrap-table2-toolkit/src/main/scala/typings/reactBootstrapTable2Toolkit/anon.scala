package typings.reactBootstrapTable2Toolkit

import typings.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bootstrap4 extends StObject {
    
    var bootstrap4: js.UndefOr[Boolean] = js.undefined
    
    var columns: js.Array[ColumnDescription[js.Any, js.Any]]
    
    var data: js.Array[js.Any]
    
    /**
      * table key field
      */
    var keyField: js.Any
  }
  object Bootstrap4 {
    
    inline def apply(columns: js.Array[ColumnDescription[js.Any, js.Any]], data: js.Array[js.Any], keyField: js.Any): Bootstrap4 = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bootstrap4]
    }
    
    extension [Self <: Bootstrap4](x: Self) {
      
      inline def setBootstrap4(value: Boolean): Self = StObject.set(x, "bootstrap4", value.asInstanceOf[js.Any])
      
      inline def setBootstrap4Undefined: Self = StObject.set(x, "bootstrap4", js.undefined)
      
      inline def setColumns(value: js.Array[ColumnDescription[js.Any, js.Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setKeyField(value: js.Any): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
    }
  }
  
  trait Columns extends StObject {
    
    var columns: js.Array[ColumnDescription[js.Any, js.Any]]
    
    def onColumnToggle(dataField: String): Unit
    
    /**
      * array of toggled columns
      */
    var toggles: js.Array[Boolean]
  }
  object Columns {
    
    inline def apply(
      columns: js.Array[ColumnDescription[js.Any, js.Any]],
      onColumnToggle: String => Unit,
      toggles: js.Array[Boolean]
    ): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1(onColumnToggle), toggles = toggles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    extension [Self <: Columns](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnDescription[js.Any, js.Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setOnColumnToggle(value: String => Unit): Self = StObject.set(x, "onColumnToggle", js.Any.fromFunction1(value))
      
      inline def setToggles(value: js.Array[Boolean]): Self = StObject.set(x, "toggles", value.asInstanceOf[js.Any])
      
      inline def setTogglesVarargs(value: Boolean*): Self = StObject.set(x, "toggles", js.Array(value :_*))
    }
  }
  
  trait OnExport extends StObject {
    
    def onExport(): Unit
  }
  object OnExport {
    
    inline def apply(onExport: () => Unit): OnExport = {
      val __obj = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
      __obj.asInstanceOf[OnExport]
    }
    
    extension [Self <: OnExport](x: Self) {
      
      inline def setOnExport(value: () => Unit): Self = StObject.set(x, "onExport", js.Any.fromFunction0(value))
    }
  }
}
