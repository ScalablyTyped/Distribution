package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FileCreationInformation")
@js.native
class FileCreationInformation () extends ClientValueObject {
  def get_content(): Base64EncodedByteArray = js.native
  def get_overwrite(): scala.Boolean = js.native
  def get_url(): java.lang.String = js.native
  def set_content(value: Base64EncodedByteArray): scala.Unit = js.native
  def set_overwrite(value: scala.Boolean): scala.Unit = js.native
  def set_url(value: java.lang.String): scala.Unit = js.native
}

