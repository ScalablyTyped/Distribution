package typings.sharepoint.SPNs.CompliancePolicyNs

import typings.sharepoint.SPNs.ClientObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.CompliancePolicy.SPPolicyAssociation")
@js.native
class SPPolicyAssociation () extends ClientObject {
  def get_allowOverride(): Boolean = js.native
  def get_comment(): String = js.native
  def get_defaultPolicyDefinitionConfigId(): js.Array[_] = js.native
  def get_description(): String = js.native
  def get_identity(): Boolean = js.native
  def get_name(): String = js.native
  def get_policyApplyStatus(): js.Any = js.native
  def get_policyDefinitionConfigIds(): js.Array[_] = js.native
  def get_scope(): js.Any = js.native
  def get_source(): js.Any = js.native
  def get_version(): js.Any = js.native
  def get_whenAppliedUTC(): Date = js.native
  def get_whenChangedUTC(): Date = js.native
  def get_whenCreatedUTC(): Date = js.native
  def set_allowOverride(value: Boolean): Boolean = js.native
  def set_comment(value: String): String = js.native
  def set_defaultPolicyDefinitionConfigId(value: js.Array[_]): js.Array[_] = js.native
  def set_description(value: String): String = js.native
  def set_identity(value: Boolean): Boolean = js.native
  def set_name(value: String): String = js.native
  def set_policyApplyStatus(value: js.Any): js.Any = js.native
  def set_policyDefinitionConfigIds(value: js.Array[_]): js.Array[_] = js.native
  def set_scope(value: js.Any): js.Any = js.native
  def set_source(value: js.Any): js.Any = js.native
  def set_version(value: js.Any): js.Any = js.native
  def set_whenAppliedUTC(value: Date): Date = js.native
  def set_whenChangedUTC(value: Date): Date = js.native
  def set_whenCreatedUTC(value: Date): Date = js.native
}

