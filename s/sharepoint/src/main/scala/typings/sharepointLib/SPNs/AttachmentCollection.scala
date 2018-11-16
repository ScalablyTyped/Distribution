package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentCollection extends ClientObjectCollection[Attachment] {
  def getByFileName(fileName: java.lang.String): Attachment = js.native
  def get_item(index: scala.Double): Attachment = js.native
  def itemAt(index: scala.Double): Attachment = js.native
}

