package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.semanticUiReactStrings.ascending
import typings.semanticUiReact.semanticUiReactStrings.descending
import typings.semanticUiReact.tableCellMod.StrictTableCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeaderCellMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableHeaderCell", JSImport.Default)
  @js.native
  val default: StatelessComponent[TableHeaderCellProps] = js.native
  
  @js.native
  trait StrictTableHeaderCellProps extends StrictTableCellProps {
    
    /** A header cell can be sorted in ascending or descending order. */
    var sorted: js.UndefOr[ascending | descending] = js.native
  }
  object StrictTableHeaderCellProps {
    
    @scala.inline
    def apply(): StrictTableHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableHeaderCellProps]
    }
    
    @scala.inline
    implicit class StrictTableHeaderCellPropsMutableBuilder[Self <: StrictTableHeaderCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSorted(value: ascending | descending): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
  
  @js.native
  trait TableHeaderCellProps
    extends StrictTableHeaderCellProps
       with /* key */ StringDictionary[js.Any]
  object TableHeaderCellProps {
    
    @scala.inline
    def apply(): TableHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderCellProps]
    }
  }
  
  type _To = StatelessComponent[TableHeaderCellProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeaderCellMod.foo` */
  override def _to: StatelessComponent[TableHeaderCellProps] = default
}
