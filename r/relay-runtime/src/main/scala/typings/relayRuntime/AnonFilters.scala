package typings.relayRuntime

import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilters extends js.Object {
  var filters: js.UndefOr[Variables] = js.undefined
  var key: String
  var rangeBehavior: String
}

object AnonFilters {
  @scala.inline
  def apply(key: String, rangeBehavior: String, filters: Variables = null): AnonFilters = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], rangeBehavior = rangeBehavior.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilters]
  }
}

