package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 5 */ val education: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.education with Double = js.native
  /* 6 */ val guest: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.guest with Double = js.native
  /* 4 */ val myTasksDashboard: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.myTasksDashboard with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.none with Double = js.native
  /* 1 */ val profile: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.profile with Double = js.native
  /* 2 */ val social: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.social with Double = js.native
  /* 3 */ val storage: typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.storage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonalSiteCapabilities with Double] = js.native
}

