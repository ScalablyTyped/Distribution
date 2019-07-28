package typings.sharepoint.SPNs.WorkflowNs

import typings.sharepoint.SPNs.ClientObjectCollection
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTemplateCollection extends ClientObjectCollection[WorkflowTemplate] {
  def getById(templateId: Guid): WorkflowTemplate = js.native
  def getByName(name: String): WorkflowTemplate = js.native
  def get_item(index: Double): WorkflowTemplate = js.native
  def itemAt(index: Double): WorkflowTemplate = js.native
}

