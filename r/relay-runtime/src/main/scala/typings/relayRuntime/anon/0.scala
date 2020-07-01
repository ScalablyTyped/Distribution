package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.missing
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends OperationAvailability {
  var status: missing
}

object `0` {
  @scala.inline
  def apply(status: missing): `0` = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

