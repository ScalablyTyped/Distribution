package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>. */
trait MediaError extends js.Object {
  val MEDIA_ERR_ABORTED: Double
  val MEDIA_ERR_DECODE: Double
  val MEDIA_ERR_NETWORK: Double
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Double
  val MS_MEDIA_ERR_ENCRYPTED: Double
  val code: Double
  val message: java.lang.String
  val msExtendedCode: Double
}

@JSGlobal("MediaError")
@js.native
object MediaError extends Instantiable0[MediaError] {
  val MEDIA_ERR_ABORTED: Double = js.native
  val MEDIA_ERR_DECODE: Double = js.native
  val MEDIA_ERR_NETWORK: Double = js.native
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Double = js.native
  val MS_MEDIA_ERR_ENCRYPTED: Double = js.native
}

