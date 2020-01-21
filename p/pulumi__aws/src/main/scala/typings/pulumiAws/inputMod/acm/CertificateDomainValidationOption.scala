package typings.pulumiAws.inputMod.acm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateDomainValidationOption extends js.Object {
  /**
    * A domain name for which the certificate should be issued
    */
  var domainName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the DNS record to create to validate the certificate
    */
  var resourceRecordName: js.UndefOr[Input[String]] = js.native
  /**
    * The type of DNS record to create
    */
  var resourceRecordType: js.UndefOr[Input[String]] = js.native
  /**
    * The value the DNS record needs to have
    */
  var resourceRecordValue: js.UndefOr[Input[String]] = js.native
}

object CertificateDomainValidationOption {
  @scala.inline
  def apply(
    domainName: Input[String] = null,
    resourceRecordName: Input[String] = null,
    resourceRecordType: Input[String] = null,
    resourceRecordValue: Input[String] = null
  ): CertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (resourceRecordName != null) __obj.updateDynamic("resourceRecordName")(resourceRecordName.asInstanceOf[js.Any])
    if (resourceRecordType != null) __obj.updateDynamic("resourceRecordType")(resourceRecordType.asInstanceOf[js.Any])
    if (resourceRecordValue != null) __obj.updateDynamic("resourceRecordValue")(resourceRecordValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateDomainValidationOption]
  }
}

