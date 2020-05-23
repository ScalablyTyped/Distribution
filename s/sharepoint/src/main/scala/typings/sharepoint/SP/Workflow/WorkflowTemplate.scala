package typings.sharepoint.SP.Workflow

import typings.sharepoint.SP.BasePermissions
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTemplate extends ClientObject {
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

