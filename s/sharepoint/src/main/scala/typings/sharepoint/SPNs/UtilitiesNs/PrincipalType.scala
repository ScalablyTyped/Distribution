package typings.sharepoint.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrincipalType extends js.Object

@JSGlobal("SP.Utilities.PrincipalType")
@js.native
object PrincipalType extends js.Object {
  @js.native
  sealed trait all extends PrincipalType
  
  @js.native
  sealed trait distributionList extends PrincipalType
  
  @js.native
  sealed trait none extends PrincipalType
  
  @js.native
  sealed trait securityGroup extends PrincipalType
  
  @js.native
  sealed trait sharePointGroup extends PrincipalType
  
  @js.native
  sealed trait user extends PrincipalType
  
  /* 5 */ val all: typings.sharepoint.SPNs.UtilitiesNs.PrincipalType.all with Double = js.native
  /* 2 */ val distributionList: typings.sharepoint.SPNs.UtilitiesNs.PrincipalType.distributionList with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.UtilitiesNs.PrincipalType.none with Double = js.native
  /* 3 */ val securityGroup: typings.sharepoint.SPNs.UtilitiesNs.PrincipalType.securityGroup with Double = js.native
  /* 4 */ val sharePointGroup: typings.sharepoint.SPNs.UtilitiesNs.PrincipalType.sharePointGroup with Double = js.native
  /* 1 */ val user: typings.sharepoint.SPNs.UtilitiesNs.PrincipalType.user with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrincipalType with Double] = js.native
}

