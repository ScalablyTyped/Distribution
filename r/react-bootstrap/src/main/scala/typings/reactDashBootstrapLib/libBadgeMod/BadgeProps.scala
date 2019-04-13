package typings
package reactDashBootstrapLib.libBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps
  extends reactLib.reactMod.HTMLProps[Badge] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var pullRight: js.UndefOr[scala.Boolean] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Badge] = null,
    bsClass: java.lang.String = null,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[BadgeProps]
  }
}

