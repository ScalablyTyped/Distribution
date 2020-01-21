package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikEngineapi.qlikEngineapiStrings.Add
  - typings.qlikEngineapi.qlikEngineapiStrings.Remove
  - typings.qlikEngineapi.qlikEngineapiStrings.Replace
*/
trait NxPatchOpType extends js.Object

object NxPatchOpType {
  @scala.inline
  def Add: typings.qlikEngineapi.qlikEngineapiStrings.Add = this.cast("Add")
  @scala.inline
  def Remove: typings.qlikEngineapi.qlikEngineapiStrings.Remove = this.cast("Remove")
  @scala.inline
  def Replace: typings.qlikEngineapi.qlikEngineapiStrings.Replace = this.cast("Replace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

