package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
