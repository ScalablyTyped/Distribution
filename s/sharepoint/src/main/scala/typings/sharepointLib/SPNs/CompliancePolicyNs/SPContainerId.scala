package typings
package sharepointLib.SPNs.CompliancePolicyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.CompliancePolicy.SPContainerId")
@js.native
class SPContainerId ()
  extends sharepointLib.SPNs.ClientObject {
  def get_containerType(): sharepointLib.SPNs.ContentType = js.native
  def get_listId(): sharepointLib.SPNs.Guid = js.native
  def get_siteId(): sharepointLib.SPNs.Guid = js.native
  def get_siteUrl(): java.lang.String = js.native
  def get_tenantId(): sharepointLib.SPNs.Guid = js.native
  def get_title(): java.lang.String = js.native
  def get_version(): js.Any = js.native
  def get_webId(): sharepointLib.SPNs.Guid = js.native
  def serialize(): sharepointLib.SPNs.StringResult = js.native
  def set_containerType(value: sharepointLib.SPNs.ContentType): sharepointLib.SPNs.ContentType = js.native
  def set_listId(value: sharepointLib.SPNs.Guid): sharepointLib.SPNs.Guid = js.native
  def set_siteId(value: sharepointLib.SPNs.Guid): sharepointLib.SPNs.Guid = js.native
  def set_siteUrl(value: java.lang.String): java.lang.String = js.native
  def set_tenantId(value: sharepointLib.SPNs.Guid): sharepointLib.SPNs.Guid = js.native
  def set_title(value: java.lang.String): java.lang.String = js.native
  def set_version(value: js.Any): js.Any = js.native
  def set_webId(value: sharepointLib.SPNs.Guid): sharepointLib.SPNs.Guid = js.native
}

@JSGlobal("SP.CompliancePolicy.SPContainerId")
@js.native
object SPContainerId extends js.Object {
  def create(context: sharepointLib.SPNs.ClientRuntimeContext, containerId: js.Any): sharepointLib.SPNs.CompliancePolicyNs.SPContainerId = js.native
  def createFromList(context: sharepointLib.SPNs.ClientRuntimeContext, list: sharepointLib.SPNs.List[_]): sharepointLib.SPNs.CompliancePolicyNs.SPContainerId = js.native
  def createFromSite(context: sharepointLib.SPNs.ClientRuntimeContext, site: sharepointLib.SPNs.Site): sharepointLib.SPNs.CompliancePolicyNs.SPContainerId = js.native
  def createFromWeb(context: sharepointLib.SPNs.ClientRuntimeContext, web: sharepointLib.SPNs.Web): sharepointLib.SPNs.CompliancePolicyNs.SPContainerId = js.native
}

