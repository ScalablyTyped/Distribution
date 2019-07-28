package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends HTMLProps[js.Any] {
  var threeLine: js.UndefOr[Boolean] = js.undefined
  var twoLine: js.UndefOr[Boolean] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[js.Any] = null,
    threeLine: js.UndefOr[Boolean] = js.undefined,
    twoLine: js.UndefOr[Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(threeLine)) __obj.updateDynamic("threeLine")(threeLine)
    if (!js.isUndefined(twoLine)) __obj.updateDynamic("twoLine")(twoLine)
    __obj.asInstanceOf[ListItemProps]
  }
}

