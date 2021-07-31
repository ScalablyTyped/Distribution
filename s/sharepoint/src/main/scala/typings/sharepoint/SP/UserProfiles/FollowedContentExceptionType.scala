package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FollowedContentExceptionType extends StObject
@JSGlobal("SP.UserProfiles.FollowedContentExceptionType")
@js.native
object FollowedContentExceptionType extends StObject {
  
  @js.native
  sealed trait followLimitReached
    extends StObject
       with FollowedContentExceptionType
  
  @js.native
  sealed trait internalError
    extends StObject
       with FollowedContentExceptionType
  
  @js.native
  sealed trait invalidQueryString
    extends StObject
       with FollowedContentExceptionType
  
  @js.native
  sealed trait invalidSubtypeValue
    extends StObject
       with FollowedContentExceptionType
  
  @js.native
  sealed trait itemAlreadyExists
    extends StObject
       with FollowedContentExceptionType
  
  @js.native
  sealed trait itemDoesNotExist
    extends StObject
       with FollowedContentExceptionType
  
  @js.native
  sealed trait unsupportedItemType
    extends StObject
       with FollowedContentExceptionType
  
  @js.native
  sealed trait unsupportedSite
    extends StObject
       with FollowedContentExceptionType
  
  @js.native
  sealed trait untrustedSource
    extends StObject
       with FollowedContentExceptionType
}
