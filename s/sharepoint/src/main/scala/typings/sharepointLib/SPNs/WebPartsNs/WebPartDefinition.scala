package typings
package sharepointLib.SPNs.WebPartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebParts.WebPartDefinition")
@js.native
class WebPartDefinition ()
  extends sharepointLib.SPNs.ClientObject {
  def closeWebPart(): scala.Unit = js.native
  def deleteWebPart(): scala.Unit = js.native
  def get_id(): sharepointLib.SPNs.Guid = js.native
  def get_webPart(): WebPart = js.native
  def moveWebPartTo(zoneID: java.lang.String, zoneIndex: scala.Double): scala.Unit = js.native
  def openWebPart(): scala.Unit = js.native
  def saveWebPartChanges(): scala.Unit = js.native
}

