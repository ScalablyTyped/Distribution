package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quicksightGroupMod {
  
  @JSImport("@pulumi/aws/quicksight/group", "Group")
  @js.native
  class Group protected () extends CustomResource {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of group
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    val awsAccountId: Output_[String] = js.native
    
    /**
      * A description for the group.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A name for the group.
      */
    val groupName: Output_[String] = js.native
    
    /**
      * The namespace. Currently, you should set this to `default`.
      */
    val namespace: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Group {
    
    @JSImport("@pulumi/aws/quicksight/group", "Group")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Group]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Group]
    inline def get(name: String, id: Input[ID], state: GroupState): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Group]
    inline def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Group]
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/quicksight/group.Group */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/quicksight/group.Group */ Boolean]
  }
  
  trait GroupArgs extends StObject {
    
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    val awsAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description for the group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A name for the group.
      */
    val groupName: Input[String]
    
    /**
      * The namespace. Currently, you should set this to `default`.
      */
    val namespace: js.UndefOr[Input[String]] = js.undefined
  }
  object GroupArgs {
    
    inline def apply(groupName: Input[String]): GroupArgs = {
      val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupArgs]
    }
    
    extension [Self <: GroupArgs](x: Self) {
      
      inline def setAwsAccountId(value: Input[String]): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
      
      inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGroupName(value: Input[String]): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
  
  trait GroupState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of group
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
      */
    val awsAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description for the group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A name for the group.
      */
    val groupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The namespace. Currently, you should set this to `default`.
      */
    val namespace: js.UndefOr[Input[String]] = js.undefined
  }
  object GroupState {
    
    inline def apply(): GroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupState]
    }
    
    extension [Self <: GroupState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAwsAccountId(value: Input[String]): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
      
      inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGroupName(value: Input[String]): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
}
