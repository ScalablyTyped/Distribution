package typings.atStorybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StartOpen extends js.Object {
  var startOpen: js.UndefOr[Boolean] = js.undefined
}

object Anon_StartOpen {
  @scala.inline
  def apply(startOpen: js.UndefOr[Boolean] = js.undefined): Anon_StartOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StartOpen]
  }
}

