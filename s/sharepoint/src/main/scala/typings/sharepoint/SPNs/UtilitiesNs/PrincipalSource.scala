package typings.sharepoint.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrincipalSource extends js.Object

@JSGlobal("SP.Utilities.PrincipalSource")
@js.native
object PrincipalSource extends js.Object {
  @js.native
  sealed trait all extends PrincipalSource
  
  @js.native
  sealed trait membershipProvider extends PrincipalSource
  
  @js.native
  sealed trait none extends PrincipalSource
  
  @js.native
  sealed trait roleProvider extends PrincipalSource
  
  @js.native
  sealed trait userInfoList extends PrincipalSource
  
  @js.native
  sealed trait windows extends PrincipalSource
  
  /* 5 */ val all: typings.sharepoint.SPNs.UtilitiesNs.PrincipalSource.all with Double = js.native
  /* 3 */ val membershipProvider: typings.sharepoint.SPNs.UtilitiesNs.PrincipalSource.membershipProvider with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.UtilitiesNs.PrincipalSource.none with Double = js.native
  /* 4 */ val roleProvider: typings.sharepoint.SPNs.UtilitiesNs.PrincipalSource.roleProvider with Double = js.native
  /* 1 */ val userInfoList: typings.sharepoint.SPNs.UtilitiesNs.PrincipalSource.userInfoList with Double = js.native
  /* 2 */ val windows: typings.sharepoint.SPNs.UtilitiesNs.PrincipalSource.windows with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrincipalSource with Double] = js.native
}

