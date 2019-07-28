package typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.PortabilityNs

import typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectOwner
import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.JsonObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Portability.SearchConfigurationPortability")
@js.native
class SearchConfigurationPortability protected () extends ClientObject {
  def this(context: ClientContext) = this()
  def deleteSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
  def exportSearchConfiguration(owningScope: SearchObjectOwner): JsonObjectResult = js.native
  def get_importWarnings(): String = js.native
  def importSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
}

