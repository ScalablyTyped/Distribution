package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSGlobal("SP.PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait defaultView
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait dialogView
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait displayForm
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait displayFormDialog
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait editForm
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait editFormDialog
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait invalid
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait newForm
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait newFormDialog
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait normalView
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait pAGE_MAXITEMS
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait solutionForm
    extends sharepointLib.SPNs.PageType
  
  @js.native
  sealed trait view
    extends sharepointLib.SPNs.PageType
  
  /* 1 */ val defaultView: defaultView with scala.Double = js.native
  /* 3 */ val dialogView: dialogView with scala.Double = js.native
  /* 5 */ val displayForm: displayForm with scala.Double = js.native
  /* 6 */ val displayFormDialog: displayFormDialog with scala.Double = js.native
  /* 7 */ val editForm: editForm with scala.Double = js.native
  /* 8 */ val editFormDialog: editFormDialog with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 9 */ val newForm: newForm with scala.Double = js.native
  /* 10 */ val newFormDialog: newFormDialog with scala.Double = js.native
  /* 2 */ val normalView: normalView with scala.Double = js.native
  /* 12 */ val pAGE_MAXITEMS: pAGE_MAXITEMS with scala.Double = js.native
  /* 11 */ val solutionForm: solutionForm with scala.Double = js.native
  /* 4 */ val view: view with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.PageType with scala.Double] = js.native
}

