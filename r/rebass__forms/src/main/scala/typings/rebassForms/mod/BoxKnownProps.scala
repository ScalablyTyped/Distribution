package typings.rebassForms.mod

import typings.rebass.mod.BaseProps
import typings.rebass.mod.SxProps
import typings.rebassForms.rebassFormsStrings.colors
import typings.rebassForms.rebassFormsStrings.fontSizes
import typings.rebassForms.rebassFormsStrings.space
import typings.styledSystem.mod.AlignSelfProps
import typings.styledSystem.mod.BackgroundColorProps
import typings.styledSystem.mod.DisplayProps
import typings.styledSystem.mod.FlexProps
import typings.styledSystem.mod.FontSizeProps
import typings.styledSystem.mod.HeightProps
import typings.styledSystem.mod.MaxHeightProps
import typings.styledSystem.mod.MaxWidthProps
import typings.styledSystem.mod.MinHeightProps
import typings.styledSystem.mod.MinWidthProps
import typings.styledSystem.mod.OpacityProps
import typings.styledSystem.mod.OrderProps
import typings.styledSystem.mod.OverflowProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.SizeProps
import typings.styledSystem.mod.SpaceProps
import typings.styledSystem.mod.TextColorProps
import typings.styledSystem.mod.ThemeValue
import typings.styledSystem.mod.VerticalAlignProps
import typings.styledSystem.mod.WidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxKnownProps
  extends BaseProps
     with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
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
     with FontSizeProps[RequiredTheme, ThemeValue[fontSizes, RequiredTheme, js.Any]]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme]
     with FlexProps[
      RequiredTheme, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexProperty<TLengthStyledSystem> */ js.Any
    ]
     with OrderProps[RequiredTheme]
     with AlignSelfProps[RequiredTheme]
     with SxProps {
  var tx: js.UndefOr[String] = js.native
  var variant: js.UndefOr[ResponsiveValue[String, RequiredTheme]] = js.native
}

object BoxKnownProps {
  @scala.inline
  def apply(): BoxKnownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxKnownProps]
  }
  @scala.inline
  implicit class BoxKnownPropsOps[Self <: BoxKnownProps] (val x: Self) extends AnyVal {
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
    def setTx(value: String): Self = this.set("tx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTx: Self = this.set("tx", js.undefined)
    @scala.inline
    def setVariantVarargs(value: (String | Null)*): Self = this.set("variant", js.Array(value :_*))
    @scala.inline
    def setVariant(value: ResponsiveValue[String, RequiredTheme]): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
    @scala.inline
    def setVariantNull: Self = this.set("variant", null)
  }
  
}

