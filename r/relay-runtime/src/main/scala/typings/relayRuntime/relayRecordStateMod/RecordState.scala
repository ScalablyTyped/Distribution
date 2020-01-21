package typings.relayRuntime.relayRecordStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayRuntimeStrings.EXISTENT
  - typings.relayRuntime.relayRuntimeStrings.NONEXISTENT
  - typings.relayRuntime.relayRuntimeStrings.UNKNOWN
*/
trait RecordState extends js.Object

object RecordState {
  @scala.inline
  def EXISTENT: typings.relayRuntime.relayRuntimeStrings.EXISTENT = this.cast("EXISTENT")
  @scala.inline
  def NONEXISTENT: typings.relayRuntime.relayRuntimeStrings.NONEXISTENT = this.cast("NONEXISTENT")
  @scala.inline
  def UNKNOWN: typings.relayRuntime.relayRuntimeStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

