package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FileSaveBinaryInformation")
@js.native
class FileSaveBinaryInformation () extends ClientValueObject {
  def get_checkRequiredFields(): scala.Boolean = js.native
  def get_content(): Base64EncodedByteArray = js.native
  def get_eTag(): java.lang.String = js.native
  def get_fieldValues(): js.Any = js.native
  def set_checkRequiredFields(value: scala.Boolean): scala.Unit = js.native
  def set_content(value: Base64EncodedByteArray): scala.Unit = js.native
  def set_eTag(value: java.lang.String): scala.Unit = js.native
  def set_fieldValues(value: js.Any): scala.Unit = js.native
}

