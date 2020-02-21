package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayRuntimeStrings.available
  - typings.relayRuntime.relayRuntimeStrings.stale
  - typings.relayRuntime.relayRuntimeStrings.missing
*/
trait OperationAvailability extends js.Object

object OperationAvailability {
  @scala.inline
  def available: typings.relayRuntime.relayRuntimeStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def missing: typings.relayRuntime.relayRuntimeStrings.missing = this.cast("missing")
  @scala.inline
  def stale: typings.relayRuntime.relayRuntimeStrings.stale = this.cast("stale")
}

