package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiMod.State
import typings.atStorybookApi.atStorybookApiStrings.development
import typings.atStorybookApi.atStorybookApiStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Development extends js.Object {
  var mode: js.UndefOr[production | development] = js.undefined
  var state: State
}

object Anon_Development {
  @scala.inline
  def apply(state: State, mode: production | development = null): Anon_Development = {
    val __obj = js.Dynamic.literal(state = state)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Development]
  }
}

