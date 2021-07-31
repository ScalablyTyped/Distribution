package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FollowedContentQueryOptions extends StObject
@JSGlobal("SP.UserProfiles.FollowedContentQueryOptions")
@js.native
object FollowedContentQueryOptions extends StObject {
  
  @js.native
  sealed trait all
    extends StObject
       with FollowedContentQueryOptions
  
  @js.native
  sealed trait defaultOptions
    extends StObject
       with FollowedContentQueryOptions
  
  @js.native
  sealed trait documents
    extends StObject
       with FollowedContentQueryOptions
  
  @js.native
  sealed trait hidden
    extends StObject
       with FollowedContentQueryOptions
  
  @js.native
  sealed trait nonFeed
    extends StObject
       with FollowedContentQueryOptions
  
  @js.native
  sealed trait sites
    extends StObject
       with FollowedContentQueryOptions
  
  @js.native
  sealed trait unset
    extends StObject
       with FollowedContentQueryOptions
}
