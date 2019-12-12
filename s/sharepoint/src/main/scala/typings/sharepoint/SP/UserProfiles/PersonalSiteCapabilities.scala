package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.education
import typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.guest
import typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.myTasksDashboard
import typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.none
import typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.profile
import typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.social
import typings.sharepoint.SP.UserProfiles.PersonalSiteCapabilities.storage
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonalSiteCapabilities with Double] = js.native
  /* 5 */ @js.native
  object education extends TopLevel[education with Double]
  
  /* 6 */ @js.native
  object guest extends TopLevel[guest with Double]
  
  /* 4 */ @js.native
  object myTasksDashboard extends TopLevel[myTasksDashboard with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object profile extends TopLevel[profile with Double]
  
  /* 2 */ @js.native
  object social extends TopLevel[social with Double]
  
  /* 3 */ @js.native
  object storage extends TopLevel[storage with Double]
  
}

