package typings
package reactDashBootstrapLib.libColMod.ColNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libColMod.Col] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var lg: js.UndefOr[scala.Double] = js.undefined
  var lgHidden: js.UndefOr[scala.Boolean] = js.undefined
  var lgOffset: js.UndefOr[scala.Double] = js.undefined
  var lgPull: js.UndefOr[scala.Double] = js.undefined
  var lgPush: js.UndefOr[scala.Double] = js.undefined
  var md: js.UndefOr[scala.Double] = js.undefined
  var mdHidden: js.UndefOr[scala.Boolean] = js.undefined
  var mdOffset: js.UndefOr[scala.Double] = js.undefined
  var mdPull: js.UndefOr[scala.Double] = js.undefined
  var mdPush: js.UndefOr[scala.Double] = js.undefined
  var sm: js.UndefOr[scala.Double] = js.undefined
  var smHidden: js.UndefOr[scala.Boolean] = js.undefined
  var smOffset: js.UndefOr[scala.Double] = js.undefined
  var smPull: js.UndefOr[scala.Double] = js.undefined
  var smPush: js.UndefOr[scala.Double] = js.undefined
  var xs: js.UndefOr[scala.Double] = js.undefined
  var xsHidden: js.UndefOr[scala.Boolean] = js.undefined
  var xsOffset: js.UndefOr[scala.Double] = js.undefined
  var xsPull: js.UndefOr[scala.Double] = js.undefined
  var xsPush: js.UndefOr[scala.Double] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libColMod.Col] = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    lg: scala.Int | scala.Double = null,
    lgHidden: js.UndefOr[scala.Boolean] = js.undefined,
    lgOffset: scala.Int | scala.Double = null,
    lgPull: scala.Int | scala.Double = null,
    lgPush: scala.Int | scala.Double = null,
    md: scala.Int | scala.Double = null,
    mdHidden: js.UndefOr[scala.Boolean] = js.undefined,
    mdOffset: scala.Int | scala.Double = null,
    mdPull: scala.Int | scala.Double = null,
    mdPush: scala.Int | scala.Double = null,
    sm: scala.Int | scala.Double = null,
    smHidden: js.UndefOr[scala.Boolean] = js.undefined,
    smOffset: scala.Int | scala.Double = null,
    smPull: scala.Int | scala.Double = null,
    smPush: scala.Int | scala.Double = null,
    xs: scala.Int | scala.Double = null,
    xsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    xsOffset: scala.Int | scala.Double = null,
    xsPull: scala.Int | scala.Double = null,
    xsPush: scala.Int | scala.Double = null
  ): ColProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (!js.isUndefined(lgHidden)) __obj.updateDynamic("lgHidden")(lgHidden)
    if (lgOffset != null) __obj.updateDynamic("lgOffset")(lgOffset.asInstanceOf[js.Any])
    if (lgPull != null) __obj.updateDynamic("lgPull")(lgPull.asInstanceOf[js.Any])
    if (lgPush != null) __obj.updateDynamic("lgPush")(lgPush.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (!js.isUndefined(mdHidden)) __obj.updateDynamic("mdHidden")(mdHidden)
    if (mdOffset != null) __obj.updateDynamic("mdOffset")(mdOffset.asInstanceOf[js.Any])
    if (mdPull != null) __obj.updateDynamic("mdPull")(mdPull.asInstanceOf[js.Any])
    if (mdPush != null) __obj.updateDynamic("mdPush")(mdPush.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (!js.isUndefined(smHidden)) __obj.updateDynamic("smHidden")(smHidden)
    if (smOffset != null) __obj.updateDynamic("smOffset")(smOffset.asInstanceOf[js.Any])
    if (smPull != null) __obj.updateDynamic("smPull")(smPull.asInstanceOf[js.Any])
    if (smPush != null) __obj.updateDynamic("smPush")(smPush.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (!js.isUndefined(xsHidden)) __obj.updateDynamic("xsHidden")(xsHidden)
    if (xsOffset != null) __obj.updateDynamic("xsOffset")(xsOffset.asInstanceOf[js.Any])
    if (xsPull != null) __obj.updateDynamic("xsPull")(xsPull.asInstanceOf[js.Any])
    if (xsPush != null) __obj.updateDynamic("xsPush")(xsPush.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

