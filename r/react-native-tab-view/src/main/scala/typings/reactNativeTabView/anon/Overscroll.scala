package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overscroll extends js.Object {
  var overscroll: js.UndefOr[Boolean] = js.undefined
}

object Overscroll {
  @scala.inline
  def apply(overscroll: js.UndefOr[Boolean] = js.undefined): Overscroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overscroll)) __obj.updateDynamic("overscroll")(overscroll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overscroll]
  }
}

