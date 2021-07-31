package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.flagFlagMod.FlagProps
import typings.semanticUiReact.genericMod.HtmlSpanProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.imageImageMod.ImageProps
import typings.semanticUiReact.labelLabelMod.LabelProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownItemMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownItem", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[DropdownItemProps, ComponentState, js.Any] {
    def this(props: DropdownItemProps) = this()
    def this(props: DropdownItemProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownItem", JSImport.Default)
  @js.native
  val default: ComponentClass[DropdownItemProps, ComponentState] = js.native
  
  trait DropdownItemProps
    extends StObject
       with StrictDropdownItemProps
       with /* key */ StringDictionary[js.Any]
  object DropdownItemProps {
    
    @scala.inline
    def apply(): DropdownItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownItemProps]
    }
  }
  
  trait StrictDropdownItemProps extends StObject {
    
    /** Style as the currently chosen item. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Additional text with less emphasis. */
    var description: js.UndefOr[SemanticShorthandItem[HtmlSpanProps]] = js.undefined
    
    /** A dropdown item can be disabled. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for Flag. */
    var flag: js.UndefOr[SemanticShorthandItem[FlagProps]] = js.undefined
    
    /** Shorthand for Icon. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
    
    /** Shorthand for Image. */
    var image: js.UndefOr[SemanticShorthandItem[ImageProps]] = js.undefined
    
    /** Shorthand for Label. */
    var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          /* data */ DropdownItemProps, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The item currently selected by keyboard shortcut.
      * This is not the active item.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** Display text. */
    var text: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Stored value. */
    var value: js.UndefOr[Boolean | Double | String] = js.undefined
  }
  object StrictDropdownItemProps {
    
    @scala.inline
    def apply(): StrictDropdownItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownItemProps]
    }
    
    @scala.inline
    implicit class StrictDropdownItemPropsMutableBuilder[Self <: StrictDropdownItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDescription(value: SemanticShorthandItem[HtmlSpanProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFunction3(
        value: (/* component */ ElementType[HtmlSpanProps], HtmlSpanProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFlag(value: SemanticShorthandItem[FlagProps]): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagFunction3(
        value: (/* component */ ElementType[FlagProps], FlagProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "flag", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      @scala.inline
      def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setImage(value: SemanticShorthandItem[ImageProps]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageFunction3(
        value: (/* component */ ElementType[ImageProps], ImageProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setLabel(value: SemanticShorthandItem[LabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ElementType[LabelProps], LabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ DropdownItemProps) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setText(value: SemanticShorthandContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: Boolean | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ComponentClass[DropdownItemProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownItemMod.foo` */
  override def _to: ComponentClass[DropdownItemProps, ComponentState] = default
}
