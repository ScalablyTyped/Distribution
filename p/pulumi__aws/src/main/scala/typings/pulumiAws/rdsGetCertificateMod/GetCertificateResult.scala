package typings.pulumiAws.rdsGetCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateResult extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the certificate.
    */
  val arn: String = js.native
  
  /**
    * Type of certificate. For example, `CA`.
    */
  val certificateType: String = js.native
  
  /**
    * Boolean whether there is an override for the default certificate identifier.
    */
  val customerOverride: Boolean = js.native
  
  /**
    * If there is an override for the default certificate identifier, when the override expires.
    */
  val customerOverrideValidTill: String = js.native
  
  val id: String = js.native
  
  val latestValidTill: js.UndefOr[Boolean] = js.native
  
  /**
    * Thumbprint of the certificate.
    */
  val thumbprint: String = js.native
  
  /**
    * [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate starting validity date.
    */
  val validFrom: String = js.native
  
  /**
    * [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of certificate ending validity date.
    */
  val validTill: String = js.native
}
object GetCertificateResult {
  
  @scala.inline
  def apply(
    arn: String,
    certificateType: String,
    customerOverride: Boolean,
    customerOverrideValidTill: String,
    id: String,
    thumbprint: String,
    validFrom: String,
    validTill: String
  ): GetCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateType = certificateType.asInstanceOf[js.Any], customerOverride = customerOverride.asInstanceOf[js.Any], customerOverrideValidTill = customerOverrideValidTill.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any], validFrom = validFrom.asInstanceOf[js.Any], validTill = validTill.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateResult]
  }
  
  @scala.inline
  implicit class GetCertificateResultOps[Self <: GetCertificateResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateType(value: String): Self = this.set("certificateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOverride(value: Boolean): Self = this.set("customerOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOverrideValidTill(value: String): Self = this.set("customerOverrideValidTill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbprint(value: String): Self = this.set("thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFrom(value: String): Self = this.set("validFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidTill(value: String): Self = this.set("validTill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestValidTill(value: Boolean): Self = this.set("latestValidTill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestValidTill: Self = this.set("latestValidTill", js.undefined)
  }
}
