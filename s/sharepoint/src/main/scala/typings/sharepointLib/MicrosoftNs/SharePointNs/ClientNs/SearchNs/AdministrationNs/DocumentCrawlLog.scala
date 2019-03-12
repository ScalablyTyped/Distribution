package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AdministrationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Administration.DocumentCrawlLog")
@js.native
class DocumentCrawlLog protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientContext, site: sharepointLib.SPNs.Site) = this()
  def getCrawledUrls(
    getCountOnly: scala.Boolean,
    maxRows: sharepointLib.Anon_High,
    queryString: java.lang.String,
    isLike: scala.Boolean,
    contentSourceID: scala.Double,
    errorLevel: scala.Double,
    errorID: scala.Double,
    startDateTime: stdLib.Date,
    endDateTime: stdLib.Date
  ): sharepointLib.SPNs.JsonObjectResult = js.native
}

