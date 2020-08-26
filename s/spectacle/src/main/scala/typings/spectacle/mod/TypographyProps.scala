package typings.spectacle.mod

import typings.react.mod.ReactNode
import typings.spectacle.spectacleStrings.colors
import typings.spectacle.spectacleStrings.fontSizes
import typings.spectacle.spectacleStrings.fontWeights
import typings.spectacle.spectacleStrings.letterSpacings
import typings.spectacle.spectacleStrings.lineHeights
import typings.spectacle.spectacleStrings.space
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  children :react.react.ReactNode} & styled-system.styled-system.ColorProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'colors', styled-system.styled-system.RequiredTheme, any>> & styled-system.styled-system.TypographyProps<styled-system.styled-system.RequiredTheme> & styled-system.styled-system.SpaceProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'space', styled-system.styled-system.RequiredTheme, any>> */
@js.native
trait TypographyProps extends js.Object {
  var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
    */
  var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  var children: ReactNode = js.native
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
    */
  var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  var fontFamily: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
    *
    * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
    * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
    * - String values are passed as raw CSS values.
    * - And array values are converted into responsive values.
    *
    */
  var fontSize: js.UndefOr[ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The font-style CSS property specifies whether a font should be styled with a normal, italic,
    * or oblique face from its font-family.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-style)
    */
  var fontStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontStyleProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The font-weight CSS property specifies the weight (or boldness) of the font.
    *
    * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
    */
  var fontWeight: js.UndefOr[ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The letter-spacing CSS property sets the spacing behavior between text characters.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing)
    */
  var letterSpacing: js.UndefOr[ResponsiveValue[ThemeValue[letterSpacings, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The line-height CSS property sets the amount of space used for lines, such as in text. On block-level elements,
    * it specifies the minimum height of line boxes within the element.
    *
    * On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/line-height)
    */
  var lineHeight: js.UndefOr[ResponsiveValue[ThemeValue[lineHeights, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top, left, bottom and right */
  var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top, left, bottom and right */
  var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on bottom */
  var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on left */
  var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on right */
  var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top */
  var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on left and right */
  var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top and bottom */
  var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on bottom */
  var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on left */
  var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on right */
  var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top */
  var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on left and right */
  var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top and bottom */
  var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
      RequiredTheme
    ]
  ] = js.native
  /** Padding on top, left, bottom and right */
  var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top, left, bottom and right */
  var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on bottom */
  var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left */
  var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on right */
  var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top */
  var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left and right */
  var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top and bottom */
  var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on bottom */
  var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left */
  var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on right */
  var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top */
  var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left and right */
  var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top and bottom */
  var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The text-align CSS property specifies the horizontal alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-align)
    */
  var textAlign: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TextAlignProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
}

object TypographyProps {
  @scala.inline
  def apply(): TypographyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyProps]
  }
  @scala.inline
  implicit class TypographyPropsOps[Self <: TypographyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("backgroundColor", js.Array(value :_*))
    @scala.inline
    def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundColorNull: Self = this.set("backgroundColor", null)
    @scala.inline
    def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("bg", js.Array(value :_*))
    @scala.inline
    def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    @scala.inline
    def setBgNull: Self = this.set("bg", null)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorNull: Self = this.set("color", null)
    @scala.inline
    def setFontFamilyVarargs(value: (js.Any | Null)*): Self = this.set("fontFamily", js.Array(value :_*))
    @scala.inline
    def setFontFamily(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontFamilyNull: Self = this.set("fontFamily", null)
    @scala.inline
    def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = this.set("fontSize", js.Array(value :_*))
    @scala.inline
    def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontSizeNull: Self = this.set("fontSize", null)
    @scala.inline
    def setFontStyleVarargs(value: (js.Any | Null)*): Self = this.set("fontStyle", js.Array(value :_*))
    @scala.inline
    def setFontStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontStyleProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontStyleNull: Self = this.set("fontStyle", null)
    @scala.inline
    def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = this.set("fontWeight", js.Array(value :_*))
    @scala.inline
    def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, _], RequiredTheme]): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setFontWeightNull: Self = this.set("fontWeight", null)
    @scala.inline
    def setLetterSpacingVarargs(value: ((ThemeValue[letterSpacings, RequiredTheme, js.Any]) | Null)*): Self = this.set("letterSpacing", js.Array(value :_*))
    @scala.inline
    def setLetterSpacing(value: ResponsiveValue[ThemeValue[letterSpacings, RequiredTheme, _], RequiredTheme]): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setLetterSpacingNull: Self = this.set("letterSpacing", null)
    @scala.inline
    def setLineHeightVarargs(value: ((ThemeValue[lineHeights, RequiredTheme, js.Any]) | Null)*): Self = this.set("lineHeight", js.Array(value :_*))
    @scala.inline
    def setLineHeight(value: ResponsiveValue[ThemeValue[lineHeights, RequiredTheme, _], RequiredTheme]): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setLineHeightNull: Self = this.set("lineHeight", null)
    @scala.inline
    def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("m", js.Array(value :_*))
    @scala.inline
    def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setMNull: Self = this.set("m", null)
    @scala.inline
    def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginNull: Self = this.set("margin", null)
    @scala.inline
    def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginBottom", js.Array(value :_*))
    @scala.inline
    def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginBottomNull: Self = this.set("marginBottom", null)
    @scala.inline
    def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginLeft", js.Array(value :_*))
    @scala.inline
    def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginLeftNull: Self = this.set("marginLeft", null)
    @scala.inline
    def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginRight", js.Array(value :_*))
    @scala.inline
    def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginRightNull: Self = this.set("marginRight", null)
    @scala.inline
    def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginTop", js.Array(value :_*))
    @scala.inline
    def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMarginTopNull: Self = this.set("marginTop", null)
    @scala.inline
    def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginX", js.Array(value :_*))
    @scala.inline
    def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginX: Self = this.set("marginX", js.undefined)
    @scala.inline
    def setMarginXNull: Self = this.set("marginX", null)
    @scala.inline
    def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("marginY", js.Array(value :_*))
    @scala.inline
    def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("marginY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginY: Self = this.set("marginY", js.undefined)
    @scala.inline
    def setMarginYNull: Self = this.set("marginY", null)
    @scala.inline
    def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("mb", js.Array(value :_*))
    @scala.inline
    def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("mb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
    @scala.inline
    def setMbNull: Self = this.set("mb", null)
    @scala.inline
    def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("ml", js.Array(value :_*))
    @scala.inline
    def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("ml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMl: Self = this.set("ml", js.undefined)
    @scala.inline
    def setMlNull: Self = this.set("ml", null)
    @scala.inline
    def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("mr", js.Array(value :_*))
    @scala.inline
    def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("mr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMr: Self = this.set("mr", js.undefined)
    @scala.inline
    def setMrNull: Self = this.set("mr", null)
    @scala.inline
    def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("mt", js.Array(value :_*))
    @scala.inline
    def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("mt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMt: Self = this.set("mt", js.undefined)
    @scala.inline
    def setMtNull: Self = this.set("mt", null)
    @scala.inline
    def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("mx", js.Array(value :_*))
    @scala.inline
    def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("mx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMx: Self = this.set("mx", js.undefined)
    @scala.inline
    def setMxNull: Self = this.set("mx", null)
    @scala.inline
    def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("my", js.Array(value :_*))
    @scala.inline
    def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("my", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    @scala.inline
    def setMyNull: Self = this.set("my", null)
    @scala.inline
    def setOpacityVarargs(value: (js.Any | Null)*): Self = this.set("opacity", js.Array(value :_*))
    @scala.inline
    def setOpacity(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
          RequiredTheme
        ]
    ): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOpacityNull: Self = this.set("opacity", null)
    @scala.inline
    def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("p", js.Array(value :_*))
    @scala.inline
    def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setPNull: Self = this.set("p", null)
    @scala.inline
    def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingNull: Self = this.set("padding", null)
    @scala.inline
    def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingBottom", js.Array(value :_*))
    @scala.inline
    def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingBottomNull: Self = this.set("paddingBottom", null)
    @scala.inline
    def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingLeft", js.Array(value :_*))
    @scala.inline
    def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingLeftNull: Self = this.set("paddingLeft", null)
    @scala.inline
    def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingRight", js.Array(value :_*))
    @scala.inline
    def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingRightNull: Self = this.set("paddingRight", null)
    @scala.inline
    def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingTop", js.Array(value :_*))
    @scala.inline
    def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setPaddingTopNull: Self = this.set("paddingTop", null)
    @scala.inline
    def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingX", js.Array(value :_*))
    @scala.inline
    def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingX: Self = this.set("paddingX", js.undefined)
    @scala.inline
    def setPaddingXNull: Self = this.set("paddingX", null)
    @scala.inline
    def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("paddingY", js.Array(value :_*))
    @scala.inline
    def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingY: Self = this.set("paddingY", js.undefined)
    @scala.inline
    def setPaddingYNull: Self = this.set("paddingY", null)
    @scala.inline
    def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("pb", js.Array(value :_*))
    @scala.inline
    def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("pb", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePb: Self = this.set("pb", js.undefined)
    @scala.inline
    def setPbNull: Self = this.set("pb", null)
    @scala.inline
    def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("pl", js.Array(value :_*))
    @scala.inline
    def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("pl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePl: Self = this.set("pl", js.undefined)
    @scala.inline
    def setPlNull: Self = this.set("pl", null)
    @scala.inline
    def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("pr", js.Array(value :_*))
    @scala.inline
    def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("pr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePr: Self = this.set("pr", js.undefined)
    @scala.inline
    def setPrNull: Self = this.set("pr", null)
    @scala.inline
    def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("pt", js.Array(value :_*))
    @scala.inline
    def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePt: Self = this.set("pt", js.undefined)
    @scala.inline
    def setPtNull: Self = this.set("pt", null)
    @scala.inline
    def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("px", js.Array(value :_*))
    @scala.inline
    def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("px", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePx: Self = this.set("px", js.undefined)
    @scala.inline
    def setPxNull: Self = this.set("px", null)
    @scala.inline
    def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("py", js.Array(value :_*))
    @scala.inline
    def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("py", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePy: Self = this.set("py", js.undefined)
    @scala.inline
    def setPyNull: Self = this.set("py", null)
    @scala.inline
    def setTextAlignVarargs(value: (js.Any | Null)*): Self = this.set("textAlign", js.Array(value :_*))
    @scala.inline
    def setTextAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TextAlignProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextAlignNull: Self = this.set("textAlign", null)
  }
  
}

