package typings
package sharepointLib.SPNs.SiteHealthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SiteHealthStatusType extends js.Object

@JSGlobal("SP.SiteHealth.SiteHealthStatusType")
@js.native
object SiteHealthStatusType extends js.Object {
  @js.native
  sealed trait failedError
    extends sharepointLib.SPNs.SiteHealthNs.SiteHealthStatusType
  
  @js.native
  sealed trait failedWarning
    extends sharepointLib.SPNs.SiteHealthNs.SiteHealthStatusType
  
  @js.native
  sealed trait passed
    extends sharepointLib.SPNs.SiteHealthNs.SiteHealthStatusType
  
  /* 2 */ val failedError: failedError with scala.Double = js.native
  /* 1 */ val failedWarning: failedWarning with scala.Double = js.native
  /* 0 */ val passed: passed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SiteHealthNs.SiteHealthStatusType with scala.Double] = js.native
}

