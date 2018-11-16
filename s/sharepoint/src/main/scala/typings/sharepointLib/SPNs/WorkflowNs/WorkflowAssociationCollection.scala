package typings
package sharepointLib.SPNs.WorkflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowAssociationCollection
  extends sharepointLib.SPNs.ClientObjectCollection[WorkflowAssociation] {
  def add(parameters: WorkflowAssociationCreationInformation): WorkflowAssociation = js.native
  def getById(associationId: sharepointLib.SPNs.Guid): WorkflowAssociation = js.native
  def getByName(name: java.lang.String): WorkflowAssociation = js.native
  def get_item(index: scala.Double): WorkflowAssociation = js.native
  def itemAt(index: scala.Double): WorkflowAssociation = js.native
}

