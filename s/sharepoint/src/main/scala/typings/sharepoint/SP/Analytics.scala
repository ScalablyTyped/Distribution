package typings.sharepoint.SP

import typings.sharepoint.SP.Analytics.EventTypeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Analytics")
@js.native
object Analytics extends js.Object {
  @js.native
  class AnalyticsUsageEntry () extends ClientObject
  
  @js.native
  sealed trait EventTypeId extends js.Object
  
  /* static members */
  @js.native
  object AnalyticsUsageEntry extends js.Object {
    def logAnalyticsAppEvent(context: ClientRuntimeContext, appEventTypeId: Guid, itemId: String): Unit = js.native
    def logAnalyticsAppEvent2(
      context: ClientRuntimeContext,
      appEventTypeId: Guid,
      itemId: String,
      rollupScopeId: Guid,
      siteId: Guid,
      userId: String
    ): Unit = js.native
    def logAnalyticsEvent(context: ClientRuntimeContext, eventTypeId: Double, itemId: String): Unit = js.native
    def logAnalyticsEvent2(
      context: ClientRuntimeContext,
      eventTypeId: Double,
      itemId: String,
      rollupScopeId: Guid,
      siteId: Guid,
      userId: String
    ): Unit = js.native
  }
  
  @js.native
  object EventTypeId extends js.Object {
    @js.native
    sealed trait first extends EventTypeId
    
    @js.native
    sealed trait last extends EventTypeId
    
    @js.native
    sealed trait none extends EventTypeId
    
    @js.native
    sealed trait recommendationClick extends EventTypeId
    
    @js.native
    sealed trait recommendationView extends EventTypeId
    
    @js.native
    sealed trait view extends EventTypeId
    
    /* 1 */ val first: typings.sharepoint.SP.Analytics.EventTypeId.first with Double = js.native
    /* 5 */ val last: typings.sharepoint.SP.Analytics.EventTypeId.last with Double = js.native
    /* 0 */ val none: typings.sharepoint.SP.Analytics.EventTypeId.none with Double = js.native
    /* 4 */ val recommendationClick: typings.sharepoint.SP.Analytics.EventTypeId.recommendationClick with Double = js.native
    /* 3 */ val recommendationView: typings.sharepoint.SP.Analytics.EventTypeId.recommendationView with Double = js.native
    /* 2 */ val view: typings.sharepoint.SP.Analytics.EventTypeId.view with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventTypeId with Double] = js.native
  }
  
}

