package typings
package reactDashBootstrapLib.libClearfixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearfixProps
  extends reactLib.reactMod.HTMLProps[Clearfix] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var visibleLgBlock: js.UndefOr[scala.Boolean] = js.undefined
  var visibleMdBlock: js.UndefOr[scala.Boolean] = js.undefined
  var visibleSmBlock: js.UndefOr[scala.Boolean] = js.undefined
  var visibleXsBlock: js.UndefOr[scala.Boolean] = js.undefined
}

object ClearfixProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Clearfix] = null,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactType[_] = null,
    visibleLgBlock: js.UndefOr[scala.Boolean] = js.undefined,
    visibleMdBlock: js.UndefOr[scala.Boolean] = js.undefined,
    visibleSmBlock: js.UndefOr[scala.Boolean] = js.undefined,
    visibleXsBlock: js.UndefOr[scala.Boolean] = js.undefined
  ): ClearfixProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleLgBlock)) __obj.updateDynamic("visibleLgBlock")(visibleLgBlock)
    if (!js.isUndefined(visibleMdBlock)) __obj.updateDynamic("visibleMdBlock")(visibleMdBlock)
    if (!js.isUndefined(visibleSmBlock)) __obj.updateDynamic("visibleSmBlock")(visibleSmBlock)
    if (!js.isUndefined(visibleXsBlock)) __obj.updateDynamic("visibleXsBlock")(visibleXsBlock)
    __obj.asInstanceOf[ClearfixProps]
  }
}

