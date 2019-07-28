package typings.reduxDashFirstDashRouterDashLink.reduxDashFirstDashRouterDashLinkMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends HTMLAttributes[HTMLElement] {
  var down: js.UndefOr[Boolean] = js.undefined
  var redirect: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var shouldDispatch: js.UndefOr[Boolean] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var to: To
}

object LinkProps {
  @scala.inline
  def apply(
    to: To,
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    down: js.UndefOr[Boolean] = js.undefined,
    redirect: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    shouldDispatch: js.UndefOr[Boolean] = js.undefined,
    tagName: String = null,
    target: String = null
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

