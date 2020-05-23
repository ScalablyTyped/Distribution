package typings.rebassForms.mod

import typings.csstype.mod.AlignItemsProperty
import typings.csstype.mod.AlignSelfProperty
import typings.csstype.mod.DisplayProperty
import typings.csstype.mod.FlexDirectionProperty
import typings.csstype.mod.FlexProperty
import typings.csstype.mod.FlexWrapProperty
import typings.csstype.mod.GlobalsNumber
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.JustifyContentProperty
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
import typings.rebass.mod.SxStyleProp
import typings.rebassForms.rebassFormsStrings.colors
import typings.rebassForms.rebassFormsStrings.fontSizes
import typings.rebassForms.rebassFormsStrings.space
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typings.styledSystem.mod.AlignItemsProps
import typings.styledSystem.mod.FlexDirectionProps
import typings.styledSystem.mod.FlexWrapProps
import typings.styledSystem.mod.JustifyContentProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.TLengthStyledSystem
import typings.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelKnownProps
  extends BoxKnownProps
     with FlexWrapProps[RequiredTheme]
     with FlexDirectionProps[RequiredTheme]
     with AlignItemsProps[RequiredTheme]
     with JustifyContentProps[RequiredTheme]

object LabelKnownProps {
  @scala.inline
  def apply(
    alignItems: js.UndefOr[Null | (ResponsiveValue[AlignItemsProperty, RequiredTheme])] = js.undefined,
    alignSelf: js.UndefOr[Null | (ResponsiveValue[AlignSelfProperty, RequiredTheme])] = js.undefined,
    as: ElementType[_] = null,
    backgroundColor: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    bg: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    color: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    css: CSSObject | FlattenSimpleInterpolation | String = null,
    display: js.UndefOr[Null | (ResponsiveValue[DisplayProperty, RequiredTheme])] = js.undefined,
    flex: js.UndefOr[Null | (ResponsiveValue[FlexProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    flexDirection: js.UndefOr[Null | (ResponsiveValue[FlexDirectionProperty, RequiredTheme])] = js.undefined,
    flexWrap: js.UndefOr[Null | (ResponsiveValue[FlexWrapProperty, RequiredTheme])] = js.undefined,
    fontSize: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    height: js.UndefOr[Null | (ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    justifyContent: js.UndefOr[Null | (ResponsiveValue[JustifyContentProperty, RequiredTheme])] = js.undefined,
    key: Key = null,
    m: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    margin: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginBottom: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginLeft: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginRight: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginTop: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginX: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    marginY: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    maxHeight: js.UndefOr[Null | (ResponsiveValue[MaxHeightProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    maxWidth: js.UndefOr[Null | (ResponsiveValue[MaxWidthProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    mb: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    minHeight: js.UndefOr[Null | (ResponsiveValue[MinHeightProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    minWidth: js.UndefOr[Null | (ResponsiveValue[MinWidthProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    ml: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    mr: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    mt: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    mx: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    my: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    opacity: js.UndefOr[Null | (ResponsiveValue[GlobalsNumber, RequiredTheme])] = js.undefined,
    order: js.UndefOr[Null | (ResponsiveValue[GlobalsNumber, RequiredTheme])] = js.undefined,
    overflow: js.UndefOr[Null | (ResponsiveValue[OverflowProperty, RequiredTheme])] = js.undefined,
    overflowX: js.UndefOr[Null | (ResponsiveValue[OverflowXProperty, RequiredTheme])] = js.undefined,
    overflowY: js.UndefOr[Null | (ResponsiveValue[OverflowYProperty, RequiredTheme])] = js.undefined,
    p: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    padding: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingBottom: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingLeft: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingRight: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingTop: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingX: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    paddingY: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    pb: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    pl: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    pr: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    pt: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    px: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    py: js.UndefOr[
      Null | (ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme])
    ] = js.undefined,
    ref: js.UndefOr[Null | Ref[js.Any]] = js.undefined,
    size: js.UndefOr[Null | (ResponsiveValue[HeightProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined,
    sx: js.UndefOr[Null | SxStyleProp] = js.undefined,
    tx: String = null,
    variant: js.UndefOr[Null | (ResponsiveValue[String, RequiredTheme])] = js.undefined,
    verticalAlign: js.UndefOr[
      Null | (ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem], RequiredTheme])
    ] = js.undefined,
    width: js.UndefOr[Null | (ResponsiveValue[WidthProperty[TLengthStyledSystem], RequiredTheme])] = js.undefined
  ): LabelKnownProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignItems)) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (!js.isUndefined(alignSelf)) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundColor)) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bg)) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(flexDirection)) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(flexWrap)) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(justifyContent)) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (!js.isUndefined(marginX)) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (!js.isUndefined(marginY)) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(mb)) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(ml)) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (!js.isUndefined(mr)) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (!js.isUndefined(mt)) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (!js.isUndefined(mx)) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (!js.isUndefined(my)) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowX)) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowY)) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (!js.isUndefined(p)) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingBottom)) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeft)) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingRight)) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTop)) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingX)) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingY)) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (!js.isUndefined(pb)) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (!js.isUndefined(pl)) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (!js.isUndefined(pr)) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (!js.isUndefined(pt)) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (!js.isUndefined(px)) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (!js.isUndefined(py)) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sx)) __obj.updateDynamic("sx")(sx.asInstanceOf[js.Any])
    if (tx != null) __obj.updateDynamic("tx")(tx.asInstanceOf[js.Any])
    if (!js.isUndefined(variant)) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalAlign)) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelKnownProps]
  }
}

