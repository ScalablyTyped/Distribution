package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppLicenseType extends js.Object

@JSGlobal("SP.AppLicenseType")
@js.native
object AppLicenseType extends js.Object {
  @js.native
  sealed trait perpetualAllUsers
    extends sharepointLib.SPNs.AppLicenseType
  
  @js.native
  sealed trait perpetualMultiUser
    extends sharepointLib.SPNs.AppLicenseType
  
  @js.native
  sealed trait trialAllUsers
    extends sharepointLib.SPNs.AppLicenseType
  
  @js.native
  sealed trait trialMultiUser
    extends sharepointLib.SPNs.AppLicenseType
  
  /* 1 */ val perpetualAllUsers: perpetualAllUsers with scala.Double = js.native
  /* 0 */ val perpetualMultiUser: perpetualMultiUser with scala.Double = js.native
  /* 3 */ val trialAllUsers: trialAllUsers with scala.Double = js.native
  /* 2 */ val trialMultiUser: trialMultiUser with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.AppLicenseType with scala.Double] = js.native
}

