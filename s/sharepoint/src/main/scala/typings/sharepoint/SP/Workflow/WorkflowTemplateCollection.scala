package typings.sharepoint.SP.Workflow

import typings.sharepoint.SP.ClientObjectCollection
import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTemplateCollection extends ClientObjectCollection[WorkflowTemplate] {
  
  def getById(templateId: Guid): WorkflowTemplate = js.native
  
  def getByName(name: String): WorkflowTemplate = js.native
  
  def get_item(index: Double): WorkflowTemplate = js.native
  
  def itemAt(index: Double): WorkflowTemplate = js.native
}
