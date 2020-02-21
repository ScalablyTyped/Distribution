package typings.reactNativeTabView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverscroll extends js.Object {
  var overscroll: js.UndefOr[Boolean] = js.undefined
}

object AnonOverscroll {
  @scala.inline
  def apply(overscroll: js.UndefOr[Boolean] = js.undefined): AnonOverscroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overscroll)) __obj.updateDynamic("overscroll")(overscroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverscroll]
  }
}

