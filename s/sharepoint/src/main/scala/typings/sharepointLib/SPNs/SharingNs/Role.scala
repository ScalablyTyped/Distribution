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
  
  val edit: edit with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val owner: owner with java.lang.String = js.native
  val view: view with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SharingNs.Role with java.lang.String] = js.native
}

