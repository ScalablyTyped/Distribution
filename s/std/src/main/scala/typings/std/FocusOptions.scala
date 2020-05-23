package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusOptions extends js.Object {
  var preventScroll: js.UndefOr[scala.Boolean] = js.undefined
}

object FocusOptions {
  @scala.inline
  def apply(preventScroll: js.UndefOr[scala.Boolean] = js.undefined): FocusOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventScroll)) __obj.updateDynamic("preventScroll")(preventScroll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOptions]
  }
}

