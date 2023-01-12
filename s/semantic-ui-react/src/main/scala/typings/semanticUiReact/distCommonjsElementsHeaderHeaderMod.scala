package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsElementsHeaderHeaderContentMod.HeaderContentProps
import typings.semanticUiReact.distCommonjsElementsHeaderHeaderSubheaderMod.HeaderSubheaderProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.medium
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsHeaderHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Header/Header", JSImport.Default)
  @js.native
  val default: HeaderComponent = js.native
  
  @js.native
  trait HeaderComponent
    extends StObject
       with FunctionComponent[HeaderProps] {
    
    var Content: FC[HeaderContentProps] = js.native
    
    var Subheader: FC[HeaderSubheaderProps] = js.native
  }
  
  trait HeaderProps
    extends StObject
       with StrictHeaderProps
       with /* key */ StringDictionary[Any]
  object HeaderProps {
    
    inline def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
  }
  
  trait StrictHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Attach header  to other content, like a segment. */
    var attached: js.UndefOr[Boolean | top | bottom] = js.undefined
    
    /** Format header to appear inside a content block. */
    var block: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Color of the header. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[ReactNode] = js.undefined
    
    /** Show that the header is inactive. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Divide header from the content below it. */
    var dividing: js.UndefOr[Boolean] = js.undefined
    
    /** Header can sit to the left or right of other content. */
    var floated: js.UndefOr[SemanticFLOATS] = js.undefined
    
    /** Add an icon by icon name or pass an Icon. */
    var icon: js.UndefOr[Any] = js.undefined
    
    /** Add an image by img src or pass an Image. */
    var image: js.UndefOr[Any] = js.undefined
    
    /** Inverts the color of the header for dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Content headings are sized with em and are based on the font-size of their container. */
    var size: js.UndefOr[tiny | small | medium | large | huge] = js.undefined
    
    /** Headers may be formatted to label smaller or de-emphasized content. */
    var sub: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for Header.Subheader. */
    var subheader: js.UndefOr[Any] = js.undefined
    
    /** Align header content. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
  }
  object StrictHeaderProps {
    
    inline def apply(): StrictHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttached(value: Boolean | top | bottom): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDividing(value: Boolean): Self = StObject.set(x, "dividing", value.asInstanceOf[js.Any])
      
      inline def setDividingUndefined: Self = StObject.set(x, "dividing", js.undefined)
      
      inline def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      inline def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setSize(value: tiny | small | medium | large | huge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSub(value: Boolean): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
      
      inline def setSubheader(value: Any): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
      
      inline def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  type _To = HeaderComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsHeaderHeaderMod.foo` */
  override def _to: HeaderComponent = default
}
