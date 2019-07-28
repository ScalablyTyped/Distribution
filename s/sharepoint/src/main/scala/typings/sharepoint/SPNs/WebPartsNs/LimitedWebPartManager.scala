package typings.sharepoint.SPNs.WebPartsNs

import typings.sharepoint.SPNs.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebParts.LimitedWebPartManager")
@js.native
class LimitedWebPartManager () extends ClientObject {
  def addWebPart(webPart: WebPart, zoneId: String, zoneIndex: Double): WebPartDefinition = js.native
  def get_hasPersonalizedParts(): Boolean = js.native
  def get_scope(): PersonalizationScope = js.native
  def get_webParts(): WebPartDefinitionCollection = js.native
  def importWebPart(webPartXml: String): WebPartDefinition = js.native
}

