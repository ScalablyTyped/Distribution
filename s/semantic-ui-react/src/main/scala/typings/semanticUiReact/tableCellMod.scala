package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.react.mod.TdHTMLAttributes
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table/TableCell", JSImport.Default)
  @js.native
  val default: StatelessComponent[TableCellProps] = js.native
  
  trait StrictTableCellProps
    extends StObject
       with TdHTMLAttributes[HTMLTableCellElement] {
    
    /** A cell can be active or selected by a user. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
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
    var textAlign: js.UndefOr[center | left | right] = js.undefined
    
    /** A table cell can adjust its text alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
    
    /** A cell may warn a user. */
    var warning: js.UndefOr[Boolean] = js.undefined
    
    /** A table can specify the width of individual columns independently. */
    @JSName("width")
    var width_StrictTableCellProps: js.UndefOr[SemanticWIDTHS] = js.undefined
  }
  object StrictTableCellProps {
    
    @scala.inline
    def apply(): StrictTableCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTableCellProps]
    }
    
    @scala.inline
    implicit class StrictTableCellPropsMutableBuilder[Self <: StrictTableCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setCollapsing(value: Boolean): Self = StObject.set(x, "collapsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsingUndefined: Self = StObject.set(x, "collapsing", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSingleLine(value: Boolean): Self = StObject.set(x, "singleLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleLineUndefined: Self = StObject.set(x, "singleLine", js.undefined)
      
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
      
      @scala.inline
      def setWidth(value: SemanticWIDTHS): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type TableCellProps = StrictTableCellProps
  
  type _To = StatelessComponent[TableCellProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableCellMod.foo` */
  override def _to: StatelessComponent[TableCellProps] = default
}
