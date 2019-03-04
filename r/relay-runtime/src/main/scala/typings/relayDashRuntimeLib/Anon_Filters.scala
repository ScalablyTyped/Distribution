package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends js.Object {
  var filters: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.Variables] = js.undefined
  var key: java.lang.String
  var rangeBehavior: java.lang.String
}

object Anon_Filters {
  @scala.inline
  def apply(
    key: java.lang.String,
    rangeBehavior: java.lang.String,
    filters: relayDashRuntimeLib.relayDashRuntimeMod.Variables = null
  ): Anon_Filters = {
    val __obj = js.Dynamic.literal(key = key, rangeBehavior = rangeBehavior)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[Anon_Filters]
  }
}

