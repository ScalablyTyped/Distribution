package typings.sharepoint.SP

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
  
  /* 2 */ val canceling: typings.sharepoint.SP.AppInstanceStatus.canceling with Double = js.native
  /* 9 */ val disabled: typings.sharepoint.SP.AppInstanceStatus.disabled with Double = js.native
  /* 8 */ val disabling: typings.sharepoint.SP.AppInstanceStatus.disabling with Double = js.native
  /* 6 */ val initialized: typings.sharepoint.SP.AppInstanceStatus.initialized with Double = js.native
  /* 4 */ val installed: typings.sharepoint.SP.AppInstanceStatus.installed with Double = js.native
  /* 1 */ val installing: typings.sharepoint.SP.AppInstanceStatus.installing with Double = js.native
  /* 0 */ val invalidStatus: typings.sharepoint.SP.AppInstanceStatus.invalidStatus with Double = js.native
  /* 3 */ val uninstalling: typings.sharepoint.SP.AppInstanceStatus.uninstalling with Double = js.native
  /* 7 */ val upgradeCanceling: typings.sharepoint.SP.AppInstanceStatus.upgradeCanceling with Double = js.native
  /* 5 */ val upgrading: typings.sharepoint.SP.AppInstanceStatus.upgrading with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstanceStatus with Double] = js.native
}

