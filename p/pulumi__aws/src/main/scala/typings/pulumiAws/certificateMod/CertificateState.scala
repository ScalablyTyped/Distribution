package typings.pulumiAws.certificateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.acm.CertificateDomainValidationOption
import typings.pulumiAws.inputMod.acm.CertificateOptions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateState extends js.Object {
  /**
    * The ARN of the certificate
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * ARN of an ACMPCA
    */
  val certificateAuthorityArn: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate's PEM-formatted public key
    */
  val certificateBody: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate's PEM-formatted chain
    * * Creating a private CA issued certificate
    */
  val certificateChain: js.UndefOr[Input[String]] = js.native
  /**
    * A domain name for which the certificate should be issued
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * A list of attributes to feed into other resources to complete certificate validation. Can have more than one element, e.g. if SANs are defined. Only set if `DNS`-validation was used.
    */
  val domainValidationOptions: js.UndefOr[Input[js.Array[Input[CertificateDomainValidationOption]]]] = js.native
  /**
    * Configuration block used to set certificate options. Detailed below.
    * * Importing an existing certificate
    */
  val options: js.UndefOr[Input[CertificateOptions]] = js.native
  /**
    * The certificate's PEM-formatted private key
    */
  val privateKey: js.UndefOr[Input[String]] = js.native
  /**
    * Status of the certificate.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * A list of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`) to trigger recreation.
    */
  val subjectAlternativeNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
    */
  val validationEmails: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
    */
  val validationMethod: js.UndefOr[Input[String]] = js.native
}

object CertificateState {
  @scala.inline
  def apply(): CertificateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateState]
  }
  @scala.inline
  implicit class CertificateStateOps[Self <: CertificateState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCertificateAuthorityArn(value: Input[String]): Self = this.set("certificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAuthorityArn: Self = this.set("certificateAuthorityArn", js.undefined)
    @scala.inline
    def setCertificateBody(value: Input[String]): Self = this.set("certificateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateBody: Self = this.set("certificateBody", js.undefined)
    @scala.inline
    def setCertificateChain(value: Input[String]): Self = this.set("certificateChain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateChain: Self = this.set("certificateChain", js.undefined)
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setDomainValidationOptionsVarargs(value: Input[CertificateDomainValidationOption]*): Self = this.set("domainValidationOptions", js.Array(value :_*))
    @scala.inline
    def setDomainValidationOptions(value: Input[js.Array[Input[CertificateDomainValidationOption]]]): Self = this.set("domainValidationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainValidationOptions: Self = this.set("domainValidationOptions", js.undefined)
    @scala.inline
    def setOptions(value: Input[CertificateOptions]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPrivateKey(value: Input[String]): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: Input[String]*): Self = this.set("subjectAlternativeNames", js.Array(value :_*))
    @scala.inline
    def setSubjectAlternativeNames(value: Input[js.Array[Input[String]]]): Self = this.set("subjectAlternativeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectAlternativeNames: Self = this.set("subjectAlternativeNames", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setValidationEmailsVarargs(value: Input[String]*): Self = this.set("validationEmails", js.Array(value :_*))
    @scala.inline
    def setValidationEmails(value: Input[js.Array[Input[String]]]): Self = this.set("validationEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationEmails: Self = this.set("validationEmails", js.undefined)
    @scala.inline
    def setValidationMethod(value: Input[String]): Self = this.set("validationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationMethod: Self = this.set("validationMethod", js.undefined)
  }
  
}

