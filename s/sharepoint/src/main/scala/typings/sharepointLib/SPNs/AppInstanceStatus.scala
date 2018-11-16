package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppInstanceStatus extends js.Object

@JSGlobal("SP.AppInstanceStatus")
@js.native
object AppInstanceStatus extends js.Object {
  @js.native
  sealed trait canceling
    extends sharepointLib.SPNs.AppInstanceStatus
  
  @js.native
  sealed trait disabled
    extends sharepointLib.SPNs.AppInstanceStatus
  
  @js.native
  sealed trait disabling
    extends sharepointLib.SPNs.AppInstanceStatus
  
  @js.native
  sealed trait initialized
    extends sharepointLib.SPNs.AppInstanceStatus
  
  @js.native
  sealed trait installed
    extends sharepointLib.SPNs.AppInstanceStatus
  
  @js.native
  sealed trait installing
    extends sharepointLib.SPNs.AppInstanceStatus
  
  @js.native
  sealed trait invalidStatus
    extends sharepointLib.SPNs.AppInstanceStatus
  
  @js.native
  sealed trait uninstalling
    extends sharepointLib.SPNs.AppInstanceStatus
  
  @js.native
  sealed trait upgradeCanceling
    extends sharepointLib.SPNs.AppInstanceStatus
  
  @js.native
  sealed trait upgrading
    extends sharepointLib.SPNs.AppInstanceStatus
  
  val canceling: canceling with java.lang.String = js.native
  val disabled: disabled with java.lang.String = js.native
  val disabling: disabling with java.lang.String = js.native
  val initialized: initialized with java.lang.String = js.native
  val installed: installed with java.lang.String = js.native
  val installing: installing with java.lang.String = js.native
  val invalidStatus: invalidStatus with java.lang.String = js.native
  val uninstalling: uninstalling with java.lang.String = js.native
  val upgradeCanceling: upgradeCanceling with java.lang.String = js.native
  val upgrading: upgrading with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.AppInstanceStatus with java.lang.String] = js.native
}

