package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.PortabilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Portability.SearchConfigurationPortability")
@js.native
class SearchConfigurationPortability protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientContext) = this()
  def deleteSearchConfiguration(
    owningScope: sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectOwner,
    searchConfiguration: java.lang.String
  ): scala.Unit = js.native
  def exportSearchConfiguration(
    owningScope: sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectOwner
  ): sharepointLib.SPNs.JsonObjectResult = js.native
  def get_importWarnings(): java.lang.String = js.native
  def importSearchConfiguration(
    owningScope: sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs.SearchObjectOwner,
    searchConfiguration: java.lang.String
  ): scala.Unit = js.native
}

