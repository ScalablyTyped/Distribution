package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikEngineapi.qlikEngineapiStrings.NORMAL
  - typings.qlikEngineapi.qlikEngineapiStrings.AND
  - typings.qlikEngineapi.qlikEngineapiStrings.NOT
*/
trait FieldSelectionModeType extends js.Object

object FieldSelectionModeType {
  @scala.inline
  def AND: typings.qlikEngineapi.qlikEngineapiStrings.AND = this.cast("AND")
  @scala.inline
  def NORMAL: typings.qlikEngineapi.qlikEngineapiStrings.NORMAL = this.cast("NORMAL")
  @scala.inline
  def NOT: typings.qlikEngineapi.qlikEngineapiStrings.NOT = this.cast("NOT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

