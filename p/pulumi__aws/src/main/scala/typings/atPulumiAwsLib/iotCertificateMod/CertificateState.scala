package typings
package atPulumiAwsLib.iotCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateState extends js.Object {
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN of the created AWS IoT certificate
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate signing request. Review the
    * [IoT API Reference Guide] (http://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on creating a certificate from a certificate signing request (CSR).
    */
  val csr: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

