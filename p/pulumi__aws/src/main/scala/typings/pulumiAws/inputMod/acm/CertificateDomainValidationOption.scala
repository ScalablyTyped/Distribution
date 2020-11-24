package typings.pulumiAws.inputMod.acm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): CertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal()
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
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setResourceRecordName(value: Input[String]): Self = this.set("resourceRecordName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRecordName: Self = this.set("resourceRecordName", js.undefined)
    
    @scala.inline
    def setResourceRecordType(value: Input[String]): Self = this.set("resourceRecordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRecordType: Self = this.set("resourceRecordType", js.undefined)
    
    @scala.inline
    def setResourceRecordValue(value: Input[String]): Self = this.set("resourceRecordValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRecordValue: Self = this.set("resourceRecordValue", js.undefined)
  }
}
