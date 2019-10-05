package typings.atPulumiAws.acmCertificateMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.acm.CertificateOptions
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateArgs extends js.Object {
  /**
    * ARN of an ACMPCA
    */
  val certificateAuthorityArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The certificate's PEM-formatted public key
    */
  val certificateBody: js.UndefOr[Input[String]] = js.undefined
  /**
    * The certificate's PEM-formatted chain
    * * Creating a private CA issued certificate
    */
  val certificateChain: js.UndefOr[Input[String]] = js.undefined
  /**
    * A domain name for which the certificate should be issued
    */
  val domainName: js.UndefOr[Input[String]] = js.undefined
  val options: js.UndefOr[Input[CertificateOptions]] = js.undefined
  /**
    * The certificate's PEM-formatted private key
    */
  val privateKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of domains that should be SANs in the issued certificate
    */
  val subjectAlternativeNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into state managed by this provider.
    * * Importing an existing certificate
    */
  val validationMethod: js.UndefOr[Input[String]] = js.undefined
}

object CertificateArgs {
  @scala.inline
  def apply(
    certificateAuthorityArn: Input[String] = null,
    certificateBody: Input[String] = null,
    certificateChain: Input[String] = null,
    domainName: Input[String] = null,
    options: Input[CertificateOptions] = null,
    privateKey: Input[String] = null,
    subjectAlternativeNames: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    validationMethod: Input[String] = null
  ): CertificateArgs = {
    val __obj = js.Dynamic.literal()
    if (certificateAuthorityArn != null) __obj.updateDynamic("certificateAuthorityArn")(certificateAuthorityArn.asInstanceOf[js.Any])
    if (certificateBody != null) __obj.updateDynamic("certificateBody")(certificateBody.asInstanceOf[js.Any])
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (subjectAlternativeNames != null) __obj.updateDynamic("subjectAlternativeNames")(subjectAlternativeNames.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (validationMethod != null) __obj.updateDynamic("validationMethod")(validationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateArgs]
  }
}

