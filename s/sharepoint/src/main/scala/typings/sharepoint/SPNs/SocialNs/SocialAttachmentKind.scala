package typings.sharepoint.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialAttachmentKind extends js.Object

@JSGlobal("SP.Social.SocialAttachmentKind")
@js.native
object SocialAttachmentKind extends js.Object {
  @js.native
  sealed trait document extends SocialAttachmentKind
  
  @js.native
  sealed trait image extends SocialAttachmentKind
  
  @js.native
  sealed trait video extends SocialAttachmentKind
  
  /* 2 */ val document: typings.sharepoint.SPNs.SocialNs.SocialAttachmentKind.document with Double = js.native
  /* 0 */ val image: typings.sharepoint.SPNs.SocialNs.SocialAttachmentKind.image with Double = js.native
  /* 1 */ val video: typings.sharepoint.SPNs.SocialNs.SocialAttachmentKind.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialAttachmentKind with Double] = js.native
}

