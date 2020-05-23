package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.Base64EncodedByteArray
import typings.sharepoint.SP.BooleanResult
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.ClientObjectList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for operations related to people.
  Note: The SocialFollowingManager object is the recommended object for performing Following People and Following Content tasks.
  However, PeopleManager provides some methods that SocialFollowingManager doesn't. */
@js.native
trait PeopleManager extends ClientObject {
  def amIFollowedBy(accountName: String): BooleanResult = js.native
  def amIFollowing(accountName: String): BooleanResult = js.native
  def follow(accountName: String): Unit = js.native
  /** Add the specified tag to the current user's list of followed tags.
    @param tagId GUID of the tag to start following. */
  def followTag(tagId: String): Unit = js.native
  /** Gets tags that the user is following. */
  def getFollowedTags(numberOfTagsToFetch: Double): js.Array[String] = js.native
  def getFollowersFor(accountName: String): ClientObjectList[PersonProperties] = js.native
  def getMyFollowers(): ClientObjectList[PersonProperties] = js.native
  /** Gets user properties for the current user. */
  def getMyProperties(): PersonProperties = js.native
  /** Gets suggestions for who the current user might want to follow.
    Note: The recommended API to use for this task is SocialFollowingManager.getSuggestions.
    Returns list of PersonProperties objects */
  def getMySuggestions(): ClientObjectList[PersonProperties] = js.native
  def getPeopleFollowedBy(accountName: String): ClientObjectList[PersonProperties] = js.native
  def getPeopleFollowedByMe(): ClientObjectList[PersonProperties] = js.native
  def getPropertiesFor(accountName: String): PersonProperties = js.native
  /** Gets the specified user profile properties for the specified user. */
  def getUserProfilePropertiesFor(propertiesForUser: UserProfilePropertiesForUser): js.Array[_] = js.native
  /** Gets the specified user profile property for the specified user. */
  def getUserProfilePropertyFor(accountName: String, propertyName: String): String = js.native
  /** Gets the URL of the edit profile page for the current user. */
  def get_editProfileLink(): String = js.native
  /** Gets a Boolean value that indicates whether the current user's People I'm Following list is public. */
  def get_isMyPeopleListPublic(): Boolean = js.native
  /** Removes the specified user from the user's list of suggested people to follow. */
  def hideSuggestion(accountName: String): Unit = js.native
  /** Uploads and sets the user profile picture.
    Pictures in bmp, jpg and png formats and up to 5,000,000 bytes are supported.
    A user can upload a picture only to the user's own profile.
    @param data Binary content of an image file */
  def setMyProfilePicture(data: Base64EncodedByteArray): Unit = js.native
  def stopFollowing(accountName: String): Unit = js.native
  /** Remove the specified tag from the current user's list of followed tags.
    @param tagId GUID of the tag to stop following. */
  def stopFollowingTag(tagId: String): Unit = js.native
}

