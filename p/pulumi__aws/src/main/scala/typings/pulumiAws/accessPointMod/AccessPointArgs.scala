package typings.pulumiAws.accessPointMod

import typings.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration
import typings.pulumiAws.inputMod.s3.AccessPointVpcConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointArgs extends js.Object {
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  val bucket: Input[String] = js.native
  /**
    * The name you want to assign to this access point.
    */
  val name: js.UndefOr[Input[String]] = js.native
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

object AccessPointArgs {
  @scala.inline
  def apply(
    bucket: Input[String],
    accountId: Input[String] = null,
    name: Input[String] = null,
    policy: Input[String] = null,
    publicAccessBlockConfiguration: Input[AccessPointPublicAccessBlockConfiguration] = null,
    vpcConfiguration: Input[AccessPointVpcConfiguration] = null
  ): AccessPointArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (publicAccessBlockConfiguration != null) __obj.updateDynamic("publicAccessBlockConfiguration")(publicAccessBlockConfiguration.asInstanceOf[js.Any])
    if (vpcConfiguration != null) __obj.updateDynamic("vpcConfiguration")(vpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointArgs]
  }
}

