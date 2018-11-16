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
  
  val defaultView: defaultView with java.lang.String = js.native
  val dialogView: dialogView with java.lang.String = js.native
  val displayForm: displayForm with java.lang.String = js.native
  val displayFormDialog: displayFormDialog with java.lang.String = js.native
  val editForm: editForm with java.lang.String = js.native
  val editFormDialog: editFormDialog with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val newForm: newForm with java.lang.String = js.native
  val newFormDialog: newFormDialog with java.lang.String = js.native
  val normalView: normalView with java.lang.String = js.native
  val pAGE_MAXITEMS: pAGE_MAXITEMS with java.lang.String = js.native
  val solutionForm: solutionForm with java.lang.String = js.native
  val view: view with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.PageType with java.lang.String] = js.native
}

