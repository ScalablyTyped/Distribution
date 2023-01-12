package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsCollectionsTableTableCellMod.TableCellProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsTableTableRowMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableRow", JSImport.Default)
  @js.native
  val default: FC[TableRowProps] = js.native
  
  trait StrictTableRowProps extends StObject {
    
    /** A row can be active or selected by a user. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** An element type to render as (string or function). */
    var cellAs: js.UndefOr[Any] = js.undefined
    
    /** Shorthand array of props for TableCell. */
    var cells: js.UndefOr[SemanticShorthandCollection[TableCellProps]] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A row can be disabled. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A row may call attention to an error or a negative value. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** A row may let a user know whether a value is bad. */
    var negative: js.UndefOr[Boolean] = js.undefined
    
    /** A row may let a user know whether a value is good. */
    var positive: js.UndefOr[Boolean] = js.undefined
    
    /** A table row can adjust its text alignment. */
    var textAlign: js.UndefOr[center | left | right] = js.undefined
    
    /** A table row can adjust its vertical alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
    
    /** A row may warn a user. */
    var warning: js.UndefOr[Boolean] = js.undefined
  }
  object StrictTableRowProps {
    
    inline def apply(): StrictTableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableRowProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictTableRowProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCellAs(value: Any): Self = StObject.set(x, "cellAs", value.asInstanceOf[js.Any])
      
      inline def setCellAsUndefined: Self = StObject.set(x, "cellAs", js.undefined)
      
      inline def setCells(value: SemanticShorthandCollection[TableCellProps]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: SemanticShorthandItem[TableCellProps]*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setTextAlign(value: center | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait TableRowProps
    extends StObject
       with StrictTableRowProps
       with /* key */ StringDictionary[Any]
  object TableRowProps {
    
    inline def apply(): TableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowProps]
    }
  }
  
  type _To = FC[TableRowProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsTableTableRowMod.foo` */
  override def _to: FC[TableRowProps] = default
}
