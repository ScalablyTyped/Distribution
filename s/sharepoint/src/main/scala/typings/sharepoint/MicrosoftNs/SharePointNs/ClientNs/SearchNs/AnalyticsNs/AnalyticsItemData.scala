package typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AnalyticsNs

import typings.sharepoint.SPNs.ClientObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Analytics.AnalyticsItemData")
@js.native
class AnalyticsItemData () extends ClientObject {
  def getHitCountForDay(day: Date): Double = js.native
  def getHitCountForMonth(day: Date): Double = js.native
  def getUniqueUsersCountForDay(day: Date): Double = js.native
  def getUniqueUsersCountForMonth(day: Date): Double = js.native
  def get_lastProcessingTime(): Date = js.native
  def get_totalHits(): Double = js.native
  def get_totalUniqueUsers(): Double = js.native
}

