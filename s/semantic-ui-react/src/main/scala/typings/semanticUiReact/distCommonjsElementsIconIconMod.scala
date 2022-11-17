package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.semanticUiReact.distCommonjsElementsIconIconGroupMod.IconGroupProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticUiReact.distCommonjsGenericMod.SemanticICONS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsIconIconMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Icon/Icon", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[IconProps, js.Object, Any]
  object default {
    
    /* was `typeof IconGroup` */
    @JSImport("semantic-ui-react/dist/commonjs/elements/Icon/Icon", "default.Group")
    @js.native
    val Group: FC[IconGroupProps] = js.native
  }
  
  type Icon = PureComponent[IconProps, js.Object, Any]
  
  object IconCorner {
    
    inline def `bottom left`: "bottom left" = ("bottom left").asInstanceOf["bottom left"]
    
    inline def `bottom right`: "bottom right" = ("bottom right").asInstanceOf["bottom right"]
    
    inline def `top left`: "top left" = ("top left").asInstanceOf["top left"]
    
    inline def `top right`: "top right" = ("top right").asInstanceOf["top right"]
  }
  type IconCorner = ("bottom right") | ("top right") | ("top left") | ("bottom left")
  
  trait IconProps
    extends StObject
       with StrictIconProps
       with /* key */ StringDictionary[Any]
  object IconProps {
    
    inline def apply(): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconProps]
    }
  }
  
  object IconSizeProp {
    
    inline def big: "big" = "big".asInstanceOf["big"]
    
    inline def huge: "huge" = "huge".asInstanceOf["huge"]
    
    inline def large: "large" = "large".asInstanceOf["large"]
    
    inline def massive: "massive" = "massive".asInstanceOf["massive"]
    
    inline def mini: "mini" = "mini".asInstanceOf["mini"]
    
    inline def small: "small" = "small".asInstanceOf["small"]
    
    inline def tiny: "tiny" = "tiny".asInstanceOf["tiny"]
  }
  type IconSizeProp = "mini" | "tiny" | "small" | "large" | "big" | "huge" | "massive"
  
  trait StrictIconProps extends StObject {
    
    /** Icon can have an aria hidden. */
    var `aria-hidden`: js.UndefOr[String] = js.undefined
    
    /** Icon can have an aria label. */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Formatted to appear bordered */
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can formatted to appear circular. */
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Color of the icon. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Icons can display a smaller corner icon. */
    var corner: js.UndefOr[Boolean | IconCorner] = js.undefined
    
    /** Show that the icon is inactive. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Fitted, without space to left or right of Icon. */
    var fitted: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can be flipped. */
    var flipped: js.UndefOr["horizontally" | "vertically"] = js.undefined
    
    /** Formatted to have its colors inverted for contrast. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can be formatted as a link. */
    var link: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can be used as a simple loader. */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the icon. */
    var name: js.UndefOr[SemanticICONS] = js.undefined
    
    /** Icon can rotated. */
    var rotated: js.UndefOr["clockwise" | "counterclockwise"] = js.undefined
    
    /** Size of the icon. */
    var size: js.UndefOr[IconSizeProp] = js.undefined
  }
  object StrictIconProps {
    
    inline def apply(): StrictIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictIconProps]
    }
    
    extension [Self <: StrictIconProps](x: Self) {
      
      inline def `setAria-hidden`(value: String): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCorner(value: Boolean | IconCorner): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
      
      inline def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFitted(value: Boolean): Self = StObject.set(x, "fitted", value.asInstanceOf[js.Any])
      
      inline def setFittedUndefined: Self = StObject.set(x, "fitted", js.undefined)
      
      inline def setFlipped(value: "horizontally" | "vertically"): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
      
      inline def setFlippedUndefined: Self = StObject.set(x, "flipped", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setName(value: SemanticICONS): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRotated(value: "clockwise" | "counterclockwise"): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
      
      inline def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
      
      inline def setSize(value: IconSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
