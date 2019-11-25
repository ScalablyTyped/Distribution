package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.LOG_ON_SERVICE_USER
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.LOG_ON_CURRENT_USER
*/
trait LogonType extends js.Object

object LogonType {
  @scala.inline
  def LOG_ON_CURRENT_USER: typings.qlikDashEngineapi.qlikDashEngineapiStrings.LOG_ON_CURRENT_USER = this.cast("LOG_ON_CURRENT_USER")
  @scala.inline
  def LOG_ON_SERVICE_USER: typings.qlikDashEngineapi.qlikDashEngineapiStrings.LOG_ON_SERVICE_USER = this.cast("LOG_ON_SERVICE_USER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

