package typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.AnalyticsNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Analytics.UsageAnalytics")
@js.native
class UsageAnalytics () extends ClientObject {
  def deleteCustomEventUsageData(appEventTypeId: Guid): Unit = js.native
  def deleteStandardEventUsageData(eventType: Double): Unit = js.native
  def getAnalyticsItemData[T](eventType: Double, listItem: typings.sharepoint.SPNs.ListItem[T]): AnalyticsItemData = js.native
  def getAnalyticsItemDataForApplicationEventType[T](appEventType: Guid, listItem: typings.sharepoint.SPNs.ListItem[T]): AnalyticsItemData = js.native
}

