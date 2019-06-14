package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpgradeType extends js.Object

@JSGlobal("SP.UpgradeType")
@js.native
object UpgradeType extends js.Object {
  @js.native
  sealed trait buildUpgrade
    extends sharepointLib.SPNs.UpgradeType
  
  @js.native
  sealed trait versionUpgrade
    extends sharepointLib.SPNs.UpgradeType
  
  /* 0 */ val buildUpgrade: buildUpgrade with scala.Double = js.native
  /* 1 */ val versionUpgrade: versionUpgrade with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UpgradeType with scala.Double] = js.native
}

