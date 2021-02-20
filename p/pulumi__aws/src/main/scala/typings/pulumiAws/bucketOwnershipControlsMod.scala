package typings.pulumiAws

import typings.pulumiAws.outputMod.s3.BucketOwnershipControlsRule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing BucketOwnershipControls resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3/bucketOwnershipControls", "BucketOwnershipControls.get")
    @js.native
    def get(name: String, id: Input[ID]): BucketOwnershipControls = js.native
    @JSImport("@pulumi/aws/s3/bucketOwnershipControls", "BucketOwnershipControls.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketOwnershipControls = js.native
    @JSImport("@pulumi/aws/s3/bucketOwnershipControls", "BucketOwnershipControls.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketOwnershipControlsState): BucketOwnershipControls = js.native
    @JSImport("@pulumi/aws/s3/bucketOwnershipControls", "BucketOwnershipControls.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketOwnershipControlsState, opts: CustomResourceOptions): BucketOwnershipControls = js.native
    
    /**
      * Returns true if the given object is an instance of BucketOwnershipControls.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3/bucketOwnershipControls", "BucketOwnershipControls.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketOwnershipControls.BucketOwnershipControls */ Boolean = js.native
  }
  
  @js.native
  trait BucketOwnershipControlsArgs extends StObject {
    
    /**
      * The name of the bucket that you want to associate this access point with.
      */
    val bucket: Input[String] = js.native
    
    /**
      * Configuration block(s) with Ownership Controls rules. Detailed below.
      */
    val rule: Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule] = js.native
  }
  object BucketOwnershipControlsArgs {
    
    @scala.inline
    def apply(bucket: Input[String], rule: Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule]): BucketOwnershipControlsArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketOwnershipControlsArgs]
    }
    
    @scala.inline
    implicit class BucketOwnershipControlsArgsMutableBuilder[Self <: BucketOwnershipControlsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketOwnershipControlsState extends StObject {
    
    /**
      * The name of the bucket that you want to associate this access point with.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block(s) with Ownership Controls rules. Detailed below.
      */
    val rule: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule]] = js.native
  }
  object BucketOwnershipControlsState {
    
    @scala.inline
    def apply(): BucketOwnershipControlsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketOwnershipControlsState]
    }
    
    @scala.inline
    implicit class BucketOwnershipControlsStateMutableBuilder[Self <: BucketOwnershipControlsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setRule(value: Input[typings.pulumiAws.inputMod.s3.BucketOwnershipControlsRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    }
  }
}
