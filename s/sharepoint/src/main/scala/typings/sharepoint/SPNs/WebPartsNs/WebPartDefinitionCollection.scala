package typings.sharepoint.SPNs.WebPartsNs

import typings.sharepoint.SPNs.ClientObjectCollection
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPartDefinitionCollection extends ClientObjectCollection[WebPartDefinition] {
  def getByControlId(controlId: String): WebPartDefinition = js.native
  def getById(id: Guid): WebPartDefinition = js.native
  def get_item(index: Double): WebPartDefinition = js.native
  def itemAt(index: Double): WebPartDefinition = js.native
}

