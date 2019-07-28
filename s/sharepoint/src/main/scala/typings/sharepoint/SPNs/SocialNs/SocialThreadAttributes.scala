package typings.sharepoint.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialThreadAttributes extends js.Object

/** Specifies properties of the thread. */
@JSGlobal("SP.Social.SocialThreadAttributes")
@js.native
object SocialThreadAttributes extends js.Object {
  @js.native
  sealed trait canLock extends SocialThreadAttributes
  
  @js.native
  sealed trait canReply extends SocialThreadAttributes
  
  @js.native
  sealed trait isDigest extends SocialThreadAttributes
  
  @js.native
  sealed trait isLocked extends SocialThreadAttributes
  
  @js.native
  sealed trait none extends SocialThreadAttributes
  
  @js.native
  sealed trait replyLimitReached extends SocialThreadAttributes
  
  /* 3 */ val canLock: typings.sharepoint.SPNs.SocialNs.SocialThreadAttributes.canLock with Double = js.native
  /* 2 */ val canReply: typings.sharepoint.SPNs.SocialNs.SocialThreadAttributes.canReply with Double = js.native
  /* 1 */ val isDigest: typings.sharepoint.SPNs.SocialNs.SocialThreadAttributes.isDigest with Double = js.native
  /* 4 */ val isLocked: typings.sharepoint.SPNs.SocialNs.SocialThreadAttributes.isLocked with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.SocialNs.SocialThreadAttributes.none with Double = js.native
  /* 5 */ val replyLimitReached: typings.sharepoint.SPNs.SocialNs.SocialThreadAttributes.replyLimitReached with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialThreadAttributes with Double] = js.native
}

