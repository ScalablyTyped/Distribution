package typings
package sharepointLib.SPNs.DiscoveryNs

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
  sealed trait complete
    extends sharepointLib.SPNs.DiscoveryNs.ExportStatus
  
  @js.native
  sealed trait failed
    extends sharepointLib.SPNs.DiscoveryNs.ExportStatus
  
   // : 0,
  @js.native
  sealed trait notStarted
    extends sharepointLib.SPNs.DiscoveryNs.ExportStatus
  
   // : 1,
  @js.native
  sealed trait started
    extends sharepointLib.SPNs.DiscoveryNs.ExportStatus
  
  /* 2 */ val complete: complete with scala.Double = js.native
  /* 3 */ val failed: failed with scala.Double = js.native
  /* 0 */ val notStarted: notStarted with scala.Double = js.native
  /* 1 */ val started: started with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.DiscoveryNs.ExportStatus with scala.Double] = js.native
}

