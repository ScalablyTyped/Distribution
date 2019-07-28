package typings.reactDashFrontload.reactDashFrontloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrontloadConnectOptions extends js.Object {
  var noServerRender: js.UndefOr[Boolean] = js.undefined
  var onMount: js.UndefOr[Boolean] = js.undefined
  var onUpdate: js.UndefOr[Boolean] = js.undefined
}

object FrontloadConnectOptions {
  @scala.inline
  def apply(
    noServerRender: js.UndefOr[Boolean] = js.undefined,
    onMount: js.UndefOr[Boolean] = js.undefined,
    onUpdate: js.UndefOr[Boolean] = js.undefined
  ): FrontloadConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noServerRender)) __obj.updateDynamic("noServerRender")(noServerRender)
    if (!js.isUndefined(onMount)) __obj.updateDynamic("onMount")(onMount)
    if (!js.isUndefined(onUpdate)) __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.asInstanceOf[FrontloadConnectOptions]
  }
}

