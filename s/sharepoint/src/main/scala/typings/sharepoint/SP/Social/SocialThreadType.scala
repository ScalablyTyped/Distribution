package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Social.SocialThreadType.likeReference
import typings.sharepoint.SP.Social.SocialThreadType.mentionReference
import typings.sharepoint.SP.Social.SocialThreadType.normal
import typings.sharepoint.SP.Social.SocialThreadType.replyReference
import typings.sharepoint.SP.Social.SocialThreadType.tagReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialThreadType extends js.Object

@JSGlobal("SP.Social.SocialThreadType")
@js.native
object SocialThreadType extends js.Object {
  @js.native
  sealed trait likeReference extends SocialThreadType
  
  @js.native
  sealed trait mentionReference extends SocialThreadType
  
  @js.native
  sealed trait normal extends SocialThreadType
  
  @js.native
  sealed trait replyReference extends SocialThreadType
  
  @js.native
  sealed trait tagReference extends SocialThreadType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialThreadType with Double] = js.native
  /* 1 */ @js.native
  object likeReference extends TopLevel[likeReference with Double]
  
  /* 3 */ @js.native
  object mentionReference extends TopLevel[mentionReference with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 2 */ @js.native
  object replyReference extends TopLevel[replyReference with Double]
  
  /* 4 */ @js.native
  object tagReference extends TopLevel[tagReference with Double]
  
}

