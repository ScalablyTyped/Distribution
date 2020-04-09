package typings.pulumiAws.accessPointMod

import typings.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration
import typings.pulumiAws.inputMod.s3.AccessPointVpcConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointState extends js.Object {
  /**
    * The AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the provider.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the S3 Access Point.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS domain name of the S3 Access Point in the format _`name`_-_`accountId`_.s3-accesspoint._region_.amazonaws.com.
    * Note: S3 access points only support secure access by HTTPS. HTTP isn't supported.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether this access point currently has a policy that allows public access.
    */
  val hasPublicAccessPolicy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name you want to assign to this access point.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn't allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
    */
  val networkOrigin: js.UndefOr[Input[String]] = js.native
  /**
    * A valid JSON document that specifies the policy that you want to apply to this access point.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
    */
  val publicAccessBlockConfiguration: js.UndefOr[Input[AccessPointPublicAccessBlockConfiguration]] = js.native
  /**
    * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Detailed below.
    */
  val vpcConfiguration: js.UndefOr[Input[AccessPointVpcConfiguration]] = js.native
}

object AccessPointState {
  @scala.inline
  def apply(
    accountId: Input[String] = null,
    arn: Input[String] = null,
    bucket: Input[String] = null,
    domainName: Input[String] = null,
    hasPublicAccessPolicy: Input[Boolean] = null,
    name: Input[String] = null,
    networkOrigin: Input[String] = null,
    policy: Input[String] = null,
    publicAccessBlockConfiguration: Input[AccessPointPublicAccessBlockConfiguration] = null,
    vpcConfiguration: Input[AccessPointVpcConfiguration] = null
  ): AccessPointState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (hasPublicAccessPolicy != null) __obj.updateDynamic("hasPublicAccessPolicy")(hasPublicAccessPolicy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkOrigin != null) __obj.updateDynamic("networkOrigin")(networkOrigin.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (publicAccessBlockConfiguration != null) __obj.updateDynamic("publicAccessBlockConfiguration")(publicAccessBlockConfiguration.asInstanceOf[js.Any])
    if (vpcConfiguration != null) __obj.updateDynamic("vpcConfiguration")(vpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointState]
  }
}

