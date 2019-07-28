package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeType extends js.Object

@JSGlobal("SP.ChangeType")
@js.native
object ChangeType extends js.Object {
  @js.native
  sealed trait add extends ChangeType
  
  @js.native
  sealed trait assignmentAdd extends ChangeType
  
  @js.native
  sealed trait assignmentDelete extends ChangeType
  
  @js.native
  sealed trait deleteObject extends ChangeType
  
  @js.native
  sealed trait listContentTypeAdd extends ChangeType
  
  @js.native
  sealed trait listContentTypeDelete extends ChangeType
  
  @js.native
  sealed trait memberAdd extends ChangeType
  
  @js.native
  sealed trait memberDelete extends ChangeType
  
  @js.native
  sealed trait moveAway extends ChangeType
  
  @js.native
  sealed trait moveInto extends ChangeType
  
  @js.native
  sealed trait navigation extends ChangeType
  
  @js.native
  sealed trait noChange extends ChangeType
  
  @js.native
  sealed trait rename extends ChangeType
  
  @js.native
  sealed trait restore extends ChangeType
  
  @js.native
  sealed trait roleAdd extends ChangeType
  
  @js.native
  sealed trait roleDelete extends ChangeType
  
  @js.native
  sealed trait roleUpdate extends ChangeType
  
  @js.native
  sealed trait scopeAdd extends ChangeType
  
  @js.native
  sealed trait scopeDelete extends ChangeType
  
  @js.native
  sealed trait systemUpdate extends ChangeType
  
  @js.native
  sealed trait update extends ChangeType
  
  /* 1 */ val add: typings.sharepoint.SPNs.ChangeType.add with Double = js.native
  /* 11 */ val assignmentAdd: typings.sharepoint.SPNs.ChangeType.assignmentAdd with Double = js.native
  /* 12 */ val assignmentDelete: typings.sharepoint.SPNs.ChangeType.assignmentDelete with Double = js.native
  /* 3 */ val deleteObject: typings.sharepoint.SPNs.ChangeType.deleteObject with Double = js.native
  /* 19 */ val listContentTypeAdd: typings.sharepoint.SPNs.ChangeType.listContentTypeAdd with Double = js.native
  /* 20 */ val listContentTypeDelete: typings.sharepoint.SPNs.ChangeType.listContentTypeDelete with Double = js.native
  /* 13 */ val memberAdd: typings.sharepoint.SPNs.ChangeType.memberAdd with Double = js.native
  /* 14 */ val memberDelete: typings.sharepoint.SPNs.ChangeType.memberDelete with Double = js.native
  /* 5 */ val moveAway: typings.sharepoint.SPNs.ChangeType.moveAway with Double = js.native
  /* 6 */ val moveInto: typings.sharepoint.SPNs.ChangeType.moveInto with Double = js.native
  /* 16 */ val navigation: typings.sharepoint.SPNs.ChangeType.navigation with Double = js.native
  /* 0 */ val noChange: typings.sharepoint.SPNs.ChangeType.noChange with Double = js.native
  /* 4 */ val rename: typings.sharepoint.SPNs.ChangeType.rename with Double = js.native
  /* 7 */ val restore: typings.sharepoint.SPNs.ChangeType.restore with Double = js.native
  /* 8 */ val roleAdd: typings.sharepoint.SPNs.ChangeType.roleAdd with Double = js.native
  /* 9 */ val roleDelete: typings.sharepoint.SPNs.ChangeType.roleDelete with Double = js.native
  /* 10 */ val roleUpdate: typings.sharepoint.SPNs.ChangeType.roleUpdate with Double = js.native
  /* 17 */ val scopeAdd: typings.sharepoint.SPNs.ChangeType.scopeAdd with Double = js.native
  /* 18 */ val scopeDelete: typings.sharepoint.SPNs.ChangeType.scopeDelete with Double = js.native
  /* 15 */ val systemUpdate: typings.sharepoint.SPNs.ChangeType.systemUpdate with Double = js.native
  /* 2 */ val update: typings.sharepoint.SPNs.ChangeType.update with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeType with Double] = js.native
}

