package typings.atPulumiAws.typesInputMod.cloudfrontNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionViewerCertificate extends js.Object {
  /**
    * The ARN of the [AWS Certificate Manager][6]
    * certificate that you wish to use with this distribution. Specify this,
    * `cloudfrontDefaultCertificate`, or `iamCertificateId`.  The ACM
    * certificate must be in  US-EAST-1.
    */
  var acmCertificateArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * `true` if you want viewers to use HTTPS
    * to request your objects and you're using the CloudFront domain name for your
    * distribution. Specify this, `acmCertificateArn`, or `iamCertificateId`.
    */
  var cloudfrontDefaultCertificate: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The IAM certificate identifier of the custom viewer
    * certificate for this distribution if you are using a custom domain. Specify
    * this, `acmCertificateArn`, or `cloudfrontDefaultCertificate`.
    */
  var iamCertificateId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The minimum version of the SSL protocol that
    * you want CloudFront to use for HTTPS connections. One of `SSLv3`, `TLSv1`,
    * `TLSv1_2016`, `TLSv1.1_2016` or `TLSv1.2_2018`. Default: `TLSv1`. **NOTE**:
    * If you are using a custom certificate (specified with `acmCertificateArn`
    * or `iamCertificateId`), and have specified `sni-only` in
    * `sslSupportMethod`, `TLSv1` or later must be specified. If you have
    * specified `vip` in `sslSupportMethod`, only `SSLv3` or `TLSv1` can be
    * specified. If you have specified `cloudfrontDefaultCertificate`, `TLSv1`
    * must be specified.
    */
  var minimumProtocolVersion: js.UndefOr[Input[String]] = js.undefined
  var sslSupportMethod: js.UndefOr[Input[String]] = js.undefined
}

object DistributionViewerCertificate {
  @scala.inline
  def apply(
    acmCertificateArn: Input[String] = null,
    cloudfrontDefaultCertificate: Input[Boolean] = null,
    iamCertificateId: Input[String] = null,
    minimumProtocolVersion: Input[String] = null,
    sslSupportMethod: Input[String] = null
  ): DistributionViewerCertificate = {
    val __obj = js.Dynamic.literal()
    if (acmCertificateArn != null) __obj.updateDynamic("acmCertificateArn")(acmCertificateArn.asInstanceOf[js.Any])
    if (cloudfrontDefaultCertificate != null) __obj.updateDynamic("cloudfrontDefaultCertificate")(cloudfrontDefaultCertificate.asInstanceOf[js.Any])
    if (iamCertificateId != null) __obj.updateDynamic("iamCertificateId")(iamCertificateId.asInstanceOf[js.Any])
    if (minimumProtocolVersion != null) __obj.updateDynamic("minimumProtocolVersion")(minimumProtocolVersion.asInstanceOf[js.Any])
    if (sslSupportMethod != null) __obj.updateDynamic("sslSupportMethod")(sslSupportMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionViewerCertificate]
  }
}

