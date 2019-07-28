package typings.sharepoint.SPNs.AnalyticsNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Analytics.AnalyticsUsageEntry")
@js.native
class AnalyticsUsageEntry () extends ClientObject

/* static members */
@JSGlobal("SP.Analytics.AnalyticsUsageEntry")
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

