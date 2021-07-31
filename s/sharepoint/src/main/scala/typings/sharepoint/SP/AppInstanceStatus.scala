package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppInstanceStatus extends StObject
@JSGlobal("SP.AppInstanceStatus")
@js.native
object AppInstanceStatus extends StObject {
  
  @js.native
  sealed trait canceling
    extends StObject
       with AppInstanceStatus
  
  @js.native
  sealed trait disabled
    extends StObject
       with AppInstanceStatus
  
  @js.native
  sealed trait disabling
    extends StObject
       with AppInstanceStatus
  
  @js.native
  sealed trait initialized
    extends StObject
       with AppInstanceStatus
  
  @js.native
  sealed trait installed
    extends StObject
       with AppInstanceStatus
  
  @js.native
  sealed trait installing
    extends StObject
       with AppInstanceStatus
  
  @js.native
  sealed trait invalidStatus
    extends StObject
       with AppInstanceStatus
  
  @js.native
  sealed trait uninstalling
    extends StObject
       with AppInstanceStatus
  
  @js.native
  sealed trait upgradeCanceling
    extends StObject
       with AppInstanceStatus
  
  @js.native
  sealed trait upgrading
    extends StObject
       with AppInstanceStatus
}
