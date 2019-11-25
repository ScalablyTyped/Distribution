package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.NOT_KEY
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.ANY_KEY
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.PRIMARY_KEY
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.PERFECT_KEY
*/
trait TableRecordKeyType extends js.Object

object TableRecordKeyType {
  @scala.inline
  def ANY_KEY: typings.qlikDashEngineapi.qlikDashEngineapiStrings.ANY_KEY = this.cast("ANY_KEY")
  @scala.inline
  def NOT_KEY: typings.qlikDashEngineapi.qlikDashEngineapiStrings.NOT_KEY = this.cast("NOT_KEY")
  @scala.inline
  def PERFECT_KEY: typings.qlikDashEngineapi.qlikDashEngineapiStrings.PERFECT_KEY = this.cast("PERFECT_KEY")
  @scala.inline
  def PRIMARY_KEY: typings.qlikDashEngineapi.qlikDashEngineapiStrings.PRIMARY_KEY = this.cast("PRIMARY_KEY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

