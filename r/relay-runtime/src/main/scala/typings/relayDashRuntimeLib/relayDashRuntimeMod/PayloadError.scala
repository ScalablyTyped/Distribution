package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadError extends js.Object {
  var locations: js.UndefOr[js.Array[relayDashRuntimeLib.Anon_Column]] = js.undefined
  var message: java.lang.String
  var severity: js.UndefOr[
    relayDashRuntimeLib.relayDashRuntimeLibStrings.CRITICAL | relayDashRuntimeLib.relayDashRuntimeLibStrings.ERROR | relayDashRuntimeLib.relayDashRuntimeLibStrings.WARNING
  ] = js.undefined
}

object PayloadError {
  @scala.inline
  def apply(
    message: java.lang.String,
    locations: js.Array[relayDashRuntimeLib.Anon_Column] = null,
    severity: relayDashRuntimeLib.relayDashRuntimeLibStrings.CRITICAL | relayDashRuntimeLib.relayDashRuntimeLibStrings.ERROR | relayDashRuntimeLib.relayDashRuntimeLibStrings.WARNING = null
  ): PayloadError = {
    val __obj = js.Dynamic.literal(message = message)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadError]
  }
}

