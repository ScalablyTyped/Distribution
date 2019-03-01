package typings
package rebassLib.rebassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxKnownProps
  extends styledDashSystemLib.styledDashSystemMod.ColorProps
     with BaseProps
     with styledDashSystemLib.styledDashSystemMod.SpaceProps[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
     with styledDashSystemLib.styledDashSystemMod.WidthProps[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
     with styledDashSystemLib.styledDashSystemMod.FontSizeProps[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
     with styledDashSystemLib.styledDashSystemMod.FlexProps[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
     with styledDashSystemLib.styledDashSystemMod.OrderProps
     with styledDashSystemLib.styledDashSystemMod.AlignSelfProps

object BoxKnownProps {
  @scala.inline
  def apply(
    alignSelf: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[csstypeLib.csstypeMod.AlignSelfProperty] = null,
    as: reactLib.reactMod.ReactNs.ReactType[_] = null,
    bg: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.BackgroundProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    color: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[csstypeLib.csstypeMod.ColorProperty] = null,
    css: styledDashComponentsLib.styledDashComponentsMod.CSSObject = null,
    flex: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.FlexProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    fontSize: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.FontSizeProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    m: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.MarginProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    mb: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.MarginBottomProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    ml: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.MarginLeftProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    mr: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.MarginRightProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    mt: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.MarginTopProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    mx: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.PaddingProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    my: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.PaddingProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    order: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[csstypeLib.GlobalsNumber] = null,
    p: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.PaddingProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    pb: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.PaddingBottomProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    pl: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.PaddingLeftProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    pr: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.PaddingRightProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    pt: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.PaddingTopProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    px: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.PaddingProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    py: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.PaddingProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[js.Any] = null,
    width: styledDashSystemLib.styledDashSystemMod.ResponsiveValue[
      csstypeLib.csstypeMod.WidthProperty[styledDashSystemLib.styledDashSystemMod.TLengthStyledSystem]
    ] = null
  ): BoxKnownProps = {
    val __obj = js.Dynamic.literal()
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css)
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxKnownProps]
  }
}

