package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikEngineapi.qlikEngineapiStrings.JsonRequest
  - typings.qlikEngineapi.qlikEngineapiStrings.GetCustomCaption
  - typings.qlikEngineapi.qlikEngineapiStrings.IsConnected
  - typings.qlikEngineapi.qlikEngineapiStrings.DisableQlikViewSelectButton
  - typings.qlikEngineapi.qlikEngineapiStrings.HaveStarField
*/
trait CommandType extends js.Object

object CommandType {
  @scala.inline
  def DisableQlikViewSelectButton: typings.qlikEngineapi.qlikEngineapiStrings.DisableQlikViewSelectButton = this.cast("DisableQlikViewSelectButton")
  @scala.inline
  def GetCustomCaption: typings.qlikEngineapi.qlikEngineapiStrings.GetCustomCaption = this.cast("GetCustomCaption")
  @scala.inline
  def HaveStarField: typings.qlikEngineapi.qlikEngineapiStrings.HaveStarField = this.cast("HaveStarField")
  @scala.inline
  def IsConnected: typings.qlikEngineapi.qlikEngineapiStrings.IsConnected = this.cast("IsConnected")
  @scala.inline
  def JsonRequest: typings.qlikEngineapi.qlikEngineapiStrings.JsonRequest = this.cast("JsonRequest")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

