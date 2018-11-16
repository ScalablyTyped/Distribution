package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Executes queries against a search server.*/
@JSGlobal("Microsoft.SharePoint.Client.Search.Query.SearchExecutor")
@js.native
class SearchExecutor protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientContext) = this()
  def executeQueries(queryIds: js.Array[java.lang.String], queries: js.Array[Query], handleExceptions: scala.Boolean): sharepointLib.SPNs.JsonObjectResult = js.native
  /**Runs a query.*/
  def executeQuery(query: Query): sharepointLib.SPNs.JsonObjectResult = js.native
  def exportPopularQueries(web: sharepointLib.SPNs.Web, sourceId: sharepointLib.SPNs.Guid): sharepointLib.SPNs.JsonObjectResult = js.native
  def recordPageClick(
    pageInfo: java.lang.String,
    clickType: java.lang.String,
    blockType: scala.Double,
    clickedResultId: java.lang.String,
    subResultIndex: scala.Double,
    immediacySourceId: java.lang.String,
    immediacyQueryString: java.lang.String,
    immediacyTitle: java.lang.String,
    immediacyUrl: java.lang.String
  ): scala.Unit = js.native
}

