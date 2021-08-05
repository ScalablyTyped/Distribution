package typings.pulumiAws

import typings.pulumiAws.outputMod.s3.BucketOwnershipControlsRule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketOwnershipControlsMod {
  
  @JSImport("@pulumi/aws/s3/bucketOwnershipControls", "BucketOwnershipControls")
  @js.native
  class BucketOwnershipControls protected () extends CustomResource {
    /**
      * Create a BucketOwnershipControls resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketOwnershipControlsArgs) = this()
    def this(name: String, args: BucketOwnershipControlsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the bucket that you want to associate this access point with.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * Configuration block(s) with Ownership Controls rules. Detailed below.
      */
    val rule: Output_[BucketOwnershipControlsRule] = js.native
  }
  /* static members */
  object BucketOwnershipControls {
    
    @JSImport("@pulumi/aws/s3/bucketOwnershipControls", "BucketOwnershipControls")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketOwnershipControls resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): BucketOwnershipControls = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[BucketOwnershipControls]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): BucketOwnershipControls = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BucketOwnershipControls]
    inline def get(name: String, id: Input[ID], state: BucketOwnershipControlsState): BucketOwnershipControls = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[BucketOwnershipControls]
    inline def get(name: String, id: Input[ID], state: BucketOwnershipControlsState, opts: CustomResourceOptions): BucketOwnershipControls = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BucketOwnershipControls]
    
    /**
      * Returns true if the given object is an instance of BucketOwnershipControls.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketOwnershipControls.BucketOwnershipControls */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucketOwnershipControls.BucketOwnershipControls */ Boolean]
  }
  
  trait BucketOwnershipControlsArgs extends StObject {
    
    /**
      * The name of the bucket that you want to associate this access point with.
      */
    val bucket: Input[String]
    
    /**
      * Configuration block(s) with Ownership Controls rules. Detailed below.
      */
    val rule: Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule]
  }
  object BucketOwnershipControlsArgs {
    
    inline def apply(bucket: Input[String], rule: Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule]): BucketOwnershipControlsArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketOwnershipControlsArgs]
    }
    
    extension [Self <: BucketOwnershipControlsArgs](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setRule(value: Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
  
  trait BucketOwnershipControlsState extends StObject {
    
    /**
      * The name of the bucket that you want to associate this access point with.
      */
    val bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block(s) with Ownership Controls rules. Detailed below.
      */
    val rule: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule]] = js.undefined
  }
  object BucketOwnershipControlsState {
    
    inline def apply(): BucketOwnershipControlsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketOwnershipControlsState]
    }
    
    extension [Self <: BucketOwnershipControlsState](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setRule(value: Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    }
  }
}
