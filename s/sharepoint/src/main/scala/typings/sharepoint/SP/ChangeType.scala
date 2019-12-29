package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeType with Double] = js.native
  /* 1 */ @js.native
  object add extends TopLevel[add with Double]
  
  /* 11 */ @js.native
  object assignmentAdd extends TopLevel[assignmentAdd with Double]
  
  /* 12 */ @js.native
  object assignmentDelete extends TopLevel[assignmentDelete with Double]
  
  /* 3 */ @js.native
  object deleteObject extends TopLevel[deleteObject with Double]
  
  /* 19 */ @js.native
  object listContentTypeAdd extends TopLevel[listContentTypeAdd with Double]
  
  /* 20 */ @js.native
  object listContentTypeDelete extends TopLevel[listContentTypeDelete with Double]
  
  /* 13 */ @js.native
  object memberAdd extends TopLevel[memberAdd with Double]
  
  /* 14 */ @js.native
  object memberDelete extends TopLevel[memberDelete with Double]
  
  /* 5 */ @js.native
  object moveAway extends TopLevel[moveAway with Double]
  
  /* 6 */ @js.native
  object moveInto extends TopLevel[moveInto with Double]
  
  /* 16 */ @js.native
  object navigation extends TopLevel[navigation with Double]
  
  /* 0 */ @js.native
  object noChange extends TopLevel[noChange with Double]
  
  /* 4 */ @js.native
  object rename extends TopLevel[rename with Double]
  
  /* 7 */ @js.native
  object restore extends TopLevel[restore with Double]
  
  /* 8 */ @js.native
  object roleAdd extends TopLevel[roleAdd with Double]
  
  /* 9 */ @js.native
  object roleDelete extends TopLevel[roleDelete with Double]
  
  /* 10 */ @js.native
  object roleUpdate extends TopLevel[roleUpdate with Double]
  
  /* 17 */ @js.native
  object scopeAdd extends TopLevel[scopeAdd with Double]
  
  /* 18 */ @js.native
  object scopeDelete extends TopLevel[scopeDelete with Double]
  
  /* 15 */ @js.native
  object systemUpdate extends TopLevel[systemUpdate with Double]
  
  /* 2 */ @js.native
  object update extends TopLevel[update with Double]
  
}

