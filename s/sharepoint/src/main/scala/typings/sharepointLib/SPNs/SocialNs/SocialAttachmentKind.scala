package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialAttachmentKind extends js.Object

@JSGlobal("SP.Social.SocialAttachmentKind")
@js.native
object SocialAttachmentKind extends js.Object {
  @js.native
  sealed trait document
    extends sharepointLib.SPNs.SocialNs.SocialAttachmentKind
  
  @js.native
  sealed trait image
    extends sharepointLib.SPNs.SocialNs.SocialAttachmentKind
  
  @js.native
  sealed trait video
    extends sharepointLib.SPNs.SocialNs.SocialAttachmentKind
  
  /* 2 */ val document: document with scala.Double = js.native
  /* 0 */ val image: image with scala.Double = js.native
  /* 1 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialAttachmentKind with scala.Double] = js.native
}

