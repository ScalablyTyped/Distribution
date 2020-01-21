package typings.reflexbox.mod

import typings.csstype.mod.AlignContentProperty
import typings.csstype.mod.AlignItemsProperty
import typings.csstype.mod.AlignSelfProperty
import typings.csstype.mod.BackgroundProperty
import typings.csstype.mod.ColorProperty
import typings.csstype.mod.DisplayProperty
import typings.csstype.mod.FlexBasisProperty
import typings.csstype.mod.FlexDirectionProperty
import typings.csstype.mod.FlexProperty
import typings.csstype.mod.FlexWrapProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontSizeProperty
import typings.csstype.mod.FontStyleProperty
import typings.csstype.mod.FontWeightProperty
import typings.csstype.mod.GlobalsNumber
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.JustifyContentProperty
import typings.csstype.mod.JustifyItemsProperty
import typings.csstype.mod.JustifySelfProperty
import typings.csstype.mod.LetterSpacingProperty
import typings.csstype.mod.LineHeightProperty
import typings.csstype.mod.MarginBottomProperty
import typings.csstype.mod.MarginLeftProperty
import typings.csstype.mod.MarginProperty
import typings.csstype.mod.MarginRightProperty
import typings.csstype.mod.MarginTopProperty
import typings.csstype.mod.MaxHeightProperty
import typings.csstype.mod.MaxWidthProperty
import typings.csstype.mod.MinHeightProperty
import typings.csstype.mod.MinWidthProperty
import typings.csstype.mod.OverflowProperty
import typings.csstype.mod.OverflowXProperty
import typings.csstype.mod.OverflowYProperty
import typings.csstype.mod.PaddingBottomProperty
import typings.csstype.mod.PaddingLeftProperty
import typings.csstype.mod.PaddingProperty
import typings.csstype.mod.PaddingRightProperty
import typings.csstype.mod.PaddingTopProperty
import typings.csstype.mod.TextAlignProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.csstype.mod.WidthProperty
import typings.react.mod.ElementType
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
import typings.styledSystem.mod.ResponsiveValue
import typings.styledSystem.mod.SizeProps
import typings.styledSystem.mod.SpaceProps
import typings.styledSystem.mod.TLengthStyledSystem
import typings.styledSystem.mod.TextAlignProps
import typings.styledSystem.mod.TextColorProps
import typings.styledSystem.mod.VerticalAlignProps
import typings.styledSystem.mod.WidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps
  extends SpaceProps[TLengthStyledSystem]
     with WidthProps[TLengthStyledSystem]
     with HeightProps[TLengthStyledSystem]
     with MinWidthProps[TLengthStyledSystem]
     with MinHeightProps[TLengthStyledSystem]
     with MaxWidthProps[TLengthStyledSystem]
     with MaxHeightProps[TLengthStyledSystem]
     with DisplayProps
     with VerticalAlignProps[TLengthStyledSystem]
     with SizeProps[TLengthStyledSystem]
     with OverflowProps
     with FontFamilyProps
     with FontSizeProps[TLengthStyledSystem]
     with FontWeightProps
     with LineHeightProps[TLengthStyledSystem]
     with LetterSpacingProps[TLengthStyledSystem]
     with FontStyleProps
     with TextAlignProps
     with TextColorProps
     with BackgroundColorProps[TLengthStyledSystem]
     with OpacityProps
     with AlignItemsProps
     with AlignContentProps
     with JustifyItemsProps
     with JustifyContentProps
     with FlexWrapProps
     with FlexDirectionProps
     with FlexProps[TLengthStyledSystem]
     with FlexGrowProps
     with FlexShrinkProps
     with FlexBasisProps[TLengthStyledSystem]
     with JustifySelfProps
     with AlignSelfProps
     with OrderProps {
  var as: js.UndefOr[ElementType[_]] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    alignContent: ResponsiveValue[AlignContentProperty] = null,
    alignItems: ResponsiveValue[AlignItemsProperty] = null,
    alignSelf: ResponsiveValue[AlignSelfProperty] = null,
    as: ElementType[_] = null,
    backgroundColor: ResponsiveValue[BackgroundProperty[TLengthStyledSystem]] = null,
    bg: ResponsiveValue[BackgroundProperty[TLengthStyledSystem]] = null,
    color: ResponsiveValue[ColorProperty] = null,
    display: ResponsiveValue[DisplayProperty] = null,
    flex: ResponsiveValue[FlexProperty[TLengthStyledSystem]] = null,
    flexBasis: ResponsiveValue[FlexBasisProperty[TLengthStyledSystem]] = null,
    flexDirection: ResponsiveValue[FlexDirectionProperty] = null,
    flexGrow: ResponsiveValue[GlobalsNumber] = null,
    flexShrink: ResponsiveValue[GlobalsNumber] = null,
    flexWrap: ResponsiveValue[FlexWrapProperty] = null,
    fontFamily: ResponsiveValue[FontFamilyProperty] = null,
    fontSize: ResponsiveValue[FontSizeProperty[TLengthStyledSystem]] = null,
    fontStyle: ResponsiveValue[FontStyleProperty] = null,
    fontWeight: ResponsiveValue[FontWeightProperty] = null,
    height: ResponsiveValue[HeightProperty[TLengthStyledSystem]] = null,
    justifyContent: ResponsiveValue[JustifyContentProperty] = null,
    justifyItems: ResponsiveValue[JustifyItemsProperty] = null,
    justifySelf: ResponsiveValue[JustifySelfProperty] = null,
    letterSpacing: ResponsiveValue[LetterSpacingProperty[TLengthStyledSystem]] = null,
    lineHeight: ResponsiveValue[LineHeightProperty[TLengthStyledSystem]] = null,
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
    size: ResponsiveValue[HeightProperty[TLengthStyledSystem]] = null,
    textAlign: ResponsiveValue[TextAlignProperty] = null,
    verticalAlign: ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem]] = null,
    width: ResponsiveValue[WidthProperty[TLengthStyledSystem]] = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
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
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

