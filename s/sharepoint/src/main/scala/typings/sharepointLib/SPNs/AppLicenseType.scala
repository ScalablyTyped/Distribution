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
  
  val perpetualAllUsers: perpetualAllUsers with java.lang.String = js.native
  val perpetualMultiUser: perpetualMultiUser with java.lang.String = js.native
  val trialAllUsers: trialAllUsers with java.lang.String = js.native
  val trialMultiUser: trialMultiUser with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.AppLicenseType with java.lang.String] = js.native
}

