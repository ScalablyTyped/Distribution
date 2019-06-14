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
  
  /* 2 */ val canceling: canceling with scala.Double = js.native
  /* 9 */ val disabled: disabled with scala.Double = js.native
  /* 8 */ val disabling: disabling with scala.Double = js.native
  /* 6 */ val initialized: initialized with scala.Double = js.native
  /* 4 */ val installed: installed with scala.Double = js.native
  /* 1 */ val installing: installing with scala.Double = js.native
  /* 0 */ val invalidStatus: invalidStatus with scala.Double = js.native
  /* 3 */ val uninstalling: uninstalling with scala.Double = js.native
  /* 7 */ val upgradeCanceling: upgradeCanceling with scala.Double = js.native
  /* 5 */ val upgrading: upgrading with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.AppInstanceStatus with scala.Double] = js.native
}

