package typings.sdpTransform.mod

import typings.sdpTransform.anon.Codec
import typings.sdpTransform.anon.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDescription
  extends MediaAttributes
     with SharedDescriptionFields

object MediaDescription {
  @scala.inline
  def apply(fmtp: js.Array[Config], rtp: js.Array[Codec]): MediaDescription = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDescription]
  }
}

