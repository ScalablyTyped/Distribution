package typings.ravenDashJs.ravenDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenInstrumentationOptions extends js.Object {
  var tryCatch: js.UndefOr[Boolean] = js.undefined
}

object RavenInstrumentationOptions {
  @scala.inline
  def apply(tryCatch: js.UndefOr[Boolean] = js.undefined): RavenInstrumentationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tryCatch)) __obj.updateDynamic("tryCatch")(tryCatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RavenInstrumentationOptions]
  }
}

