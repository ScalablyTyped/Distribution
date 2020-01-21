package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikEngineapi.qlikEngineapiStrings.FOLDER
  - typings.qlikEngineapi.qlikEngineapiStrings.FILE
  - typings.qlikEngineapi.qlikEngineapiStrings.OTHER
*/
trait FolderItemType extends js.Object

object FolderItemType {
  @scala.inline
  def FILE: typings.qlikEngineapi.qlikEngineapiStrings.FILE = this.cast("FILE")
  @scala.inline
  def FOLDER: typings.qlikEngineapi.qlikEngineapiStrings.FOLDER = this.cast("FOLDER")
  @scala.inline
  def OTHER: typings.qlikEngineapi.qlikEngineapiStrings.OTHER = this.cast("OTHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

