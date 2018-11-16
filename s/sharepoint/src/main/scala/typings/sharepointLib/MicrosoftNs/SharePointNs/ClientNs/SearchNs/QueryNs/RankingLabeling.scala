package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.RankingLabeling")
@js.native
class RankingLabeling protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientContext) = this()
  def addJudgment(userQuery: java.lang.String, url: java.lang.String, labelId: scala.Double): scala.Unit = js.native
  def getJudgementsForQuery(query: java.lang.String): sharepointLib.SPNs.JsonObjectResult = js.native
  def normalizeResultUrl(url: java.lang.String): sharepointLib.SPNs.JsonObjectResult = js.native
}

