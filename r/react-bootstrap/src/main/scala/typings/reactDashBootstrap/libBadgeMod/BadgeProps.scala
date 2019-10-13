package typings.reactDashBootstrap.libBadgeMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps
  extends AllHTMLAttributes[Badge]
     with ClassAttributes[Badge] {
  var bsClass: js.UndefOr[String] = js.undefined
  var pullRight: js.UndefOr[Boolean] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Badge] = null,
    ClassAttributes: ClassAttributes[Badge] = null,
    bsClass: String = null,
    pullRight: js.UndefOr[Boolean] = js.undefined
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[BadgeProps]
  }
}

