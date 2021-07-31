package typings.pulumiAws

import typings.pulumiAws.enumsMod.Region
import typings.pulumiAws.inputMod.ProviderAssumeRole
import typings.pulumiAws.inputMod.ProviderEndpoint
import typings.pulumiAws.inputMod.ProviderIgnoreTags
import typings.pulumiPulumi.mod.ProviderResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@pulumi/aws/provider", "Provider")
  @js.native
  class Provider protected () extends ProviderResource {
    /**
      * Create a Provider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ProviderArgs) = this()
    def this(name: String, args: Unit, opts: ResourceOptions) = this()
    def this(name: String, args: ProviderArgs, opts: ResourceOptions) = this()
  }
  /* static members */
  object Provider {
    
    @JSImport("@pulumi/aws/provider", "Provider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of Provider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/provider.Provider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/provider.Provider */ Boolean]
  }
  
  trait ProviderArgs extends StObject {
    
    /**
      * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
      */
    val accessKey: js.UndefOr[Input[String]] = js.undefined
    
    val allowedAccountIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    val assumeRole: js.UndefOr[Input[ProviderAssumeRole]] = js.undefined
    
    val endpoints: js.UndefOr[Input[js.Array[Input[ProviderEndpoint]]]] = js.undefined
    
    val forbiddenAccountIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Configuration block with settings to ignore resource tags across all resources.
      */
    val ignoreTags: js.UndefOr[Input[ProviderIgnoreTags]] = js.undefined
    
    /**
      * Explicitly allow the provider to perform "insecure" SSL requests. If omitted,default value is `false`
      */
    val insecure: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
      */
    val maxRetries: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
      */
    val profile: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
      */
    val region: js.UndefOr[Input[Region]] = js.undefined
    
    /**
      * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
      * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
      * Specific to the Amazon S3 service.
      */
    val s3ForcePathStyle: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
      */
    val secretKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
      */
    val sharedCredentialsFile: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
      * available/implemented.
      */
    val skipCredentialsValidation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
      */
    val skipGetEc2Platforms: js.UndefOr[Input[Boolean]] = js.undefined
    
    val skipMetadataApiCheck: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
      * not public (yet).
      */
    val skipRegionValidation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
      */
    val skipRequestingAccountId: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * session token. A session token is only required if you are using temporary security credentials.
      */
    val token: js.UndefOr[Input[String]] = js.undefined
  }
  object ProviderArgs {
    
    @scala.inline
    def apply(): ProviderArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderArgs]
    }
    
    @scala.inline
    implicit class ProviderArgsMutableBuilder[Self <: ProviderArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: Input[String]): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAllowedAccountIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedAccountIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedAccountIdsUndefined: Self = StObject.set(x, "allowedAccountIds", js.undefined)
      
      @scala.inline
      def setAllowedAccountIdsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedAccountIds", js.Array(value :_*))
      
      @scala.inline
      def setAssumeRole(value: Input[ProviderAssumeRole]): Self = StObject.set(x, "assumeRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssumeRoleUndefined: Self = StObject.set(x, "assumeRole", js.undefined)
      
      @scala.inline
      def setEndpoints(value: Input[js.Array[Input[ProviderEndpoint]]]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
      
      @scala.inline
      def setEndpointsVarargs(value: Input[ProviderEndpoint]*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      @scala.inline
      def setForbiddenAccountIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "forbiddenAccountIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForbiddenAccountIdsUndefined: Self = StObject.set(x, "forbiddenAccountIds", js.undefined)
      
      @scala.inline
      def setForbiddenAccountIdsVarargs(value: Input[String]*): Self = StObject.set(x, "forbiddenAccountIds", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreTags(value: Input[ProviderIgnoreTags]): Self = StObject.set(x, "ignoreTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTagsUndefined: Self = StObject.set(x, "ignoreTags", js.undefined)
      
      @scala.inline
      def setInsecure(value: Input[Boolean]): Self = StObject.set(x, "insecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsecureUndefined: Self = StObject.set(x, "insecure", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Input[Double]): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setProfile(value: Input[String]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setRegion(value: Input[Region]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setS3ForcePathStyle(value: Input[Boolean]): Self = StObject.set(x, "s3ForcePathStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3ForcePathStyleUndefined: Self = StObject.set(x, "s3ForcePathStyle", js.undefined)
      
      @scala.inline
      def setSecretKey(value: Input[String]): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
      
      @scala.inline
      def setSharedCredentialsFile(value: Input[String]): Self = StObject.set(x, "sharedCredentialsFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedCredentialsFileUndefined: Self = StObject.set(x, "sharedCredentialsFile", js.undefined)
      
      @scala.inline
      def setSkipCredentialsValidation(value: Input[Boolean]): Self = StObject.set(x, "skipCredentialsValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipCredentialsValidationUndefined: Self = StObject.set(x, "skipCredentialsValidation", js.undefined)
      
      @scala.inline
      def setSkipGetEc2Platforms(value: Input[Boolean]): Self = StObject.set(x, "skipGetEc2Platforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipGetEc2PlatformsUndefined: Self = StObject.set(x, "skipGetEc2Platforms", js.undefined)
      
      @scala.inline
      def setSkipMetadataApiCheck(value: Input[Boolean]): Self = StObject.set(x, "skipMetadataApiCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipMetadataApiCheckUndefined: Self = StObject.set(x, "skipMetadataApiCheck", js.undefined)
      
      @scala.inline
      def setSkipRegionValidation(value: Input[Boolean]): Self = StObject.set(x, "skipRegionValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipRegionValidationUndefined: Self = StObject.set(x, "skipRegionValidation", js.undefined)
      
      @scala.inline
      def setSkipRequestingAccountId(value: Input[Boolean]): Self = StObject.set(x, "skipRequestingAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipRequestingAccountIdUndefined: Self = StObject.set(x, "skipRequestingAccountId", js.undefined)
      
      @scala.inline
      def setToken(value: Input[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
