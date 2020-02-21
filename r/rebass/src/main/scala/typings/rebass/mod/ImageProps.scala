package typings.rebass.mod

import typings.csstype.mod.AlignSelfProperty
import typings.csstype.mod.DisplayProperty
import typings.csstype.mod.FlexProperty
import typings.csstype.mod.GlobalsNumber
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.MaxHeightProperty
import typings.csstype.mod.MaxWidthProperty
import typings.csstype.mod.MinHeightProperty
import typings.csstype.mod.MinWidthProperty
import typings.csstype.mod.OverflowProperty
import typings.csstype.mod.OverflowXProperty
import typings.csstype.mod.OverflowYProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.csstype.mod.WidthProperty
import typings.react.mod.ElementType
import typings.react.mod.Key
import typings.react.mod.Ref
import typings.rebass.rebassStrings.colors
import typings.rebass.rebassStrings.fontSizes
import typings.rebass.rebassStrings.space
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.TLengthStyledSystem
import typings.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLImageElement>, 'variant' | 'tx'> ]: react.react.HTMLProps<std.HTMLImageElement>[P]} */ trait ImageProps extends BoxKnownProps

object ImageProps {
  @scala.inline
  def apply(
    alignSelf: ResponsiveValue[AlignSelfProperty, RequiredTheme] = null,
    as: ElementType[_] = null,
    backgroundColor: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    bg: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    color: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    css: CSSObject | FlattenSimpleInterpolation | String = null,
    display: ResponsiveValue[DisplayProperty, RequiredTheme] = null,
    flex: ResponsiveValue[FlexProperty[TLengthStyledSystem], RequiredTheme] = null,
    fontSize: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme] = null,
    height: ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    key: Key = null,
    m: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    margin: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginRight: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginTop: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginX: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginY: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    maxHeight: ResponsiveValue[MaxHeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    maxWidth: ResponsiveValue[MaxWidthProperty[TLengthStyledSystem], RequiredTheme] = null,
    mb: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    minHeight: ResponsiveValue[MinHeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    minWidth: ResponsiveValue[MinWidthProperty[TLengthStyledSystem], RequiredTheme] = null,
    ml: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mr: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mt: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mx: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    my: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    opacity: ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OpacityProperty */ _, 
      RequiredTheme
    ] = null,
    order: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    overflow: ResponsiveValue[OverflowProperty, RequiredTheme] = null,
    overflowX: ResponsiveValue[OverflowXProperty, RequiredTheme] = null,
    overflowY: ResponsiveValue[OverflowYProperty, RequiredTheme] = null,
    p: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    padding: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingRight: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingTop: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingX: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingY: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pb: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pl: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pr: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pt: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    px: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    py: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    ref: Ref[js.Any] = null,
    size: ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme] = null,
    sx: SxStyleProp = null,
    tx: String = null,
    variant: ResponsiveValue[String, RequiredTheme] = null,
    verticalAlign: ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem], RequiredTheme] = null,
    width: ResponsiveValue[WidthProperty[TLengthStyledSystem], RequiredTheme] = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal()
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sx != null) __obj.updateDynamic("sx")(sx.asInstanceOf[js.Any])
    if (tx != null) __obj.updateDynamic("tx")(tx.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

