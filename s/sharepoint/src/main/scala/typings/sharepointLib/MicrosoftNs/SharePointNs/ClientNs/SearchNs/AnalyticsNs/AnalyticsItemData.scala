package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AnalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Analytics.AnalyticsItemData")
@js.native
class AnalyticsItemData ()
  extends sharepointLib.SPNs.ClientObject {
  def getHitCountForDay(day: stdLib.Date): scala.Double = js.native
  def getHitCountForMonth(day: stdLib.Date): scala.Double = js.native
  def getUniqueUsersCountForDay(day: stdLib.Date): scala.Double = js.native
  def getUniqueUsersCountForMonth(day: stdLib.Date): scala.Double = js.native
  def get_lastProcessingTime(): stdLib.Date = js.native
  def get_totalHits(): scala.Double = js.native
  def get_totalUniqueUsers(): scala.Double = js.native
}

