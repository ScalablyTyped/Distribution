package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.JsonObjectResult
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

