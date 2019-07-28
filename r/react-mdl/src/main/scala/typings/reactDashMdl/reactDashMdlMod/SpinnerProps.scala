package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps
  extends HTMLProps[js.Any] {
  var singleColor: js.UndefOr[Boolean] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[js.Any] = null, singleColor: js.UndefOr[Boolean] = js.undefined): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(singleColor)) __obj.updateDynamic("singleColor")(singleColor)
    __obj.asInstanceOf[SpinnerProps]
  }
}

