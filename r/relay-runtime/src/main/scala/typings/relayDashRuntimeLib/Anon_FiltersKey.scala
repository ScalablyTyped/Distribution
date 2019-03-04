package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FiltersKey extends js.Object {
  var filters: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Variables] = js.undefined
  var key: java.lang.String
}

object Anon_FiltersKey {
  @scala.inline
  def apply(key: java.lang.String, filters: relayDashRuntimeLib.relayDashRuntimeMod.Variables = null): Anon_FiltersKey = {
    val __obj = js.Dynamic.literal(key = key)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[Anon_FiltersKey]
  }
}

