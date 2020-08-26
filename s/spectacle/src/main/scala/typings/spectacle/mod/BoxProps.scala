package typings.spectacle.mod

import typings.react.mod.ReactNode
import typings.spectacle.spectacleStrings.borderWidths
import typings.spectacle.spectacleStrings.colors
import typings.spectacle.spectacleStrings.radii
import typings.spectacle.spectacleStrings.space
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  children :react.react.ReactNode} & styled-system.styled-system.ColorProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'colors', styled-system.styled-system.RequiredTheme, any>> & styled-system.styled-system.SpaceProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'space', styled-system.styled-system.RequiredTheme, any>> & styled-system.styled-system.LayoutProps<styled-system.styled-system.RequiredTheme> & styled-system.styled-system.PositionProps<styled-system.styled-system.RequiredTheme> & styled-system.styled-system.BorderProps<styled-system.styled-system.RequiredTheme, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> * / any> */
@js.native
trait BoxProps extends js.Object {
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
  /**
    * The border CSS property sets an element's border. It's a shorthand for border-width, border-style,
    * and border-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border)
    */
  var border: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-bottom CSS property sets an element's bottom border. It's a shorthand for
    * border-bottom-width, border-bottom-style and border-bottom-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom)
    */
  var borderBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderBottomProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-bottom-color CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties border-color or border-bottom.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color)
    */
  var borderBottomColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-bottom-left-radius CSS property rounds the bottom-left corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-left-radius)
    */
  var borderBottomLeftRadius: js.UndefOr[ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-bottom-right-radius CSS property rounds the bottom-right corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-right-radius)
    */
  var borderBottomRightRadius: js.UndefOr[ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-bottom-style CSS property sets the line style of an element's bottom border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style)
    */
  var borderBottomStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderBottomStyleProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-bottom-width CSS property sets the width of the bottom border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width)
    */
  var borderBottomWidth: js.UndefOr[ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-color shorthand CSS property sets the color of all sides of an element's border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-color)
    */
  var borderColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-left CSS property is a shorthand that sets the values of border-left-width,
    * border-left-style, and border-left-color. These properties describe an element's left border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left)
    */
  var borderLeft: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderLeftProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-left-color CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties border-color or border-left.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color)
    */
  var borderLeftColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-left-style CSS property sets the line style of an element's left border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style)
    */
  var borderLeftStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderLeftStyleProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-left-width CSS property sets the width of the left border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width)
    */
  var borderLeftWidth: js.UndefOr[ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-radius CSS property rounds the corners of an element's outer border edge. You can set a single
    * radius to make circular corners, or two radii to make elliptical corners.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-radius)
    */
  var borderRadius: js.UndefOr[ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-right CSS property is a shorthand that sets border-right-width, border-right-style,
    * and border-right-color. These properties set an element's right border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right)
    */
  var borderRight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-right-color CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties border-color or border-right.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color)
    */
  var borderRightColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-right-style CSS property sets the line style of an element's right border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style)
    */
  var borderRightStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRightStyleProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-right-width CSS property sets the width of the right border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width)
    */
  var borderRightWidth: js.UndefOr[ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-style shorthand CSS property sets the style of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-style)
    */
  var borderStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderStyleProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-top CSS property is a shorthand that sets the values of border-top-width, border-top-style,
    * and border-top-color. These properties describe an element's top border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top)
    */
  var borderTop: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderTopProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-top-color CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties border-color or border-top.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color)
    */
  var borderTopColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-top-left-radius CSS property rounds the top-left corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-left-radius)
    */
  var borderTopLeftRadius: js.UndefOr[ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-top-right-radius CSS property rounds the top-right corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-right-radius)
    */
  var borderTopRightRadius: js.UndefOr[ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-top-style CSS property sets the line style of an element's top border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style)
    */
  var borderTopStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderTopStyleProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The border-top-width CSS property sets the width of the top border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width)
    */
  var borderTopWidth: js.UndefOr[ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The border-width shorthand CSS property sets the width of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width)
    */
  var borderWidth: js.UndefOr[ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]] = js.native
  var borderX: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  var borderY: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The bottom CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var bottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BottomProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
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
  /**
    * The display CSS property defines the display type of an element, which consists of the two basic qualities
    * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
    * and the inner display type defining how the children of the box are laid out.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var display: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.DisplayProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The height CSS property specifies the height of an element. By default, the property defines the height of the
    * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
    */
  var height: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The left CSS property participates in specifying the horizontal position
    * of a positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/left)
    */
  var left: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LeftProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
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
  /**
    * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
    * property from becoming larger than the value specified for max-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
    */
  var maxHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxHeightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The max-width CSS property sets the maximum width of an element.
    * It prevents the used value of the width property from becoming larger than the value specified by max-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
    */
  var maxWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxWidthProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /** Margin on bottom */
  var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
    * property from becoming smaller than the value specified for min-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var minHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinHeightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The min-width CSS property sets the minimum width of an element.
    * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
    */
  var minWidth: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinWidthProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
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
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The overflow-x CSS property sets what shows when content overflows a block-level element's left
    * and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
    */
  var overflowX: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowXProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The overflow-y CSS property sets what shows when content overflows a block-level element's top
    * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
    */
  var overflowY: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowYProperty */ _, 
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
  /**
    * The position CSS property specifies how an element is positioned in a document.
    * The top, right, bottom, and left properties determine the final location of positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/position)
    */
  var position: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PositionProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
  /** Padding on right */
  var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top */
  var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left and right */
  var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top and bottom */
  var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /**
    * The right CSS property participates in specifying the horizontal position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/right)
    */
  var right: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.RightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  var size: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The top CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var top: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TopProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.VerticalAlignProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    *   The width utility parses a component's `width` prop and converts it into a CSS width declaration.
    *
    *   - Numbers from 0-1 are converted to percentage widths.
    *   - Numbers greater than 1 are converted to pixel values.
    *   - String values are passed as raw CSS values.
    *   - And arrays are converted to responsive width styles.
    */
  var width: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.WidthProperty<TLengthStyledSystem> */ _, 
      RequiredTheme
    ]
  ] = js.native
  /**
    * The z-index CSS property sets the z-order of a positioned element and its descendants or
    * flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/z-index)
    */
  var zIndex: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _, 
      RequiredTheme
    ]
  ] = js.native
}

