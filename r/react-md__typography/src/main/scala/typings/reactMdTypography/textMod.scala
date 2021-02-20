package typings.reactMdTypography

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdTypography.anon.ClassName
import typings.reactMdTypography.reactMdTypographyStrings.bottom
import typings.reactMdTypography.reactMdTypographyStrings.initial
import typings.reactMdTypography.reactMdTypographyStrings.none
import typings.reactMdTypography.reactMdTypographyStrings.top
import typings.reactMdUtils.typesTypesMod.ClassNameCloneableChild
import typings.std.HTMLAnchorElement
import typings.std.HTMLBodyElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLHtmlElement
import typings.std.HTMLParagraphElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@react-md/typography/types/Text", "Text")
  @js.native
  val Text: ForwardRefExoticComponent[TextProps with RefAttributes[TextElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTypography.reactMdTypographyStrings.italic
    - typings.reactMdTypography.reactMdTypographyStrings.oblique
    - typings.reactMdTypography.reactMdTypographyStrings.normal
  */
  trait FontStyle extends StObject
  object FontStyle {
    
    @scala.inline
    def italic: typings.reactMdTypography.reactMdTypographyStrings.italic = "italic".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.italic]
    
    @scala.inline
    def normal: typings.reactMdTypography.reactMdTypographyStrings.normal = "normal".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.normal]
    
    @scala.inline
    def oblique: typings.reactMdTypography.reactMdTypographyStrings.oblique = "oblique".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.oblique]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTypography.reactMdTypographyStrings.left
    - typings.reactMdTypography.reactMdTypographyStrings.center
    - typings.reactMdTypography.reactMdTypographyStrings.right
  */
  trait TextAlign extends StObject
  object TextAlign {
    
    @scala.inline
    def center: typings.reactMdTypography.reactMdTypographyStrings.center = "center".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.center]
    
    @scala.inline
    def left: typings.reactMdTypography.reactMdTypographyStrings.left = "left".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.left]
    
    @scala.inline
    def right: typings.reactMdTypography.reactMdTypographyStrings.right = "right".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTypography.reactMdTypographyStrings.secondary
    - typings.reactMdTypography.reactMdTypographyStrings.hint
    - typings.reactMdTypography.reactMdTypographyStrings.`theme-primary`
    - typings.reactMdTypography.reactMdTypographyStrings.`theme-secondary`
    - typings.reactMdTypography.reactMdTypographyStrings.`theme-warning`
    - typings.reactMdTypography.reactMdTypographyStrings.`theme-error`
  */
  trait TextColor extends StObject
  object TextColor {
    
    @scala.inline
    def hint: typings.reactMdTypography.reactMdTypographyStrings.hint = "hint".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.hint]
    
    @scala.inline
    def secondary: typings.reactMdTypography.reactMdTypographyStrings.secondary = "secondary".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.secondary]
    
    @scala.inline
    def `theme-error`: typings.reactMdTypography.reactMdTypographyStrings.`theme-error` = "theme-error".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`theme-error`]
    
    @scala.inline
    def `theme-primary`: typings.reactMdTypography.reactMdTypographyStrings.`theme-primary` = "theme-primary".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`theme-primary`]
    
    @scala.inline
    def `theme-secondary`: typings.reactMdTypography.reactMdTypographyStrings.`theme-secondary` = "theme-secondary".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`theme-secondary`]
    
    @scala.inline
    def `theme-warning`: typings.reactMdTypography.reactMdTypographyStrings.`theme-warning` = "theme-warning".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`theme-warning`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTypography.reactMdTypographyStrings.underline
    - typings.reactMdTypography.reactMdTypographyStrings.overline
    - typings.reactMdTypography.reactMdTypographyStrings.`line-through`
  */
  trait TextDecoration extends StObject
  object TextDecoration {
    
    @scala.inline
    def `line-through`: typings.reactMdTypography.reactMdTypographyStrings.`line-through` = "line-through".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`line-through`]
    
    @scala.inline
    def overline: typings.reactMdTypography.reactMdTypographyStrings.overline = "overline".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.overline]
    
    @scala.inline
    def underline: typings.reactMdTypography.reactMdTypographyStrings.underline = "underline".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.underline]
  }
  
  type TextElement = HTMLHeadingElement | HTMLParagraphElement | HTMLSpanElement | HTMLDivElement | HTMLButtonElement | HTMLAnchorElement | HTMLBodyElement | HTMLHtmlElement
  
  @js.native
  trait TextProps extends HTMLAttributes[TextElement] {
    
    /**
      * An optional text alignment to apply.
      */
    var align: js.UndefOr[TextAlign] = js.native
    
    /**
      * Either a child render function or a react node. If this is not the child
      * render function, a different wrapper component can be provided using the
      * `component` prop.
      */
    @JSName("children")
    var children_TextProps: js.UndefOr[ReactNode | ClassNameCloneableChild[js.Object] | TextRenderFunction] = js.native
    
    /**
      * An optional text color to apply. Unline normal theme colors, these will
      * reflect the `text-secondary-on-background` and `text-hint-on-background`
      * instead of the primary or secondary theme colors.
      */
    @JSName("color")
    var color_TextProps: js.UndefOr[TextColor] = js.native
    
    /**
      * The component to render as when the children are not a render function. If
      * this prop is omitted, the component will be determined by the `type` prop
      * where:
      *
      * - `"headline-1" -> <h1>`
      * - `"headline-2" -> <h2>`
      * - `"headline-3" -> <h3>`
      * - `"headline-4" -> <h4>`
      * - `"headline-5" -> <h5>`
      * - `"headline-6" -> <h6>`
      * - `"subtitle-1" -> <h5>`
      * - `"subtitle-2" -> <h6>`
      * - `"body-1"     -> <p>`
      * - `"body-2"     -> <p>`
      * - `"caption"    -> <caption>`
      * - `"overline"   -> <span>`
      * - `"button"     -> <button>`
      *
      */
    var component: js.UndefOr[ElementType[_] | Null] = js.native
    
    /**
      * An optional text decoration to apply.
      */
    var decoration: js.UndefOr[TextDecoration] = js.native
    
    /**
      * An optional font-style to apply.
      */
    var fontStyle: js.UndefOr[FontStyle] = js.native
    
    /**
      * Since the typography within react-md tries to not modify base elements, the
      * default margin applied to heading tags (h1-h6) and paragraph (p) might have
      * large margin that you don't want applied when using this component. You can
      * disable:
      *
      * - only the top margin by setting this prop to `"bottom"`
      * - only the bottom margin by setting this prop to `"top"`
      * - top and bottom margin by setting this prop to `"none"`
      * - or keep the initial behavior: `"initial"`
      */
    var margin: js.UndefOr[initial | none | top | bottom] = js.native
    
    /**
      * An optional text transformation to apply.
      */
    var transform: js.UndefOr[TextTransform] = js.native
    
    /**
      * One of the material design typography text styles. This is used to generate
      * a className that can be applied to any element and have the correct
      * typography.
      */
    var `type`: js.UndefOr[TextTypes] = js.native
    
    /**
      * An optional font-weight to apply.
      */
    var weight: js.UndefOr[TextWeight] = js.native
  }
  object TextProps {
    
    @scala.inline
    def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    @scala.inline
    implicit class TextPropsMutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: TextAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode | ClassNameCloneableChild[js.Object] | TextRenderFunction): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ ClassName => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColor(value: TextColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setComponent(value: ElementType[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNull: Self = StObject.set(x, "component", null)
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDecoration(value: TextDecoration): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setMargin(value: initial | none | top | bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setTransform(value: TextTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: TextTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWeight(value: TextWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  type TextRenderFunction = js.Function1[/* props */ ClassName, ReactElement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTypography.reactMdTypographyStrings.capitalize
    - typings.reactMdTypography.reactMdTypographyStrings.uppercase
    - typings.reactMdTypography.reactMdTypographyStrings.lowercase
  */
  trait TextTransform extends StObject
  object TextTransform {
    
    @scala.inline
    def capitalize: typings.reactMdTypography.reactMdTypographyStrings.capitalize = "capitalize".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.capitalize]
    
    @scala.inline
    def lowercase: typings.reactMdTypography.reactMdTypographyStrings.lowercase = "lowercase".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.lowercase]
    
    @scala.inline
    def uppercase: typings.reactMdTypography.reactMdTypographyStrings.uppercase = "uppercase".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.uppercase]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTypography.reactMdTypographyStrings.`headline-1`
    - typings.reactMdTypography.reactMdTypographyStrings.`headline-2`
    - typings.reactMdTypography.reactMdTypographyStrings.`headline-3`
    - typings.reactMdTypography.reactMdTypographyStrings.`headline-4`
    - typings.reactMdTypography.reactMdTypographyStrings.`headline-5`
    - typings.reactMdTypography.reactMdTypographyStrings.`headline-6`
    - typings.reactMdTypography.reactMdTypographyStrings.`subtitle-1`
    - typings.reactMdTypography.reactMdTypographyStrings.`subtitle-2`
    - typings.reactMdTypography.reactMdTypographyStrings.`body-1`
    - typings.reactMdTypography.reactMdTypographyStrings.`body-2`
    - typings.reactMdTypography.reactMdTypographyStrings.caption
    - typings.reactMdTypography.reactMdTypographyStrings.overline
    - typings.reactMdTypography.reactMdTypographyStrings.button
  */
  trait TextTypes extends StObject
  object TextTypes {
    
    @scala.inline
    def `body-1`: typings.reactMdTypography.reactMdTypographyStrings.`body-1` = "body-1".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`body-1`]
    
    @scala.inline
    def `body-2`: typings.reactMdTypography.reactMdTypographyStrings.`body-2` = "body-2".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`body-2`]
    
    @scala.inline
    def button: typings.reactMdTypography.reactMdTypographyStrings.button = "button".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.button]
    
    @scala.inline
    def caption: typings.reactMdTypography.reactMdTypographyStrings.caption = "caption".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.caption]
    
    @scala.inline
    def `headline-1`: typings.reactMdTypography.reactMdTypographyStrings.`headline-1` = "headline-1".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`headline-1`]
    
    @scala.inline
    def `headline-2`: typings.reactMdTypography.reactMdTypographyStrings.`headline-2` = "headline-2".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`headline-2`]
    
    @scala.inline
    def `headline-3`: typings.reactMdTypography.reactMdTypographyStrings.`headline-3` = "headline-3".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`headline-3`]
    
    @scala.inline
    def `headline-4`: typings.reactMdTypography.reactMdTypographyStrings.`headline-4` = "headline-4".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`headline-4`]
    
    @scala.inline
    def `headline-5`: typings.reactMdTypography.reactMdTypographyStrings.`headline-5` = "headline-5".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`headline-5`]
    
    @scala.inline
    def `headline-6`: typings.reactMdTypography.reactMdTypographyStrings.`headline-6` = "headline-6".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`headline-6`]
    
    @scala.inline
    def overline: typings.reactMdTypography.reactMdTypographyStrings.overline = "overline".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.overline]
    
    @scala.inline
    def `subtitle-1`: typings.reactMdTypography.reactMdTypographyStrings.`subtitle-1` = "subtitle-1".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`subtitle-1`]
    
    @scala.inline
    def `subtitle-2`: typings.reactMdTypography.reactMdTypographyStrings.`subtitle-2` = "subtitle-2".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`subtitle-2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTypography.reactMdTypographyStrings.thin
    - typings.reactMdTypography.reactMdTypographyStrings.light
    - typings.reactMdTypography.reactMdTypographyStrings.regular
    - typings.reactMdTypography.reactMdTypographyStrings.medium
    - typings.reactMdTypography.reactMdTypographyStrings.bold
    - typings.reactMdTypography.reactMdTypographyStrings.`semi-bold`
    - typings.reactMdTypography.reactMdTypographyStrings.black
  */
  trait TextWeight extends StObject
  object TextWeight {
    
    @scala.inline
    def black: typings.reactMdTypography.reactMdTypographyStrings.black = "black".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.black]
    
    @scala.inline
    def bold: typings.reactMdTypography.reactMdTypographyStrings.bold = "bold".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.bold]
    
    @scala.inline
    def light: typings.reactMdTypography.reactMdTypographyStrings.light = "light".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.light]
    
    @scala.inline
    def medium: typings.reactMdTypography.reactMdTypographyStrings.medium = "medium".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.medium]
    
    @scala.inline
    def regular: typings.reactMdTypography.reactMdTypographyStrings.regular = "regular".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.regular]
    
    @scala.inline
    def `semi-bold`: typings.reactMdTypography.reactMdTypographyStrings.`semi-bold` = "semi-bold".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.`semi-bold`]
    
    @scala.inline
    def thin: typings.reactMdTypography.reactMdTypographyStrings.thin = "thin".asInstanceOf[typings.reactMdTypography.reactMdTypographyStrings.thin]
  }
}
