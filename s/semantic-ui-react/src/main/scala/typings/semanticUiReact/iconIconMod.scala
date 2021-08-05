package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.PureComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticICONS
import typings.semanticUiReact.iconGroupMod.IconGroupProps
import typings.semanticUiReact.semanticUiReactStrings.clockwise
import typings.semanticUiReact.semanticUiReactStrings.counterclockwise
import typings.semanticUiReact.semanticUiReactStrings.horizontally
import typings.semanticUiReact.semanticUiReactStrings.vertically
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconIconMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Icon/Icon", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[IconProps, js.Object, js.Any]
  object default {
    
    /* was `typeof IconGroup` */
    @JSImport("semantic-ui-react/dist/commonjs/elements/Icon/Icon", "default.Group")
    @js.native
    val Group: StatelessComponent[IconGroupProps] = js.native
  }
  
  type Icon = PureComponent[IconProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.semanticUiReact.semanticUiReactStrings.`bottom right`
    - typings.semanticUiReact.semanticUiReactStrings.`top right`
    - typings.semanticUiReact.semanticUiReactStrings.`top left`
    - typings.semanticUiReact.semanticUiReactStrings.`bottom left`
  */
  trait IconCorner extends StObject
  object IconCorner {
    
    inline def `bottom left`: typings.semanticUiReact.semanticUiReactStrings.`bottom left` = ("bottom left").asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.`bottom left`]
    
    inline def `bottom right`: typings.semanticUiReact.semanticUiReactStrings.`bottom right` = ("bottom right").asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.`bottom right`]
    
    inline def `top left`: typings.semanticUiReact.semanticUiReactStrings.`top left` = ("top left").asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.`top left`]
    
    inline def `top right`: typings.semanticUiReact.semanticUiReactStrings.`top right` = ("top right").asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.`top right`]
  }
  
  trait IconProps
    extends StObject
       with StrictIconProps
       with /* key */ StringDictionary[js.Any]
  object IconProps {
    
    inline def apply(): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semanticUiReact.semanticUiReactStrings.mini
    - typings.semanticUiReact.semanticUiReactStrings.tiny
    - typings.semanticUiReact.semanticUiReactStrings.small
    - typings.semanticUiReact.semanticUiReactStrings.large
    - typings.semanticUiReact.semanticUiReactStrings.big
    - typings.semanticUiReact.semanticUiReactStrings.huge
    - typings.semanticUiReact.semanticUiReactStrings.massive
  */
  trait IconSizeProp extends StObject
  object IconSizeProp {
    
    inline def big: typings.semanticUiReact.semanticUiReactStrings.big = "big".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.big]
    
    inline def huge: typings.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.huge]
    
    inline def large: typings.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.large]
    
    inline def massive: typings.semanticUiReact.semanticUiReactStrings.massive = "massive".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.massive]
    
    inline def mini: typings.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.mini]
    
    inline def small: typings.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.small]
    
    inline def tiny: typings.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  trait StrictIconProps extends StObject {
    
    /** Icon can have an aria hidden. */
    var `aria-hidden`: js.UndefOr[String] = js.undefined
    
    /** Icon can have an aria label. */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
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
    var flipped: js.UndefOr[horizontally | vertically] = js.undefined
    
    /** Formatted to have its colors inverted for contrast. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can be formatted as a link. */
    var link: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can be used as a simple loader. */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the icon. */
    var name: js.UndefOr[SemanticICONS] = js.undefined
    
    /** Icon can rotated. */
    var rotated: js.UndefOr[clockwise | counterclockwise] = js.undefined
    
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
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
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
      
      inline def setFlipped(value: horizontally | vertically): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
      
      inline def setFlippedUndefined: Self = StObject.set(x, "flipped", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setName(value: SemanticICONS): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRotated(value: clockwise | counterclockwise): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
      
      inline def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
      
      inline def setSize(value: IconSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
