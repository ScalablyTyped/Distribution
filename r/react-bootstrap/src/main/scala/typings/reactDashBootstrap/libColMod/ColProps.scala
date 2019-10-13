package typings.reactDashBootstrap.libColMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps
  extends AllHTMLAttributes[Col]
     with ClassAttributes[Col] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var lg: js.UndefOr[Double] = js.undefined
  var lgHidden: js.UndefOr[Boolean] = js.undefined
  var lgOffset: js.UndefOr[Double] = js.undefined
  var lgPull: js.UndefOr[Double] = js.undefined
  var lgPush: js.UndefOr[Double] = js.undefined
  var md: js.UndefOr[Double] = js.undefined
  var mdHidden: js.UndefOr[Boolean] = js.undefined
  var mdOffset: js.UndefOr[Double] = js.undefined
  var mdPull: js.UndefOr[Double] = js.undefined
  var mdPush: js.UndefOr[Double] = js.undefined
  var sm: js.UndefOr[Double] = js.undefined
  var smHidden: js.UndefOr[Boolean] = js.undefined
  var smOffset: js.UndefOr[Double] = js.undefined
  var smPull: js.UndefOr[Double] = js.undefined
  var smPush: js.UndefOr[Double] = js.undefined
  var xs: js.UndefOr[Double] = js.undefined
  var xsHidden: js.UndefOr[Boolean] = js.undefined
  var xsOffset: js.UndefOr[Double] = js.undefined
  var xsPull: js.UndefOr[Double] = js.undefined
  var xsPush: js.UndefOr[Double] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Col] = null,
    ClassAttributes: ClassAttributes[Col] = null,
    componentClass: ReactType[_] = null,
    lg: Int | Double = null,
    lgHidden: js.UndefOr[Boolean] = js.undefined,
    lgOffset: Int | Double = null,
    lgPull: Int | Double = null,
    lgPush: Int | Double = null,
    md: Int | Double = null,
    mdHidden: js.UndefOr[Boolean] = js.undefined,
    mdOffset: Int | Double = null,
    mdPull: Int | Double = null,
    mdPush: Int | Double = null,
    sm: Int | Double = null,
    smHidden: js.UndefOr[Boolean] = js.undefined,
    smOffset: Int | Double = null,
    smPull: Int | Double = null,
    smPush: Int | Double = null,
    xs: Int | Double = null,
    xsHidden: js.UndefOr[Boolean] = js.undefined,
    xsOffset: Int | Double = null,
    xsPull: Int | Double = null,
    xsPush: Int | Double = null
  ): ColProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
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

