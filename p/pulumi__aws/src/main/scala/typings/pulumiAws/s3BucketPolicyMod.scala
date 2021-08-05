package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3BucketPolicyMod {
  
  @JSImport("@pulumi/aws/s3/bucketPolicy", "BucketPolicy")
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
      * The name of the bucket to which to apply the policy.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * The text of the policy.
      */
    val policy: Output_[String] = js.native
  }
  /* static members */
  object BucketPolicy {
    
    @JSImport("@pulumi/aws/s3/bucketPolicy", "BucketPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[BucketPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BucketPolicy]
    inline def get(name: String, id: Input[ID], state: BucketPolicyState): BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[BucketPolicy]
    inline def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BucketPolicy]
    
    /**
      * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPolicy.BucketPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucketPolicy.BucketPolicy */ Boolean]
  }
  
  trait BucketPolicyArgs extends StObject {
    
    /**
      * The name of the bucket to which to apply the policy.
      */
    val bucket: Input[String]
    
    /**
      * The text of the policy.
      */
    val policy: Input[String | PolicyDocument]
  }
  object BucketPolicyArgs {
    
    inline def apply(bucket: Input[String], policy: Input[String | PolicyDocument]): BucketPolicyArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketPolicyArgs]
    }
    
    extension [Self <: BucketPolicyArgs](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  trait BucketPolicyState extends StObject {
    
    /**
      * The name of the bucket to which to apply the policy.
      */
    val bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The text of the policy.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
  }
  object BucketPolicyState {
    
    inline def apply(): BucketPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketPolicyState]
    }
    
    extension [Self <: BucketPolicyState](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
