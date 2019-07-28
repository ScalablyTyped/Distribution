package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FileCreationInformation")
@js.native
class FileCreationInformation () extends ClientValueObject {
  def get_content(): Base64EncodedByteArray = js.native
  def get_overwrite(): Boolean = js.native
  def get_url(): String = js.native
  def set_content(value: Base64EncodedByteArray): Unit = js.native
  def set_overwrite(value: Boolean): Unit = js.native
  def set_url(value: String): Unit = js.native
}

