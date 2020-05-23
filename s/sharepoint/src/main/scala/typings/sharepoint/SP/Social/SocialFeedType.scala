package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialFeedType extends js.Object

/** Identifies the kind of post to be retrieved.  */
@JSGlobal("SP.Social.SocialFeedType")
@js.native
object SocialFeedType extends js.Object {
  @js.native
  sealed trait everyone extends SocialFeedType
  
  @js.native
  sealed trait likes extends SocialFeedType
  
  @js.native
  sealed trait news extends SocialFeedType
  
  @js.native
  sealed trait personal extends SocialFeedType
  
  @js.native
  sealed trait timeline extends SocialFeedType
  
}

