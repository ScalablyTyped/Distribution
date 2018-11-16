package typings
package sharepointLib.SPNs.WebPartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPartDefinitionCollection
  extends sharepointLib.SPNs.ClientObjectCollection[WebPartDefinition] {
  def getByControlId(controlId: java.lang.String): WebPartDefinition = js.native
  def getById(id: sharepointLib.SPNs.Guid): WebPartDefinition = js.native
  def get_item(index: scala.Double): WebPartDefinition = js.native
  def itemAt(index: scala.Double): WebPartDefinition = js.native
}

