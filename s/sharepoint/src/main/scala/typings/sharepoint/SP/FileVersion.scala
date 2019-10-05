package typings.sharepoint.SP

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FileVersion")
@js.native
class FileVersion () extends ClientObject {
  def deleteObject(): Unit = js.native
  def get_checkInComment(): String = js.native
  def get_created(): Date = js.native
  def get_createdBy(): User = js.native
  def get_iD(): Double = js.native
  def get_isCurrentVersion(): Boolean = js.native
  def get_size(): Double = js.native
  def get_url(): String = js.native
  def get_versionLabel(): String = js.native
}

