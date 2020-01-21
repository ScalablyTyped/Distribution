package typings.relayRuntime.relayNetworkTypesMod

import typings.relayRuntime.AnonColumn
import typings.relayRuntime.relayRuntimeStrings.CRITICAL
import typings.relayRuntime.relayRuntimeStrings.ERROR
import typings.relayRuntime.relayRuntimeStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadError extends js.Object {
  var locations: js.UndefOr[js.Array[AnonColumn]] = js.undefined
  var message: String
  var severity: js.UndefOr[CRITICAL | ERROR | WARNING] = js.undefined
}

object PayloadError {
  @scala.inline
  def apply(
    message: String,
    locations: js.Array[AnonColumn] = null,
    severity: CRITICAL | ERROR | WARNING = null
  ): PayloadError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadError]
  }
}

