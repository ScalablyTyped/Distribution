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

object bucketPolicyMod {
  
  @JSImport("@pulumi/aws/s3control/bucketPolicy", "BucketPolicy")
  @js.native
  class BucketPolicy protected () extends CustomResource {
    /**
      * Create a BucketPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketPolicyArgs) = this()
    def this(name: String, args: BucketPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val bucket: Output_[String] = js.native
    
    val policy: Output_[String] = js.native
  }
  /* static members */
  object BucketPolicy {
    
    /**
      * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3control/bucketPolicy", "BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): BucketPolicy = js.native
    @JSImport("@pulumi/aws/s3control/bucketPolicy", "BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketPolicy = js.native
    @JSImport("@pulumi/aws/s3control/bucketPolicy", "BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState): BucketPolicy = js.native
    @JSImport("@pulumi/aws/s3control/bucketPolicy", "BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): BucketPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3control/bucketPolicy", "BucketPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketPolicy.BucketPolicy */ Boolean = js.native
  }
  
  @js.native
  trait BucketPolicyArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val bucket: Input[String] = js.native
    
    val policy: Input[String] = js.native
  }
  object BucketPolicyArgs {
    
    @scala.inline
    def apply(bucket: Input[String], policy: Input[String]): BucketPolicyArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketPolicyArgs]
    }
    
    @scala.inline
    implicit class BucketPolicyArgsMutableBuilder[Self <: BucketPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketPolicyState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    val policy: js.UndefOr[Input[String]] = js.native
  }
  object BucketPolicyState {
    
    @scala.inline
    def apply(): BucketPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketPolicyState]
    }
    
    @scala.inline
    implicit class BucketPolicyStateMutableBuilder[Self <: BucketPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
