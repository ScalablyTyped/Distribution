package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiStrings.development
import typings.atStorybookApi.atStorybookApiStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Development extends js.Object {
  var mode: js.UndefOr[production | development] = js.undefined
}

object Anon_Development {
  @scala.inline
  def apply(mode: production | development = null): Anon_Development = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Development]
  }
}

