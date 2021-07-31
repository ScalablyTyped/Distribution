package typings.sharepoint.Microsoft.SharePoint.Client.Search

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.ListItem
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**Located in sp.search.apps.js*/
object Analytics {
  
  @js.native
  trait AnalyticsItemData
    extends StObject
       with ClientObject {
    
    def getHitCountForDay(day: Date): Double = js.native
    
    def getHitCountForMonth(day: Date): Double = js.native
    
    def getUniqueUsersCountForDay(day: Date): Double = js.native
    
    def getUniqueUsersCountForMonth(day: Date): Double = js.native
    
    def get_lastProcessingTime(): Date = js.native
    
    def get_totalHits(): Double = js.native
    
    def get_totalUniqueUsers(): Double = js.native
  }
  
  @js.native
  trait UsageAnalytics
    extends StObject
       with ClientObject {
    
    def deleteCustomEventUsageData(appEventTypeId: Guid): Unit = js.native
    
    def deleteStandardEventUsageData(eventType: Double): Unit = js.native
    
    def getAnalyticsItemData[T](eventType: Double, listItem: ListItem[T]): AnalyticsItemData = js.native
    
    def getAnalyticsItemDataForApplicationEventType[T](appEventType: Guid, listItem: ListItem[T]): AnalyticsItemData = js.native
  }
}
