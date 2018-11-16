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
  
  val PeopleAndGroups: PeopleAndGroups with java.lang.String = js.native
  val PeopleOnly: PeopleOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPClientTemplatesNs.UserSelectionMode with java.lang.String] = js.native
}

