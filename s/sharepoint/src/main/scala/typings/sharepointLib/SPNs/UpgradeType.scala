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
  
  val buildUpgrade: buildUpgrade with java.lang.String = js.native
  val versionUpgrade: versionUpgrade with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UpgradeType with java.lang.String] = js.native
}

