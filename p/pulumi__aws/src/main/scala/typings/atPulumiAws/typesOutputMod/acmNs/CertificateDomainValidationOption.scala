package typings.atPulumiAws.typesOutputMod.acmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateDomainValidationOption extends js.Object {
  /**
    * A domain name for which the certificate should be issued
    */
  var domainName: String
  /**
    * The name of the DNS record to create to validate the certificate
    */
  var resourceRecordName: String
  /**
    * The type of DNS record to create
    */
  var resourceRecordType: String
  /**
    * The value the DNS record needs to have
    */
  var resourceRecordValue: String
}

object CertificateDomainValidationOption {
  @scala.inline
  def apply(
    domainName: String,
    resourceRecordName: String,
    resourceRecordType: String,
    resourceRecordValue: String
  ): CertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal(domainName = domainName, resourceRecordName = resourceRecordName, resourceRecordType = resourceRecordType, resourceRecordValue = resourceRecordValue)
  
    __obj.asInstanceOf[CertificateDomainValidationOption]
  }
}

