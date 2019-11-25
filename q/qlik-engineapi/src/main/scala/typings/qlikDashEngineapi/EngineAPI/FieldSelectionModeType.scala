package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.NORMAL
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.AND
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.NOT
*/
trait FieldSelectionModeType extends js.Object

object FieldSelectionModeType {
  @scala.inline
  def AND: typings.qlikDashEngineapi.qlikDashEngineapiStrings.AND = this.cast("AND")
  @scala.inline
  def NORMAL: typings.qlikDashEngineapi.qlikDashEngineapiStrings.NORMAL = this.cast("NORMAL")
  @scala.inline
  def NOT: typings.qlikDashEngineapi.qlikDashEngineapiStrings.NOT = this.cast("NOT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

