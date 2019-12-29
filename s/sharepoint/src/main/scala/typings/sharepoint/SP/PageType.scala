package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSGlobal("SP.PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait defaultView extends PageType
  
  @js.native
  sealed trait dialogView extends PageType
  
  @js.native
  sealed trait displayForm extends PageType
  
  @js.native
  sealed trait displayFormDialog extends PageType
  
  @js.native
  sealed trait editForm extends PageType
  
  @js.native
  sealed trait editFormDialog extends PageType
  
  @js.native
  sealed trait invalid extends PageType
  
  @js.native
  sealed trait newForm extends PageType
  
  @js.native
  sealed trait newFormDialog extends PageType
  
  @js.native
  sealed trait normalView extends PageType
  
  @js.native
  sealed trait pAGE_MAXITEMS extends PageType
  
  @js.native
  sealed trait solutionForm extends PageType
  
  @js.native
  sealed trait view extends PageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
  /* 1 */ @js.native
  object defaultView extends TopLevel[defaultView with Double]
  
  /* 3 */ @js.native
  object dialogView extends TopLevel[dialogView with Double]
  
  /* 5 */ @js.native
  object displayForm extends TopLevel[displayForm with Double]
  
  /* 6 */ @js.native
  object displayFormDialog extends TopLevel[displayFormDialog with Double]
  
  /* 7 */ @js.native
  object editForm extends TopLevel[editForm with Double]
  
  /* 8 */ @js.native
  object editFormDialog extends TopLevel[editFormDialog with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 9 */ @js.native
  object newForm extends TopLevel[newForm with Double]
  
  /* 10 */ @js.native
  object newFormDialog extends TopLevel[newFormDialog with Double]
  
  /* 2 */ @js.native
  object normalView extends TopLevel[normalView with Double]
  
  /* 12 */ @js.native
  object pAGE_MAXITEMS extends TopLevel[pAGE_MAXITEMS with Double]
  
  /* 11 */ @js.native
  object solutionForm extends TopLevel[solutionForm with Double]
  
  /* 4 */ @js.native
  object view extends TopLevel[view with Double]
  
}

