package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrincipalType extends js.Object

@JSGlobal("SP.Utilities.PrincipalType")
@js.native
object PrincipalType extends js.Object {
  @js.native
  sealed trait all
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalType
  
  @js.native
  sealed trait distributionList
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalType
  
  @js.native
  sealed trait securityGroup
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalType
  
  @js.native
  sealed trait sharePointGroup
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalType
  
  @js.native
  sealed trait user
    extends sharepointLib.SPNs.UtilitiesNs.PrincipalType
  
  /* 5 */ val all: all with scala.Double = js.native
  /* 2 */ val distributionList: distributionList with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val securityGroup: securityGroup with scala.Double = js.native
  /* 4 */ val sharePointGroup: sharePointGroup with scala.Double = js.native
  /* 1 */ val user: user with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.PrincipalType with scala.Double] = js.native
}

