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

object resourceGroupMod {
  
  @JSImport("@pulumi/aws/inspector/resourceGroup", "ResourceGroup")
  @js.native
  class ResourceGroup protected () extends CustomResource {
    /**
      * Create a ResourceGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceGroupArgs) = this()
    def this(name: String, args: ResourceGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The resource group ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Key-value map of tags that are used to select the EC2 instances to be included in an `Amazon Inspector assessment target` resource.
      */
    val tags: Output_[StringDictionary[String]] = js.native
  }
  /* static members */
  object ResourceGroup {
    
    @JSImport("@pulumi/aws/inspector/resourceGroup", "ResourceGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ResourceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ResourceGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ResourceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResourceGroupState): ResourceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ResourceGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResourceGroupState, opts: CustomResourceOptions): ResourceGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceGroup]
    
    /**
      * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean]
  }
  
  trait ResourceGroupArgs extends StObject {
    
    /**
      * Key-value map of tags that are used to select the EC2 instances to be included in an `Amazon Inspector assessment target` resource.
      */
    val tags: Input[StringDictionary[Input[String]]]
  }
  object ResourceGroupArgs {
    
    @scala.inline
    def apply(tags: Input[StringDictionary[Input[String]]]): ResourceGroupArgs = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceGroupArgs]
    }
    
    @scala.inline
    implicit class ResourceGroupArgsMutableBuilder[Self <: ResourceGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceGroupState extends StObject {
    
    /**
      * The resource group ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of tags that are used to select the EC2 instances to be included in an `Amazon Inspector assessment target` resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ResourceGroupState {
    
    @scala.inline
    def apply(): ResourceGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceGroupState]
    }
    
    @scala.inline
    implicit class ResourceGroupStateMutableBuilder[Self <: ResourceGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
