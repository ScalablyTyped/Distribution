package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FileSaveBinaryInformation")
@js.native
class FileSaveBinaryInformation () extends ClientValueObject {
  def get_checkRequiredFields(): Boolean = js.native
  def get_content(): Base64EncodedByteArray = js.native
  def get_eTag(): String = js.native
  def get_fieldValues(): js.Any = js.native
  def set_checkRequiredFields(value: Boolean): Unit = js.native
  def set_content(value: Base64EncodedByteArray): Unit = js.native
  def set_eTag(value: String): Unit = js.native
  def set_fieldValues(value: js.Any): Unit = js.native
}

