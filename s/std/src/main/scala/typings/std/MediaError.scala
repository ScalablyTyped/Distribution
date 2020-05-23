package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>. */
trait MediaError extends js.Object {
  val MEDIA_ERR_ABORTED: Double
  val MEDIA_ERR_DECODE: Double
  val MEDIA_ERR_NETWORK: Double
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Double
  val code: Double
  val message: java.lang.String
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
}

