package typings.rebass.rebassMod

import typings.csstype.csstypeMod.AlignSelfProperty
import typings.csstype.csstypeMod.BackgroundProperty
import typings.csstype.csstypeMod.ColorProperty
import typings.csstype.csstypeMod.DisplayProperty
import typings.csstype.csstypeMod.FlexProperty
import typings.csstype.csstypeMod.FontSizeProperty
import typings.csstype.csstypeMod.GlobalsNumber
import typings.csstype.csstypeMod.HeightProperty
import typings.csstype.csstypeMod.MarginBottomProperty
import typings.csstype.csstypeMod.MarginLeftProperty
import typings.csstype.csstypeMod.MarginProperty
import typings.csstype.csstypeMod.MarginRightProperty
import typings.csstype.csstypeMod.MarginTopProperty
import typings.csstype.csstypeMod.MaxHeightProperty
import typings.csstype.csstypeMod.MaxWidthProperty
import typings.csstype.csstypeMod.MinHeightProperty
import typings.csstype.csstypeMod.MinWidthProperty
import typings.csstype.csstypeMod.OverflowProperty
import typings.csstype.csstypeMod.OverflowXProperty
import typings.csstype.csstypeMod.OverflowYProperty
import typings.csstype.csstypeMod.PaddingBottomProperty
import typings.csstype.csstypeMod.PaddingLeftProperty
import typings.csstype.csstypeMod.PaddingProperty
import typings.csstype.csstypeMod.PaddingRightProperty
import typings.csstype.csstypeMod.PaddingTopProperty
import typings.csstype.csstypeMod.VerticalAlignProperty
import typings.csstype.csstypeMod.WidthProperty
import typings.react.reactMod.ElementType
import typings.react.reactMod.Key
import typings.react.reactMod.Ref
import typings.styledDashComponents.styledDashComponentsMod.CSSObject
import typings.styledDashComponents.styledDashComponentsMod.FlattenSimpleInterpolation
import typings.styledDashSystem.styledDashSystemMod.ResponsiveValue
import typings.styledDashSystem.styledDashSystemMod.TLengthStyledSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLAnchorElement>, keyof rebass.rebass.LinkKnownProps> ]: react.react.HTMLProps<std.HTMLAnchorElement>[P]} */ trait LinkProps extends BoxKnownProps

object LinkProps {
  @scala.inline
  def apply(
    alignSelf: ResponsiveValue[AlignSelfProperty] = null,
    as: ElementType[_] = null,
    backgroundColor: ResponsiveValue[BackgroundProperty[TLengthStyledSystem]] = null,
    bg: ResponsiveValue[BackgroundProperty[TLengthStyledSystem]] = null,
    color: ResponsiveValue[ColorProperty] = null,
    css: CSSObject | FlattenSimpleInterpolation | String = null,
    display: ResponsiveValue[DisplayProperty] = null,
    flex: ResponsiveValue[FlexProperty[TLengthStyledSystem]] = null,
    fontSize: ResponsiveValue[FontSizeProperty[TLengthStyledSystem]] = null,
    height: ResponsiveValue[HeightProperty[TLengthStyledSystem]] = null,
    key: Key = null,
    m: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    margin: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    marginBottom: ResponsiveValue[MarginBottomProperty[TLengthStyledSystem]] = null,
    marginLeft: ResponsiveValue[MarginLeftProperty[TLengthStyledSystem]] = null,
    marginRight: ResponsiveValue[MarginRightProperty[TLengthStyledSystem]] = null,
    marginTop: ResponsiveValue[MarginTopProperty[TLengthStyledSystem]] = null,
    marginX: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    marginY: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    maxHeight: ResponsiveValue[MaxHeightProperty[TLengthStyledSystem]] = null,
    maxWidth: ResponsiveValue[MaxWidthProperty[TLengthStyledSystem]] = null,
    mb: ResponsiveValue[MarginBottomProperty[TLengthStyledSystem]] = null,
    minHeight: ResponsiveValue[MinHeightProperty[TLengthStyledSystem]] = null,
    minWidth: ResponsiveValue[MinWidthProperty[TLengthStyledSystem]] = null,
    ml: ResponsiveValue[MarginLeftProperty[TLengthStyledSystem]] = null,
    mr: ResponsiveValue[MarginRightProperty[TLengthStyledSystem]] = null,
    mt: ResponsiveValue[MarginTopProperty[TLengthStyledSystem]] = null,
    mx: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    my: ResponsiveValue[MarginProperty[TLengthStyledSystem]] = null,
    opacity: ResponsiveValue[GlobalsNumber] = null,
    order: ResponsiveValue[GlobalsNumber] = null,
    overflow: ResponsiveValue[OverflowProperty] = null,
    overflowX: ResponsiveValue[OverflowXProperty] = null,
    overflowY: ResponsiveValue[OverflowYProperty] = null,
    p: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    padding: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    paddingBottom: ResponsiveValue[PaddingBottomProperty[TLengthStyledSystem]] = null,
    paddingLeft: ResponsiveValue[PaddingLeftProperty[TLengthStyledSystem]] = null,
    paddingRight: ResponsiveValue[PaddingRightProperty[TLengthStyledSystem]] = null,
    paddingTop: ResponsiveValue[PaddingTopProperty[TLengthStyledSystem]] = null,
    paddingX: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    paddingY: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    pb: ResponsiveValue[PaddingBottomProperty[TLengthStyledSystem]] = null,
    pl: ResponsiveValue[PaddingLeftProperty[TLengthStyledSystem]] = null,
    pr: ResponsiveValue[PaddingRightProperty[TLengthStyledSystem]] = null,
    pt: ResponsiveValue[PaddingTopProperty[TLengthStyledSystem]] = null,
    px: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    py: ResponsiveValue[PaddingProperty[TLengthStyledSystem]] = null,
    ref: Ref[js.Any] = null,
    size: ResponsiveValue[HeightProperty[TLengthStyledSystem]] = null,
    sx: SxStyleProp = null,
    tx: String = null,
    variant: ResponsiveValue[String] = null,
    verticalAlign: ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem]] = null,
    width: ResponsiveValue[WidthProperty[TLengthStyledSystem]] = null
  ): LinkProps = {
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
    __obj.asInstanceOf[LinkProps]
  }
}

