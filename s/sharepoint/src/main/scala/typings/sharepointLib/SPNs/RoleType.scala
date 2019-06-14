package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoleType extends js.Object

@JSGlobal("SP.RoleType")
@js.native
object RoleType extends js.Object {
  @js.native
  sealed trait administrator
    extends sharepointLib.SPNs.RoleType
  
  @js.native
  sealed trait contributor
    extends sharepointLib.SPNs.RoleType
  
  @js.native
  sealed trait editor
    extends sharepointLib.SPNs.RoleType
  
  @js.native
  sealed trait guest
    extends sharepointLib.SPNs.RoleType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.RoleType
  
  @js.native
  sealed trait reader
    extends sharepointLib.SPNs.RoleType
  
  @js.native
  sealed trait webDesigner
    extends sharepointLib.SPNs.RoleType
  
  /* 5 */ val administrator: administrator with scala.Double = js.native
  /* 3 */ val contributor: contributor with scala.Double = js.native
  /* 6 */ val editor: editor with scala.Double = js.native
  /* 1 */ val guest: guest with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val reader: reader with scala.Double = js.native
  /* 4 */ val webDesigner: webDesigner with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.RoleType with scala.Double] = js.native
}

