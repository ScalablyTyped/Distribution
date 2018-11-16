package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedContentExceptionType extends js.Object

@JSGlobal("SP.UserProfiles.FollowedContentExceptionType")
@js.native
object FollowedContentExceptionType extends js.Object {
  @js.native
  sealed trait followLimitReached
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType
  
  @js.native
  sealed trait internalError
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType
  
  @js.native
  sealed trait invalidQueryString
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType
  
  @js.native
  sealed trait invalidSubtypeValue
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType
  
  @js.native
  sealed trait itemAlreadyExists
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType
  
  @js.native
  sealed trait itemDoesNotExist
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType
  
  @js.native
  sealed trait unsupportedItemType
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType
  
  @js.native
  sealed trait unsupportedSite
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType
  
  @js.native
  sealed trait untrustedSource
    extends sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType
  
  val followLimitReached: followLimitReached with java.lang.String = js.native
  val internalError: internalError with java.lang.String = js.native
  val invalidQueryString: invalidQueryString with java.lang.String = js.native
  val invalidSubtypeValue: invalidSubtypeValue with java.lang.String = js.native
  val itemAlreadyExists: itemAlreadyExists with java.lang.String = js.native
  val itemDoesNotExist: itemDoesNotExist with java.lang.String = js.native
  val unsupportedItemType: unsupportedItemType with java.lang.String = js.native
  val unsupportedSite: unsupportedSite with java.lang.String = js.native
  val untrustedSource: untrustedSource with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType with java.lang.String
  ] = js.native
}

