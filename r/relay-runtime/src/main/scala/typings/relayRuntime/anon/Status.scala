package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.stale
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends OperationAvailability {
  var status: stale
}

object Status {
  @scala.inline
  def apply(status: stale): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

