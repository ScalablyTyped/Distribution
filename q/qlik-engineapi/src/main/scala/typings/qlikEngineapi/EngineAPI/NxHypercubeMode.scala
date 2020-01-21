package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - S for DATA_MODE_STRAIGHT; straight table representation
  * - P for DATA_MODE_PIVOT; pivot table representation
  * - K for DATA_MODE_PIVOT_STACK; stacked table representation
  * - T for DATA_MODE_TREE; tree representation
  */
/* Rewritten from type alias, can be one of: 
  - typings.qlikEngineapi.qlikEngineapiStrings.S
  - typings.qlikEngineapi.qlikEngineapiStrings.P
  - typings.qlikEngineapi.qlikEngineapiStrings.K
  - typings.qlikEngineapi.qlikEngineapiStrings.T
*/
trait NxHypercubeMode extends js.Object

object NxHypercubeMode {
  @scala.inline
  def K: typings.qlikEngineapi.qlikEngineapiStrings.K = this.cast("K")
  @scala.inline
  def P: typings.qlikEngineapi.qlikEngineapiStrings.P = this.cast("P")
  @scala.inline
  def S: typings.qlikEngineapi.qlikEngineapiStrings.S = this.cast("S")
  @scala.inline
  def T: typings.qlikEngineapi.qlikEngineapiStrings.T = this.cast("T")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

