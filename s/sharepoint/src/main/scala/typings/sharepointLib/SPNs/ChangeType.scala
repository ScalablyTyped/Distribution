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
  
  /* 1 */ val add: add with scala.Double = js.native
  /* 11 */ val assignmentAdd: assignmentAdd with scala.Double = js.native
  /* 12 */ val assignmentDelete: assignmentDelete with scala.Double = js.native
  /* 3 */ val deleteObject: deleteObject with scala.Double = js.native
  /* 19 */ val listContentTypeAdd: listContentTypeAdd with scala.Double = js.native
  /* 20 */ val listContentTypeDelete: listContentTypeDelete with scala.Double = js.native
  /* 13 */ val memberAdd: memberAdd with scala.Double = js.native
  /* 14 */ val memberDelete: memberDelete with scala.Double = js.native
  /* 5 */ val moveAway: moveAway with scala.Double = js.native
  /* 6 */ val moveInto: moveInto with scala.Double = js.native
  /* 16 */ val navigation: navigation with scala.Double = js.native
  /* 0 */ val noChange: noChange with scala.Double = js.native
  /* 4 */ val rename: rename with scala.Double = js.native
  /* 7 */ val restore: restore with scala.Double = js.native
  /* 8 */ val roleAdd: roleAdd with scala.Double = js.native
  /* 9 */ val roleDelete: roleDelete with scala.Double = js.native
  /* 10 */ val roleUpdate: roleUpdate with scala.Double = js.native
  /* 17 */ val scopeAdd: scopeAdd with scala.Double = js.native
  /* 18 */ val scopeDelete: scopeDelete with scala.Double = js.native
  /* 15 */ val systemUpdate: systemUpdate with scala.Double = js.native
  /* 2 */ val update: update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ChangeType with scala.Double] = js.native
}

