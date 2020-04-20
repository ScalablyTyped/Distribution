package typings.pulumiAws.providerMod

import typings.pulumiAws.inputMod.ProviderAssumeRole
import typings.pulumiAws.inputMod.ProviderEndpoint
import typings.pulumiAws.inputMod.ProviderIgnoreTags
import typings.pulumiAws.regionMod.Region
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderArgs extends js.Object {
  /**
    * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS
    * console.
    */
  val accessKey: js.UndefOr[Input[String]] = js.native
  val allowedAccountIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val assumeRole: js.UndefOr[Input[ProviderAssumeRole]] = js.native
  val endpoints: js.UndefOr[Input[js.Array[Input[ProviderEndpoint]]]] = js.native
  val forbiddenAccountIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Configuration block with settings to ignore resource tags across all resources.
    */
  val ignoreTags: js.UndefOr[Input[ProviderIgnoreTags]] = js.native
  /**
    * Explicitly allow the provider to perform "insecure" SSL requests. If omitted,default value is `false`
    */
  val insecure: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The maximum number of times an AWS API request is being executed. If the API request still fails, an error is
    * thrown.
    */
  val maxRetries: js.UndefOr[Input[Double]] = js.native
  /**
    * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
    */
  val profile: js.UndefOr[Input[String]] = js.native
  /**
    * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
    */
  val region: js.UndefOr[Input[Region]] = js.native
  /**
    * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
    * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
    * Specific to the Amazon S3 service.
    */
  val s3ForcePathStyle: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS
    * console.
    */
  val secretKey: js.UndefOr[Input[String]] = js.native
  /**
    * The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
    */
  val sharedCredentialsFile: js.UndefOr[Input[String]] = js.native
  /**
    * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
    * available/implemented.
    */
  val skipCredentialsValidation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
    */
  val skipGetEc2Platforms: js.UndefOr[Input[Boolean]] = js.native
  val skipMetadataApiCheck: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that
    * are not public (yet).
    */
  val skipRegionValidation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
    */
  val skipRequestingAccountId: js.UndefOr[Input[Boolean]] = js.native
  /**
    * session token. A session token is only required if you are using temporary security credentials.
    */
  val token: js.UndefOr[Input[String]] = js.native
}

object ProviderArgs {
  @scala.inline
  def apply(
    accessKey: Input[String] = null,
    allowedAccountIds: Input[js.Array[Input[String]]] = null,
    assumeRole: Input[ProviderAssumeRole] = null,
    endpoints: Input[js.Array[Input[ProviderEndpoint]]] = null,
    forbiddenAccountIds: Input[js.Array[Input[String]]] = null,
    ignoreTags: Input[ProviderIgnoreTags] = null,
    insecure: Input[Boolean] = null,
    maxRetries: Input[Double] = null,
    profile: Input[String] = null,
    region: Input[Region] = null,
    s3ForcePathStyle: Input[Boolean] = null,
    secretKey: Input[String] = null,
    sharedCredentialsFile: Input[String] = null,
    skipCredentialsValidation: Input[Boolean] = null,
    skipGetEc2Platforms: Input[Boolean] = null,
    skipMetadataApiCheck: Input[Boolean] = null,
    skipRegionValidation: Input[Boolean] = null,
    skipRequestingAccountId: Input[Boolean] = null,
    token: Input[String] = null
  ): ProviderArgs = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (allowedAccountIds != null) __obj.updateDynamic("allowedAccountIds")(allowedAccountIds.asInstanceOf[js.Any])
    if (assumeRole != null) __obj.updateDynamic("assumeRole")(assumeRole.asInstanceOf[js.Any])
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (forbiddenAccountIds != null) __obj.updateDynamic("forbiddenAccountIds")(forbiddenAccountIds.asInstanceOf[js.Any])
    if (ignoreTags != null) __obj.updateDynamic("ignoreTags")(ignoreTags.asInstanceOf[js.Any])
    if (insecure != null) __obj.updateDynamic("insecure")(insecure.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (s3ForcePathStyle != null) __obj.updateDynamic("s3ForcePathStyle")(s3ForcePathStyle.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    if (sharedCredentialsFile != null) __obj.updateDynamic("sharedCredentialsFile")(sharedCredentialsFile.asInstanceOf[js.Any])
    if (skipCredentialsValidation != null) __obj.updateDynamic("skipCredentialsValidation")(skipCredentialsValidation.asInstanceOf[js.Any])
    if (skipGetEc2Platforms != null) __obj.updateDynamic("skipGetEc2Platforms")(skipGetEc2Platforms.asInstanceOf[js.Any])
    if (skipMetadataApiCheck != null) __obj.updateDynamic("skipMetadataApiCheck")(skipMetadataApiCheck.asInstanceOf[js.Any])
    if (skipRegionValidation != null) __obj.updateDynamic("skipRegionValidation")(skipRegionValidation.asInstanceOf[js.Any])
    if (skipRequestingAccountId != null) __obj.updateDynamic("skipRequestingAccountId")(skipRequestingAccountId.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderArgs]
  }
}

