package typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs

import typings.sharepoint.Anon_High
import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.JsonObjectResult
import typings.sharepoint.SPNs.Site
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Administration.DocumentCrawlLog")
@js.native
class DocumentCrawlLog protected () extends ClientObject {
  def this(context: ClientContext, site: Site) = this()
  def getCrawledUrls(
    getCountOnly: Boolean,
    maxRows: Anon_High,
    queryString: String,
    isLike: Boolean,
    contentSourceID: Double,
    errorLevel: Double,
    errorID: Double,
    startDateTime: Date,
    endDateTime: Date
  ): JsonObjectResult = js.native
}

