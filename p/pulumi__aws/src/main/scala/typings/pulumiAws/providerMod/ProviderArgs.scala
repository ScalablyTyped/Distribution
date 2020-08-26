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
    * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
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
    * The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
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
    * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
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
    * Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
    * not public (yet).
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
  def apply(): ProviderArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderArgs]
  }
  @scala.inline
  implicit class ProviderArgsOps[Self <: ProviderArgs] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: Input[String]): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAllowedAccountIdsVarargs(value: Input[String]*): Self = this.set("allowedAccountIds", js.Array(value :_*))
    @scala.inline
    def setAllowedAccountIds(value: Input[js.Array[Input[String]]]): Self = this.set("allowedAccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedAccountIds: Self = this.set("allowedAccountIds", js.undefined)
    @scala.inline
    def setAssumeRole(value: Input[ProviderAssumeRole]): Self = this.set("assumeRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeRole: Self = this.set("assumeRole", js.undefined)
    @scala.inline
    def setEndpointsVarargs(value: Input[ProviderEndpoint]*): Self = this.set("endpoints", js.Array(value :_*))
    @scala.inline
    def setEndpoints(value: Input[js.Array[Input[ProviderEndpoint]]]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    @scala.inline
    def setForbiddenAccountIdsVarargs(value: Input[String]*): Self = this.set("forbiddenAccountIds", js.Array(value :_*))
    @scala.inline
    def setForbiddenAccountIds(value: Input[js.Array[Input[String]]]): Self = this.set("forbiddenAccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForbiddenAccountIds: Self = this.set("forbiddenAccountIds", js.undefined)
    @scala.inline
    def setIgnoreTags(value: Input[ProviderIgnoreTags]): Self = this.set("ignoreTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreTags: Self = this.set("ignoreTags", js.undefined)
    @scala.inline
    def setInsecure(value: Input[Boolean]): Self = this.set("insecure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsecure: Self = this.set("insecure", js.undefined)
    @scala.inline
    def setMaxRetries(value: Input[Double]): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    @scala.inline
    def setProfile(value: Input[String]): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setRegion(value: Input[Region]): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setS3ForcePathStyle(value: Input[Boolean]): Self = this.set("s3ForcePathStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3ForcePathStyle: Self = this.set("s3ForcePathStyle", js.undefined)
    @scala.inline
    def setSecretKey(value: Input[String]): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
    @scala.inline
    def setSharedCredentialsFile(value: Input[String]): Self = this.set("sharedCredentialsFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedCredentialsFile: Self = this.set("sharedCredentialsFile", js.undefined)
    @scala.inline
    def setSkipCredentialsValidation(value: Input[Boolean]): Self = this.set("skipCredentialsValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipCredentialsValidation: Self = this.set("skipCredentialsValidation", js.undefined)
    @scala.inline
    def setSkipGetEc2Platforms(value: Input[Boolean]): Self = this.set("skipGetEc2Platforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipGetEc2Platforms: Self = this.set("skipGetEc2Platforms", js.undefined)
    @scala.inline
    def setSkipMetadataApiCheck(value: Input[Boolean]): Self = this.set("skipMetadataApiCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipMetadataApiCheck: Self = this.set("skipMetadataApiCheck", js.undefined)
    @scala.inline
    def setSkipRegionValidation(value: Input[Boolean]): Self = this.set("skipRegionValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipRegionValidation: Self = this.set("skipRegionValidation", js.undefined)
    @scala.inline
    def setSkipRequestingAccountId(value: Input[Boolean]): Self = this.set("skipRequestingAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipRequestingAccountId: Self = this.set("skipRequestingAccountId", js.undefined)
    @scala.inline
    def setToken(value: Input[String]): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

