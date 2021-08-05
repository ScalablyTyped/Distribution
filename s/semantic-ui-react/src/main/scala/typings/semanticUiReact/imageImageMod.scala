package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.dimmerDimmerMod.DimmerProps
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typings.semanticUiReact.imageGroupMod.ImageGroupProps
import typings.semanticUiReact.labelLabelMod.LabelProps
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageImageMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Image/Image", JSImport.Default)
  @js.native
  val default: ImageComponent = js.native
  
  @js.native
  trait ImageComponent
    extends StObject
       with FunctionComponent[ImageProps] {
    
    var Group: StatelessComponent[ImageGroupProps] = js.native
  }
  
  trait ImageProps
    extends StObject
       with StrictImageProps
       with /* key */ StringDictionary[js.Any]
  object ImageProps {
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
  }
  
  trait StrictImageProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** An image may be formatted to appear inline with text as an avatar. */
    var avatar: js.UndefOr[Boolean] = js.undefined
    
    /** An image may include a border to emphasize the edges of white or transparent content. */
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    /** An image can appear centered in a content block. */
    var centered: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** An image may appear circular. */
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for Dimmer. */
    var dimmer: js.UndefOr[SemanticShorthandItem[DimmerProps]] = js.undefined
    
    /** An image can show that it is disabled and cannot be selected. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** An image can sit to the left or right of other content. */
    var floated: js.UndefOr[SemanticFLOATS] = js.undefined
    
    /** An image can take up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** An image can be hidden. */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** Renders the Image as an <a> tag with this href. */
    var href: js.UndefOr[String] = js.undefined
    
    /** An image may appear inline. */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for Label. */
    var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.undefined
    
    /** An image may appear rounded. */
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    /** An image may appear at different sizes. */
    var size: js.UndefOr[SemanticSIZES] = js.undefined
    
    /** An image can specify that it needs an additional spacing to separate it from nearby content. */
    var spaced: js.UndefOr[Boolean | left | right] = js.undefined
    
    /** Whether or not to add the ui className. */
    var ui: js.UndefOr[Boolean] = js.undefined
    
    /** An image can specify its vertical alignment. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
    
    /** An image can render wrapped in a `div.ui.image` as alternative HTML markup. */
    var wrapped: js.UndefOr[Boolean] = js.undefined
  }
  object StrictImageProps {
    
    inline def apply(): StrictImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictImageProps]
    }
    
    extension [Self <: StrictImageProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAvatar(value: Boolean): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDimmer(value: SemanticShorthandItem[DimmerProps]): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
      
      inline def setDimmerFunction3(
        value: (/* component */ ElementType[DimmerProps], DimmerProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "dimmer", js.Any.fromFunction3(value))
      
      inline def setDimmerUndefined: Self = StObject.set(x, "dimmer", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      inline def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setLabel(value: SemanticShorthandItem[LabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction3(
        value: (/* component */ ElementType[LabelProps], LabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpaced(value: Boolean | left | right): Self = StObject.set(x, "spaced", value.asInstanceOf[js.Any])
      
      inline def setSpacedUndefined: Self = StObject.set(x, "spaced", js.undefined)
      
      inline def setUi(value: Boolean): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWrapped(value: Boolean): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
      
      inline def setWrappedUndefined: Self = StObject.set(x, "wrapped", js.undefined)
    }
  }
  
  type _To = ImageComponent
  
  /* This means you don't have to write `default`, but can instead just say `imageImageMod.foo` */
  override def _to: ImageComponent = default
}
