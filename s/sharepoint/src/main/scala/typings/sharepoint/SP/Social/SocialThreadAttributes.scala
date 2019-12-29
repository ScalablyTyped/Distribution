package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialThreadAttributes with Double] = js.native
  /* 3 */ @js.native
  object canLock extends TopLevel[canLock with Double]
  
  /* 2 */ @js.native
  object canReply extends TopLevel[canReply with Double]
  
  /* 1 */ @js.native
  object isDigest extends TopLevel[isDigest with Double]
  
  /* 4 */ @js.native
  object isLocked extends TopLevel[isLocked with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object replyLimitReached extends TopLevel[replyLimitReached with Double]
  
}

