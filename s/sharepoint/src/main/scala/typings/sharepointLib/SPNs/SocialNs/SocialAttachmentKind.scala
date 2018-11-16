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
  
  val document: document with java.lang.String = js.native
  val image: image with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialAttachmentKind with java.lang.String] = js.native
}

