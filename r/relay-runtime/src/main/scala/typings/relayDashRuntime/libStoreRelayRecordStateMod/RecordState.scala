package typings.relayDashRuntime.libStoreRelayRecordStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayDashRuntime.relayDashRuntimeStrings.EXISTENT
  - typings.relayDashRuntime.relayDashRuntimeStrings.NONEXISTENT
  - typings.relayDashRuntime.relayDashRuntimeStrings.UNKNOWN
*/
trait RecordState extends js.Object

object RecordState {
  @scala.inline
  def EXISTENT: typings.relayDashRuntime.relayDashRuntimeStrings.EXISTENT = this.cast("EXISTENT")
  @scala.inline
  def NONEXISTENT: typings.relayDashRuntime.relayDashRuntimeStrings.NONEXISTENT = this.cast("NONEXISTENT")
  @scala.inline
  def UNKNOWN: typings.relayDashRuntime.relayDashRuntimeStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

