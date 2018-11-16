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
  
  val completed: completed with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val inProgress: inProgress with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UpgradeStatus with java.lang.String] = js.native
}

