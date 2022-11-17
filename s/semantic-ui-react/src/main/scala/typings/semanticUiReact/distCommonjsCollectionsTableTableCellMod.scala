package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.TdHTMLAttributes
import typings.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsTableTableCellMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableCell", JSImport.Default)
  @js.native
  val default: FC[TableCellProps] = js.native
  
  trait StrictTableCellProps
    extends StObject
       with TdHTMLAttributes[HTMLTableCellElement] {
    
    /** A cell can be active or selected by a user. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A table can be collapsing, taking up only as much space as its rows. */
    var collapsing: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A cell can be disabled. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A cell may call attention to an error or a negative value. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Add an Icon by name, props object, or pass an <Icon /> */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
    
    /** A cell may let a user know whether a value is bad. */
    var negative: js.UndefOr[Boolean] = js.undefined
    
    /** A cell may let a user know whether a value is good. */
    var positive: js.UndefOr[Boolean] = js.undefined
    
    /** A cell can be selectable. */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /** A cell can specify that its contents should remain on a single line and not wrap. */
    var singleLine: js.UndefOr[Boolean] = js.undefined
    
    /** A table cell can adjust its text alignment. */
    var textAlign: js.UndefOr["center" | "left" | "right"] = js.undefined
    
    /** A table cell can adjust its text alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
    
    /** A cell may warn a user. */
    var warning: js.UndefOr[Boolean] = js.undefined
    
    /** A table can specify the width of individual columns independently. */
    @JSName("width")
    var width_StrictTableCellProps: js.UndefOr[SemanticWIDTHS] = js.undefined
  }
  object StrictTableCellProps {
    
    inline def apply(): StrictTableCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableCellProps]
    }
    
    extension [Self <: StrictTableCellProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCollapsing(value: Boolean): Self = StObject.set(x, "collapsing", value.asInstanceOf[js.Any])
      
      inline def setCollapsingUndefined: Self = StObject.set(x, "collapsing", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSingleLine(value: Boolean): Self = StObject.set(x, "singleLine", value.asInstanceOf[js.Any])
      
      inline def setSingleLineUndefined: Self = StObject.set(x, "singleLine", js.undefined)
      
      inline def setTextAlign(value: "center" | "left" | "right"): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      
      inline def setWidth(value: SemanticWIDTHS): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type TableCellProps = StrictTableCellProps
  
  type _To = FC[TableCellProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsTableTableCellMod.foo` */
  override def _to: FC[TableCellProps] = default
}
