package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.JsonObjectResult
import typings.sharepoint.SP.Web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**Executes queries against a search server.*/
@js.native
trait SearchExecutor
  extends StObject
     with ClientObject {
  
  def executeQueries(
    queryIds: js.Array[String],
    queries: js.Array[typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.Query],
    handleExceptions: Boolean
  ): JsonObjectResult = js.native
  
  /**Runs a query.*/
  def executeQuery(query: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.Query): JsonObjectResult = js.native
  
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
