package typings
package atPulumiAwsLib.acmCertificateValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateValidationArgs extends js.Object {
  /**
    * The ARN of the certificate that is being validated.
    */
  val certificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
    */
  val validationRecordFqdns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object CertificateValidationArgs {
  @scala.inline
  def apply(
    certificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    validationRecordFqdns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): CertificateValidationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (validationRecordFqdns != null) __obj.updateDynamic("validationRecordFqdns")(validationRecordFqdns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateValidationArgs]
  }
}

