package typings
package reduxDashFirstDashRouterDashLinkLib.reduxDashFirstDashRouterDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] {
  var down: js.UndefOr[scala.Boolean] = js.undefined
  var redirect: js.UndefOr[scala.Boolean] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var shouldDispatch: js.UndefOr[scala.Boolean] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var to: To
}

object LinkProps {
  @scala.inline
  def apply(
    to: To,
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] = null,
    down: js.UndefOr[scala.Boolean] = js.undefined,
    redirect: js.UndefOr[scala.Boolean] = js.undefined,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    shouldDispatch: js.UndefOr[scala.Boolean] = js.undefined,
    tagName: java.lang.String = null,
    target: java.lang.String = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(down)) __obj.updateDynamic("down")(down)
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(shouldDispatch)) __obj.updateDynamic("shouldDispatch")(shouldDispatch)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[LinkProps]
  }
}

