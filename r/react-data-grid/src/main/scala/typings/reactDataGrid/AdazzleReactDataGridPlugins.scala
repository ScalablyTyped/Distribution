package typings.reactDataGrid

import typings.react.mod.Component
import typings.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typings.reactDataGrid.anon.Caption
import typings.reactDataGrid.anon.Id
import typings.reactDataGrid.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AdazzleReactDataGridPlugins {
  
  @js.native
  trait AutoCompleteEditorProps extends StObject {
    
    var column: js.UndefOr[ExcelColumn] = js.native
    
    var editorDisplayValue: js.UndefOr[js.Function2[/* column */ ExcelColumn, /* value */ js.Any, String]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var label: js.UndefOr[js.Any] = js.native
    
    var onCommit: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.native
    
    var options: js.UndefOr[js.Array[Id]] = js.native
    
    var resultIdentifier: js.UndefOr[String] = js.native
    
    var search: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
    
    var valueParams: js.UndefOr[js.Array[String]] = js.native
  }
  object AutoCompleteEditorProps {
    
    @scala.inline
    def apply(): AutoCompleteEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoCompleteEditorProps]
    }
    
    @scala.inline
    implicit class AutoCompleteEditorPropsMutableBuilder[Self <: AutoCompleteEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ExcelColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setEditorDisplayValue(value: (/* column */ ExcelColumn, /* value */ js.Any) => String): Self = StObject.set(x, "editorDisplayValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEditorDisplayValueUndefined: Self = StObject.set(x, "editorDisplayValue", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnCommit(value: () => Unit): Self = StObject.set(x, "onCommit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCommitUndefined: Self = StObject.set(x, "onCommit", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: () => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Id]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: Id*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setResultIdentifier(value: String): Self = StObject.set(x, "resultIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultIdentifierUndefined: Self = StObject.set(x, "resultIdentifier", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueParams(value: js.Array[String]): Self = StObject.set(x, "valueParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueParamsUndefined: Self = StObject.set(x, "valueParams", js.undefined)
      
      @scala.inline
      def setValueParamsVarargs(value: String*): Self = StObject.set(x, "valueParams", js.Array(value :_*))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait AutoCompleteTokensEditorProps extends StObject {
    
    var column: js.UndefOr[ExcelColumn] = js.native
    
    var options: js.Array[String | Caption] = js.native
    
    var value: js.UndefOr[js.Array[_]] = js.native
  }
  object AutoCompleteTokensEditorProps {
    
    @scala.inline
    def apply(options: js.Array[String | Caption]): AutoCompleteTokensEditorProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoCompleteTokensEditorProps]
    }
    
    @scala.inline
    implicit class AutoCompleteTokensEditorPropsMutableBuilder[Self <: AutoCompleteTokensEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ExcelColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[String | Caption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: (String | Caption)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  object DraggableHeader {
    
    type DraggableContainer = Component[js.Any, js.Object, js.Any]
  }
  
  @js.native
  trait DropDownEditorProps extends StObject {
    
    var options: js.Array[String | Text] = js.native
  }
  object DropDownEditorProps {
    
    @scala.inline
    def apply(options: js.Array[String | Text]): DropDownEditorProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownEditorProps]
    }
    
    @scala.inline
    implicit class DropDownEditorPropsMutableBuilder[Self <: DropDownEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Array[String | Text]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: (String | Text)*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  object Editors {
    
    type AutoComplete = Component[AutoCompleteEditorProps, js.Object, js.Any]
    
    type AutoCompleteTokensEditor = Component[AutoCompleteTokensEditorProps, js.Object, js.Any]
    
    type CheckboxEditor = Component[js.Any, js.Object, js.Any]
    
    type DropDownEditor = Component[DropDownEditorProps, js.Object, js.Any]
    
    type SimpleTextEditor = Component[js.Any, js.Object, js.Any]
  }
  
  object Filters {
    
    type AutoCompleteFilter = Component[js.Any, js.Object, js.Any]
    
    type MultiSelectFilter = Component[js.Any, js.Object, js.Any]
    
    type NumericFilter = Component[js.Any, js.Object, js.Any]
    
    type SingleSelectFilter = Component[js.Any, js.Object, js.Any]
  }
  
  object Formatters {
    
    type DropDownFormatter = Component[js.Any, js.Object, js.Any]
    
    type ImageFormatter = Component[js.Any, js.Object, js.Any]
  }
  
  object Menu {
    
    type ContextMenu = Component[js.Any, js.Object, js.Any]
    
    type MenuHeader = Component[js.Any, js.Object, js.Any]
    
    type MenuItem = Component[js.Any, js.Object, js.Any]
    
    type SubMenu = Component[js.Any, js.Object, js.Any]
  }
  
  type Toolbar = Component[js.Any, js.Object, js.Any]
}
