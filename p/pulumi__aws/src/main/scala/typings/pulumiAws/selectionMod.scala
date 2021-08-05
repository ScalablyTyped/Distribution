package typings.pulumiAws

import typings.pulumiAws.outputMod.backup.SelectionSelectionTag
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/backup/selection", "Selection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Selection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Selection]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Selection]
    inline def get(name: String, id: Input[ID], state: SelectionState): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Selection]
    inline def get(name: String, id: Input[ID], state: SelectionState, opts: CustomResourceOptions): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Selection]
    
    /**
      * Returns true if the given object is an instance of Selection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/backup/selection.Selection */ Boolean]
  }
  
  trait SelectionArgs extends StObject {
    
    /**
      * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
      */
    val iamRoleArn: Input[String]
    
    /**
      * The display name of a resource selection document.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The backup plan ID to be associated with the selection of resources.
      */
    val planId: Input[String]
    
    /**
      * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
      */
    val resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Tag-based conditions used to specify a set of resources to assign to a backup plan.
      */
    val selectionTags: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]]]] = js.undefined
  }
  object SelectionArgs {
    
    inline def apply(iamRoleArn: Input[String], planId: Input[String]): SelectionArgs = {
      val __obj = js.Dynamic.literal(iamRoleArn = iamRoleArn.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionArgs]
    }
    
    extension [Self <: SelectionArgs](x: Self) {
      
      inline def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlanId(value: Input[String]): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      inline def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      inline def setSelectionTags(value: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]]]): Self = StObject.set(x, "selectionTags", value.asInstanceOf[js.Any])
      
      inline def setSelectionTagsUndefined: Self = StObject.set(x, "selectionTags", js.undefined)
      
      inline def setSelectionTagsVarargs(value: Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]*): Self = StObject.set(x, "selectionTags", js.Array(value :_*))
    }
  }
  
  trait SelectionState extends StObject {
    
    /**
      * The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
      */
    val iamRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The display name of a resource selection document.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The backup plan ID to be associated with the selection of resources.
      */
    val planId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
      */
    val resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Tag-based conditions used to specify a set of resources to assign to a backup plan.
      */
    val selectionTags: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]]]] = js.undefined
  }
  object SelectionState {
    
    inline def apply(): SelectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionState]
    }
    
    extension [Self <: SelectionState](x: Self) {
      
      inline def setIamRoleArn(value: Input[String]): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
      
      inline def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlanId(value: Input[String]): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
      
      inline def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
      
      inline def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      inline def setSelectionTags(value: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]]]): Self = StObject.set(x, "selectionTags", value.asInstanceOf[js.Any])
      
      inline def setSelectionTagsUndefined: Self = StObject.set(x, "selectionTags", js.undefined)
      
      inline def setSelectionTagsVarargs(value: Input[typings.pulumiAws.inputMod.backup.SelectionSelectionTag]*): Self = StObject.set(x, "selectionTags", js.Array(value :_*))
    }
  }
}
