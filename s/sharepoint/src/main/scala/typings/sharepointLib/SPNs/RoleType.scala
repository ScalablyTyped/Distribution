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
  
  val administrator: administrator with java.lang.String = js.native
  val contributor: contributor with java.lang.String = js.native
  val editor: editor with java.lang.String = js.native
  val guest: guest with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val reader: reader with java.lang.String = js.native
  val webDesigner: webDesigner with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.RoleType with java.lang.String] = js.native
}

