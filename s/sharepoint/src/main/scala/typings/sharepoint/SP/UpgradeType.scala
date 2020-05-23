package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpgradeType extends js.Object

@JSGlobal("SP.UpgradeType")
@js.native
object UpgradeType extends js.Object {
  @js.native
  sealed trait buildUpgrade extends UpgradeType
  
  @js.native
  sealed trait versionUpgrade extends UpgradeType
  
}

