package typings.sharepoint.SPNs.WebPartsNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebParts.WebPartDefinition")
@js.native
class WebPartDefinition () extends ClientObject {
  def closeWebPart(): Unit = js.native
  def deleteWebPart(): Unit = js.native
  def get_id(): Guid = js.native
  def get_webPart(): WebPart = js.native
  def get_zoneId(): String = js.native
  def moveWebPartTo(zoneID: String, zoneIndex: Double): Unit = js.native
  def openWebPart(): Unit = js.native
  def saveWebPartChanges(): Unit = js.native
}

