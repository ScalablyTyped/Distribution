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
  
  val all: all with java.lang.String = js.native
  val distributionList: distributionList with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val securityGroup: securityGroup with java.lang.String = js.native
  val sharePointGroup: sharePointGroup with java.lang.String = js.native
  val user: user with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.PrincipalType with java.lang.String] = js.native
}

