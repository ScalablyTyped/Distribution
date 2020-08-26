package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSMediaKeyError extends js.Object {
  val MS_MEDIA_KEYERR_CLIENT: Double = js.native
  val MS_MEDIA_KEYERR_DOMAIN: Double = js.native
  val MS_MEDIA_KEYERR_HARDWARECHANGE: Double = js.native
  val MS_MEDIA_KEYERR_OUTPUT: Double = js.native
  val MS_MEDIA_KEYERR_SERVICE: Double = js.native
  val MS_MEDIA_KEYERR_UNKNOWN: Double = js.native
  val code: Double = js.native
  val systemCode: Double = js.native
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
  @scala.inline
  implicit class MSMediaKeyErrorOps[Self <: MSMediaKeyError] (val x: Self) extends AnyVal {
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
    def setMS_MEDIA_KEYERR_CLIENT(value: Double): Self = this.set("MS_MEDIA_KEYERR_CLIENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MEDIA_KEYERR_DOMAIN(value: Double): Self = this.set("MS_MEDIA_KEYERR_DOMAIN", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MEDIA_KEYERR_HARDWARECHANGE(value: Double): Self = this.set("MS_MEDIA_KEYERR_HARDWARECHANGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MEDIA_KEYERR_OUTPUT(value: Double): Self = this.set("MS_MEDIA_KEYERR_OUTPUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MEDIA_KEYERR_SERVICE(value: Double): Self = this.set("MS_MEDIA_KEYERR_SERVICE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MEDIA_KEYERR_UNKNOWN(value: Double): Self = this.set("MS_MEDIA_KEYERR_UNKNOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemCode(value: Double): Self = this.set("systemCode", value.asInstanceOf[js.Any])
  }
  
}

