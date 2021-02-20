package typings.spectacle

import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.FC
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.spectacle.anon.AnimationsWhenGoingBack
import typings.spectacle.anon.AutoFillHeight
import typings.spectacle.anon.BackgroundColor
import typings.spectacle.anon.Children
import typings.spectacle.anon.ChildrenReactNode
import typings.spectacle.anon.Color
import typings.spectacle.anon.ContainsSlides
import typings.spectacle.anon.CurrentSlide
import typings.spectacle.anon.DefaultValue
import typings.spectacle.anon.Size
import typings.spectacle.anon.childrenReactNodeLayoutPr
import typings.spectacle.spectacleStrings.borderWidths
import typings.spectacle.spectacleStrings.colors
import typings.spectacle.spectacleStrings.fontSizes
import typings.spectacle.spectacleStrings.fontWeights
import typings.spectacle.spectacleStrings.letterSpacings
import typings.spectacle.spectacleStrings.lineHeights
import typings.spectacle.spectacleStrings.radii
import typings.spectacle.spectacleStrings.space
import typings.std.Record
import typings.styledSystem.mod.FlexProps
import typings.styledSystem.mod.LayoutProps
import typings.styledSystem.mod.PositionProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.ThemeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spectacle", "Appear")
  @js.native
  val Appear: FC[Children] = js.native
  
  @JSImport("spectacle", "Box")
  @js.native
  val Box: FC[BoxProps] = js.native
  
  @JSImport("spectacle", "CodePane")
  @js.native
  val CodePane: FC[AutoFillHeight] = js.native
  
  @JSImport("spectacle", "CodeSpan")
  @js.native
  val CodeSpan: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Deck")
  @js.native
  val Deck: FC[AnimationsWhenGoingBack] = js.native
  
  @JSImport("spectacle", "FlexBox")
  @js.native
  val FlexBox: FC[
    BoxProps with (FlexProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ _
    ])
  ] = js.native
  
  @JSImport("spectacle", "FullScreen")
  @js.native
  val FullScreen: FC[Color] = js.native
  
  @JSImport("spectacle", "FullSizeImage")
  @js.native
  val FullSizeImage: FC[
    ImgHTMLAttributes[js.Object] with LayoutProps[RequiredTheme] with PositionProps[RequiredTheme]
  ] = js.native
  
  @JSImport("spectacle", "Grid")
  @js.native
  val Grid: FC[childrenReactNodeLayoutPr] = js.native
  
  @JSImport("spectacle", "Heading")
  @js.native
  val Heading: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Image")
  @js.native
  val Image: FC[
    ImgHTMLAttributes[js.Object] with LayoutProps[RequiredTheme] with PositionProps[RequiredTheme]
  ] = js.native
  
  @JSImport("spectacle", "Link")
  @js.native
  val Link: FC[TypographyProps with AnchorHTMLAttributes[js.Object]] = js.native
  
  @JSImport("spectacle", "ListItem")
  @js.native
  val ListItem: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Markdown")
  @js.native
  val Markdown: FC[ContainsSlides] = js.native
  
  @JSImport("spectacle", "Notes")
  @js.native
  val Notes: FC[ChildrenReactNode] = js.native
  
  @JSImport("spectacle", "OrderedList")
  @js.native
  val OrderedList: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Progress")
  @js.native
  val Progress: FC[Color] = js.native
  
  @JSImport("spectacle", "Quote")
  @js.native
  val Quote: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "Slide")
  @js.native
  val Slide: FC[BackgroundColor] = js.native
  
  @JSImport("spectacle", "SpectacleLogo")
  @js.native
  val SpectacleLogo: FC[Size] = js.native
  
  @JSImport("spectacle", "Stepper")
  @js.native
  val Stepper: FC[DefaultValue] = js.native
  
  @JSImport("spectacle", "Text")
  @js.native
  val Text: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "UnorderedList")
  @js.native
  val UnorderedList: FC[TypographyProps] = js.native
  
  @JSImport("spectacle", "isolateNotes")
  @js.native
  def isolateNotes(content: String): String = js.native
  
  @JSImport("spectacle", "mdxComponentMap")
  @js.native
  val mdxComponentMap: Record[String, Element] = js.native
  
  @JSImport("spectacle", "remoteNotes")
  @js.native
  def remoteNotes(content: String): String = js.native
  
  /* Inlined {  children :react.react.ReactNode} & styled-system.styled-system.ColorProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'colors', styled-system.styled-system.RequiredTheme, any>> & styled-system.styled-system.SpaceProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'space', styled-system.styled-system.RequiredTheme, any>> & styled-system.styled-system.LayoutProps<styled-system.styled-system.RequiredTheme> & styled-system.styled-system.PositionProps<styled-system.styled-system.RequiredTheme> & styled-system.styled-system.BorderProps<styled-system.styled-system.RequiredTheme, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLengthStyledSystem> * / any> */
  @js.native
  trait BoxProps extends StObject {
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottomStyle */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeftStyle */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRightStyle */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTopStyle */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
      ] = js.native
    
    var borderY: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
      ] = js.native
    
    var size: js.UndefOr[
        ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _, 
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
    implicit class BoxPropsMutableBuilder[Self <: BoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      @scala.inline
      def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgNull: Self = StObject.set(x, "bg", null)
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      @scala.inline
      def setBorder(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottom(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomColorNull: Self = StObject.set(x, "borderBottomColor", null)
      
      @scala.inline
      def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      @scala.inline
      def setBorderBottomColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderBottomColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderBottomLeftRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomLeftRadiusNull: Self = StObject.set(x, "borderBottomLeftRadius", null)
      
      @scala.inline
      def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      @scala.inline
      def setBorderBottomLeftRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderBottomLeftRadius", js.Array(value :_*))
      
      @scala.inline
      def setBorderBottomNull: Self = StObject.set(x, "borderBottom", null)
      
      @scala.inline
      def setBorderBottomRightRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomRightRadiusNull: Self = StObject.set(x, "borderBottomRightRadius", null)
      
      @scala.inline
      def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      @scala.inline
      def setBorderBottomRightRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderBottomRightRadius", js.Array(value :_*))
      
      @scala.inline
      def setBorderBottomStyle(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottomStyle */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomStyleNull: Self = StObject.set(x, "borderBottomStyle", null)
      
      @scala.inline
      def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
      
      @scala.inline
      def setBorderBottomStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderBottomStyle", js.Array(value :_*))
      
      @scala.inline
      def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      @scala.inline
      def setBorderBottomVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderBottom", js.Array(value :_*))
      
      @scala.inline
      def setBorderBottomWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomWidthNull: Self = StObject.set(x, "borderBottomWidth", null)
      
      @scala.inline
      def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      @scala.inline
      def setBorderBottomWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderBottomWidth", js.Array(value :_*))
      
      @scala.inline
      def setBorderColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorNull: Self = StObject.set(x, "borderColor", null)
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderLeft(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftColorNull: Self = StObject.set(x, "borderLeftColor", null)
      
      @scala.inline
      def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      @scala.inline
      def setBorderLeftColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderLeftColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderLeftNull: Self = StObject.set(x, "borderLeft", null)
      
      @scala.inline
      def setBorderLeftStyle(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeftStyle */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftStyleNull: Self = StObject.set(x, "borderLeftStyle", null)
      
      @scala.inline
      def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
      
      @scala.inline
      def setBorderLeftStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderLeftStyle", js.Array(value :_*))
      
      @scala.inline
      def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      @scala.inline
      def setBorderLeftVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderLeft", js.Array(value :_*))
      
      @scala.inline
      def setBorderLeftWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftWidthNull: Self = StObject.set(x, "borderLeftWidth", null)
      
      @scala.inline
      def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
      
      @scala.inline
      def setBorderLeftWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderLeftWidth", js.Array(value :_*))
      
      @scala.inline
      def setBorderNull: Self = StObject.set(x, "border", null)
      
      @scala.inline
      def setBorderRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusNull: Self = StObject.set(x, "borderRadius", null)
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setBorderRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderRadius", js.Array(value :_*))
      
      @scala.inline
      def setBorderRight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightColorNull: Self = StObject.set(x, "borderRightColor", null)
      
      @scala.inline
      def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      @scala.inline
      def setBorderRightColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderRightColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderRightNull: Self = StObject.set(x, "borderRight", null)
      
      @scala.inline
      def setBorderRightStyle(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRightStyle */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightStyleNull: Self = StObject.set(x, "borderRightStyle", null)
      
      @scala.inline
      def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
      
      @scala.inline
      def setBorderRightStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderRightStyle", js.Array(value :_*))
      
      @scala.inline
      def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      @scala.inline
      def setBorderRightVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderRight", js.Array(value :_*))
      
      @scala.inline
      def setBorderRightWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightWidthNull: Self = StObject.set(x, "borderRightWidth", null)
      
      @scala.inline
      def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
      
      @scala.inline
      def setBorderRightWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderRightWidth", js.Array(value :_*))
      
      @scala.inline
      def setBorderStyle(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleNull: Self = StObject.set(x, "borderStyle", null)
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setBorderStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderStyle", js.Array(value :_*))
      
      @scala.inline
      def setBorderTop(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopColorNull: Self = StObject.set(x, "borderTopColor", null)
      
      @scala.inline
      def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      @scala.inline
      def setBorderTopColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderTopColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderTopLeftRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopLeftRadiusNull: Self = StObject.set(x, "borderTopLeftRadius", null)
      
      @scala.inline
      def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      @scala.inline
      def setBorderTopLeftRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderTopLeftRadius", js.Array(value :_*))
      
      @scala.inline
      def setBorderTopNull: Self = StObject.set(x, "borderTop", null)
      
      @scala.inline
      def setBorderTopRightRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopRightRadiusNull: Self = StObject.set(x, "borderTopRightRadius", null)
      
      @scala.inline
      def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      @scala.inline
      def setBorderTopRightRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderTopRightRadius", js.Array(value :_*))
      
      @scala.inline
      def setBorderTopStyle(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTopStyle */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopStyleNull: Self = StObject.set(x, "borderTopStyle", null)
      
      @scala.inline
      def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
      
      @scala.inline
      def setBorderTopStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderTopStyle", js.Array(value :_*))
      
      @scala.inline
      def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      @scala.inline
      def setBorderTopVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderTop", js.Array(value :_*))
      
      @scala.inline
      def setBorderTopWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopWidthNull: Self = StObject.set(x, "borderTopWidth", null)
      
      @scala.inline
      def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      @scala.inline
      def setBorderTopWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderTopWidth", js.Array(value :_*))
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setBorderWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthNull: Self = StObject.set(x, "borderWidth", null)
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setBorderWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "borderWidth", js.Array(value :_*))
      
      @scala.inline
      def setBorderX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderXNull: Self = StObject.set(x, "borderX", null)
      
      @scala.inline
      def setBorderXUndefined: Self = StObject.set(x, "borderX", js.undefined)
      
      @scala.inline
      def setBorderXVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderX", js.Array(value :_*))
      
      @scala.inline
      def setBorderY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "borderY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderYNull: Self = StObject.set(x, "borderY", null)
      
      @scala.inline
      def setBorderYUndefined: Self = StObject.set(x, "borderY", js.undefined)
      
      @scala.inline
      def setBorderYVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "borderY", js.Array(value :_*))
      
      @scala.inline
      def setBottom(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomNull: Self = StObject.set(x, "bottom", null)
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setBottomVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "bottom", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNull: Self = StObject.set(x, "color", null)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setDisplay(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNull: Self = StObject.set(x, "display", null)
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setDisplayVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "display", js.Array(value :_*))
      
      @scala.inline
      def setHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightNull: Self = StObject.set(x, "height", null)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHeightVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "height", js.Array(value :_*))
      
      @scala.inline
      def setLeft(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftNull: Self = StObject.set(x, "left", null)
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLeftVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      @scala.inline
      def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNull: Self = StObject.set(x, "m", null)
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      @scala.inline
      def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      @scala.inline
      def setMarginNull: Self = StObject.set(x, "margin", null)
      
      @scala.inline
      def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      @scala.inline
      def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      @scala.inline
      def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      @scala.inline
      def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      @scala.inline
      def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      @scala.inline
      def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      @scala.inline
      def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      @scala.inline
      def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      @scala.inline
      def setMaxHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightNull: Self = StObject.set(x, "maxHeight", null)
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxHeightVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      @scala.inline
      def setMaxWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMaxWidthVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      @scala.inline
      def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMbNull: Self = StObject.set(x, "mb", null)
      
      @scala.inline
      def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      @scala.inline
      def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      @scala.inline
      def setMinHeight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightNull: Self = StObject.set(x, "minHeight", null)
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinHeightVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      @scala.inline
      def setMinWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthNull: Self = StObject.set(x, "minWidth", null)
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMinWidthVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      @scala.inline
      def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMlNull: Self = StObject.set(x, "ml", null)
      
      @scala.inline
      def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      @scala.inline
      def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      @scala.inline
      def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMrNull: Self = StObject.set(x, "mr", null)
      
      @scala.inline
      def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      @scala.inline
      def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      @scala.inline
      def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtNull: Self = StObject.set(x, "mt", null)
      
      @scala.inline
      def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      @scala.inline
      def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      @scala.inline
      def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMxNull: Self = StObject.set(x, "mx", null)
      
      @scala.inline
      def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      @scala.inline
      def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      @scala.inline
      def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMyNull: Self = StObject.set(x, "my", null)
      
      @scala.inline
      def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      @scala.inline
      def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpacityVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverflowVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      @scala.inline
      def setOverflowX(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
      
      @scala.inline
      def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      @scala.inline
      def setOverflowXVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "overflowX", js.Array(value :_*))
      
      @scala.inline
      def setOverflowY(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
      
      @scala.inline
      def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      @scala.inline
      def setOverflowYVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "overflowY", js.Array(value :_*))
      
      @scala.inline
      def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNull: Self = StObject.set(x, "p", null)
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      @scala.inline
      def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      @scala.inline
      def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      @scala.inline
      def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      @scala.inline
      def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      @scala.inline
      def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      @scala.inline
      def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      @scala.inline
      def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      @scala.inline
      def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      @scala.inline
      def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      @scala.inline
      def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      @scala.inline
      def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPbNull: Self = StObject.set(x, "pb", null)
      
      @scala.inline
      def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      @scala.inline
      def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      @scala.inline
      def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlNull: Self = StObject.set(x, "pl", null)
      
      @scala.inline
      def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      @scala.inline
      def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      @scala.inline
      def setPosition(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionNull: Self = StObject.set(x, "position", null)
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrNull: Self = StObject.set(x, "pr", null)
      
      @scala.inline
      def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      @scala.inline
      def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      @scala.inline
      def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPtNull: Self = StObject.set(x, "pt", null)
      
      @scala.inline
      def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      @scala.inline
      def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      @scala.inline
      def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPxNull: Self = StObject.set(x, "px", null)
      
      @scala.inline
      def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      @scala.inline
      def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      @scala.inline
      def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPyNull: Self = StObject.set(x, "py", null)
      
      @scala.inline
      def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      @scala.inline
      def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      @scala.inline
      def setRight(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightNull: Self = StObject.set(x, "right", null)
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setRightVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "right", js.Array(value :_*))
      
      @scala.inline
      def setSize(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeNull: Self = StObject.set(x, "size", null)
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizeVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "size", js.Array(value :_*))
      
      @scala.inline
      def setTop(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopNull: Self = StObject.set(x, "top", null)
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTopVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "top", js.Array(value :_*))
      
      @scala.inline
      def setVerticalAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setVerticalAlignVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      @scala.inline
      def setWidth(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLengthStyledSystem> */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthNull: Self = StObject.set(x, "width", null)
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidthVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "width", js.Array(value :_*))
      
      @scala.inline
      def setZIndex(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexNull: Self = StObject.set(x, "zIndex", null)
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZIndexVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "zIndex", js.Array(value :_*))
    }
  }
  
  type TemplateFn = js.Function1[/* options */ CurrentSlide, ReactNode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.spectacle.anon.Config
    - typings.spectacle.spectacleStrings.fade
    - typings.spectacle.spectacleStrings.slide
    - typings.spectacle.spectacleStrings.none
  */
  trait TransitionEffect extends StObject
  
  /* Inlined {  children :react.react.ReactNode} & styled-system.styled-system.ColorProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'colors', styled-system.styled-system.RequiredTheme, any>> & styled-system.styled-system.TypographyProps<styled-system.styled-system.RequiredTheme> & styled-system.styled-system.SpaceProps<styled-system.styled-system.RequiredTheme, styled-system.styled-system.ThemeValue<'space', styled-system.styled-system.RequiredTheme, any>> */
  @js.native
  trait TypographyProps extends StObject {
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ _, 
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
    implicit class TypographyPropsMutableBuilder[Self <: TypographyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      @scala.inline
      def setBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgNull: Self = StObject.set(x, "bg", null)
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setBgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNull: Self = StObject.set(x, "color", null)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setFontFamily(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyNull: Self = StObject.set(x, "fontFamily", null)
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontFamilyVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "fontFamily", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(value: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontSizeVarargs(value: ((ThemeValue[fontSizes, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      @scala.inline
      def setFontStyle(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleNull: Self = StObject.set(x, "fontStyle", null)
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontStyleVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "fontStyle", js.Array(value :_*))
      
      @scala.inline
      def setFontWeight(value: ResponsiveValue[ThemeValue[fontWeights, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightNull: Self = StObject.set(x, "fontWeight", null)
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFontWeightVarargs(value: ((ThemeValue[fontWeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      @scala.inline
      def setLetterSpacing(value: ResponsiveValue[ThemeValue[letterSpacings, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingNull: Self = StObject.set(x, "letterSpacing", null)
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLetterSpacingVarargs(value: ((ThemeValue[letterSpacings, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "letterSpacing", js.Array(value :_*))
      
      @scala.inline
      def setLineHeight(value: ResponsiveValue[ThemeValue[lineHeights, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightNull: Self = StObject.set(x, "lineHeight", null)
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLineHeightVarargs(value: ((ThemeValue[lineHeights, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "lineHeight", js.Array(value :_*))
      
      @scala.inline
      def setM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNull: Self = StObject.set(x, "m", null)
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      @scala.inline
      def setMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      @scala.inline
      def setMarginNull: Self = StObject.set(x, "margin", null)
      
      @scala.inline
      def setMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightNull: Self = StObject.set(x, "marginRight", null)
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      @scala.inline
      def setMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopNull: Self = StObject.set(x, "marginTop", null)
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      @scala.inline
      def setMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginXNull: Self = StObject.set(x, "marginX", null)
      
      @scala.inline
      def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      @scala.inline
      def setMarginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginX", js.Array(value :_*))
      
      @scala.inline
      def setMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginYNull: Self = StObject.set(x, "marginY", null)
      
      @scala.inline
      def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      @scala.inline
      def setMarginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "marginY", js.Array(value :_*))
      
      @scala.inline
      def setMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMbNull: Self = StObject.set(x, "mb", null)
      
      @scala.inline
      def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      @scala.inline
      def setMbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      @scala.inline
      def setMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMlNull: Self = StObject.set(x, "ml", null)
      
      @scala.inline
      def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      @scala.inline
      def setMlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      @scala.inline
      def setMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMrNull: Self = StObject.set(x, "mr", null)
      
      @scala.inline
      def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      @scala.inline
      def setMrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      @scala.inline
      def setMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtNull: Self = StObject.set(x, "mt", null)
      
      @scala.inline
      def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      @scala.inline
      def setMtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      @scala.inline
      def setMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMxNull: Self = StObject.set(x, "mx", null)
      
      @scala.inline
      def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      @scala.inline
      def setMxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      @scala.inline
      def setMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMyNull: Self = StObject.set(x, "my", null)
      
      @scala.inline
      def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      @scala.inline
      def setMyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpacityVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      @scala.inline
      def setP(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNull: Self = StObject.set(x, "p", null)
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      @scala.inline
      def setPadding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomNull: Self = StObject.set(x, "paddingBottom", null)
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      @scala.inline
      def setPaddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftNull: Self = StObject.set(x, "paddingLeft", null)
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      @scala.inline
      def setPaddingNull: Self = StObject.set(x, "padding", null)
      
      @scala.inline
      def setPaddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      @scala.inline
      def setPaddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopNull: Self = StObject.set(x, "paddingTop", null)
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPaddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingXNull: Self = StObject.set(x, "paddingX", null)
      
      @scala.inline
      def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      @scala.inline
      def setPaddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingX", js.Array(value :_*))
      
      @scala.inline
      def setPaddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingYNull: Self = StObject.set(x, "paddingY", null)
      
      @scala.inline
      def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      @scala.inline
      def setPaddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "paddingY", js.Array(value :_*))
      
      @scala.inline
      def setPb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPbNull: Self = StObject.set(x, "pb", null)
      
      @scala.inline
      def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      @scala.inline
      def setPbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      @scala.inline
      def setPl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlNull: Self = StObject.set(x, "pl", null)
      
      @scala.inline
      def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      @scala.inline
      def setPlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      @scala.inline
      def setPr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrNull: Self = StObject.set(x, "pr", null)
      
      @scala.inline
      def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      @scala.inline
      def setPrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      @scala.inline
      def setPt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPtNull: Self = StObject.set(x, "pt", null)
      
      @scala.inline
      def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      @scala.inline
      def setPtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      @scala.inline
      def setPx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPxNull: Self = StObject.set(x, "px", null)
      
      @scala.inline
      def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      @scala.inline
      def setPxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      @scala.inline
      def setPy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPyNull: Self = StObject.set(x, "py", null)
      
      @scala.inline
      def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      @scala.inline
      def setPyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      @scala.inline
      def setTextAlign(
        value: ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ _, 
              RequiredTheme
            ]
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignNull: Self = StObject.set(x, "textAlign", null)
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextAlignVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "textAlign", js.Array(value :_*))
    }
  }
}
