package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionViewerCertificate extends StObject {
  
  /**
    * The ARN of the [AWS Certificate Manager](https://aws.amazon.com/certificate-manager/)
    * certificate that you wish to use with this distribution. Specify this,
    * `cloudfrontDefaultCertificate`, or `iamCertificateId`.  The ACM
    * certificate must be in  US-EAST-1.
    */
  var acmCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * `true` if you want viewers to use HTTPS
    * to request your objects and you're using the CloudFront domain name for your
    * distribution. Specify this, `acmCertificateArn`, or `iamCertificateId`.
    */
  var cloudfrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IAM certificate identifier of the custom viewer
    * certificate for this distribution if you are using a custom domain. Specify
    * this, `acmCertificateArn`, or `cloudfrontDefaultCertificate`.
    */
  var iamCertificateId: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum version of the SSL protocol that
    * you want CloudFront to use for HTTPS connections. Can only be set if
    * `cloudfrontDefaultCertificate = false`. One of `SSLv3`, `TLSv1`,
    * `TLSv1_2016`, `TLSv1.1_2016`, `TLSv1.2_2018` or `TLSv1.2_2019`. Default: `TLSv1`. **NOTE**:
    * If you are using a custom certificate (specified with `acmCertificateArn`
    * or `iamCertificateId`), and have specified `sni-only` in
    * `sslSupportMethod`, `TLSv1` or later must be specified. If you have
    * specified `vip` in `sslSupportMethod`, only `SSLv3` or `TLSv1` can be
    * specified. If you have specified `cloudfrontDefaultCertificate`, `TLSv1`
    * must be specified.
    */
  var minimumProtocolVersion: js.UndefOr[String] = js.undefined
  
  var sslSupportMethod: js.UndefOr[String] = js.undefined
}
object DistributionViewerCertificate {
  
  @scala.inline
  def apply(): DistributionViewerCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionViewerCertificate]
  }
  
  @scala.inline
  implicit class DistributionViewerCertificateMutableBuilder[Self <: DistributionViewerCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcmCertificateArn(value: String): Self = StObject.set(x, "acmCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmCertificateArnUndefined: Self = StObject.set(x, "acmCertificateArn", js.undefined)
    
    @scala.inline
    def setCloudfrontDefaultCertificate(value: Boolean): Self = StObject.set(x, "cloudfrontDefaultCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudfrontDefaultCertificateUndefined: Self = StObject.set(x, "cloudfrontDefaultCertificate", js.undefined)
    
    @scala.inline
    def setIamCertificateId(value: String): Self = StObject.set(x, "iamCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamCertificateIdUndefined: Self = StObject.set(x, "iamCertificateId", js.undefined)
    
    @scala.inline
    def setMinimumProtocolVersion(value: String): Self = StObject.set(x, "minimumProtocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumProtocolVersionUndefined: Self = StObject.set(x, "minimumProtocolVersion", js.undefined)
    
    @scala.inline
    def setSslSupportMethod(value: String): Self = StObject.set(x, "sslSupportMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslSupportMethodUndefined: Self = StObject.set(x, "sslSupportMethod", js.undefined)
  }
}
