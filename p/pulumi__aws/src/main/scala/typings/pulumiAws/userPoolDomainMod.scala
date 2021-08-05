package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPoolDomainMod {
  
  @JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain")
  @js.native
  class UserPoolDomain protected () extends CustomResource {
    /**
      * Create a UserPoolDomain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolDomainArgs) = this()
    def this(name: String, args: UserPoolDomainArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The AWS account ID for the user pool owner.
      */
    val awsAccountId: Output_[String] = js.native
    
    /**
      * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
      */
    val certificateArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
      */
    val cloudfrontDistributionArn: Output_[String] = js.native
    
    /**
      * The domain string.
      */
    val domain: Output_[String] = js.native
    
    /**
      * The S3 bucket where the static files for this domain are stored.
      */
    val s3Bucket: Output_[String] = js.native
    
    /**
      * The user pool ID.
      */
    val userPoolId: Output_[String] = js.native
    
    /**
      * The app version.
      */
    val version: Output_[String] = js.native
  }
  /* static members */
  object UserPoolDomain {
    
    @JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): UserPoolDomain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[UserPoolDomain]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): UserPoolDomain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserPoolDomain]
    inline def get(name: String, id: Input[ID], state: UserPoolDomainState): UserPoolDomain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[UserPoolDomain]
    inline def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): UserPoolDomain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UserPoolDomain]
    
    /**
      * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean]
  }
  
  trait UserPoolDomainArgs extends StObject {
    
    /**
      * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The domain string.
      */
    val domain: Input[String]
    
    /**
      * The user pool ID.
      */
    val userPoolId: Input[String]
  }
  object UserPoolDomainArgs {
    
    inline def apply(domain: Input[String], userPoolId: Input[String]): UserPoolDomainArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPoolDomainArgs]
    }
    
    extension [Self <: UserPoolDomainArgs](x: Self) {
      
      inline def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      inline def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserPoolDomainState extends StObject {
    
    /**
      * The AWS account ID for the user pool owner.
      */
    val awsAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
      */
    val cloudfrontDistributionArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The domain string.
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The S3 bucket where the static files for this domain are stored.
      */
    val s3Bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The user pool ID.
      */
    val userPoolId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The app version.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
  }
  object UserPoolDomainState {
    
    inline def apply(): UserPoolDomainState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPoolDomainState]
    }
    
    extension [Self <: UserPoolDomainState](x: Self) {
      
      inline def setAwsAccountId(value: Input[String]): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
      
      inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
      
      inline def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      inline def setCloudfrontDistributionArn(value: Input[String]): Self = StObject.set(x, "cloudfrontDistributionArn", value.asInstanceOf[js.Any])
      
      inline def setCloudfrontDistributionArnUndefined: Self = StObject.set(x, "cloudfrontDistributionArn", js.undefined)
      
      inline def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setS3Bucket(value: Input[String]): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
      
      inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
      
      inline def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
      
      inline def setUserPoolIdUndefined: Self = StObject.set(x, "userPoolId", js.undefined)
      
      inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
