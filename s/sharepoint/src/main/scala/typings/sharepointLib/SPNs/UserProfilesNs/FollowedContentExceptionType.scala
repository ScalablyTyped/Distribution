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
  
  /* 5 */ val followLimitReached: followLimitReached with scala.Double = js.native
  /* 8 */ val internalError: internalError with scala.Double = js.native
  /* 2 */ val invalidQueryString: invalidQueryString with scala.Double = js.native
  /* 3 */ val invalidSubtypeValue: invalidSubtypeValue with scala.Double = js.native
  /* 0 */ val itemAlreadyExists: itemAlreadyExists with scala.Double = js.native
  /* 1 */ val itemDoesNotExist: itemDoesNotExist with scala.Double = js.native
  /* 4 */ val unsupportedItemType: unsupportedItemType with scala.Double = js.native
  /* 7 */ val unsupportedSite: unsupportedSite with scala.Double = js.native
  /* 6 */ val untrustedSource: untrustedSource with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.FollowedContentExceptionType with scala.Double] = js.native
}

