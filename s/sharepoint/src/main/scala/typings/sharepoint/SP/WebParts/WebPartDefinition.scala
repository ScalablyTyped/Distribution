package typings.sharepoint.SP.WebParts

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPartDefinition extends ClientObject {
  def closeWebPart(): Unit = js.native
  def deleteWebPart(): Unit = js.native
  def get_id(): Guid = js.native
  def get_webPart(): WebPart = js.native
  def get_zoneId(): String = js.native
  def moveWebPartTo(zoneID: String, zoneIndex: Double): Unit = js.native
  def openWebPart(): Unit = js.native
  def saveWebPartChanges(): Unit = js.native
}

