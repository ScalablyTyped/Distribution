package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
