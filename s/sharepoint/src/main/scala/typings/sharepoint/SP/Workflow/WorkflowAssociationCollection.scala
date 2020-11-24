package typings.sharepoint.SP.Workflow

import typings.sharepoint.SP.ClientObjectCollection
import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowAssociationCollection extends ClientObjectCollection[WorkflowAssociation] {
  
  def add(parameters: WorkflowAssociationCreationInformation): WorkflowAssociation = js.native
  
  def getById(associationId: Guid): WorkflowAssociation = js.native
  
  def getByName(name: String): WorkflowAssociation = js.native
  
  def get_item(index: Double): WorkflowAssociation = js.native
  
  def itemAt(index: Double): WorkflowAssociation = js.native
}
