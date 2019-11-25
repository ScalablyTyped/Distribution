package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.Add
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.Remove
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.Replace
*/
trait NxPatchOpType extends js.Object

object NxPatchOpType {
  @scala.inline
  def Add: typings.qlikDashEngineapi.qlikDashEngineapiStrings.Add = this.cast("Add")
  @scala.inline
  def Remove: typings.qlikDashEngineapi.qlikDashEngineapiStrings.Remove = this.cast("Remove")
  @scala.inline
  def Replace: typings.qlikDashEngineapi.qlikDashEngineapiStrings.Replace = this.cast("Replace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

