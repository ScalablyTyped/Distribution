package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/inspector/resourceGroup", "ResourceGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): ResourceGroup = js.native
    @JSImport("@pulumi/aws/inspector/resourceGroup", "ResourceGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResourceGroup = js.native
    @JSImport("@pulumi/aws/inspector/resourceGroup", "ResourceGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState): ResourceGroup = js.native
    @JSImport("@pulumi/aws/inspector/resourceGroup", "ResourceGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceGroupState, opts: CustomResourceOptions): ResourceGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/inspector/resourceGroup", "ResourceGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/inspector/resourceGroup.ResourceGroup */ Boolean = js.native
  }
  
  @js.native
  trait ResourceGroupArgs extends StObject {
    
    /**
      * Key-value map of tags that are used to select the EC2 instances to be included in an `Amazon Inspector assessment target` resource.
      */
    val tags: Input[StringDictionary[Input[String]]] = js.native
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
  
  @js.native
  trait ResourceGroupState extends StObject {
    
    /**
      * The resource group ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of tags that are used to select the EC2 instances to be included in an `Amazon Inspector assessment target` resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
