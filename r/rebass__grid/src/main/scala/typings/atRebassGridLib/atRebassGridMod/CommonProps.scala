package typings
package atRebassGridLib.atRebassGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var bg: js.UndefOr[ResponsiveProp] = js.undefined
  var color: js.UndefOr[ResponsiveProp] = js.undefined
  // this is actually more powerful than the plugin because of some limitations of the transform
  /**
    * This works even without babel-plugin-styled-components.
    */
  var css: js.UndefOr[styledDashComponentsLib.styledDashComponentsMod.Interpolation[_]] = js.undefined
  var fontSize: js.UndefOr[ResponsiveProp] = js.undefined
  var m: js.UndefOr[ResponsiveProp] = js.undefined
  var mb: js.UndefOr[ResponsiveProp] = js.undefined
  var ml: js.UndefOr[ResponsiveProp] = js.undefined
  var mr: js.UndefOr[ResponsiveProp] = js.undefined
  var mt: js.UndefOr[ResponsiveProp] = js.undefined
  var mx: js.UndefOr[ResponsiveProp] = js.undefined
  var my: js.UndefOr[ResponsiveProp] = js.undefined
  var p: js.UndefOr[ResponsiveProp] = js.undefined
  var pb: js.UndefOr[ResponsiveProp] = js.undefined
  var pl: js.UndefOr[ResponsiveProp] = js.undefined
  var pr: js.UndefOr[ResponsiveProp] = js.undefined
  var pt: js.UndefOr[ResponsiveProp] = js.undefined
  var px: js.UndefOr[ResponsiveProp] = js.undefined
  var py: js.UndefOr[ResponsiveProp] = js.undefined
  var theme: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[ResponsiveProp] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    bg: ResponsiveProp = null,
    color: ResponsiveProp = null,
    css: styledDashComponentsLib.styledDashComponentsMod.Interpolation[_] = null,
    fontSize: ResponsiveProp = null,
    m: ResponsiveProp = null,
    mb: ResponsiveProp = null,
    ml: ResponsiveProp = null,
    mr: ResponsiveProp = null,
    mt: ResponsiveProp = null,
    mx: ResponsiveProp = null,
    my: ResponsiveProp = null,
    p: ResponsiveProp = null,
    pb: ResponsiveProp = null,
    pl: ResponsiveProp = null,
    pr: ResponsiveProp = null,
    pt: ResponsiveProp = null,
    px: ResponsiveProp = null,
    py: ResponsiveProp = null,
    theme: js.Any = null,
    width: ResponsiveProp = null
  ): CommonProps = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
}

