package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialThreadType extends js.Object

@JSGlobal("SP.Social.SocialThreadType")
@js.native
object SocialThreadType extends js.Object {
  @js.native
  sealed trait likeReference
    extends sharepointLib.SPNs.SocialNs.SocialThreadType
  
  @js.native
  sealed trait mentionReference
    extends sharepointLib.SPNs.SocialNs.SocialThreadType
  
  @js.native
  sealed trait normal
    extends sharepointLib.SPNs.SocialNs.SocialThreadType
  
  @js.native
  sealed trait replyReference
    extends sharepointLib.SPNs.SocialNs.SocialThreadType
  
  @js.native
  sealed trait tagReference
    extends sharepointLib.SPNs.SocialNs.SocialThreadType
  
  /* 1 */ val likeReference: likeReference with scala.Double = js.native
  /* 3 */ val mentionReference: mentionReference with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 2 */ val replyReference: replyReference with scala.Double = js.native
  /* 4 */ val tagReference: tagReference with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialThreadType with scala.Double] = js.native
}

