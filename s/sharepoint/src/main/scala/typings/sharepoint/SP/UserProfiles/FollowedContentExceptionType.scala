package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedContentExceptionType extends js.Object

@JSGlobal("SP.UserProfiles.FollowedContentExceptionType")
@js.native
object FollowedContentExceptionType extends js.Object {
  @js.native
  sealed trait followLimitReached extends FollowedContentExceptionType
  
  @js.native
  sealed trait internalError extends FollowedContentExceptionType
  
  @js.native
  sealed trait invalidQueryString extends FollowedContentExceptionType
  
  @js.native
  sealed trait invalidSubtypeValue extends FollowedContentExceptionType
  
  @js.native
  sealed trait itemAlreadyExists extends FollowedContentExceptionType
  
  @js.native
  sealed trait itemDoesNotExist extends FollowedContentExceptionType
  
  @js.native
  sealed trait unsupportedItemType extends FollowedContentExceptionType
  
  @js.native
  sealed trait unsupportedSite extends FollowedContentExceptionType
  
  @js.native
  sealed trait untrustedSource extends FollowedContentExceptionType
  
  /* 5 */ val followLimitReached: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.followLimitReached with Double = js.native
  /* 8 */ val internalError: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.internalError with Double = js.native
  /* 2 */ val invalidQueryString: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.invalidQueryString with Double = js.native
  /* 3 */ val invalidSubtypeValue: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.invalidSubtypeValue with Double = js.native
  /* 0 */ val itemAlreadyExists: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.itemAlreadyExists with Double = js.native
  /* 1 */ val itemDoesNotExist: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.itemDoesNotExist with Double = js.native
  /* 4 */ val unsupportedItemType: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.unsupportedItemType with Double = js.native
  /* 7 */ val unsupportedSite: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.unsupportedSite with Double = js.native
  /* 6 */ val untrustedSource: typings.sharepoint.SP.UserProfiles.FollowedContentExceptionType.untrustedSource with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedContentExceptionType with Double] = js.native
}

