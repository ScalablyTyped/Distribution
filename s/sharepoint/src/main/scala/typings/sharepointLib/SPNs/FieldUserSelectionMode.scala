package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldUserSelectionMode extends js.Object

@JSGlobal("SP.FieldUserSelectionMode")
@js.native
object FieldUserSelectionMode extends js.Object {
  @js.native
  sealed trait peopleAndGroups
    extends sharepointLib.SPNs.FieldUserSelectionMode
  
  @js.native
  sealed trait peopleOnly
    extends sharepointLib.SPNs.FieldUserSelectionMode
  
  /* 1 */ val peopleAndGroups: peopleAndGroups with scala.Double = js.native
  /* 0 */ val peopleOnly: peopleOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.FieldUserSelectionMode with scala.Double] = js.native
}

