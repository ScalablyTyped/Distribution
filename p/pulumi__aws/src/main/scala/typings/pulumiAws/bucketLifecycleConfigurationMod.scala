package typings.pulumiAws

import typings.pulumiAws.outputMod.s3control.BucketLifecycleConfigurationRule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketLifecycleConfigurationMod {
  
  @JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration")
  @js.native
  class BucketLifecycleConfiguration protected () extends CustomResource {
    /**
      * Create a BucketLifecycleConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketLifecycleConfigurationArgs) = this()
    def this(name: String, args: BucketLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * Configuration block(s) containing lifecycle rules for the bucket.
      */
    val rules: Output_[js.Array[BucketLifecycleConfigurationRule]] = js.native
  }
  /* static members */
  object BucketLifecycleConfiguration {
    
    @JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration")
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
    inline def get(name: String, id: Input[ID]): BucketLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[BucketLifecycleConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): BucketLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BucketLifecycleConfiguration]
    inline def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState): BucketLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[BucketLifecycleConfiguration]
    inline def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState, opts: CustomResourceOptions): BucketLifecycleConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BucketLifecycleConfiguration]
    
    /**
      * Returns true if the given object is an instance of BucketLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketLifecycleConfiguration.BucketLifecycleConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3control/bucketLifecycleConfiguration.BucketLifecycleConfiguration */ Boolean]
  }
  
  trait BucketLifecycleConfigurationArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val bucket: Input[String]
    
    /**
      * Configuration block(s) containing lifecycle rules for the bucket.
      */
    val rules: Input[
        js.Array[Input[typings.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]]
      ]
  }
  object BucketLifecycleConfigurationArgs {
    
    inline def apply(
      bucket: Input[String],
      rules: Input[
          js.Array[Input[typings.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]]
        ]
    ): BucketLifecycleConfigurationArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketLifecycleConfigurationArgs]
    }
    
    extension [Self <: BucketLifecycleConfigurationArgs](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setRules(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]]
            ]
      ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: Input[typings.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  trait BucketLifecycleConfigurationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block(s) containing lifecycle rules for the bucket.
      */
    val rules: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]]
        ]
      ] = js.undefined
  }
  object BucketLifecycleConfigurationState {
    
    inline def apply(): BucketLifecycleConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketLifecycleConfigurationState]
    }
    
    extension [Self <: BucketLifecycleConfigurationState](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setRules(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]]
            ]
      ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[typings.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
}
