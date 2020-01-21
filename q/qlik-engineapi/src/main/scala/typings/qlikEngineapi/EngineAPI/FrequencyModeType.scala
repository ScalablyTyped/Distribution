package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - NX_FREQUENCY_NONE
  * - NX_FREQUENCY_VALUE
  * - NX_FREQUENCY_PERCENT. The percentage is between 0 and 100.
  * - NX_FREQUENCY_RELATIVE. Same as percent except that the relative value is between 0 and 1.
  */
/* Rewritten from type alias, can be one of: 
  - typings.qlikEngineapi.qlikEngineapiStrings.NX_FREQUENCY_NONE
  - typings.qlikEngineapi.qlikEngineapiStrings.NX_FREQUENCY_VALUE
  - typings.qlikEngineapi.qlikEngineapiStrings.NX_FREQUENCY_PERCENT
  - typings.qlikEngineapi.qlikEngineapiStrings.NX_FREQUENCY_RELATIVE
*/
trait FrequencyModeType extends js.Object

object FrequencyModeType {
  @scala.inline
  def NX_FREQUENCY_NONE: typings.qlikEngineapi.qlikEngineapiStrings.NX_FREQUENCY_NONE = this.cast("NX_FREQUENCY_NONE")
  @scala.inline
  def NX_FREQUENCY_PERCENT: typings.qlikEngineapi.qlikEngineapiStrings.NX_FREQUENCY_PERCENT = this.cast("NX_FREQUENCY_PERCENT")
  @scala.inline
  def NX_FREQUENCY_RELATIVE: typings.qlikEngineapi.qlikEngineapiStrings.NX_FREQUENCY_RELATIVE = this.cast("NX_FREQUENCY_RELATIVE")
  @scala.inline
  def NX_FREQUENCY_VALUE: typings.qlikEngineapi.qlikEngineapiStrings.NX_FREQUENCY_VALUE = this.cast("NX_FREQUENCY_VALUE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

