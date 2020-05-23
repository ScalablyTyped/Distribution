package typings.reactBootstrap.colMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
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
    lg: js.UndefOr[Double] = js.undefined,
    lgHidden: js.UndefOr[Boolean] = js.undefined,
    lgOffset: js.UndefOr[Double] = js.undefined,
    lgPull: js.UndefOr[Double] = js.undefined,
    lgPush: js.UndefOr[Double] = js.undefined,
    md: js.UndefOr[Double] = js.undefined,
    mdHidden: js.UndefOr[Boolean] = js.undefined,
    mdOffset: js.UndefOr[Double] = js.undefined,
    mdPull: js.UndefOr[Double] = js.undefined,
    mdPush: js.UndefOr[Double] = js.undefined,
    sm: js.UndefOr[Double] = js.undefined,
    smHidden: js.UndefOr[Boolean] = js.undefined,
    smOffset: js.UndefOr[Double] = js.undefined,
    smPull: js.UndefOr[Double] = js.undefined,
    smPush: js.UndefOr[Double] = js.undefined,
    xs: js.UndefOr[Double] = js.undefined,
    xsHidden: js.UndefOr[Boolean] = js.undefined,
    xsOffset: js.UndefOr[Double] = js.undefined,
    xsPull: js.UndefOr[Double] = js.undefined,
    xsPush: js.UndefOr[Double] = js.undefined
  ): ColProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(lg)) __obj.updateDynamic("lg")(lg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lgHidden)) __obj.updateDynamic("lgHidden")(lgHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lgOffset)) __obj.updateDynamic("lgOffset")(lgOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lgPull)) __obj.updateDynamic("lgPull")(lgPull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lgPush)) __obj.updateDynamic("lgPush")(lgPush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(md)) __obj.updateDynamic("md")(md.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mdHidden)) __obj.updateDynamic("mdHidden")(mdHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mdOffset)) __obj.updateDynamic("mdOffset")(mdOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mdPull)) __obj.updateDynamic("mdPull")(mdPull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mdPush)) __obj.updateDynamic("mdPush")(mdPush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sm)) __obj.updateDynamic("sm")(sm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smHidden)) __obj.updateDynamic("smHidden")(smHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smOffset)) __obj.updateDynamic("smOffset")(smOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smPull)) __obj.updateDynamic("smPull")(smPull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smPush)) __obj.updateDynamic("smPush")(smPush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xs)) __obj.updateDynamic("xs")(xs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xsHidden)) __obj.updateDynamic("xsHidden")(xsHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xsOffset)) __obj.updateDynamic("xsOffset")(xsOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xsPull)) __obj.updateDynamic("xsPull")(xsPull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xsPush)) __obj.updateDynamic("xsPush")(xsPush.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

