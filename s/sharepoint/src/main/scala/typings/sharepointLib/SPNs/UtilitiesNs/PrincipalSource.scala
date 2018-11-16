package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrincipalSource extends js.Object

@JSGlobal("SP.Utilities.PrincipalSource")
@js.native
object PrincipalSource extends js.Object {
  @js.native
  sealed trait all
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalSource
  
  @js.native
  sealed trait membershipProvider
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalSource
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalSource
  
  @js.native
  sealed trait roleProvider
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalSource
  
  @js.native
  sealed trait userInfoList
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalSource
  
  @js.native
  sealed trait windows
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalSource
  
  val all: all with java.lang.String = js.native
  val membershipProvider: membershipProvider with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val roleProvider: roleProvider with java.lang.String = js.native
  val userInfoList: userInfoList with java.lang.String = js.native
  val windows: windows with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.PrincipalSource with java.lang.String] = js.native
}

