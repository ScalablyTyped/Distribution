package typings.sharepoint.SPNs.CompliancePolicyNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.ContentType
import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.List
import typings.sharepoint.SPNs.Site
import typings.sharepoint.SPNs.StringResult
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.CompliancePolicy.SPContainerId")
@js.native
class SPContainerId () extends ClientObject {
  def get_containerType(): ContentType = js.native
  def get_listId(): Guid = js.native
  def get_siteId(): Guid = js.native
  def get_siteUrl(): String = js.native
  def get_tenantId(): Guid = js.native
  def get_title(): String = js.native
  def get_version(): js.Any = js.native
  def get_webId(): Guid = js.native
  def serialize(): StringResult = js.native
  def set_containerType(value: ContentType): ContentType = js.native
  def set_listId(value: Guid): Guid = js.native
  def set_siteId(value: Guid): Guid = js.native
  def set_siteUrl(value: String): String = js.native
  def set_tenantId(value: Guid): Guid = js.native
  def set_title(value: String): String = js.native
  def set_version(value: js.Any): js.Any = js.native
  def set_webId(value: Guid): Guid = js.native
}

/* static members */
@JSGlobal("SP.CompliancePolicy.SPContainerId")
@js.native
object SPContainerId extends js.Object {
  def create(context: ClientRuntimeContext, containerId: js.Any): SPContainerId = js.native
  def createFromList(context: ClientRuntimeContext, list: List[_]): SPContainerId = js.native
  def createFromSite(context: ClientRuntimeContext, site: Site): SPContainerId = js.native
  def createFromWeb(context: ClientRuntimeContext, web: Web): SPContainerId = js.native
}

