package typings
package sharepointLib.SPNs.AnalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Analytics.AnalyticsUsageEntry")
@js.native
class AnalyticsUsageEntry ()
  extends sharepointLib.SPNs.ClientObject

@JSGlobal("SP.Analytics.AnalyticsUsageEntry")
@js.native
object AnalyticsUsageEntry extends js.Object {
  def logAnalyticsAppEvent(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    appEventTypeId: sharepointLib.SPNs.Guid,
    itemId: java.lang.String
  ): scala.Unit = js.native
  def logAnalyticsAppEvent2(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    appEventTypeId: sharepointLib.SPNs.Guid,
    itemId: java.lang.String,
    rollupScopeId: sharepointLib.SPNs.Guid,
    siteId: sharepointLib.SPNs.Guid,
    userId: java.lang.String
  ): scala.Unit = js.native
  def logAnalyticsEvent(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    eventTypeId: scala.Double,
    itemId: java.lang.String
  ): scala.Unit = js.native
  def logAnalyticsEvent2(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    eventTypeId: scala.Double,
    itemId: java.lang.String,
    rollupScopeId: sharepointLib.SPNs.Guid,
    siteId: sharepointLib.SPNs.Guid,
    userId: java.lang.String
  ): scala.Unit = js.native
}

