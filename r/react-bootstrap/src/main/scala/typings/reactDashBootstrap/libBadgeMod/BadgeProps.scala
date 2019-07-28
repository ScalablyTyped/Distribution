package typings.reactDashBootstrap.libBadgeMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends HTMLProps[Badge] {
  var bsClass: js.UndefOr[String] = js.undefined
  var pullRight: js.UndefOr[Boolean] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[Badge] = null,
    bsClass: String = null,
    pullRight: js.UndefOr[Boolean] = js.undefined
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[BadgeProps]
  }
}

