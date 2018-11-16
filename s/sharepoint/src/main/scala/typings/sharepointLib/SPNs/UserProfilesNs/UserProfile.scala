package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a client-side user profile for a person.
            Note: The client-side UserProfile object provides methods you can use to create a personal site for the current user.
            However, it does not contain the user properties that the server-side UserProfile object contains.
            To access user properties from client-side code, use PeopleManager */
@JSGlobal("SP.UserProfiles.UserProfile")
@js.native
class UserProfile ()
  extends sharepointLib.SPNs.ClientObject {
  /** This member is reserved for internal use and is not intended to be used directly from your code.
                  Use the createPersonalSiteEnque method to create a personal site. */
  def createPersonalSite(lcid: scala.Double): scala.Unit = js.native
  /** Enquees creation of a personal site for the current user.
                  @param isInteractive Has a true value if the request is from a web browser and a false value if the request is from a client application. */
  def createPersonalSiteEnque(isInteractive: scala.Boolean): scala.Unit = js.native
  /** Represents the content that the user is following. */
  def get_followedContent(): FollowedContent = js.native
  /** Retrieves SP.Site object that represents the user's personal site. */
  def get_personalSite(): sharepointLib.SPNs.Site = js.native
  /** Specifies attributes of the user's personal site. */
  def get_personalSiteCapabilities(): PersonalSiteCapabilities = js.native
  /** Provides the state of the user's personal site */
  def get_personalSiteInstantiationState(): PersonalSiteInstantiationState = js.native
  /** Specifies whether the user can import pictures */
  def get_pictureImportEnabled(): scala.Boolean = js.native
  /** Specifies the URL to allow the current user to create a personal site. */
  def get_urlToCreatePersonalSite(): java.lang.String = js.native
  /** Specifies whether the current user's social data is to be shared. */
  def shareAllSocialData(shareAll: scala.Boolean): scala.Unit = js.native
}

