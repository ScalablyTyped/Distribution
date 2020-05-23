package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Analytics")
@js.native
object Analytics extends js.Object {
  @js.native
  class AnalyticsUsageEntry ()
    extends typings.sharepoint.SP.ClientObject
  
  /* static members */
  @js.native
  object AnalyticsUsageEntry extends js.Object {
    def logAnalyticsAppEvent(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      appEventTypeId: typings.sharepoint.SP.Guid,
      itemId: String
    ): Unit = js.native
    def logAnalyticsAppEvent2(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      appEventTypeId: typings.sharepoint.SP.Guid,
      itemId: String,
      rollupScopeId: typings.sharepoint.SP.Guid,
      siteId: typings.sharepoint.SP.Guid,
      userId: String
    ): Unit = js.native
    def logAnalyticsEvent(context: typings.sharepoint.SP.ClientRuntimeContext, eventTypeId: Double, itemId: String): Unit = js.native
    def logAnalyticsEvent2(
      context: typings.sharepoint.SP.ClientRuntimeContext,
      eventTypeId: Double,
      itemId: String,
      rollupScopeId: typings.sharepoint.SP.Guid,
      siteId: typings.sharepoint.SP.Guid,
      userId: String
    ): Unit = js.native
  }
  
  @js.native
  object EventTypeId extends js.Object {
    /* 1 */ val first: typings.sharepoint.SP.Analytics.EventTypeId.first with Double = js.native
    /* 5 */ val last: typings.sharepoint.SP.Analytics.EventTypeId.last with Double = js.native
    /* 0 */ val none: typings.sharepoint.SP.Analytics.EventTypeId.none with Double = js.native
    /* 4 */ val recommendationClick: typings.sharepoint.SP.Analytics.EventTypeId.recommendationClick with Double = js.native
    /* 3 */ val recommendationView: typings.sharepoint.SP.Analytics.EventTypeId.recommendationView with Double = js.native
    /* 2 */ val view: typings.sharepoint.SP.Analytics.EventTypeId.view with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Analytics.EventTypeId with Double] = js.native
  }
  
}

