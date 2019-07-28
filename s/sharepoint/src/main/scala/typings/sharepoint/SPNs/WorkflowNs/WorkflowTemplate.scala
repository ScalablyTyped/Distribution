package typings.sharepoint.SPNs.WorkflowNs

import typings.sharepoint.SPNs.BasePermissions
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Workflow.WorkflowTemplate")
@js.native
class WorkflowTemplate () extends ClientObject {
  def get_allowManual(): Boolean = js.native
  def get_associationUrl(): String = js.native
  def get_autoStartChange(): Boolean = js.native
  def get_autoStartCreate(): Boolean = js.native
  def get_description(): String = js.native
  def get_id(): Guid = js.native
  def get_isDeclarative(): Boolean = js.native
  def get_name(): String = js.native
  def get_permissionsManual(): BasePermissions = js.native
}

