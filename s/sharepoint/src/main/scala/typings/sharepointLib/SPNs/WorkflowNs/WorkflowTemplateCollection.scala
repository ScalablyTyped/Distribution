package typings
package sharepointLib.SPNs.WorkflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTemplateCollection
  extends sharepointLib.SPNs.ClientObjectCollection[WorkflowTemplate] {
  def getById(templateId: sharepointLib.SPNs.Guid): WorkflowTemplate = js.native
  def getByName(name: java.lang.String): WorkflowTemplate = js.native
  def get_item(index: scala.Double): WorkflowTemplate = js.native
  def itemAt(index: scala.Double): WorkflowTemplate = js.native
}

