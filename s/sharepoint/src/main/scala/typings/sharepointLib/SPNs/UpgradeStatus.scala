package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpgradeStatus extends js.Object

@JSGlobal("SP.UpgradeStatus")
@js.native
object UpgradeStatus extends js.Object {
  @js.native
  sealed trait completed
    extends sharepointLib.SPNs.UpgradeStatus
  
  @js.native
  sealed trait failed
    extends sharepointLib.SPNs.UpgradeStatus
  
  @js.native
  sealed trait inProgress
    extends sharepointLib.SPNs.UpgradeStatus
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.UpgradeStatus
  
  /* 3 */ val completed: completed with scala.Double = js.native
  /* 2 */ val failed: failed with scala.Double = js.native
  /* 1 */ val inProgress: inProgress with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UpgradeStatus with scala.Double] = js.native
}

