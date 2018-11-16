package typings
package sharepointLib.SPNs.SocialNs

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
  sealed trait canDelete
    extends sharepointLib.SPNs.SocialNs.SocialPostAttributes
  
  @js.native
  sealed trait canFollowUp
    extends sharepointLib.SPNs.SocialNs.SocialPostAttributes
  
  @js.native
  sealed trait canLike
    extends sharepointLib.SPNs.SocialNs.SocialPostAttributes
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.SocialNs.SocialPostAttributes
  
  @js.native
  sealed trait useAuthorImage
    extends sharepointLib.SPNs.SocialNs.SocialPostAttributes
  
  @js.native
  sealed trait useSmallImage
    extends sharepointLib.SPNs.SocialNs.SocialPostAttributes
  
  val canDelete: canDelete with java.lang.String = js.native
  val canFollowUp: canFollowUp with java.lang.String = js.native
  val canLike: canLike with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val useAuthorImage: useAuthorImage with java.lang.String = js.native
  val useSmallImage: useSmallImage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialPostAttributes with java.lang.String] = js.native
}

