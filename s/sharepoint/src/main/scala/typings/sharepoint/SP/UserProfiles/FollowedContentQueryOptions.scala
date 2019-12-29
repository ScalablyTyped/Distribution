package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedContentQueryOptions with Double] = js.native
  /* 6 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 5 */ @js.native
  object defaultOptions extends TopLevel[defaultOptions with Double]
  
  /* 2 */ @js.native
  object documents extends TopLevel[documents with Double]
  
  /* 3 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 4 */ @js.native
  object nonFeed extends TopLevel[nonFeed with Double]
  
  /* 1 */ @js.native
  object sites extends TopLevel[sites with Double]
  
  /* 0 */ @js.native
  object unset extends TopLevel[unset with Double]
  
}

