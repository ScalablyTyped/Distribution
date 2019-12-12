package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Analytics.EventTypeId
import typings.sharepoint.SP.Analytics.EventTypeId.first
import typings.sharepoint.SP.Analytics.EventTypeId.last
import typings.sharepoint.SP.Analytics.EventTypeId.none
import typings.sharepoint.SP.Analytics.EventTypeId.recommendationClick
import typings.sharepoint.SP.Analytics.EventTypeId.recommendationView
import typings.sharepoint.SP.Analytics.EventTypeId.view
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventTypeId with Double] = js.native
    /* 1 */ @js.native
    object first extends TopLevel[first with Double]
    
    /* 5 */ @js.native
    object last extends TopLevel[last with Double]
    
    /* 0 */ @js.native
    object none extends TopLevel[none with Double]
    
    /* 4 */ @js.native
    object recommendationClick extends TopLevel[recommendationClick with Double]
    
    /* 3 */ @js.native
    object recommendationView extends TopLevel[recommendationView with Double]
    
    /* 2 */ @js.native
    object view extends TopLevel[view with Double]
    
  }
  
}

