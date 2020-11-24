package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
