package typings.reactBootstrapTable2Toolkit

import typings.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bootstrap4 extends StObject {
    
    var bootstrap4: js.UndefOr[Boolean] = js.native
    
    var columns: js.Array[ColumnDescription[_, _]] = js.native
    
    var data: js.Array[_] = js.native
    
    /**
      * table key field
      */
    var keyField: js.Any = js.native
  }
  object Bootstrap4 {
    
    @scala.inline
    def apply(columns: js.Array[ColumnDescription[_, _]], data: js.Array[_], keyField: js.Any): Bootstrap4 = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bootstrap4]
    }
    
    @scala.inline
    implicit class Bootstrap4MutableBuilder[Self <: Bootstrap4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrap4(value: Boolean): Self = StObject.set(x, "bootstrap4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrap4Undefined: Self = StObject.set(x, "bootstrap4", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[ColumnDescription[_, _]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setKeyField(value: js.Any): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Columns extends StObject {
    
    var columns: js.Array[ColumnDescription[_, _]] = js.native
    
    def onColumnToggle(dataField: String): Unit = js.native
    
    /**
      * array of toggled columns
      */
    var toggles: js.Array[Boolean] = js.native
  }
  object Columns {
    
    @scala.inline
    def apply(
      columns: js.Array[ColumnDescription[_, _]],
      onColumnToggle: String => Unit,
      toggles: js.Array[Boolean]
    ): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1(onColumnToggle), toggles = toggles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    @scala.inline
    implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[ColumnDescription[_, _]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setOnColumnToggle(value: String => Unit): Self = StObject.set(x, "onColumnToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggles(value: js.Array[Boolean]): Self = StObject.set(x, "toggles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglesVarargs(value: Boolean*): Self = StObject.set(x, "toggles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OnExport extends StObject {
    
    def onExport(): Unit = js.native
  }
  object OnExport {
    
    @scala.inline
    def apply(onExport: () => Unit): OnExport = {
      val __obj = js.Dynamic.literal(onExport = js.Any.fromFunction0(onExport))
      __obj.asInstanceOf[OnExport]
    }
    
    @scala.inline
    implicit class OnExportMutableBuilder[Self <: OnExport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnExport(value: () => Unit): Self = StObject.set(x, "onExport", js.Any.fromFunction0(value))
    }
  }
}
