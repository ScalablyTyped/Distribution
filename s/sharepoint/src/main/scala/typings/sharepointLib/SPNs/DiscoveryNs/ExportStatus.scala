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
  
  val complete: complete with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val notStarted: notStarted with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.DiscoveryNs.ExportStatus with java.lang.String] = js.native
}

