package typings.atPulumiAws.typesOutputMod.acm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateOptions extends js.Object {
  var certificateTransparencyLoggingPreference: js.UndefOr[String] = js.native
}

object CertificateOptions {
  @scala.inline
  def apply(certificateTransparencyLoggingPreference: String = null): CertificateOptions = {
    val __obj = js.Dynamic.literal()
    if (certificateTransparencyLoggingPreference != null) __obj.updateDynamic("certificateTransparencyLoggingPreference")(certificateTransparencyLoggingPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateOptions]
  }
}

