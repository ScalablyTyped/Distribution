package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - N for NOT_META
  * - D for META_DOC_NAME
  * - R for META_RET_TYPE
  */
/* Rewritten from type alias, can be one of: 
  - typings.qlikEngineapi.qlikEngineapiStrings.N
  - typings.qlikEngineapi.qlikEngineapiStrings.D
  - typings.qlikEngineapi.qlikEngineapiStrings.R
*/
trait MTType extends js.Object

object MTType {
  @scala.inline
  def D: typings.qlikEngineapi.qlikEngineapiStrings.D = this.cast("D")
  @scala.inline
  def N: typings.qlikEngineapi.qlikEngineapiStrings.N = this.cast("N")
  @scala.inline
  def R: typings.qlikEngineapi.qlikEngineapiStrings.R = this.cast("R")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

