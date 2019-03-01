package typings
package rrcLib.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhenActiveOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var isActive: js.UndefOr[IsActiveCallback] = js.undefined
  var pathProp: js.UndefOr[java.lang.String] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object WhenActiveOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    isActive: IsActiveCallback = null,
    pathProp: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): WhenActiveOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (isActive != null) __obj.updateDynamic("isActive")(isActive)
    if (pathProp != null) __obj.updateDynamic("pathProp")(pathProp)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[WhenActiveOptions]
  }
}

