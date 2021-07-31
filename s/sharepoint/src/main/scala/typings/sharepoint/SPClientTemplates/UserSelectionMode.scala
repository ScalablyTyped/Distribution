package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserSelectionMode extends StObject
@JSGlobal("SPClientTemplates.UserSelectionMode")
@js.native
object UserSelectionMode extends StObject {
  
  @js.native
  sealed trait PeopleAndGroups
    extends StObject
       with UserSelectionMode
  
  @js.native
  sealed trait PeopleOnly
    extends StObject
       with UserSelectionMode
}
