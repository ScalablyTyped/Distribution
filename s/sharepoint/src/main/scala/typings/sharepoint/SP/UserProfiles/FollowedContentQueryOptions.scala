package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedContentQueryOptions extends js.Object

@JSGlobal("SP.UserProfiles.FollowedContentQueryOptions")
@js.native
object FollowedContentQueryOptions extends js.Object {
  @js.native
  sealed trait all extends FollowedContentQueryOptions
  
  @js.native
  sealed trait defaultOptions extends FollowedContentQueryOptions
  
  @js.native
  sealed trait documents extends FollowedContentQueryOptions
  
  @js.native
  sealed trait hidden extends FollowedContentQueryOptions
  
  @js.native
  sealed trait nonFeed extends FollowedContentQueryOptions
  
  @js.native
  sealed trait sites extends FollowedContentQueryOptions
  
  @js.native
  sealed trait unset extends FollowedContentQueryOptions
  
}

