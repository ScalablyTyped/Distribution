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
  
  val canLock: canLock with java.lang.String = js.native
  val canReply: canReply with java.lang.String = js.native
  val isDigest: isDigest with java.lang.String = js.native
  val isLocked: isLocked with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val replyLimitReached: replyLimitReached with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialThreadAttributes with java.lang.String] = js.native
}

