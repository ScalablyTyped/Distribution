package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>. */
@js.native
trait MediaError extends js.Object {
  val MEDIA_ERR_ABORTED: Double = js.native
  val MEDIA_ERR_DECODE: Double = js.native
  val MEDIA_ERR_NETWORK: Double = js.native
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Double = js.native
  val code: Double = js.native
  val message: java.lang.String = js.native
}

object MediaError {
  @scala.inline
  def apply(
    MEDIA_ERR_ABORTED: Double,
    MEDIA_ERR_DECODE: Double,
    MEDIA_ERR_NETWORK: Double,
    MEDIA_ERR_SRC_NOT_SUPPORTED: Double,
    code: Double,
    message: java.lang.String
  ): MediaError = {
    val __obj = js.Dynamic.literal(MEDIA_ERR_ABORTED = MEDIA_ERR_ABORTED.asInstanceOf[js.Any], MEDIA_ERR_DECODE = MEDIA_ERR_DECODE.asInstanceOf[js.Any], MEDIA_ERR_NETWORK = MEDIA_ERR_NETWORK.asInstanceOf[js.Any], MEDIA_ERR_SRC_NOT_SUPPORTED = MEDIA_ERR_SRC_NOT_SUPPORTED.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaError]
  }
  @scala.inline
  implicit class MediaErrorOps[Self <: MediaError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMEDIA_ERR_ABORTED(value: Double): Self = this.set("MEDIA_ERR_ABORTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_ERR_DECODE(value: Double): Self = this.set("MEDIA_ERR_DECODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_ERR_NETWORK(value: Double): Self = this.set("MEDIA_ERR_NETWORK", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_ERR_SRC_NOT_SUPPORTED(value: Double): Self = this.set("MEDIA_ERR_SRC_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

