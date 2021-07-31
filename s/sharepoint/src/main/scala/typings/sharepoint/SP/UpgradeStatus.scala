package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpgradeStatus extends StObject
@JSGlobal("SP.UpgradeStatus")
@js.native
object UpgradeStatus extends StObject {
  
  @js.native
  sealed trait completed
    extends StObject
       with UpgradeStatus
  
  @js.native
  sealed trait failed
    extends StObject
       with UpgradeStatus
  
  @js.native
  sealed trait inProgress
    extends StObject
       with UpgradeStatus
  
  @js.native
  sealed trait none
    extends StObject
       with UpgradeStatus
}
