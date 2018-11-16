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
  
  val peopleAndGroups: peopleAndGroups with java.lang.String = js.native
  val peopleOnly: peopleOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.FieldUserSelectionMode with java.lang.String] = js.native
}

