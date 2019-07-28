package typings.sharepoint.SPNs.AnalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventTypeId extends js.Object

@JSGlobal("SP.Analytics.EventTypeId")
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
  
  /* 1 */ val first: typings.sharepoint.SPNs.AnalyticsNs.EventTypeId.first with Double = js.native
  /* 5 */ val last: typings.sharepoint.SPNs.AnalyticsNs.EventTypeId.last with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.AnalyticsNs.EventTypeId.none with Double = js.native
  /* 4 */ val recommendationClick: typings.sharepoint.SPNs.AnalyticsNs.EventTypeId.recommendationClick with Double = js.native
  /* 3 */ val recommendationView: typings.sharepoint.SPNs.AnalyticsNs.EventTypeId.recommendationView with Double = js.native
  /* 2 */ val view: typings.sharepoint.SPNs.AnalyticsNs.EventTypeId.view with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypeId with Double] = js.native
}

