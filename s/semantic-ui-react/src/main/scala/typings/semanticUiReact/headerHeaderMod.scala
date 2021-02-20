package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.headerContentMod.HeaderContentProps
import typings.semanticUiReact.headerSubheaderMod.HeaderSubheaderProps
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.medium
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Header/Header", JSImport.Default)
  @js.native
  val default: HeaderComponent = js.native
  
  @js.native
  trait HeaderComponent extends FunctionComponent[HeaderProps] {
    
    var Content: StatelessComponent[HeaderContentProps] = js.native
    
    var Subheader: StatelessComponent[HeaderSubheaderProps] = js.native
  }
  
  @js.native
  trait HeaderProps
    extends StrictHeaderProps
       with /* key */ StringDictionary[js.Any]
  object HeaderProps {
    
    @scala.inline
    def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
  }
  
  @js.native
  trait StrictHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Attach header  to other content, like a segment. */
    var attached: js.UndefOr[Boolean | top | bottom] = js.native
    
    /** Format header to appear inside a content block. */
    var block: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Color of the header. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[ReactNode] = js.native
    
    /** Show that the header is inactive. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** Divide header from the content below it. */
    var dividing: js.UndefOr[Boolean] = js.native
    
    /** Header can sit to the left or right of other content. */
    var floated: js.UndefOr[SemanticFLOATS] = js.native
    
    /** Add an icon by icon name or pass an Icon. */
    var icon: js.UndefOr[js.Any] = js.native
    
    /** Add an image by img src or pass an Image. */
    var image: js.UndefOr[js.Any] = js.native
    
    /** Inverts the color of the header for dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /** Content headings are sized with em and are based on the font-size of their container. */
    var size: js.UndefOr[tiny | small | medium | large | huge] = js.native
    
    /** Headers may be formatted to label smaller or de-emphasized content. */
    var sub: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for Header.Subheader. */
    var subheader: js.UndefOr[js.Any] = js.native
    
    /** Align header content. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
  }
  object StrictHeaderProps {
    
    @scala.inline
    def apply(): StrictHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHeaderProps]
    }
    
    @scala.inline
    implicit class StrictHeaderPropsMutableBuilder[Self <: StrictHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: Boolean | top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
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
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDividing(value: Boolean): Self = StObject.set(x, "dividing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividingUndefined: Self = StObject.set(x, "dividing", js.undefined)
      
      @scala.inline
      def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      @scala.inline
      def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setSize(value: tiny | small | medium | large | huge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSub(value: Boolean): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
      
      @scala.inline
      def setSubheader(value: js.Any): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
      
      @scala.inline
      def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  type _To = HeaderComponent
  
  /* This means you don't have to write `default`, but can instead just say `headerHeaderMod.foo` */
  override def _to: HeaderComponent = default
}
