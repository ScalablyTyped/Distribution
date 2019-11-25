package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.FOLDER
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.FILE
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.OTHER
*/
trait FolderItemType extends js.Object

object FolderItemType {
  @scala.inline
  def FILE: typings.qlikDashEngineapi.qlikDashEngineapiStrings.FILE = this.cast("FILE")
  @scala.inline
  def FOLDER: typings.qlikDashEngineapi.qlikDashEngineapiStrings.FOLDER = this.cast("FOLDER")
  @scala.inline
  def OTHER: typings.qlikDashEngineapi.qlikDashEngineapiStrings.OTHER = this.cast("OTHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

