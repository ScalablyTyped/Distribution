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
  
  /* 5 */ val all: all with scala.Double = js.native
  /* 3 */ val membershipProvider: membershipProvider with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val roleProvider: roleProvider with scala.Double = js.native
  /* 1 */ val userInfoList: userInfoList with scala.Double = js.native
  /* 2 */ val windows: windows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.PrincipalSource with scala.Double] = js.native
}

