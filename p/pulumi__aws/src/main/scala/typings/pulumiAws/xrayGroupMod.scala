package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xrayGroupMod {
  
  @JSImport("@pulumi/aws/xray/group", "Group")
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
      * The ARN of the Group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The filter expression defining criteria by which to group traces. more info can be found in official [docs](https://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html).
      */
    val filterExpression: Output_[String] = js.native
    
    /**
      * The name of the group.
      */
    val groupName: Output_[String] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Group {
    
    @JSImport("@pulumi/aws/xray/group", "Group")
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
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/group.Group */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/xray/group.Group */ Boolean]
  }
  
  trait GroupArgs extends StObject {
    
    /**
      * The filter expression defining criteria by which to group traces. more info can be found in official [docs](https://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html).
      */
    val filterExpression: Input[String]
    
    /**
      * The name of the group.
      */
    val groupName: Input[String]
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object GroupArgs {
    
    @scala.inline
    def apply(filterExpression: Input[String], groupName: Input[String]): GroupArgs = {
      val __obj = js.Dynamic.literal(filterExpression = filterExpression.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupArgs]
    }
    
    @scala.inline
    implicit class GroupArgsMutableBuilder[Self <: GroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterExpression(value: Input[String]): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupName(value: Input[String]): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GroupState extends StObject {
    
    /**
      * The ARN of the Group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The filter expression defining criteria by which to group traces. more info can be found in official [docs](https://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html).
      */
    val filterExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the group.
      */
    val groupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value mapping of resource tags
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
      def setFilterExpression(value: Input[String]): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterExpressionUndefined: Self = StObject.set(x, "filterExpression", js.undefined)
      
      @scala.inline
      def setGroupName(value: Input[String]): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
