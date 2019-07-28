package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTitleProps
  extends HTMLProps[js.Any] {
  var expand: js.UndefOr[Boolean] = js.undefined
}

object CardTitleProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[js.Any] = null, expand: js.UndefOr[Boolean] = js.undefined): CardTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    __obj.asInstanceOf[CardTitleProps]
  }
}

