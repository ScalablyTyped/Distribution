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
import typings.semanticUiReact.genericMod.HtmlIframeProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.iconIconMod.IconProps
import typings.semanticUiReact.semanticUiReactStrings.`16Colon9`
import typings.semanticUiReact.semanticUiReactStrings.`21Colon9`
import typings.semanticUiReact.semanticUiReactStrings.`4Colon3`
import typings.semanticUiReact.semanticUiReactStrings.vimeo
import typings.semanticUiReact.semanticUiReactStrings.youtube
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embedEmbedMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed/Embed", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[EmbedProps, ComponentState, js.Any] {
    def this(props: EmbedProps) = this()
    def this(props: EmbedProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed/Embed", JSImport.Default)
  @js.native
  val default: ComponentClass[EmbedProps, ComponentState] = js.native
  
  @js.native
  trait EmbedProps
    extends StrictEmbedProps
       with /* key */ StringDictionary[js.Any]
  object EmbedProps {
    
    @scala.inline
    def apply(): EmbedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbedProps]
    }
  }
  
  @js.native
  trait StrictEmbedProps extends StObject {
    
    /** An embed can be active. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** An embed can specify an alternative aspect ratio. */
    var aspectRatio: js.UndefOr[`4Colon3` | `16Colon9` | `21Colon9`] = js.native
    
    /** Setting to true or false will force autoplay. */
    var autoplay: js.UndefOr[Boolean] = js.native
    
    /** Whether to show networks branded UI like title cards, or after video calls to action. */
    var brandedUI: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Specifies a default chrome color with Vimeo or YouTube. */
    var color: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Initial value of active. */
    var defaultActive: js.UndefOr[Boolean] = js.native
    
    /** Whether to prefer HD content. */
    var hd: js.UndefOr[Boolean] = js.native
    
    /** Specifies an icon to use with placeholder content. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.native
    
    /** Specifies an id for source. */
    var id: js.UndefOr[String] = js.native
    
    /** Shorthand for HTML iframe. */
    var iframe: js.UndefOr[SemanticShorthandItem[HtmlIframeProps]] = js.native
    
    /**
      * Сalled on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed value.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          /* data */ EmbedProps, 
          Unit
        ]
      ] = js.native
    
    /** A placeholder image for embed. */
    var placeholder: js.UndefOr[String] = js.native
    
    /** Specifies a source to use. */
    var source: js.UndefOr[youtube | vimeo] = js.native
    
    /** Specifies a url to use for embed. */
    var url: js.UndefOr[String] = js.native
  }
  object StrictEmbedProps {
    
    @scala.inline
    def apply(): StrictEmbedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictEmbedProps]
    }
    
    @scala.inline
    implicit class StrictEmbedPropsMutableBuilder[Self <: StrictEmbedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAspectRatio(value: `4Colon3` | `16Colon9` | `21Colon9`): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBrandedUI(value: Boolean): Self = StObject.set(x, "brandedUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandedUIUndefined: Self = StObject.set(x, "brandedUI", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDefaultActive(value: Boolean): Self = StObject.set(x, "defaultActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveUndefined: Self = StObject.set(x, "defaultActive", js.undefined)
      
      @scala.inline
      def setHd(value: Boolean): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
      
      @scala.inline
      def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIframe(value: SemanticShorthandItem[HtmlIframeProps]): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeFunction3(
        value: (/* component */ ElementType[HtmlIframeProps], HtmlIframeProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "iframe", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ EmbedProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSource(value: youtube | vimeo): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type _To = ComponentClass[EmbedProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `embedEmbedMod.foo` */
  override def _to: ComponentClass[EmbedProps, ComponentState] = default
}
