package typings.reactDataGrid

import typings.react.mod.Component
import typings.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typings.reactDataGrid.anon.Caption
import typings.reactDataGrid.anon.Id
import typings.reactDataGrid.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AdazzleReactDataGridPlugins {
  
  trait AutoCompleteEditorProps extends StObject {
    
    var column: js.UndefOr[ExcelColumn] = js.undefined
    
    var editorDisplayValue: js.UndefOr[js.Function2[/* column */ ExcelColumn, /* value */ Any, String]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[Any] = js.undefined
    
    var onCommit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var options: js.UndefOr[js.Array[Id]] = js.undefined
    
    var resultIdentifier: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
    
    var valueParams: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AutoCompleteEditorProps {
    
    inline def apply(): AutoCompleteEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoCompleteEditorProps]
    }
    
    extension [Self <: AutoCompleteEditorProps](x: Self) {
      
      inline def setColumn(value: ExcelColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setEditorDisplayValue(value: (/* column */ ExcelColumn, /* value */ Any) => String): Self = StObject.set(x, "editorDisplayValue", js.Any.fromFunction2(value))
      
      inline def setEditorDisplayValueUndefined: Self = StObject.set(x, "editorDisplayValue", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnCommit(value: () => Unit): Self = StObject.set(x, "onCommit", js.Any.fromFunction0(value))
      
      inline def setOnCommitUndefined: Self = StObject.set(x, "onCommit", js.undefined)
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: () => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction0(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOptions(value: js.Array[Id]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Id*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setResultIdentifier(value: String): Self = StObject.set(x, "resultIdentifier", value.asInstanceOf[js.Any])
      
      inline def setResultIdentifierUndefined: Self = StObject.set(x, "resultIdentifier", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueParams(value: js.Array[String]): Self = StObject.set(x, "valueParams", value.asInstanceOf[js.Any])
      
      inline def setValueParamsUndefined: Self = StObject.set(x, "valueParams", js.undefined)
      
      inline def setValueParamsVarargs(value: String*): Self = StObject.set(x, "valueParams", js.Array(value*))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait AutoCompleteTokensEditorProps extends StObject {
    
    var column: js.UndefOr[ExcelColumn] = js.undefined
    
    var options: js.Array[String | Caption]
    
    var value: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object AutoCompleteTokensEditorProps {
    
    inline def apply(options: js.Array[String | Caption]): AutoCompleteTokensEditorProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoCompleteTokensEditorProps]
    }
    
    extension [Self <: AutoCompleteTokensEditorProps](x: Self) {
      
      inline def setColumn(value: ExcelColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setOptions(value: js.Array[String | Caption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: (String | Caption)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  object DraggableHeader {
    
    type DraggableContainer = Component[Any, js.Object, Any]
  }
  
  trait DropDownEditorProps extends StObject {
    
    var options: js.Array[String | Text]
  }
  object DropDownEditorProps {
    
    inline def apply(options: js.Array[String | Text]): DropDownEditorProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownEditorProps]
    }
    
    extension [Self <: DropDownEditorProps](x: Self) {
      
      inline def setOptions(value: js.Array[String | Text]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: (String | Text)*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  object Editors {
    
    type AutoComplete = Component[AutoCompleteEditorProps, js.Object, Any]
    
    type AutoCompleteTokensEditor = Component[AutoCompleteTokensEditorProps, js.Object, Any]
    
    type CheckboxEditor = Component[Any, js.Object, Any]
    
    type DropDownEditor = Component[DropDownEditorProps, js.Object, Any]
    
    type SimpleTextEditor = Component[Any, js.Object, Any]
  }
  
  object Filters {
    
    type AutoCompleteFilter = Component[Any, js.Object, Any]
    
    type MultiSelectFilter = Component[Any, js.Object, Any]
    
    type NumericFilter = Component[Any, js.Object, Any]
    
    type SingleSelectFilter = Component[Any, js.Object, Any]
  }
  
  object Formatters {
    
    type DropDownFormatter = Component[Any, js.Object, Any]
    
    type ImageFormatter = Component[Any, js.Object, Any]
  }
  
  object Menu {
    
    type ContextMenu = Component[Any, js.Object, Any]
    
    type MenuHeader = Component[Any, js.Object, Any]
    
    type MenuItem = Component[Any, js.Object, Any]
    
    type SubMenu = Component[Any, js.Object, Any]
  }
  
  type Toolbar = Component[Any, js.Object, Any]
}
