package typings.relayDashRuntime

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FiltersKey extends js.Object {
  var filters: js.UndefOr[Variables] = js.undefined
  var key: String
}

object Anon_FiltersKey {
  @scala.inline
  def apply(key: String, filters: Variables = null): Anon_FiltersKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FiltersKey]
  }
}

