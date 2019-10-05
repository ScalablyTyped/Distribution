package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldUserSelectionMode extends js.Object

@JSGlobal("SP.FieldUserSelectionMode")
@js.native
object FieldUserSelectionMode extends js.Object {
  @js.native
  sealed trait peopleAndGroups extends FieldUserSelectionMode
  
  @js.native
  sealed trait peopleOnly extends FieldUserSelectionMode
  
  /* 1 */ val peopleAndGroups: typings.sharepoint.SP.FieldUserSelectionMode.peopleAndGroups with Double = js.native
  /* 0 */ val peopleOnly: typings.sharepoint.SP.FieldUserSelectionMode.peopleOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldUserSelectionMode with Double] = js.native
}

