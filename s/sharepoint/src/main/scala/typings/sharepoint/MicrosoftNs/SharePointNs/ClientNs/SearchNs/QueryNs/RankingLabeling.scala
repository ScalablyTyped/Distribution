package typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.JsonObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.RankingLabeling")
@js.native
class RankingLabeling protected () extends ClientObject {
  def this(context: ClientContext) = this()
  def addJudgment(userQuery: String, url: String, labelId: Double): Unit = js.native
  def getJudgementsForQuery(query: String): JsonObjectResult = js.native
  def normalizeResultUrl(url: String): JsonObjectResult = js.native
}

