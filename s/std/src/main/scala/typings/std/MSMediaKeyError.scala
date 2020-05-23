package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSMediaKeyError extends js.Object {
  val MS_MEDIA_KEYERR_CLIENT: Double
  val MS_MEDIA_KEYERR_DOMAIN: Double
  val MS_MEDIA_KEYERR_HARDWARECHANGE: Double
  val MS_MEDIA_KEYERR_OUTPUT: Double
  val MS_MEDIA_KEYERR_SERVICE: Double
  val MS_MEDIA_KEYERR_UNKNOWN: Double
  val code: Double
  val systemCode: Double
}

object MSMediaKeyError {
  @scala.inline
  def apply(
    MS_MEDIA_KEYERR_CLIENT: Double,
    MS_MEDIA_KEYERR_DOMAIN: Double,
    MS_MEDIA_KEYERR_HARDWARECHANGE: Double,
    MS_MEDIA_KEYERR_OUTPUT: Double,
    MS_MEDIA_KEYERR_SERVICE: Double,
    MS_MEDIA_KEYERR_UNKNOWN: Double,
    code: Double,
    systemCode: Double
  ): MSMediaKeyError = {
    val __obj = js.Dynamic.literal(MS_MEDIA_KEYERR_CLIENT = MS_MEDIA_KEYERR_CLIENT.asInstanceOf[js.Any], MS_MEDIA_KEYERR_DOMAIN = MS_MEDIA_KEYERR_DOMAIN.asInstanceOf[js.Any], MS_MEDIA_KEYERR_HARDWARECHANGE = MS_MEDIA_KEYERR_HARDWARECHANGE.asInstanceOf[js.Any], MS_MEDIA_KEYERR_OUTPUT = MS_MEDIA_KEYERR_OUTPUT.asInstanceOf[js.Any], MS_MEDIA_KEYERR_SERVICE = MS_MEDIA_KEYERR_SERVICE.asInstanceOf[js.Any], MS_MEDIA_KEYERR_UNKNOWN = MS_MEDIA_KEYERR_UNKNOWN.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], systemCode = systemCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSMediaKeyError]
  }
}

