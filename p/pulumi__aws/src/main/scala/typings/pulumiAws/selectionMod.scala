package typings.pulumiAws

import typings.pulumiAws.outputMod.backup.SelectionSelectionTag
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionMod {
  
  @JSImport("@pulumi/aws/backup/selection", "Selection")
  @js.native
  class Selection protected () extends CustomResource {
    /**
      * Create a Selection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SelectionArgs) = this()
    def this(name: String, args: SelectionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
      */
    val iamRoleArn: Output_[String] = js.native
    
    /**
      * The display name of a resource selection document.
      */
    val name: Output_[String] = js.native
    
    /**
      * The backup plan ID to be associated with the selection of resources.
      */
    val planId: Output_[String] = js.native
    
    /**
      * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
      */
    val resources: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Tag-based conditions used to specify a set of resources to assign to a backup plan.
      */
    val selectionTags: Output_[js.UndefOr[js.Array[SelectionSelectionTag]]] = js.native
  }
  /* static members */
  object Selection {
    
    /**
      * Get an existing Selection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/backup/selection", "Selection.get")
    @js.native
    def get(name: String, id: Input[ID]): Selection = js.native
    @JSImport("@pulumi/aws/backup/selection", "Selection.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Selection = js.native
    @JSImport("@pulumi/aws/backup/selection", "Selection.get")
    @js.native
    def get(name: String, id: Input[ID], state: SelectionState): Selection = js.native
    @JSImport("@pulumi/aws/backup/selection", "Selection.get")
    @js.native
    def get(name: String, id: Input[ID], state: SelectionState, opts: CustomResourceOptions): Selection = js.native
    
    /**
      * Returns true if the given object is an instance of Selection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/backup/selection", "Selection.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean = js.native
  }
  
  @js.native
  trait SelectionArgs extends StObject {
    
    /**
      * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
      */
    val iamRoleArn: Input[String] = js.native
    
    /**
      * The display name of a resource selection document.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The backup plan ID to be associated with the selection of resources.
      */
    val planId: Input[String] = js.native
    
    /**
      * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
      */
    val resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Tag-based conditions used to specify a set of resources to assign to a backup plan.
      */
    val selectionTags: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]]]] = js.native
  }
  object SelectionArgs {
    
    @scala.inline
    def apply(iamRoleArn: Input[String], planId: Input[String]): SelectionArgs = {
      val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionArgs]
    }
    
    @scala.inline
    implicit class SelectionArgsMutableBuilder[Self <: SelectionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlanId(value: Input[String]): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      @scala.inline
      def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSelectionTags(value: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]]]): Self = StObject.set(x, "selectionTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTagsUndefined: Self = StObject.set(x, "selectionTags", js.undefined)
      
      @scala.inline
      def setSelectionTagsVarargs(value: Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]*): Self = StObject.set(x, "selectionTags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SelectionState extends StObject {
    
    /**
      * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
      */
    val iamRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The display name of a resource selection document.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The backup plan ID to be associated with the selection of resources.
      */
    val planId: js.UndefOr[Input[String]] = js.native
    
    /**
      * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
      */
    val resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Tag-based conditions used to specify a set of resources to assign to a backup plan.
      */
    val selectionTags: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]]]] = js.native
  }
  object SelectionState {
    
    @scala.inline
    def apply(): SelectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionState]
    }
    
    @scala.inline
    implicit class SelectionStateMutableBuilder[Self <: SelectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlanId(value: Input[String]): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
      
      @scala.inline
      def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      @scala.inline
      def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSelectionTags(value: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]]]): Self = StObject.set(x, "selectionTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTagsUndefined: Self = StObject.set(x, "selectionTags", js.undefined)
      
      @scala.inline
      def setSelectionTagsVarargs(value: Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]*): Self = StObject.set(x, "selectionTags", js.Array(value :_*))
    }
  }
}
