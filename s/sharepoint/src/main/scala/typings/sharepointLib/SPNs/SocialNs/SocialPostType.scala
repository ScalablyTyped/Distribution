package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialPostType extends js.Object

@JSGlobal("SP.Social.SocialPostType")
@js.native
object SocialPostType extends js.Object {
  @js.native
  sealed trait reply
    extends sharepointLib.SPNs.SocialNs.SocialPostType
  
  @js.native
  sealed trait root
    extends sharepointLib.SPNs.SocialNs.SocialPostType
  
  /* 1 */ val reply: reply with scala.Double = js.native
  /* 0 */ val root: root with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialPostType with scala.Double] = js.native
}

