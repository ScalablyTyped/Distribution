package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateTransparencyLoggingPreferenceInput extends js.Object {
  var certificateTransparencyLoggingPreference: js.UndefOr[Input[String]] = js.undefined
}

object Anon_CertificateTransparencyLoggingPreferenceInput {
  @scala.inline
  def apply(certificateTransparencyLoggingPreference: Input[String] = null): Anon_CertificateTransparencyLoggingPreferenceInput = {
    val __obj = js.Dynamic.literal()
    if (certificateTransparencyLoggingPreference != null) __obj.updateDynamic("certificateTransparencyLoggingPreference")(certificateTransparencyLoggingPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CertificateTransparencyLoggingPreferenceInput]
  }
}

