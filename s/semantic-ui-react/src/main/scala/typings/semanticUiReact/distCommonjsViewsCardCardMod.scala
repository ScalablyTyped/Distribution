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
import typings.semanticUiReact.distCommonjsElementsImageImageMod.ImageProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsViewsCardCardContentMod.CardContentProps
import typings.semanticUiReact.distCommonjsViewsCardCardDescriptionMod.CardDescriptionProps
import typings.semanticUiReact.distCommonjsViewsCardCardGroupMod.CardGroupProps
import typings.semanticUiReact.distCommonjsViewsCardCardHeaderMod.CardHeaderProps
import typings.semanticUiReact.distCommonjsViewsCardCardMetaMod.CardMetaProps
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsCardCardMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/Card", JSImport.Default)
  @js.native
  open class default protected () extends Component[CardProps, ComponentState, Any] {
    def this(props: CardProps) = this()
    def this(props: CardProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/Card", JSImport.Default)
  @js.native
  val default: CardComponent = js.native
  
  @js.native
  trait CardComponent
    extends StObject
       with ComponentClass[CardProps, ComponentState] {
    
    var Content: FC[CardContentProps] = js.native
    
    var Description: FC[CardDescriptionProps] = js.native
    
    var Group: FC[CardGroupProps] = js.native
    
    var Header: FC[CardHeaderProps] = js.native
    
    var Meta: FC[CardMetaProps] = js.native
  }
  
  trait CardProps
    extends StObject
       with StrictCardProps
       with /* key */ StringDictionary[Any]
  object CardProps {
    
    inline def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
  }
  
  trait StrictCardProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A Card can center itself inside its container. */
    var centered: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A Card can be formatted to display different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for CardDescription. */
    var description: js.UndefOr[SemanticShorthandItem[CardDescriptionProps]] = js.undefined
    
    /** Shorthand for primary content of CardContent. */
    var extra: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A Card can be formatted to take up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for CardHeader. */
    var header: js.UndefOr[SemanticShorthandItem[CardHeaderProps]] = js.undefined
    
    /** Render as an `a` tag instead of a `div` and adds the href attribute. */
    var href: js.UndefOr[String] = js.undefined
    
    /** A card can contain an Image component. */
    var image: js.UndefOr[SemanticShorthandItem[ImageProps]] = js.undefined
    
    /** A card can be formatted to link to other content. */
    var link: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for CardMeta. */
    var meta: js.UndefOr[SemanticShorthandItem[CardMetaProps]] = js.undefined
    
    /**
      * Called on click. When passed, the component renders as an `a`
      * tag by default instead of a `div`.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
          /* data */ CardProps, 
          Unit
        ]
      ] = js.undefined
    
    /** A Card can be formatted to raise above the page. */
    var raised: js.UndefOr[Boolean] = js.undefined
  }
  object StrictCardProps {
    
    inline def apply(): StrictCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCardProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictCardProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: SemanticShorthandItem[CardDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionFunction3(
        value: (/* component */ ElementType[CardDescriptionProps], CardDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExtra(value: SemanticShorthandContent): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setHeader(value: SemanticShorthandItem[CardHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType[CardHeaderProps], CardHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setImage(value: SemanticShorthandItem[ImageProps]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageFunction3(
        value: (/* component */ ElementType[ImageProps], ImageProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setMeta(value: SemanticShorthandItem[CardMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction3(
        value: (/* component */ ElementType[CardMetaProps], CardMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setOnClick(value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ CardProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    }
  }
  
  type _To = CardComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsCardCardMod.foo` */
  override def _to: CardComponent = default
}
