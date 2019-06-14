package typings
package sharepointLib.SPNs.SocialNs

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
  sealed trait canLock
    extends sharepointLib.SPNs.SocialNs.SocialThreadAttributes
  
  @js.native
  sealed trait canReply
    extends sharepointLib.SPNs.SocialNs.SocialThreadAttributes
  
  @js.native
  sealed trait isDigest
    extends sharepointLib.SPNs.SocialNs.SocialThreadAttributes
  
  @js.native
  sealed trait isLocked
    extends sharepointLib.SPNs.SocialNs.SocialThreadAttributes
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.SocialNs.SocialThreadAttributes
  
  @js.native
  sealed trait replyLimitReached
    extends sharepointLib.SPNs.SocialNs.SocialThreadAttributes
  
  /* 3 */ val canLock: canLock with scala.Double = js.native
  /* 2 */ val canReply: canReply with scala.Double = js.native
  /* 1 */ val isDigest: isDigest with scala.Double = js.native
  /* 4 */ val isLocked: isLocked with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 5 */ val replyLimitReached: replyLimitReached with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialThreadAttributes with scala.Double] = js.native
}

