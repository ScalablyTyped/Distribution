package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedContentExceptionType with Double] = js.native
  /* 5 */ @js.native
  object followLimitReached extends TopLevel[followLimitReached with Double]
  
  /* 8 */ @js.native
  object internalError extends TopLevel[internalError with Double]
  
  /* 2 */ @js.native
  object invalidQueryString extends TopLevel[invalidQueryString with Double]
  
  /* 3 */ @js.native
  object invalidSubtypeValue extends TopLevel[invalidSubtypeValue with Double]
  
  /* 0 */ @js.native
  object itemAlreadyExists extends TopLevel[itemAlreadyExists with Double]
  
  /* 1 */ @js.native
  object itemDoesNotExist extends TopLevel[itemDoesNotExist with Double]
  
  /* 4 */ @js.native
  object unsupportedItemType extends TopLevel[unsupportedItemType with Double]
  
  /* 7 */ @js.native
  object unsupportedSite extends TopLevel[unsupportedSite with Double]
  
  /* 6 */ @js.native
  object untrustedSource extends TopLevel[untrustedSource with Double]
  
}

