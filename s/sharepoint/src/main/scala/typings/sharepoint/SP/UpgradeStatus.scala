package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpgradeStatus extends js.Object

@JSGlobal("SP.UpgradeStatus")
@js.native
object UpgradeStatus extends js.Object {
  @js.native
  sealed trait completed extends UpgradeStatus
  
  @js.native
  sealed trait failed extends UpgradeStatus
  
  @js.native
  sealed trait inProgress extends UpgradeStatus
  
  @js.native
  sealed trait none extends UpgradeStatus
  
}

