package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val canDelete: typings.sharepoint.SP.Social.SocialPostAttributes.canDelete with Double = js.native
  /* 5 */ val canFollowUp: typings.sharepoint.SP.Social.SocialPostAttributes.canFollowUp with Double = js.native
  /* 1 */ val canLike: typings.sharepoint.SP.Social.SocialPostAttributes.canLike with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.Social.SocialPostAttributes.none with Double = js.native
  /* 3 */ val useAuthorImage: typings.sharepoint.SP.Social.SocialPostAttributes.useAuthorImage with Double = js.native
  /* 4 */ val useSmallImage: typings.sharepoint.SP.Social.SocialPostAttributes.useSmallImage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialPostAttributes with Double] = js.native
}

