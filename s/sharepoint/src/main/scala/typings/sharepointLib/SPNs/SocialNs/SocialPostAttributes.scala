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
  
  /* 2 */ val canDelete: canDelete with scala.Double = js.native
  /* 5 */ val canFollowUp: canFollowUp with scala.Double = js.native
  /* 1 */ val canLike: canLike with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val useAuthorImage: useAuthorImage with scala.Double = js.native
  /* 4 */ val useSmallImage: useSmallImage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialPostAttributes with scala.Double] = js.native
}

