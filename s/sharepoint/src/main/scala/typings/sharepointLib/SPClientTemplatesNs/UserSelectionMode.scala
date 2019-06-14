package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserSelectionMode extends js.Object

@JSGlobal("SPClientTemplates.UserSelectionMode")
@js.native
object UserSelectionMode extends js.Object {
  @js.native
  sealed trait PeopleAndGroups
    extends sharepointLib.SPClientTemplatesNs.UserSelectionMode
  
  @js.native
  sealed trait PeopleOnly
    extends sharepointLib.SPClientTemplatesNs.UserSelectionMode
  
  /* 1 */ val PeopleAndGroups: PeopleAndGroups with scala.Double = js.native
  /* 0 */ val PeopleOnly: PeopleOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPClientTemplatesNs.UserSelectionMode with scala.Double] = js.native
}