object BoxProps {
  @scala.inline
  def apply(): BoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxProps]
  }
  @scala.inline
  implicit class BoxPropsOps[Self <: BoxProps] (val x: Self) extends AnyVal {
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
    def setBorderVarargs(value: (js.Any | Null)*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBorderNull: Self = this.set("border", null)
    @scala.inline
    def setBorderBottomVarargs(value: (js.Any | Null)*): Self = this.set("borderBottom", js.Array(value :_*))
    @scala.inline
    def setBorderBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderBottomProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    @scala.inline
    def setBorderBottomNull: Self = this.set("borderBottom", null)
    @scala.inline
    def setBorderBottomColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderBottomColor", js.Array(value :_*))
    @scala.inline
    def setBorderBottomColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomColor: Self = this.set("borderBottomColor", js.undefined)
    @scala.inline
    def setBorderBottomColorNull: Self = this.set("borderBottomColor", null)
    @scala.inline
    def setBorderBottomLeftRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderBottomLeftRadius", js.Array(value :_*))
    @scala.inline
    def setBorderBottomLeftRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    @scala.inline
    def setBorderBottomLeftRadiusNull: Self = this.set("borderBottomLeftRadius", null)
    @scala.inline
    def setBorderBottomRightRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderBottomRightRadius", js.Array(value :_*))
    @scala.inline
    def setBorderBottomRightRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    @scala.inline
    def setBorderBottomRightRadiusNull: Self = this.set("borderBottomRightRadius", null)
    @scala.inline
    def setBorderBottomStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderBottomStyle", js.Array(value :_*))
    @scala.inline
    def setBorderBottomStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderBottomStyleProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderBottomStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomStyle: Self = this.set("borderBottomStyle", js.undefined)
    @scala.inline
    def setBorderBottomStyleNull: Self = this.set("borderBottomStyle", null)
    @scala.inline
    def setBorderBottomWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderBottomWidth", js.Array(value :_*))
    @scala.inline
    def setBorderBottomWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomWidth: Self = this.set("borderBottomWidth", js.undefined)
    @scala.inline
    def setBorderBottomWidthNull: Self = this.set("borderBottomWidth", null)
    @scala.inline
    def setBorderColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderColor", js.Array(value :_*))
    @scala.inline
    def setBorderColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderColorNull: Self = this.set("borderColor", null)
    @scala.inline
    def setBorderLeftVarargs(value: (js.Any | Null)*): Self = this.set("borderLeft", js.Array(value :_*))
    @scala.inline
    def setBorderLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderLeftProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    @scala.inline
    def setBorderLeftNull: Self = this.set("borderLeft", null)
    @scala.inline
    def setBorderLeftColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderLeftColor", js.Array(value :_*))
    @scala.inline
    def setBorderLeftColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("borderLeftColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftColor: Self = this.set("borderLeftColor", js.undefined)
    @scala.inline
    def setBorderLeftColorNull: Self = this.set("borderLeftColor", null)
    @scala.inline
    def setBorderLeftStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderLeftStyle", js.Array(value :_*))
    @scala.inline
    def setBorderLeftStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderLeftStyleProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderLeftStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftStyle: Self = this.set("borderLeftStyle", js.undefined)
    @scala.inline
    def setBorderLeftStyleNull: Self = this.set("borderLeftStyle", null)
    @scala.inline
    def setBorderLeftWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderLeftWidth", js.Array(value :_*))
    @scala.inline
    def setBorderLeftWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = this.set("borderLeftWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftWidth: Self = this.set("borderLeftWidth", js.undefined)
    @scala.inline
    def setBorderLeftWidthNull: Self = this.set("borderLeftWidth", null)
    @scala.inline
    def setBorderRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderRadius", js.Array(value :_*))
    @scala.inline
    def setBorderRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderRadiusNull: Self = this.set("borderRadius", null)
    @scala.inline
    def setBorderRightVarargs(value: (js.Any | Null)*): Self = this.set("borderRight", js.Array(value :_*))
    @scala.inline
    def setBorderRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
    @scala.inline
    def setBorderRightNull: Self = this.set("borderRight", null)
    @scala.inline
    def setBorderRightColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderRightColor", js.Array(value :_*))
    @scala.inline
    def setBorderRightColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("borderRightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightColor: Self = this.set("borderRightColor", js.undefined)
    @scala.inline
    def setBorderRightColorNull: Self = this.set("borderRightColor", null)
    @scala.inline
    def setBorderRightStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderRightStyle", js.Array(value :_*))
    @scala.inline
    def setBorderRightStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRightStyleProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderRightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightStyle: Self = this.set("borderRightStyle", js.undefined)
    @scala.inline
    def setBorderRightStyleNull: Self = this.set("borderRightStyle", null)
    @scala.inline
    def setBorderRightWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderRightWidth", js.Array(value :_*))
    @scala.inline
    def setBorderRightWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightWidth: Self = this.set("borderRightWidth", js.undefined)
    @scala.inline
    def setBorderRightWidthNull: Self = this.set("borderRightWidth", null)
    @scala.inline
    def setBorderStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderStyle", js.Array(value :_*))
    @scala.inline
    def setBorderStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderStyleProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setBorderStyleNull: Self = this.set("borderStyle", null)
    @scala.inline
    def setBorderTopVarargs(value: (js.Any | Null)*): Self = this.set("borderTop", js.Array(value :_*))
    @scala.inline
    def setBorderTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderTopProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
    @scala.inline
    def setBorderTopNull: Self = this.set("borderTop", null)
    @scala.inline
    def setBorderTopColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderTopColor", js.Array(value :_*))
    @scala.inline
    def setBorderTopColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = this.set("borderTopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopColor: Self = this.set("borderTopColor", js.undefined)
    @scala.inline
    def setBorderTopColorNull: Self = this.set("borderTopColor", null)
    @scala.inline
    def setBorderTopLeftRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderTopLeftRadius", js.Array(value :_*))
    @scala.inline
    def setBorderTopLeftRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    @scala.inline
    def setBorderTopLeftRadiusNull: Self = this.set("borderTopLeftRadius", null)
    @scala.inline
    def setBorderTopRightRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderTopRightRadius", js.Array(value :_*))
    @scala.inline
    def setBorderTopRightRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    @scala.inline
    def setBorderTopRightRadiusNull: Self = this.set("borderTopRightRadius", null)
    @scala.inline
    def setBorderTopStyleVarargs(value: (js.Any | Null)*): Self = this.set("borderTopStyle", js.Array(value :_*))
    @scala.inline
    def setBorderTopStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderTopStyleProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderTopStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopStyle: Self = this.set("borderTopStyle", js.undefined)
    @scala.inline
    def setBorderTopStyleNull: Self = this.set("borderTopStyle", null)
    @scala.inline
    def setBorderTopWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderTopWidth", js.Array(value :_*))
    @scala.inline
    def setBorderTopWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopWidth: Self = this.set("borderTopWidth", js.undefined)
    @scala.inline
    def setBorderTopWidthNull: Self = this.set("borderTopWidth", null)
    @scala.inline
    def setBorderWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = this.set("borderWidth", js.Array(value :_*))
    @scala.inline
    def setBorderWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setBorderWidthNull: Self = this.set("borderWidth", null)
    @scala.inline
    def setBorderXVarargs(value: (js.Any | Null)*): Self = this.set("borderX", js.Array(value :_*))
    @scala.inline
    def setBorderX(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderX: Self = this.set("borderX", js.undefined)
    @scala.inline
    def setBorderXNull: Self = this.set("borderX", null)
    @scala.inline
    def setBorderYVarargs(value: (js.Any | Null)*): Self = this.set("borderY", js.Array(value :_*))
    @scala.inline
    def setBorderY(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("borderY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderY: Self = this.set("borderY", js.undefined)
    @scala.inline
    def setBorderYNull: Self = this.set("borderY", null)
    @scala.inline
    def setBottomVarargs(value: (js.Any | Null)*): Self = this.set("bottom", js.Array(value :_*))
    @scala.inline
    def setBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BottomProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setBottomNull: Self = this.set("bottom", null)
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
    def setDisplayVarargs(value: (js.Any | Null)*): Self = this.set("display", js.Array(value :_*))
    @scala.inline
    def setDisplay(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.DisplayProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setDisplayNull: Self = this.set("display", null)
    @scala.inline
    def setHeightVarargs(value: (js.Any | Null)*): Self = this.set("height", js.Array(value :_*))
    @scala.inline
    def setHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    @scala.inline
    def setLeftVarargs(value: (js.Any | Null)*): Self = this.set("left", js.Array(value :_*))
    @scala.inline
    def setLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LeftProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLeftNull: Self = this.set("left", null)
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
    def setMaxHeightVarargs(value: (js.Any | Null)*): Self = this.set("maxHeight", js.Array(value :_*))
    @scala.inline
    def setMaxHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxHeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxHeightNull: Self = this.set("maxHeight", null)
    @scala.inline
    def setMaxWidthVarargs(value: (js.Any | Null)*): Self = this.set("maxWidth", js.Array(value :_*))
    @scala.inline
    def setMaxWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxWidthProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaxWidthNull: Self = this.set("maxWidth", null)
    @scala.inline
    def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = this.set("mb", js.Array(value :_*))
    @scala.inline
    def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = this.set("mb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
    @scala.inline
    def setMbNull: Self = this.set("mb", null)
    @scala.inline
    def setMinHeightVarargs(value: (js.Any | Null)*): Self = this.set("minHeight", js.Array(value :_*))
    @scala.inline
    def setMinHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinHeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinHeightNull: Self = this.set("minHeight", null)
    @scala.inline
    def setMinWidthVarargs(value: (js.Any | Null)*): Self = this.set("minWidth", js.Array(value :_*))
    @scala.inline
    def setMinWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinWidthProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMinWidthNull: Self = this.set("minWidth", null)
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
    def setOverflowVarargs(value: (js.Any | Null)*): Self = this.set("overflow", js.Array(value :_*))
    @scala.inline
    def setOverflow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setOverflowNull: Self = this.set("overflow", null)
    @scala.inline
    def setOverflowXVarargs(value: (js.Any | Null)*): Self = this.set("overflowX", js.Array(value :_*))
    @scala.inline
    def setOverflowX(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowXProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("overflowX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowX: Self = this.set("overflowX", js.undefined)
    @scala.inline
    def setOverflowXNull: Self = this.set("overflowX", null)
    @scala.inline
    def setOverflowYVarargs(value: (js.Any | Null)*): Self = this.set("overflowY", js.Array(value :_*))
    @scala.inline
    def setOverflowY(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowYProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("overflowY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowY: Self = this.set("overflowY", js.undefined)
    @scala.inline
    def setOverflowYNull: Self = this.set("overflowY", null)
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
    def setPositionVarargs(value: (js.Any | Null)*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PositionProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
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
    def setRightVarargs(value: (js.Any | Null)*): Self = this.set("right", js.Array(value :_*))
    @scala.inline
    def setRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.RightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setRightNull: Self = this.set("right", null)
    @scala.inline
    def setSizeVarargs(value: (js.Any | Null)*): Self = this.set("size", js.Array(value :_*))
    @scala.inline
    def setSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizeNull: Self = this.set("size", null)
    @scala.inline
    def setTopVarargs(value: (js.Any | Null)*): Self = this.set("top", js.Array(value :_*))
    @scala.inline
    def setTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TopProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setTopNull: Self = this.set("top", null)
    @scala.inline
    def setVerticalAlignVarargs(value: (js.Any | Null)*): Self = this.set("verticalAlign", js.Array(value :_*))
    @scala.inline
    def setVerticalAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.VerticalAlignProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setVerticalAlignNull: Self = this.set("verticalAlign", null)
    @scala.inline
    def setWidthVarargs(value: (js.Any | Null)*): Self = this.set("width", js.Array(value :_*))
    @scala.inline
    def setWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.WidthProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
    @scala.inline
    def setZIndexVarargs(value: (js.Any | Null)*): Self = this.set("zIndex", js.Array(value :_*))
    @scala.inline
    def setZIndex(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _, 
          RequiredTheme
        ]
    ): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZIndexNull: Self = this.set("zIndex", null)
  }
  
}

