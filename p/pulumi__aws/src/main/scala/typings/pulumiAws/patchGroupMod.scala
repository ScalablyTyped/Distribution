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

object patchGroupMod {
  
  @JSImport("@pulumi/aws/ssm/patchGroup", "PatchGroup")
  @js.native
  class PatchGroup protected () extends CustomResource {
    /**
      * Create a PatchGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PatchGroupArgs) = this()
    def this(name: String, args: PatchGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the patch baseline to register the patch group with.
      */
    val baselineId: Output_[String] = js.native
    
    /**
      * The name of the patch group that should be registered with the patch baseline.
      */
    val patchGroup: Output_[String] = js.native
  }
  /* static members */
  object PatchGroup {
    
    /**
      * Get an existing PatchGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm/patchGroup", "PatchGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): PatchGroup = js.native
    @JSImport("@pulumi/aws/ssm/patchGroup", "PatchGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PatchGroup = js.native
    @JSImport("@pulumi/aws/ssm/patchGroup", "PatchGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: PatchGroupState): PatchGroup = js.native
    @JSImport("@pulumi/aws/ssm/patchGroup", "PatchGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: PatchGroupState, opts: CustomResourceOptions): PatchGroup = js.native
    
    /**
      * Returns true if the given object is an instance of PatchGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm/patchGroup", "PatchGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchGroup.PatchGroup */ Boolean = js.native
  }
  
  @js.native
  trait PatchGroupArgs extends StObject {
    
    /**
      * The ID of the patch baseline to register the patch group with.
      */
    val baselineId: Input[String] = js.native
    
    /**
      * The name of the patch group that should be registered with the patch baseline.
      */
    val patchGroup: Input[String] = js.native
  }
  object PatchGroupArgs {
    
    @scala.inline
    def apply(baselineId: Input[String], patchGroup: Input[String]): PatchGroupArgs = {
      val __obj = js.Dynamic.literal(baselineId = baselineId.asInstanceOf[js.Any], patchGroup = patchGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchGroupArgs]
    }
    
    @scala.inline
    implicit class PatchGroupArgsMutableBuilder[Self <: PatchGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaselineId(value: Input[String]): Self = StObject.set(x, "baselineId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchGroup(value: Input[String]): Self = StObject.set(x, "patchGroup", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PatchGroupState extends StObject {
    
    /**
      * The ID of the patch baseline to register the patch group with.
      */
    val baselineId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the patch group that should be registered with the patch baseline.
      */
    val patchGroup: js.UndefOr[Input[String]] = js.native
  }
  object PatchGroupState {
    
    @scala.inline
    def apply(): PatchGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchGroupState]
    }
    
    @scala.inline
    implicit class PatchGroupStateMutableBuilder[Self <: PatchGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaselineId(value: Input[String]): Self = StObject.set(x, "baselineId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineIdUndefined: Self = StObject.set(x, "baselineId", js.undefined)
      
      @scala.inline
      def setPatchGroup(value: Input[String]): Self = StObject.set(x, "patchGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchGroupUndefined: Self = StObject.set(x, "patchGroup", js.undefined)
    }
  }
}
