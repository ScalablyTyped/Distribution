package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typings.semanticUiReact.distCommonjsElementsLabelLabelDetailMod.LabelDetailProps
import typings.semanticUiReact.distCommonjsElementsLabelLabelGroupMod.LabelGroupProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticSIZES
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.semanticUiReactStrings.`bottom left`
import typings.semanticUiReact.semanticUiReactStrings.`bottom right`
import typings.semanticUiReact.semanticUiReactStrings.`top left`
import typings.semanticUiReact.semanticUiReactStrings.`top right`
import typings.semanticUiReact.semanticUiReactStrings.above
import typings.semanticUiReact.semanticUiReactStrings.below
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsLabelLabelMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label/Label", JSImport.Default)
  @js.native
  open class default protected () extends Component[LabelProps, ComponentState, Any] {
    def this(props: LabelProps) = this()
    def this(props: LabelProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label/Label", JSImport.Default)
  @js.native
  val default: LabelComponent = js.native
  
  @js.native
  trait LabelComponent
    extends StObject
       with ComponentClass[LabelProps, ComponentState] {
    
    var Detail: FC[LabelDetailProps] = js.native
    
    var Group: FC[LabelGroupProps] = js.native
  }
  
  trait LabelProps
    extends StObject
       with StrictLabelProps
       with /* key */ StringDictionary[Any]
  object LabelProps {
    
    inline def apply(): LabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelProps]
    }
  }
  
  trait StrictLabelProps extends StObject {
    
    /** A label can be active. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A label can attach to a content segment. */
    var attached: js.UndefOr[top | bottom | (`top right`) | (`top left`) | (`bottom left`) | (`bottom right`)] = js.undefined
    
    /** A label can reduce its complexity. */
    var basic: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** A label can be circular. */
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Color of the label. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A label can position itself in the corner of an element. */
    var corner: js.UndefOr[Boolean | left | right] = js.undefined
    
    /** Shorthand for LabelDetail. */
    var detail: js.UndefOr[SemanticShorthandItem[LabelDetailProps]] = js.undefined
    
    /** Formats the label as a dot. */
    var empty: js.UndefOr[Any] = js.undefined
    
    /** Float above another element in the upper right corner. */
    var floating: js.UndefOr[Boolean] = js.undefined
    
    /** A horizontal label is formatted to label content along-side it horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /** Add an icon by icon name or pass an <Icon /.> */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
    
    /** A label can be formatted to emphasize an image or prop can be used as shorthand for Image. */
    var image: js.UndefOr[Any] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps, Unit]
      ] = js.undefined
    
    /**
      * Adds an "x" icon, called when "x" is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onRemove: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps, Unit]
      ] = js.undefined
    
    /** A label can point to content next to it. */
    var pointing: js.UndefOr[Boolean | above | below | left | right] = js.undefined
    
    /** A label can prompt for an error in your forms. */
    var prompt: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for Icon to appear as the last child and trigger onRemove. */
    var removeIcon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
    
    /** A label can appear as a ribbon attaching itself to an element. */
    var ribbon: js.UndefOr[Boolean | right] = js.undefined
    
    /** A label can have different sizes. */
    var size: js.UndefOr[SemanticSIZES] = js.undefined
    
    /** A label can appear as a tag. */
    var tag: js.UndefOr[Boolean] = js.undefined
  }
  object StrictLabelProps {
    
    inline def apply(): StrictLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictLabelProps]
    }
    
    extension [Self <: StrictLabelProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttached(value: top | bottom | (`top right`) | (`top left`) | (`bottom left`) | (`bottom right`)): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCorner(value: Boolean | left | right): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
      
      inline def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
      
      inline def setDetail(value: SemanticShorthandItem[LabelDetailProps]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailFunction3(
        value: (/* component */ ElementType[LabelDetailProps], LabelDetailProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "detail", js.Any.fromFunction3(value))
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setEmpty(value: Any): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setOnClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnRemove(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setPointing(value: Boolean | above | below | left | right): Self = StObject.set(x, "pointing", value.asInstanceOf[js.Any])
      
      inline def setPointingUndefined: Self = StObject.set(x, "pointing", js.undefined)
      
      inline def setPrompt(value: Boolean): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setRemoveIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      inline def setRemoveIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "removeIcon", js.Any.fromFunction3(value))
      
      inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      inline def setRibbon(value: Boolean | right): Self = StObject.set(x, "ribbon", value.asInstanceOf[js.Any])
      
      inline def setRibbonUndefined: Self = StObject.set(x, "ribbon", js.undefined)
      
      inline def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTag(value: Boolean): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  type _To = LabelComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsLabelLabelMod.foo` */
  override def _to: LabelComponent = default
}
