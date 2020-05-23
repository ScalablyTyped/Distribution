package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  var filters: js.UndefOr[Variables] = js.undefined
  var key: String
  var rangeBehavior: String
}

object Filters {
  @scala.inline
  def apply(key: String, rangeBehavior: String, filters: Variables = null): Filters = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], rangeBehavior = rangeBehavior.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
}

