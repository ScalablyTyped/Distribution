package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionViewerCertificate extends js.Object {
  /**
    * The ARN of the [AWS Certificate Manager](https://aws.amazon.com/certificate-manager/)
    * certificate that you wish to use with this distribution. Specify this,
    * `cloudfrontDefaultCertificate`, or `iamCertificateId`.  The ACM
    * certificate must be in  US-EAST-1.
    */
  var acmCertificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * `true` if you want viewers to use HTTPS
    * to request your objects and you're using the CloudFront domain name for your
    * distribution. Specify this, `acmCertificateArn`, or `iamCertificateId`.
    */
  var cloudfrontDefaultCertificate: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The IAM certificate identifier of the custom viewer
    * certificate for this distribution if you are using a custom domain. Specify
    * this, `acmCertificateArn`, or `cloudfrontDefaultCertificate`.
    */
  var iamCertificateId: js.UndefOr[Input[String]] = js.native
  /**
    * The minimum version of the SSL protocol that
    * you want CloudFront to use for HTTPS connections. Can only be set if
    * `cloudfrontDefaultCertificate = false`. One of `SSLv3`, `TLSv1`,
    * `TLSv1_2016`, `TLSv1.1_2016` or `TLSv1.2_2018`. Default: `TLSv1`. **NOTE**:
    * If you are using a custom certificate (specified with `acmCertificateArn`
    * or `iamCertificateId`), and have specified `sni-only` in
    * `sslSupportMethod`, `TLSv1` or later must be specified. If you have
    * specified `vip` in `sslSupportMethod`, only `SSLv3` or `TLSv1` can be
    * specified. If you have specified `cloudfrontDefaultCertificate`, `TLSv1`
    * must be specified.
    */
  var minimumProtocolVersion: js.UndefOr[Input[String]] = js.native
  var sslSupportMethod: js.UndefOr[Input[String]] = js.native
}

object DistributionViewerCertificate {
  @scala.inline
  def apply(): DistributionViewerCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionViewerCertificate]
  }
  @scala.inline
  implicit class DistributionViewerCertificateOps[Self <: DistributionViewerCertificate] (val x: Self) extends AnyVal {
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
    def setAcmCertificateArn(value: Input[String]): Self = this.set("acmCertificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcmCertificateArn: Self = this.set("acmCertificateArn", js.undefined)
    @scala.inline
    def setCloudfrontDefaultCertificate(value: Input[Boolean]): Self = this.set("cloudfrontDefaultCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudfrontDefaultCertificate: Self = this.set("cloudfrontDefaultCertificate", js.undefined)
    @scala.inline
    def setIamCertificateId(value: Input[String]): Self = this.set("iamCertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamCertificateId: Self = this.set("iamCertificateId", js.undefined)
    @scala.inline
    def setMinimumProtocolVersion(value: Input[String]): Self = this.set("minimumProtocolVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumProtocolVersion: Self = this.set("minimumProtocolVersion", js.undefined)
    @scala.inline
    def setSslSupportMethod(value: Input[String]): Self = this.set("sslSupportMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslSupportMethod: Self = this.set("sslSupportMethod", js.undefined)
  }
  
}

