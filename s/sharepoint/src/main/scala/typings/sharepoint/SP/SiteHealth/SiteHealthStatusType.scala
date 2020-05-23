package typings.sharepoint.SP.SiteHealth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SiteHealthStatusType extends js.Object

@JSGlobal("SP.SiteHealth.SiteHealthStatusType")
@js.native
object SiteHealthStatusType extends js.Object {
  @js.native
  sealed trait failedError extends SiteHealthStatusType
  
  @js.native
  sealed trait failedWarning extends SiteHealthStatusType
  
  @js.native
  sealed trait passed extends SiteHealthStatusType
  
}

