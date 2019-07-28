package typings.sharepoint.SPNs.DiscoveryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportStatus extends js.Object

@JSGlobal("SP.Discovery.ExportStatus")
@js.native
object ExportStatus extends js.Object {
   // : 2,
  @js.native
  sealed trait complete extends ExportStatus
  
  @js.native
  sealed trait failed extends ExportStatus
  
   // : 0,
  @js.native
  sealed trait notStarted extends ExportStatus
  
   // : 1,
  @js.native
  sealed trait started extends ExportStatus
  
  /* 2 */ val complete: typings.sharepoint.SPNs.DiscoveryNs.ExportStatus.complete with Double = js.native
  /* 3 */ val failed: typings.sharepoint.SPNs.DiscoveryNs.ExportStatus.failed with Double = js.native
  /* 0 */ val notStarted: typings.sharepoint.SPNs.DiscoveryNs.ExportStatus.notStarted with Double = js.native
  /* 1 */ val started: typings.sharepoint.SPNs.DiscoveryNs.ExportStatus.started with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportStatus with Double] = js.native
}

