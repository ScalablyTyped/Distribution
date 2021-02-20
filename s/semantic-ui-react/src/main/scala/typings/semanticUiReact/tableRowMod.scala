package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.tableCellMod.TableCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableRow", JSImport.Default)
  @js.native
  val default: StatelessComponent[TableRowProps] = js.native
  
  @js.native
  trait StrictTableRowProps extends StObject {
    
    /** A row can be active or selected by a user. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** An element type to render as (string or function). */
    var cellAs: js.UndefOr[js.Any] = js.native
    
    /** Shorthand array of props for TableCell. */
    var cells: js.UndefOr[SemanticShorthandCollection[TableCellProps]] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A row can be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** A row may call attention to an error or a negative value. */
    var error: js.UndefOr[Boolean] = js.native
    
    /** A row may let a user know whether a value is bad. */
    var negative: js.UndefOr[Boolean] = js.native
    
    /** A row may let a user know whether a value is good. */
    var positive: js.UndefOr[Boolean] = js.native
    
    /** A table row can adjust its text alignment. */
    var textAlign: js.UndefOr[center | left | right] = js.native
    
    /** A table row can adjust its vertical alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
    
    /** A row may warn a user. */
    var warning: js.UndefOr[Boolean] = js.native
  }
  object StrictTableRowProps {
    
    @scala.inline
    def apply(): StrictTableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableRowProps]
    }
    
    @scala.inline
    implicit class StrictTableRowPropsMutableBuilder[Self <: StrictTableRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setCellAs(value: js.Any): Self = StObject.set(x, "cellAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellAsUndefined: Self = StObject.set(x, "cellAs", js.undefined)
      
      @scala.inline
      def setCells(value: SemanticShorthandCollection[TableCellProps]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      @scala.inline
      def setCellsVarargs(value: SemanticShorthandItem[TableCellProps]*): Self = StObject.set(x, "cells", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setTextAlign(value: center | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  @js.native
  trait TableRowProps
    extends StrictTableRowProps
       with /* key */ StringDictionary[js.Any]
  object TableRowProps {
    
    @scala.inline
    def apply(): TableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowProps]
    }
  }
  
  type _To = StatelessComponent[TableRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableRowMod.foo` */
  override def _to: StatelessComponent[TableRowProps] = default
}
