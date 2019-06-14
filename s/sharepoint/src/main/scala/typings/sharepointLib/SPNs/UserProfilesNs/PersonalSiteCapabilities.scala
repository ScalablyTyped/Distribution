package typings
package sharepointLib.SPNs.UserProfilesNs

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
  sealed trait education
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteCapabilities
  
  @js.native
  sealed trait guest
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteCapabilities
  
  @js.native
  sealed trait myTasksDashboard
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteCapabilities
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteCapabilities
  
  @js.native
  sealed trait profile
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteCapabilities
  
  @js.native
  sealed trait social
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteCapabilities
  
  @js.native
  sealed trait storage
    extends sharepointLib.SPNs.UserProfilesNs.PersonalSiteCapabilities
  
  /* 5 */ val education: education with scala.Double = js.native
  /* 6 */ val guest: guest with scala.Double = js.native
  /* 4 */ val myTasksDashboard: myTasksDashboard with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val profile: profile with scala.Double = js.native
  /* 2 */ val social: social with scala.Double = js.native
  /* 3 */ val storage: storage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.PersonalSiteCapabilities with scala.Double] = js.native
}

