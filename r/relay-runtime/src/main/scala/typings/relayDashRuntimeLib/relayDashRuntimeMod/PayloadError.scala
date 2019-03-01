package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadError extends js.Object {
  var locations: js.UndefOr[js.Array[relayDashRuntimeLib.Anon_Column]] = js.undefined
  var message: java.lang.String
}

object PayloadError {
  @scala.inline
  def apply(message: java.lang.String, locations: js.Array[relayDashRuntimeLib.Anon_Column] = null): PayloadError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[PayloadError]
  }
}

