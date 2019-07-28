package typings.reactDashBootstrap.libClearfixMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearfixProps extends HTMLProps[Clearfix] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var visibleLgBlock: js.UndefOr[Boolean] = js.undefined
  var visibleMdBlock: js.UndefOr[Boolean] = js.undefined
  var visibleSmBlock: js.UndefOr[Boolean] = js.undefined
  var visibleXsBlock: js.UndefOr[Boolean] = js.undefined
}

object ClearfixProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[Clearfix] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    visibleLgBlock: js.UndefOr[Boolean] = js.undefined,
    visibleMdBlock: js.UndefOr[Boolean] = js.undefined,
    visibleSmBlock: js.UndefOr[Boolean] = js.undefined,
    visibleXsBlock: js.UndefOr[Boolean] = js.undefined
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

