package typings.pulumiAws.outputMod.acm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateDomainValidationOption extends js.Object {
  /**
    * A domain name for which the certificate should be issued
    */
  var domainName: String = js.native
  /**
    * The name of the DNS record to create to validate the certificate
    */
  var resourceRecordName: String = js.native
  /**
    * The type of DNS record to create
    */
  var resourceRecordType: String = js.native
  /**
    * The value the DNS record needs to have
    */
  var resourceRecordValue: String = js.native
}

object CertificateDomainValidationOption {
  @scala.inline
  def apply(
    domainName: String,
    resourceRecordName: String,
    resourceRecordType: String,
    resourceRecordValue: String
  ): CertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], resourceRecordName = resourceRecordName.asInstanceOf[js.Any], resourceRecordType = resourceRecordType.asInstanceOf[js.Any], resourceRecordValue = resourceRecordValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateDomainValidationOption]
  }
  @scala.inline
  implicit class CertificateDomainValidationOptionOps[Self <: CertificateDomainValidationOption] (val x: Self) extends AnyVal {
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceRecordName(value: String): Self = this.set("resourceRecordName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceRecordType(value: String): Self = this.set("resourceRecordType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceRecordValue(value: String): Self = this.set("resourceRecordValue", value.asInstanceOf[js.Any])
  }
  
}

