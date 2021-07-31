package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpgradeType extends StObject
@JSGlobal("SP.UpgradeType")
@js.native
object UpgradeType extends StObject {
  
  @js.native
  sealed trait buildUpgrade
    extends StObject
       with UpgradeType
  
  @js.native
  sealed trait versionUpgrade
    extends StObject
       with UpgradeType
}
