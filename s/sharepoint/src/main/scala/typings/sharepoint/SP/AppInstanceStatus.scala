package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppInstanceStatus extends js.Object

@JSGlobal("SP.AppInstanceStatus")
@js.native
object AppInstanceStatus extends js.Object {
  @js.native
  sealed trait canceling extends AppInstanceStatus
  
  @js.native
  sealed trait disabled extends AppInstanceStatus
  
  @js.native
  sealed trait disabling extends AppInstanceStatus
  
  @js.native
  sealed trait initialized extends AppInstanceStatus
  
  @js.native
  sealed trait installed extends AppInstanceStatus
  
  @js.native
  sealed trait installing extends AppInstanceStatus
  
  @js.native
  sealed trait invalidStatus extends AppInstanceStatus
  
  @js.native
  sealed trait uninstalling extends AppInstanceStatus
  
  @js.native
  sealed trait upgradeCanceling extends AppInstanceStatus
  
  @js.native
  sealed trait upgrading extends AppInstanceStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstanceStatus with Double] = js.native
  /* 2 */ @js.native
  object canceling extends TopLevel[canceling with Double]
  
  /* 9 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 8 */ @js.native
  object disabling extends TopLevel[disabling with Double]
  
  /* 6 */ @js.native
  object initialized extends TopLevel[initialized with Double]
  
  /* 4 */ @js.native
  object installed extends TopLevel[installed with Double]
  
  /* 1 */ @js.native
  object installing extends TopLevel[installing with Double]
  
  /* 0 */ @js.native
  object invalidStatus extends TopLevel[invalidStatus with Double]
  
  /* 3 */ @js.native
  object uninstalling extends TopLevel[uninstalling with Double]
  
  /* 7 */ @js.native
  object upgradeCanceling extends TopLevel[upgradeCanceling with Double]
  
  /* 5 */ @js.native
  object upgrading extends TopLevel[upgrading with Double]
  
}

