package typings.relayDashRuntime

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends js.Object {
  var filters: js.UndefOr[Variables] = js.undefined
  var key: String
  var rangeBehavior: String
}

object Anon_Filters {
  @scala.inline
  def apply(key: String, rangeBehavior: String, filters: Variables = null): Anon_Filters = {
    val __obj = js.Dynamic.literal(key = key, rangeBehavior = rangeBehavior)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[Anon_Filters]
  }
}

