package typings
package sharepointLib.SPNs.WorkflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Workflow.WorkflowTemplate")
@js.native
class WorkflowTemplate ()
  extends sharepointLib.SPNs.ClientObject {
  def get_allowManual(): scala.Boolean = js.native
  def get_associationUrl(): java.lang.String = js.native
  def get_autoStartChange(): scala.Boolean = js.native
  def get_autoStartCreate(): scala.Boolean = js.native
  def get_description(): java.lang.String = js.native
  def get_id(): sharepointLib.SPNs.Guid = js.native
  def get_isDeclarative(): scala.Boolean = js.native
  def get_name(): java.lang.String = js.native
  def get_permissionsManual(): sharepointLib.SPNs.BasePermissions = js.native
}

