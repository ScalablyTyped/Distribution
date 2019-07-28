package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogActionsProps
  extends HTMLProps[js.Any] {
  var fullWidth: js.UndefOr[Boolean] = js.undefined
}

object DialogActionsProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[js.Any] = null, fullWidth: js.UndefOr[Boolean] = js.undefined): DialogActionsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    __obj.asInstanceOf[DialogActionsProps]
  }
}

