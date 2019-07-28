package typings.sharepoint.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialPostType extends js.Object

@JSGlobal("SP.Social.SocialPostType")
@js.native
object SocialPostType extends js.Object {
  @js.native
  sealed trait reply extends SocialPostType
  
  @js.native
  sealed trait root extends SocialPostType
  
  /* 1 */ val reply: typings.sharepoint.SPNs.SocialNs.SocialPostType.reply with Double = js.native
  /* 0 */ val root: typings.sharepoint.SPNs.SocialNs.SocialPostType.root with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialPostType with Double] = js.native
}

