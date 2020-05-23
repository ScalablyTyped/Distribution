package typings.reactBootstrap.badgeMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

