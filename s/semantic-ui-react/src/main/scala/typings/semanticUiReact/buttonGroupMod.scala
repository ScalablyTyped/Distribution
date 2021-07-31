package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.buttonButtonMod.ButtonProps
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button/ButtonGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[ButtonGroupProps] = js.native
  
  trait ButtonGroupProps
    extends StObject
       with StrictButtonGroupProps
       with /* key */ StringDictionary[js.Any]
  object ButtonGroupProps {
    
    @scala.inline
    def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
  }
  
  trait StrictButtonGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Groups can be attached to other content. */
    var attached: js.UndefOr[Boolean | left | right | top | bottom] = js.undefined
    
    /** Groups can be less pronounced. */
    var basic: js.UndefOr[Boolean] = js.undefined
    
    /** Array of shorthand Button values. */
    var buttons: js.UndefOr[SemanticShorthandCollection[ButtonProps]] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Groups can have a shared color. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Groups can reduce their padding to fit into tighter spaces. */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Groups can be aligned to the left or right of its container. */
    var floated: js.UndefOr[SemanticFLOATS] = js.undefined
    
    /** Groups can take the width of their container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can be formatted as icons. */
    var icon: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can be formatted to appear on dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can be formatted as labeled icon buttons. */
    var labeled: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can hint towards a negative consequence. */
    var negative: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can hint towards a positive consequence. */
    var positive: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can be formatted to show different levels of emphasis. */
    var primary: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can be formatted to show different levels of emphasis. */
    var secondary: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can have different sizes. */
    var size: js.UndefOr[SemanticSIZES] = js.undefined
    
    /** Groups can be formatted to toggle on and off. */
    var toggle: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can be formatted to appear vertically. */
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    /** Groups can have their widths divided evenly. */
    var widths: js.UndefOr[SemanticWIDTHS] = js.undefined
  }
  object StrictButtonGroupProps {
    
    @scala.inline
    def apply(): StrictButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictButtonGroupProps]
    }
    
    @scala.inline
    implicit class StrictButtonGroupPropsMutableBuilder[Self <: StrictButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: Boolean | left | right | top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def setButtons(value: SemanticShorthandCollection[ButtonProps]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: SemanticShorthandItem[ButtonProps]*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setLabeled(value: Boolean): Self = StObject.set(x, "labeled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabeledUndefined: Self = StObject.set(x, "labeled", js.undefined)
      
      @scala.inline
      def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      @scala.inline
      def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWidths(value: SemanticWIDTHS): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ButtonGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonGroupMod.foo` */
  override def _to: StatelessComponent[ButtonGroupProps] = default
}
