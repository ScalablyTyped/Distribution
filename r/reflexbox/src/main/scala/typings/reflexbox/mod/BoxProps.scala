package typings.reflexbox.mod

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
import typings.styledSystem.mod.TextAlignProps
import typings.styledSystem.mod.TextColorProps
import typings.styledSystem.mod.ThemeValue
import typings.styledSystem.mod.VerticalAlignProps
import typings.styledSystem.mod.WidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxProps
  extends SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
     with WidthProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.WidthProperty<TLengthStyledSystem> */ js.Any
    ]
     with HeightProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ js.Any
    ]
     with MinWidthProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinWidthProperty<TLengthStyledSystem> */ js.Any
    ]
     with MinHeightProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinHeightProperty<TLengthStyledSystem> */ js.Any
    ]
     with MaxWidthProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxWidthProperty<TLengthStyledSystem> */ js.Any
    ]
     with MaxHeightProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxHeightProperty<TLengthStyledSystem> */ js.Any
    ]
     with DisplayProps[RequiredTheme]
     with VerticalAlignProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.VerticalAlignProperty<TLengthStyledSystem> */ js.Any
    ]
     with SizeProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ js.Any
    ]
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
     with FlexProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexProperty<TLengthStyledSystem> */ js.Any
    ]
     with FlexGrowProps[RequiredTheme]
     with FlexShrinkProps[RequiredTheme]
     with FlexBasisProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexBasisProperty<TLengthStyledSystem> */ js.Any
    ]
     with JustifySelfProps[RequiredTheme]
     with AlignSelfProps[RequiredTheme]
     with OrderProps[RequiredTheme] {
  var as: js.UndefOr[ElementType[_]] = js.native
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
    def setAs(value: ElementType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
  }
  
}

