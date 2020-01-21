package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartOpen extends js.Object {
  var startOpen: js.UndefOr[Boolean] = js.undefined
}

object AnonStartOpen {
  @scala.inline
  def apply(startOpen: js.UndefOr[Boolean] = js.undefined): AnonStartOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartOpen]
  }
}

