package typings.sharepoint.SPNs.SharingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Role extends js.Object

@JSGlobal("SP.Sharing.Role")
@js.native
object Role extends js.Object {
  @js.native
  sealed trait edit extends Role
  
  @js.native
  sealed trait none extends Role
  
  @js.native
  sealed trait owner extends Role
  
  @js.native
  sealed trait view extends Role
  
  /* 2 */ val edit: typings.sharepoint.SPNs.SharingNs.Role.edit with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.SharingNs.Role.none with Double = js.native
  /* 3 */ val owner: typings.sharepoint.SPNs.SharingNs.Role.owner with Double = js.native
  /* 1 */ val view: typings.sharepoint.SPNs.SharingNs.Role.view with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Role with Double] = js.native
}

