package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeType extends js.Object

@JSGlobal("SP.ChangeType")
@js.native
object ChangeType extends js.Object {
  @js.native
  sealed trait add
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait assignmentAdd
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait assignmentDelete
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait deleteObject
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait listContentTypeAdd
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait listContentTypeDelete
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait memberAdd
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait memberDelete
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait moveAway
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait moveInto
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait navigation
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait noChange
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait rename
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait restore
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait roleAdd
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait roleDelete
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait roleUpdate
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait scopeAdd
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait scopeDelete
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait systemUpdate
    extends sharepointLib.SPNs.ChangeType
  
  @js.native
  sealed trait update
    extends sharepointLib.SPNs.ChangeType
  
  val add: add with java.lang.String = js.native
  val assignmentAdd: assignmentAdd with java.lang.String = js.native
  val assignmentDelete: assignmentDelete with java.lang.String = js.native
  val deleteObject: deleteObject with java.lang.String = js.native
  val listContentTypeAdd: listContentTypeAdd with java.lang.String = js.native
  val listContentTypeDelete: listContentTypeDelete with java.lang.String = js.native
  val memberAdd: memberAdd with java.lang.String = js.native
  val memberDelete: memberDelete with java.lang.String = js.native
  val moveAway: moveAway with java.lang.String = js.native
  val moveInto: moveInto with java.lang.String = js.native
  val navigation: navigation with java.lang.String = js.native
  val noChange: noChange with java.lang.String = js.native
  val rename: rename with java.lang.String = js.native
  val restore: restore with java.lang.String = js.native
  val roleAdd: roleAdd with java.lang.String = js.native
  val roleDelete: roleDelete with java.lang.String = js.native
  val roleUpdate: roleUpdate with java.lang.String = js.native
  val scopeAdd: scopeAdd with java.lang.String = js.native
  val scopeDelete: scopeDelete with java.lang.String = js.native
  val systemUpdate: systemUpdate with java.lang.String = js.native
  val update: update with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ChangeType with java.lang.String] = js.native
}

