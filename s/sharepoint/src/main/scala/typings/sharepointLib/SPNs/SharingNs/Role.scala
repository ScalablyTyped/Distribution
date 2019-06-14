package typings
package sharepointLib.SPNs.SharingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Role extends js.Object

@JSGlobal("SP.Sharing.Role")
@js.native
object Role extends js.Object {
  @js.native
  sealed trait edit
    extends sharepointLib.SPNs.SharingNs.Role
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.SharingNs.Role
  
  @js.native
  sealed trait owner
    extends sharepointLib.SPNs.SharingNs.Role
  
  @js.native
  sealed trait view
    extends sharepointLib.SPNs.SharingNs.Role
  
  /* 2 */ val edit: edit with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val owner: owner with scala.Double = js.native
  /* 1 */ val view: view with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SharingNs.Role with scala.Double] = js.native
}

