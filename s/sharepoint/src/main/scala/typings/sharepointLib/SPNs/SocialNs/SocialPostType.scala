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
  
  val reply: reply with java.lang.String = js.native
  val root: root with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialPostType with java.lang.String] = js.native
}

