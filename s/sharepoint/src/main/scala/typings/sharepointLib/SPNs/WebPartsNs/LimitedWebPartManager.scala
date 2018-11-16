package typings
package sharepointLib.SPNs.WebPartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebParts.LimitedWebPartManager")
@js.native
class LimitedWebPartManager ()
  extends sharepointLib.SPNs.ClientObject {
  def addWebPart(webPart: WebPart, zoneId: java.lang.String, zoneIndex: scala.Double): WebPartDefinition = js.native
  def get_hasPersonalizedParts(): scala.Boolean = js.native
  def get_scope(): PersonalizationScope = js.native
  def get_webParts(): WebPartDefinitionCollection = js.native
  def importWebPart(webPartXml: java.lang.String): WebPartDefinition = js.native
}

