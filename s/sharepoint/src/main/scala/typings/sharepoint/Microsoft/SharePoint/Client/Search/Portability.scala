package typings.sharepoint.Microsoft.SharePoint.Client.Search

import typings.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectOwner
import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.JsonObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Portability")
@js.native
object Portability extends js.Object {
  @js.native
  class SearchConfigurationPortability protected () extends ClientObject {
    def this(context: ClientContext) = this()
    def deleteSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
    def exportSearchConfiguration(owningScope: SearchObjectOwner): JsonObjectResult = js.native
    def get_importWarnings(): String = js.native
    def importSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
  }
  
  @js.native
  class SearchConfigurationPortabilityPropertyNames () extends js.Object
  
  /* static members */
  @js.native
  object SearchConfigurationPortabilityPropertyNames extends js.Object {
    var importWarnings: String = js.native
  }
  
}

