package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateTransparencyLoggingPreference extends js.Object {
  var certificateTransparencyLoggingPreference: js.UndefOr[String] = js.undefined
}

object Anon_CertificateTransparencyLoggingPreference {
  @scala.inline
  def apply(certificateTransparencyLoggingPreference: String = null): Anon_CertificateTransparencyLoggingPreference = {
    val __obj = js.Dynamic.literal()
    if (certificateTransparencyLoggingPreference != null) __obj.updateDynamic("certificateTransparencyLoggingPreference")(certificateTransparencyLoggingPreference)
    __obj.asInstanceOf[Anon_CertificateTransparencyLoggingPreference]
  }
}

