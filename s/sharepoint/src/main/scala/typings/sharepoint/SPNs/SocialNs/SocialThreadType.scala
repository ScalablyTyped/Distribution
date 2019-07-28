package typings.sharepoint.SPNs.SocialNs

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
  
  /* 1 */ val likeReference: typings.sharepoint.SPNs.SocialNs.SocialThreadType.likeReference with Double = js.native
  /* 3 */ val mentionReference: typings.sharepoint.SPNs.SocialNs.SocialThreadType.mentionReference with Double = js.native
  /* 0 */ val normal: typings.sharepoint.SPNs.SocialNs.SocialThreadType.normal with Double = js.native
  /* 2 */ val replyReference: typings.sharepoint.SPNs.SocialNs.SocialThreadType.replyReference with Double = js.native
  /* 4 */ val tagReference: typings.sharepoint.SPNs.SocialNs.SocialThreadType.tagReference with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialThreadType with Double] = js.native
}

