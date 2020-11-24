package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialPostAttributes extends js.Object
/** Specifies attributes of the post, such as whether the current user can like or delete the post. */
@JSGlobal("SP.Social.SocialPostAttributes")
@js.native
object SocialPostAttributes extends js.Object {
  
  @js.native
  sealed trait canDelete extends SocialPostAttributes
  
  @js.native
  sealed trait canFollowUp extends SocialPostAttributes
  
  @js.native
  sealed trait canLike extends SocialPostAttributes
  
  @js.native
  sealed trait none extends SocialPostAttributes
  
  @js.native
  sealed trait useAuthorImage extends SocialPostAttributes
  
  @js.native
  sealed trait useSmallImage extends SocialPostAttributes
}
