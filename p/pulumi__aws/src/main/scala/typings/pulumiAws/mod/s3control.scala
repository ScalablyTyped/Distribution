package typings.pulumiAws.mod

import typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfigurationArgs
import typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfigurationState
import typings.pulumiAws.bucketMod.BucketArgs
import typings.pulumiAws.bucketMod.BucketState
import typings.pulumiAws.bucketPolicyMod.BucketPolicyArgs
import typings.pulumiAws.bucketPolicyMod.BucketPolicyState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3control {
  
  @JSImport("@pulumi/aws", "s3control.Bucket")
  @js.native
  class Bucket protected ()
    extends typings.pulumiAws.s3controlMod.Bucket {
    /**
      * Create a Bucket resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketArgs) = this()
    def this(name: String, args: BucketArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Bucket {
    
    @JSImport("@pulumi/aws", "s3control.Bucket")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Bucket resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketMod.Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketMod.Bucket]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.bucketMod.Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketMod.Bucket]
    @scala.inline
    def get(name: String, id: Input[ID], state: BucketState): typings.pulumiAws.bucketMod.Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketMod.Bucket]
    @scala.inline
    def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): typings.pulumiAws.bucketMod.Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketMod.Bucket]
    
    /**
      * Returns true if the given object is an instance of Bucket.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucket.Bucket */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3control/bucket.Bucket */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "s3control.BucketLifecycleConfiguration")
  @js.native
  class BucketLifecycleConfiguration protected ()
    extends typings.pulumiAws.s3controlMod.BucketLifecycleConfiguration {
    /**
      * Create a BucketLifecycleConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketLifecycleConfigurationArgs) = this()
    def this(name: String, args: BucketLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketLifecycleConfiguration {
    
    @JSImport("@pulumi/aws", "s3control.BucketLifecycleConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketLifecycleConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState): typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration]
    
    /**
      * Returns true if the given object is an instance of BucketLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketLifecycleConfiguration.BucketLifecycleConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3control/bucketLifecycleConfiguration.BucketLifecycleConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "s3control.BucketPolicy")
  @js.native
  class BucketPolicy protected ()
    extends typings.pulumiAws.s3controlMod.BucketPolicy {
    /**
      * Create a BucketPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketPolicyArgs) = this()
    def this(name: String, args: BucketPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketPolicy {
    
    @JSImport("@pulumi/aws", "s3control.BucketPolicy")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketPolicyMod.BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketPolicyMod.BucketPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.bucketPolicyMod.BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketPolicyMod.BucketPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: BucketPolicyState): typings.pulumiAws.bucketPolicyMod.BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketPolicyMod.BucketPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): typings.pulumiAws.bucketPolicyMod.BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketPolicyMod.BucketPolicy]
    
    /**
      * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketPolicy.BucketPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3control/bucketPolicy.BucketPolicy */ Boolean]
  }
}
