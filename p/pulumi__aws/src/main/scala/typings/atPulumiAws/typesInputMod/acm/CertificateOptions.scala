package typings.atPulumiAws.typesInputMod.acm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateOptions extends js.Object {
  var certificateTransparencyLoggingPreference: js.UndefOr[Input[String]] = js.undefined
}

object CertificateOptions {
  @scala.inline
  def apply(certificateTransparencyLoggingPreference: Input[String] = null): CertificateOptions = {
    val __obj = js.Dynamic.literal()
    if (certificateTransparencyLoggingPreference != null) __obj.updateDynamic("certificateTransparencyLoggingPreference")(certificateTransparencyLoggingPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateOptions]
  }
}

