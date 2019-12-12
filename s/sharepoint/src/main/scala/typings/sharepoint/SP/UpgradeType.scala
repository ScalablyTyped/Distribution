package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.UpgradeType.buildUpgrade
import typings.sharepoint.SP.UpgradeType.versionUpgrade
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UpgradeType with Double] = js.native
  /* 0 */ @js.native
  object buildUpgrade extends TopLevel[buildUpgrade with Double]
  
  /* 1 */ @js.native
  object versionUpgrade extends TopLevel[versionUpgrade with Double]
  
}

