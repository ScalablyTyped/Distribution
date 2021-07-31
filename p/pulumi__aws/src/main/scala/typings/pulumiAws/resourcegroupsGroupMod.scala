package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.resourcegroups.GroupResourceQuery
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcegroupsGroupMod {
  
  @JSImport("@pulumi/aws/resourcegroups/group", "Group")
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
      * The ARN assigned by AWS for this resource group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A description of the resource group.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
      */
    val name: Output_[String] = js.native
    
    /**
      * A `resourceQuery` block. Resource queries are documented below.
      */
    val resourceQuery: Output_[GroupResourceQuery] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Group {
    
    @JSImport("@pulumi/aws/resourcegroups/group", "Group")
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
    @scala.inline
    def get(name: String, id: Input[ID]): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Group]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Group]
    @scala.inline
    def get(name: String, id: Input[ID], state: GroupState): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Group]
    @scala.inline
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Group]
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/resourcegroups/group.Group */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/resourcegroups/group.Group */ Boolean]
  }
  
  trait GroupArgs extends StObject {
    
    /**
      * A description of the resource group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A `resourceQuery` block. Resource queries are documented below.
      */
    val resourceQuery: Input[typings.pulumiAws.inputMod.resourcegroups.GroupResourceQuery]
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object GroupArgs {
    
    @scala.inline
    def apply(resourceQuery: Input[typings.pulumiAws.inputMod.resourcegroups.GroupResourceQuery]): GroupArgs = {
      val __obj = js.Dynamic.literal(resourceQuery = resourceQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupArgs]
    }
    
    @scala.inline
    implicit class GroupArgsMutableBuilder[Self <: GroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceQuery(value: Input[typings.pulumiAws.inputMod.resourcegroups.GroupResourceQuery]): Self = StObject.set(x, "resourceQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GroupState extends StObject {
    
    /**
      * The ARN assigned by AWS for this resource group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the resource group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A `resourceQuery` block. Resource queries are documented below.
      */
    val resourceQuery: js.UndefOr[Input[typings.pulumiAws.inputMod.resourcegroups.GroupResourceQuery]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object GroupState {
    
    @scala.inline
    def apply(): GroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupState]
    }
    
    @scala.inline
    implicit class GroupStateMutableBuilder[Self <: GroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceQuery(value: Input[typings.pulumiAws.inputMod.resourcegroups.GroupResourceQuery]): Self = StObject.set(x, "resourceQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceQueryUndefined: Self = StObject.set(x, "resourceQuery", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
