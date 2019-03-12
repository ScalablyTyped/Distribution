package typings
package sharepointLib.SPNs.WorkflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Workflow.WorkflowAssociation")
@js.native
class WorkflowAssociation ()
  extends sharepointLib.SPNs.ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_allowManual(): scala.Boolean = js.native
  def get_associationData(): java.lang.String = js.native
  def get_autoStartChange(): scala.Boolean = js.native
  def get_autoStartCreate(): scala.Boolean = js.native
  def get_baseId(): sharepointLib.SPNs.Guid = js.native
  def get_created(): stdLib.Date = js.native
  def get_description(): java.lang.String = js.native
  def get_enabled(): scala.Boolean = js.native
  def get_historyListTitle(): java.lang.String = js.native
  def get_id(): sharepointLib.SPNs.Guid = js.native
  def get_instantiationUrl(): java.lang.String = js.native
  def get_internalName(): java.lang.String = js.native
  def get_isDeclarative(): scala.Boolean = js.native
  def get_listId(): sharepointLib.SPNs.Guid = js.native
  def get_modified(): stdLib.Date = js.native
  def get_name(): java.lang.String = js.native
  def get_taskListTitle(): java.lang.String = js.native
  def get_webId(): sharepointLib.SPNs.Guid = js.native
  def set_allowManual(value: scala.Boolean): scala.Unit = js.native
  def set_associationData(value: java.lang.String): scala.Unit = js.native
  def set_autoStartChange(value: scala.Boolean): scala.Unit = js.native
  def set_autoStartCreate(value: scala.Boolean): scala.Unit = js.native
  def set_description(value: java.lang.String): scala.Unit = js.native
  def set_enabled(value: scala.Boolean): scala.Unit = js.native
  def set_historyListTitle(value: java.lang.String): scala.Unit = js.native
  def set_name(value: java.lang.String): scala.Unit = js.native
  def set_taskListTitle(value: java.lang.String): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

