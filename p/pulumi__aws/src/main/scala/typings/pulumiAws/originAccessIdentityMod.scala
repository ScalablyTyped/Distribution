package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object originAccessIdentityMod {
  
  @JSImport("@pulumi/aws/cloudfront/originAccessIdentity", "OriginAccessIdentity")
  @js.native
  class OriginAccessIdentity protected () extends CustomResource {
    /**
      * Create a OriginAccessIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: OriginAccessIdentityArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: OriginAccessIdentityArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Internal value used by CloudFront to allow future
      * updates to the origin access identity.
      */
    val callerReference: Output_[String] = js.native
    
    /**
      * A shortcut to the full path for the
      * origin access identity to use in CloudFront, see below.
      */
    val cloudfrontAccessIdentityPath: Output_[String] = js.native
    
    /**
      * An optional comment for the origin access identity.
      */
    val comment: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The current version of the origin access identity's information.
      * For example: `E2QWRUHAPOMQZL`.
      */
    val etag: Output_[String] = js.native
    
    /**
      * A pre-generated ARN for use in S3 bucket policies (see below).
      * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
      * E2QWRUHAPOMQZL`.
      */
    val iamArn: Output_[String] = js.native
    
    /**
      * The Amazon S3 canonical user ID for the origin
      * access identity, which you use when giving the origin access identity read
      * permission to an object in Amazon S3.
      */
    val s3CanonicalUserId: Output_[String] = js.native
  }
  /* static members */
  object OriginAccessIdentity {
    
    /**
      * Get an existing OriginAccessIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudfront/originAccessIdentity", "OriginAccessIdentity.get")
    @js.native
    def get(name: String, id: Input[ID]): OriginAccessIdentity = js.native
    @JSImport("@pulumi/aws/cloudfront/originAccessIdentity", "OriginAccessIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OriginAccessIdentity = js.native
    @JSImport("@pulumi/aws/cloudfront/originAccessIdentity", "OriginAccessIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState): OriginAccessIdentity = js.native
    @JSImport("@pulumi/aws/cloudfront/originAccessIdentity", "OriginAccessIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: OriginAccessIdentityState, opts: CustomResourceOptions): OriginAccessIdentity = js.native
    
    /**
      * Returns true if the given object is an instance of OriginAccessIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudfront/originAccessIdentity", "OriginAccessIdentity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/originAccessIdentity.OriginAccessIdentity */ Boolean = js.native
  }
  
  @js.native
  trait OriginAccessIdentityArgs extends StObject {
    
    /**
      * An optional comment for the origin access identity.
      */
    val comment: js.UndefOr[Input[String]] = js.native
  }
  object OriginAccessIdentityArgs {
    
    @scala.inline
    def apply(): OriginAccessIdentityArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginAccessIdentityArgs]
    }
    
    @scala.inline
    implicit class OriginAccessIdentityArgsMutableBuilder[Self <: OriginAccessIdentityArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    }
  }
  
  @js.native
  trait OriginAccessIdentityState extends StObject {
    
    /**
      * Internal value used by CloudFront to allow future
      * updates to the origin access identity.
      */
    val callerReference: js.UndefOr[Input[String]] = js.native
    
    /**
      * A shortcut to the full path for the
      * origin access identity to use in CloudFront, see below.
      */
    val cloudfrontAccessIdentityPath: js.UndefOr[Input[String]] = js.native
    
    /**
      * An optional comment for the origin access identity.
      */
    val comment: js.UndefOr[Input[String]] = js.native
    
    /**
      * The current version of the origin access identity's information.
      * For example: `E2QWRUHAPOMQZL`.
      */
    val etag: js.UndefOr[Input[String]] = js.native
    
    /**
      * A pre-generated ARN for use in S3 bucket policies (see below).
      * Example: `arn:aws:iam::cloudfront:user/CloudFront Origin Access Identity
      * E2QWRUHAPOMQZL`.
      */
    val iamArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon S3 canonical user ID for the origin
      * access identity, which you use when giving the origin access identity read
      * permission to an object in Amazon S3.
      */
    val s3CanonicalUserId: js.UndefOr[Input[String]] = js.native
  }
  object OriginAccessIdentityState {
    
    @scala.inline
    def apply(): OriginAccessIdentityState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginAccessIdentityState]
    }
    
    @scala.inline
    implicit class OriginAccessIdentityStateMutableBuilder[Self <: OriginAccessIdentityState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallerReference(value: Input[String]): Self = StObject.set(x, "callerReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallerReferenceUndefined: Self = StObject.set(x, "callerReference", js.undefined)
      
      @scala.inline
      def setCloudfrontAccessIdentityPath(value: Input[String]): Self = StObject.set(x, "cloudfrontAccessIdentityPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudfrontAccessIdentityPathUndefined: Self = StObject.set(x, "cloudfrontAccessIdentityPath", js.undefined)
      
      @scala.inline
      def setComment(value: Input[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setEtag(value: Input[String]): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setIamArn(value: Input[String]): Self = StObject.set(x, "iamArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamArnUndefined: Self = StObject.set(x, "iamArn", js.undefined)
      
      @scala.inline
      def setS3CanonicalUserId(value: Input[String]): Self = StObject.set(x, "s3CanonicalUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3CanonicalUserIdUndefined: Self = StObject.set(x, "s3CanonicalUserId", js.undefined)
    }
  }
}
