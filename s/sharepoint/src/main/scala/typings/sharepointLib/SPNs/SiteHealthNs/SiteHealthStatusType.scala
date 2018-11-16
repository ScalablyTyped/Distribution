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
  
  val failedError: failedError with java.lang.String = js.native
  val failedWarning: failedWarning with java.lang.String = js.native
  val passed: passed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SiteHealthNs.SiteHealthStatusType with java.lang.String] = js.native
}

