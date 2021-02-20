package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Analytics {
  
  @JSGlobal("SP.Analytics.AnalyticsUsageEntry")
  @js.native
  class AnalyticsUsageEntry ()
    extends typings.sharepoint.SP.ClientObject
  object AnalyticsUsageEntry {
    
    /* static member */
    @JSGlobal("SP.Analytics.AnalyticsUsageEntry.logAnalyticsAppEvent")
    @js.native
    def logAnalyticsAppEvent(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      appEventTypeId: typings.sharepoint.SP.Guid,
      itemId: String
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Analytics.AnalyticsUsageEntry.logAnalyticsAppEvent2")
    @js.native
    def logAnalyticsAppEvent2(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      appEventTypeId: typings.sharepoint.SP.Guid,
      itemId: String,
      rollupScopeId: typings.sharepoint.SP.Guid,
      siteId: typings.sharepoint.SP.Guid,
      userId: String
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Analytics.AnalyticsUsageEntry.logAnalyticsEvent")
    @js.native
    def logAnalyticsEvent(context: typings.sharepoint.SP.ClientRuntimeContext, eventTypeId: Double, itemId: String): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.Analytics.AnalyticsUsageEntry.logAnalyticsEvent2")
    @js.native
    def logAnalyticsEvent2(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      eventTypeId: Double,
      itemId: String,
      rollupScopeId: typings.sharepoint.SP.Guid,
      siteId: typings.sharepoint.SP.Guid,
      userId: String
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Analytics.EventTypeId")
  @js.native
  object EventTypeId extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Analytics.EventTypeId with Double] = js.native
    
    /* 1 */ val first: typings.sharepoint.SP.Analytics.EventTypeId.first with Double = js.native
    
    /* 5 */ val last: typings.sharepoint.SP.Analytics.EventTypeId.last with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.Analytics.EventTypeId.none with Double = js.native
    
    /* 4 */ val recommendationClick: typings.sharepoint.SP.Analytics.EventTypeId.recommendationClick with Double = js.native
    
    /* 3 */ val recommendationView: typings.sharepoint.SP.Analytics.EventTypeId.recommendationView with Double = js.native
    
    /* 2 */ val view: typings.sharepoint.SP.Analytics.EventTypeId.view with Double = js.native
  }
}
