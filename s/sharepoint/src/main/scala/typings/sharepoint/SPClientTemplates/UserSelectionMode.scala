package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SPClientTemplates.UserSelectionMode.PeopleAndGroups
import typings.sharepoint.SPClientTemplates.UserSelectionMode.PeopleOnly
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserSelectionMode with Double] = js.native
  /* 1 */ @js.native
  object PeopleAndGroups extends TopLevel[PeopleAndGroups with Double]
  
  /* 0 */ @js.native
  object PeopleOnly extends TopLevel[PeopleOnly with Double]
  
}

