package typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.JsonObjectResult
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Executes queries against a search server.*/
@JSGlobal("Microsoft.SharePoint.Client.Search.Query.SearchExecutor")
@js.native
class SearchExecutor protected () extends ClientObject {
  def this(context: ClientContext) = this()
  def executeQueries(queryIds: js.Array[String], queries: js.Array[Query], handleExceptions: Boolean): JsonObjectResult = js.native
  /**Runs a query.*/
  def executeQuery(query: Query): JsonObjectResult = js.native
  def exportPopularQueries(web: Web, sourceId: Guid): JsonObjectResult = js.native
  def recordPageClick(
    pageInfo: String,
    clickType: String,
    blockType: Double,
    clickedResultId: String,
    subResultIndex: Double,
    immediacySourceId: String,
    immediacyQueryString: String,
    immediacyTitle: String,
    immediacyUrl: String
  ): Unit = js.native
}

