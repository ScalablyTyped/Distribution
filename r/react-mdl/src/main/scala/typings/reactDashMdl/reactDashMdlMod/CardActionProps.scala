package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardActionProps
  extends HTMLProps[js.Any] {
  var border: js.UndefOr[Boolean] = js.undefined
}

object CardActionProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[js.Any] = null, border: js.UndefOr[Boolean] = js.undefined): CardActionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[CardActionProps]
  }
}

