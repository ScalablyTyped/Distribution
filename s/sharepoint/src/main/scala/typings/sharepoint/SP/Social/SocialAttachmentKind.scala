package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Social.SocialAttachmentKind.document
import typings.sharepoint.SP.Social.SocialAttachmentKind.image
import typings.sharepoint.SP.Social.SocialAttachmentKind.video
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialAttachmentKind with Double] = js.native
  /* 2 */ @js.native
  object document extends TopLevel[document with Double]
  
  /* 0 */ @js.native
  object image extends TopLevel[image with Double]
  
  /* 1 */ @js.native
  object video extends TopLevel[video with Double]
  
}

