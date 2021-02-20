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

object resourceShareMod {
  
  @JSImport("@pulumi/aws/ram/resourceShare", "ResourceShare")
  @js.native
  class ResourceShare protected () extends CustomResource {
    /**
      * Create a ResourceShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ResourceShareArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ResourceShareArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Indicates whether principals outside your organization can be associated with a resource share.
      */
    val allowExternalPrincipals: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the resource share.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource share.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ResourceShare {
    
    /**
      * Get an existing ResourceShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ram/resourceShare", "ResourceShare.get")
    @js.native
    def get(name: String, id: Input[ID]): ResourceShare = js.native
    @JSImport("@pulumi/aws/ram/resourceShare", "ResourceShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResourceShare = js.native
    @JSImport("@pulumi/aws/ram/resourceShare", "ResourceShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceShareState): ResourceShare = js.native
    @JSImport("@pulumi/aws/ram/resourceShare", "ResourceShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceShareState, opts: CustomResourceOptions): ResourceShare = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ram/resourceShare", "ResourceShare.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShare.ResourceShare */ Boolean = js.native
  }
  
  @js.native
  trait ResourceShareArgs extends StObject {
    
    /**
      * Indicates whether principals outside your organization can be associated with a resource share.
      */
    val allowExternalPrincipals: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the resource share.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource share.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ResourceShareArgs {
    
    @scala.inline
    def apply(): ResourceShareArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceShareArgs]
    }
    
    @scala.inline
    implicit class ResourceShareArgsMutableBuilder[Self <: ResourceShareArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowExternalPrincipals(value: Input[Boolean]): Self = StObject.set(x, "allowExternalPrincipals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowExternalPrincipalsUndefined: Self = StObject.set(x, "allowExternalPrincipals", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ResourceShareState extends StObject {
    
    /**
      * Indicates whether principals outside your organization can be associated with a resource share.
      */
    val allowExternalPrincipals: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the resource share.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource share.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ResourceShareState {
    
    @scala.inline
    def apply(): ResourceShareState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceShareState]
    }
    
    @scala.inline
    implicit class ResourceShareStateMutableBuilder[Self <: ResourceShareState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowExternalPrincipals(value: Input[Boolean]): Self = StObject.set(x, "allowExternalPrincipals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowExternalPrincipalsUndefined: Self = StObject.set(x, "allowExternalPrincipals", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
