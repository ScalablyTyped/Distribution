package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for operations related to people.
            Note: The SocialFollowingManager object is the recommended object for performing Following People and Following Content tasks.
            However, PeopleManager provides some methods that SocialFollowingManager doesn't. */
@JSGlobal("SP.UserProfiles.PeopleManager")
@js.native
class PeopleManager protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext) = this()
  def amIFollowedBy(accountName: java.lang.String): sharepointLib.SPNs.BooleanResult = js.native
  def amIFollowing(accountName: java.lang.String): sharepointLib.SPNs.BooleanResult = js.native
  def follow(accountName: java.lang.String): scala.Unit = js.native
  /** Add the specified tag to the current user's list of followed tags.
                  @param tagId GUID of the tag to start following. */
  def followTag(tagId: java.lang.String): scala.Unit = js.native
  /** Gets tags that the user is following. */
  def getFollowedTags(numberOfTagsToFetch: scala.Double): js.Array[java.lang.String] = js.native
  def getFollowersFor(accountName: java.lang.String): sharepointLib.SPNs.ClientObjectList[PersonProperties] = js.native
  def getMyFollowers(): sharepointLib.SPNs.ClientObjectList[PersonProperties] = js.native
  /** Gets user properties for the current user. */
  def getMyProperties(): PersonProperties = js.native
  /** Gets suggestions for who the current user might want to follow.
                  Note: The recommended API to use for this task is SocialFollowingManager.getSuggestions.
                  Returns list of PersonProperties objects */
  def getMySuggestions(): sharepointLib.SPNs.ClientObjectList[PersonProperties] = js.native
  def getPeopleFollowedBy(accountName: java.lang.String): sharepointLib.SPNs.ClientObjectList[PersonProperties] = js.native
  def getPeopleFollowedByMe(): sharepointLib.SPNs.ClientObjectList[PersonProperties] = js.native
  def getPropertiesFor(accountName: java.lang.String): PersonProperties = js.native
  /** Gets the specified user profile properties for the specified user. */
  def getUserProfilePropertiesFor(propertiesForUser: UserProfilePropertiesForUser): js.Array[_] = js.native
  /** Gets the specified user profile property for the specified user. */
  def getUserProfilePropertyFor(accountName: java.lang.String, propertyName: java.lang.String): java.lang.String = js.native
  /** Gets the URL of the edit profile page for the current user. */
  def get_editProfileLink(): java.lang.String = js.native
  /** Gets a Boolean value that indicates whether the current user's People I'm Following list is public. */
  def get_isMyPeopleListPublic(): scala.Boolean = js.native
  /** Removes the specified user from the user's list of suggested people to follow. */
  def hideSuggestion(accountName: java.lang.String): scala.Unit = js.native
  /** Uploads and sets the user profile picture.
                  Pictures in bmp, jpg and png formats and up to 5,000,000 bytes are supported.
                  A user can upload a picture only to the user's own profile.
                  @param data Binary content of an image file */
  def setMyProfilePicture(data: sharepointLib.SPNs.Base64EncodedByteArray): scala.Unit = js.native
  def stopFollowing(accountName: java.lang.String): scala.Unit = js.native
  /** Remove the specified tag from the current user's list of followed tags.
                  @param tagId GUID of the tag to stop following. */
  def stopFollowingTag(tagId: java.lang.String): scala.Unit = js.native
}

/** Provides methods for operations related to people.
            Note: The SocialFollowingManager object is the recommended object for performing Following People and Following Content tasks.
            However, PeopleManager provides some methods that SocialFollowingManager doesn't. */
@JSGlobal("SP.UserProfiles.PeopleManager")
@js.native
object PeopleManager extends js.Object {
  def getTrendingTags(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.UserProfilesNs.HashTagCollection = js.native
  /** Checks whether the first user is following the second user. */
  def isFollowing(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    possibleFollowerAccountName: java.lang.String,
    possibleFolloweeAccountName: java.lang.String
  ): sharepointLib.SPNs.BooleanResult = js.native
}

