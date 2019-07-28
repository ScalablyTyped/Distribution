package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentCollection extends ClientObjectCollection[Attachment] {
  def getByFileName(fileName: String): Attachment = js.native
  def get_item(index: Double): Attachment = js.native
  def itemAt(index: Double): Attachment = js.native
}

