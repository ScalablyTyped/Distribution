package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.semanticUiReactStrings.ascending
import typings.semanticUiReact.semanticUiReactStrings.descending
import typings.semanticUiReact.tableCellMod.StrictTableCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeaderCellMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableHeaderCell", JSImport.Default)
  @js.native
  val default: StatelessComponent[TableHeaderCellProps] = js.native
  
  trait StrictTableHeaderCellProps
    extends StObject
       with StrictTableCellProps {
    
    /** A header cell can be sorted in ascending or descending order. */
    var sorted: js.UndefOr[ascending | descending] = js.undefined
  }
  object StrictTableHeaderCellProps {
    
    inline def apply(): StrictTableHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableHeaderCellProps]
    }
    
    extension [Self <: StrictTableHeaderCellProps](x: Self) {
      
      inline def setSorted(value: ascending | descending): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
  
  trait TableHeaderCellProps
    extends StObject
       with StrictTableHeaderCellProps
       with /* key */ StringDictionary[js.Any]
  object TableHeaderCellProps {
    
    inline def apply(): TableHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderCellProps]
    }
  }
  
  type _To = StatelessComponent[TableHeaderCellProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeaderCellMod.foo` */
  override def _to: StatelessComponent[TableHeaderCellProps] = default
}
