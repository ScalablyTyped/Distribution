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
  
  val education: education with java.lang.String = js.native
  val guest: guest with java.lang.String = js.native
  val myTasksDashboard: myTasksDashboard with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val profile: profile with java.lang.String = js.native
  val social: social with java.lang.String = js.native
  val storage: storage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.PersonalSiteCapabilities with java.lang.String] = js.native
}

