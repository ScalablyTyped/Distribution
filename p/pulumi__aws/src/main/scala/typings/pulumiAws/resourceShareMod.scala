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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
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
    
    @JSImport("@pulumi/aws/ram/resourceShare", "ResourceShare")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResourceShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ResourceShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ResourceShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ResourceShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResourceShareState): ResourceShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ResourceShare]
    @scala.inline
    def get(name: String, id: Input[ID], state: ResourceShareState, opts: CustomResourceOptions): ResourceShare = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResourceShare]
    
    /**
      * Returns true if the given object is an instance of ResourceShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShare.ResourceShare */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ram/resourceShare.ResourceShare */ Boolean]
  }
  
  trait ResourceShareArgs extends StObject {
    
    /**
      * Indicates whether principals outside your organization can be associated with a resource share.
      */
    val allowExternalPrincipals: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the resource share.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource share.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
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
  
  trait ResourceShareState extends StObject {
    
    /**
      * Indicates whether principals outside your organization can be associated with a resource share.
      */
    val allowExternalPrincipals: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the resource share.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the resource share.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource share.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
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
