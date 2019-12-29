package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialPostAttributes with Double] = js.native
  /* 2 */ @js.native
  object canDelete extends TopLevel[canDelete with Double]
  
  /* 5 */ @js.native
  object canFollowUp extends TopLevel[canFollowUp with Double]
  
  /* 1 */ @js.native
  object canLike extends TopLevel[canLike with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object useAuthorImage extends TopLevel[useAuthorImage with Double]
  
  /* 4 */ @js.native
  object useSmallImage extends TopLevel[useSmallImage with Double]
  
}

