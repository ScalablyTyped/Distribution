package typings.qlikDashEngineapi.EngineAPI

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
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.N
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.D
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.R
*/
trait MTType extends js.Object

object MTType {
  @scala.inline
  def D: typings.qlikDashEngineapi.qlikDashEngineapiStrings.D = this.cast("D")
  @scala.inline
  def N: typings.qlikDashEngineapi.qlikDashEngineapiStrings.N = this.cast("N")
  @scala.inline
  def R: typings.qlikDashEngineapi.qlikDashEngineapiStrings.R = this.cast("R")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

