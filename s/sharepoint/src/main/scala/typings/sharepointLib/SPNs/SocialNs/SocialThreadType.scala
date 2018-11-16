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
  
  val likeReference: likeReference with java.lang.String = js.native
  val mentionReference: mentionReference with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val replyReference: replyReference with java.lang.String = js.native
  val tagReference: tagReference with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialThreadType with java.lang.String] = js.native
}

