package typings.rrc.rrcMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhenActiveOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var isActive: js.UndefOr[IsActiveCallback] = js.undefined
  var pathProp: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object WhenActiveOptions {
  @scala.inline
  def apply(
    className: String = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    isActive: () => Boolean = null,
    pathProp: String = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): WhenActiveOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (isActive != null) __obj.updateDynamic("isActive")(js.Any.fromFunction0(isActive))
    if (pathProp != null) __obj.updateDynamic("pathProp")(pathProp)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[WhenActiveOptions]
  }
}

