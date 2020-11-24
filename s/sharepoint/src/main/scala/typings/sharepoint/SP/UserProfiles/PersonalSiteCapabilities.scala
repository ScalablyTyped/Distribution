package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonalSiteCapabilities extends js.Object
/** Specifies the capabilities of a personal site. */
@JSGlobal("SP.UserProfiles.PersonalSiteCapabilities")
@js.native
object PersonalSiteCapabilities extends js.Object {
  
  @js.native
  sealed trait education extends PersonalSiteCapabilities
  
  @js.native
  sealed trait guest extends PersonalSiteCapabilities
  
  @js.native
  sealed trait myTasksDashboard extends PersonalSiteCapabilities
  
  @js.native
  sealed trait none extends PersonalSiteCapabilities
  
  @js.native
  sealed trait profile extends PersonalSiteCapabilities
  
  @js.native
  sealed trait social extends PersonalSiteCapabilities
  
  @js.native
  sealed trait storage extends PersonalSiteCapabilities
}
