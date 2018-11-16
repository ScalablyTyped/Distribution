package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AnalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Analytics.UsageAnalytics")
@js.native
class UsageAnalytics ()
  extends sharepointLib.SPNs.ClientObject {
  def deleteCustomEventUsageData(appEventTypeId: sharepointLib.SPNs.Guid): scala.Unit = js.native
  def deleteStandardEventUsageData(eventType: scala.Double): scala.Unit = js.native
  def getAnalyticsItemData[T](eventType: scala.Double, listItem: sharepointLib.SPNs.ListItem[T]): AnalyticsItemData = js.native
  def getAnalyticsItemDataForApplicationEventType[T](appEventType: sharepointLib.SPNs.Guid, listItem: sharepointLib.SPNs.ListItem[T]): AnalyticsItemData = js.native
}

