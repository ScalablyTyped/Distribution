package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserSelectionMode extends js.Object

@JSGlobal("SPClientTemplates.UserSelectionMode")
@js.native
object UserSelectionMode extends js.Object {
  @js.native
  sealed trait PeopleAndGroups extends UserSelectionMode
  
  @js.native
  sealed trait PeopleOnly extends UserSelectionMode
  
  /* 1 */ val PeopleAndGroups: typings.sharepoint.SPClientTemplatesNs.UserSelectionMode.PeopleAndGroups with Double = js.native
  /* 0 */ val PeopleOnly: typings.sharepoint.SPClientTemplatesNs.UserSelectionMode.PeopleOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserSelectionMode with Double] = js.native
}

