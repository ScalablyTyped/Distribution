package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTableTableHeadMod {
  
  @JSImport("react-toolbox/components/table/TableHead", JSImport.Default)
  @js.native
  open class default protected () extends TableHead {
    def this(props: TableHeadProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableHeadProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/table/TableHead", "TableHead")
  @js.native
  open class TableHead protected ()
    extends Component[TableHeadProps, js.Object, Any] {
    def this(props: TableHeadProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableHeadProps, context: Any) = this()
  }
  
  trait TableHeadProps
    extends StObject
       with Props {
    
    /**
      * If true, a checkbox will be displayed to select every row. In case the table is not multi-selectable, it will be disabled though.
      * @default true
      */
    var displaySelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the header and each row will display a checkbox to allow the user to select multiple rows.
      * @default true
      */
    var multiSelectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Handle the select state change of the checkbox in the header row.
      */
    var onSelect: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If true, each row will display a checkbox to allow the user to select that one row.
      * @default true
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If selectable, controls the selected state of the checkbox in the header row.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[TableHeadTheme] = js.undefined
  }
  object TableHeadProps {
    
    inline def apply(): TableHeadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeadProps]
    }
    
    extension [Self <: TableHeadProps](x: Self) {
      
      inline def setDisplaySelect(value: Boolean): Self = StObject.set(x, "displaySelect", value.asInstanceOf[js.Any])
      
      inline def setDisplaySelectUndefined: Self = StObject.set(x, "displaySelect", js.undefined)
      
      inline def setMultiSelectable(value: Boolean): Self = StObject.set(x, "multiSelectable", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectableUndefined: Self = StObject.set(x, "multiSelectable", js.undefined)
      
      inline def setOnSelect(value: js.Function): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTheme(value: TableHeadTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait TableHeadTheme extends StObject {
    
    /**
      * Modifier for cells that include a select checkbox.
      */
    var checkboxCell: js.UndefOr[String] = js.undefined
  }
  object TableHeadTheme {
    
    inline def apply(): TableHeadTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeadTheme]
    }
    
    extension [Self <: TableHeadTheme](x: Self) {
      
      inline def setCheckboxCell(value: String): Self = StObject.set(x, "checkboxCell", value.asInstanceOf[js.Any])
      
      inline def setCheckboxCellUndefined: Self = StObject.set(x, "checkboxCell", js.undefined)
    }
  }
}
