package typings.atPulumiAws.acmCertificateMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.acm.CertificateDomainValidationOption
import typings.atPulumiAws.typesInputMod.acm.CertificateOptions
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateState extends js.Object {
  /**
    * The ARN of the certificate
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
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
  /**
    * A list of attributes to feed into other resources to complete certificate validation. Can have more than one element, e.g. if SANs are defined. Only set if `DNS`-validation was used.
    */
  val domainValidationOptions: js.UndefOr[Input[js.Array[Input[CertificateDomainValidationOption]]]] = js.undefined
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
    * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
    */
  val validationEmails: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into state managed by this provider.
    * * Importing an existing certificate
    */
  val validationMethod: js.UndefOr[Input[String]] = js.undefined
}

object CertificateState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    certificateAuthorityArn: Input[String] = null,
    certificateBody: Input[String] = null,
    certificateChain: Input[String] = null,
    domainName: Input[String] = null,
    domainValidationOptions: Input[js.Array[Input[CertificateDomainValidationOption]]] = null,
    options: Input[CertificateOptions] = null,
    privateKey: Input[String] = null,
    subjectAlternativeNames: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    validationEmails: Input[js.Array[Input[String]]] = null,
    validationMethod: Input[String] = null
  ): CertificateState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateAuthorityArn != null) __obj.updateDynamic("certificateAuthorityArn")(certificateAuthorityArn.asInstanceOf[js.Any])
    if (certificateBody != null) __obj.updateDynamic("certificateBody")(certificateBody.asInstanceOf[js.Any])
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (domainValidationOptions != null) __obj.updateDynamic("domainValidationOptions")(domainValidationOptions.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (subjectAlternativeNames != null) __obj.updateDynamic("subjectAlternativeNames")(subjectAlternativeNames.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (validationEmails != null) __obj.updateDynamic("validationEmails")(validationEmails.asInstanceOf[js.Any])
    if (validationMethod != null) __obj.updateDynamic("validationMethod")(validationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateState]
  }
}

