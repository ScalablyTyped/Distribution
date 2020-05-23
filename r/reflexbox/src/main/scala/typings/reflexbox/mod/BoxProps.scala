package typings.reflexbox.mod

import typings.csstype.mod.FlexBasisProperty
import typings.csstype.mod.FlexProperty
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.MaxHeightProperty
import typings.csstype.mod.MaxWidthProperty
import typings.csstype.mod.MinHeightProperty
import typings.csstype.mod.MinWidthProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.csstype.mod.WidthProperty
import typings.react.mod.ElementType
import typings.reflexbox.reflexboxStrings.colors
import typings.reflexbox.reflexboxStrings.fontSizes
import typings.reflexbox.reflexboxStrings.fontWeights
import typings.reflexbox.reflexboxStrings.letterSpacings
import typings.reflexbox.reflexboxStrings.lineHeights
import typings.reflexbox.reflexboxStrings.space
import typings.styledSystem.mod.AlignContentProps
import typings.styledSystem.mod.AlignItemsProps
import typings.styledSystem.mod.AlignSelfProps
import typings.styledSystem.mod.BackgroundColorProps
import typings.styledSystem.mod.DisplayProps
import typings.styledSystem.mod.FlexBasisProps
import typings.styledSystem.mod.FlexDirectionProps
import typings.styledSystem.mod.FlexGrowProps
import typings.styledSystem.mod.FlexProps
import typings.styledSystem.mod.FlexShrinkProps
import typings.styledSystem.mod.FlexWrapProps
import typings.styledSystem.mod.FontFamilyProps
import typings.styledSystem.mod.FontSizeProps
import typings.styledSystem.mod.FontStyleProps
import typings.styledSystem.mod.FontWeightProps
import typings.styledSystem.mod.HeightProps
import typings.styledSystem.mod.JustifyContentProps
import typings.styledSystem.mod.JustifyItemsProps
import typings.styledSystem.mod.JustifySelfProps
import typings.styledSystem.mod.LetterSpacingProps
import typings.styledSystem.mod.LineHeightProps
import typings.styledSystem.mod.MaxHeightProps
import typings.styledSystem.mod.MaxWidthProps
import typings.styledSystem.mod.MinHeightProps
import typings.styledSystem.mod.MinWidthProps
import typings.styledSystem.mod.OpacityProps
import typings.styledSystem.mod.OrderProps
import typings.styledSystem.mod.OverflowProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.SizeProps
import typings.styledSystem.mod.SpaceProps
import typings.styledSystem.mod.TLengthStyledSystem
import typings.styledSystem.mod.TextAlignProps
import typings.styledSystem.mod.TextColorProps
import typings.styledSystem.mod.ThemeValue
import typings.styledSystem.mod.VerticalAlignProps
import typings.styledSystem.mod.WidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps
  extends SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
     with WidthProps[RequiredTheme, WidthProperty[TLengthStyledSystem]]
     with HeightProps[RequiredTheme, HeightProperty[TLengthStyledSystem]]
     with MinWidthProps[RequiredTheme, MinWidthProperty[TLengthStyledSystem]]
     with MinHeightProps[RequiredTheme, MinHeightProperty[TLengthStyledSystem]]
     with MaxWidthProps[RequiredTheme, MaxWidthProperty[TLengthStyledSystem]]
     with MaxHeightProps[RequiredTheme, MaxHeightProperty[TLengthStyledSystem]]
     with DisplayProps[RequiredTheme]
     with VerticalAlignProps[RequiredTheme, VerticalAlignProperty[TLengthStyledSystem]]
     with SizeProps[RequiredTheme, HeightProperty[TLengthStyledSystem]]
     with OverflowProps[RequiredTheme]
     with FontFamilyProps[RequiredTheme]
     with FontSizeProps[RequiredTheme, ThemeValue[fontSizes, RequiredTheme, js.Any]]
     with FontWeightProps[RequiredTheme, ThemeValue[fontWeights, RequiredTheme, js.Any]]
     with LineHeightProps[RequiredTheme, ThemeValue[lineHeights, RequiredTheme, js.Any]]
     with LetterSpacingProps[RequiredTheme, ThemeValue[letterSpacings, RequiredTheme, js.Any]]
     with FontStyleProps[RequiredTheme]
     with TextAlignProps[RequiredTheme]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme]
     with AlignItemsProps[RequiredTheme]
     with AlignContentProps[RequiredTheme]
     with JustifyItemsProps[RequiredTheme]
     with JustifyContentProps[RequiredTheme]
     with FlexWrapProps[RequiredTheme]
     with FlexDirectionProps[RequiredTheme]
     with FlexProps[RequiredTheme, FlexProperty[TLengthStyledSystem]]
     with FlexGrowProps[RequiredTheme]
     with FlexShrinkProps[RequiredTheme]
     with FlexBasisProps[RequiredTheme, FlexBasisProperty[TLengthStyledSystem]]
     with JustifySelfProps[RequiredTheme]
     with AlignSelfProps[RequiredTheme]
     with OrderProps[RequiredTheme] {
  var as: js.UndefOr[ElementType[_]] = js.undefined
}

