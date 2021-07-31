package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.customResourceMod.CustomResourceArgs
import typings.pulumiKubernetes.customResourceMod.CustomResourceGetOptions
import typings.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionListArgs
import typings.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinitionArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiextensions {
  
  @JSImport("@pulumi/kubernetes", "apiextensions.CustomResource")
  @js.native
  class CustomResource protected ()
    extends typings.pulumiKubernetes.apiextensionsMod.CustomResource {
    /**
      * Create a CustomResource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CustomResourceArgs) = this()
    def this(name: String, args: CustomResourceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CustomResource {
    
    @JSImport("@pulumi/kubernetes", "apiextensions.CustomResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CustomResource resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    @scala.inline
    def get(name: String, opts: CustomResourceGetOptions): typings.pulumiKubernetes.customResourceMod.CustomResource = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.customResourceMod.CustomResource]
  }
  
  object v1 {
    
    @JSImport("@pulumi/kubernetes", "apiextensions.v1.CustomResourceDefinition")
    @js.native
    class CustomResourceDefinition protected ()
      extends typings.pulumiKubernetes.apiextensionsMod.v1.CustomResourceDefinition {
      /**
        * Create a CustomResourceDefinition resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CustomResourceDefinitionArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CustomResourceDefinitionArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CustomResourceDefinition {
      
      @JSImport("@pulumi/kubernetes", "apiextensions.v1.CustomResourceDefinition")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CustomResourceDefinition resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinition]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinition]
      
      /**
        * Returns true if the given object is an instance of CustomResourceDefinition.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1/customResourceDefinition.CustomResourceDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1/customResourceDefinition.CustomResourceDefinition */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "apiextensions.v1.CustomResourceDefinitionList")
    @js.native
    class CustomResourceDefinitionList protected ()
      extends typings.pulumiKubernetes.apiextensionsMod.v1.CustomResourceDefinitionList {
      /**
        * Create a CustomResourceDefinitionList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: CustomResourceDefinitionListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: CustomResourceDefinitionListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object CustomResourceDefinitionList {
      
      @JSImport("@pulumi/kubernetes", "apiextensions.v1.CustomResourceDefinitionList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CustomResourceDefinitionList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionList]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionList]
      
      /**
        * Returns true if the given object is an instance of CustomResourceDefinitionList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1/customResourceDefinitionList.CustomResourceDefinitionList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1/customResourceDefinitionList.CustomResourceDefinitionList */ Boolean]
    }
  }
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes", "apiextensions.v1beta1.CustomResourceDefinition")
    @js.native
    class CustomResourceDefinition protected ()
      extends typings.pulumiKubernetes.apiextensionsMod.v1beta1.CustomResourceDefinition {
      /**
        * Create a CustomResourceDefinition resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.customResourceDefinitionMod.CustomResourceDefinitionArgs
      ) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.customResourceDefinitionMod.CustomResourceDefinitionArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object CustomResourceDefinition {
      
      @JSImport("@pulumi/kubernetes", "apiextensions.v1beta1.CustomResourceDefinition")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CustomResourceDefinition resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.customResourceDefinitionMod.CustomResourceDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.customResourceDefinitionMod.CustomResourceDefinition]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.customResourceDefinitionMod.CustomResourceDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.customResourceDefinitionMod.CustomResourceDefinition]
      
      /**
        * Returns true if the given object is an instance of CustomResourceDefinition.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinition.CustomResourceDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinition.CustomResourceDefinition */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "apiextensions.v1beta1.CustomResourceDefinitionList")
    @js.native
    class CustomResourceDefinitionList protected ()
      extends typings.pulumiKubernetes.apiextensionsMod.v1beta1.CustomResourceDefinitionList {
      /**
        * Create a CustomResourceDefinitionList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.customResourceDefinitionListMod.CustomResourceDefinitionListArgs
      ) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.customResourceDefinitionListMod.CustomResourceDefinitionListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    object CustomResourceDefinitionList {
      
      @JSImport("@pulumi/kubernetes", "apiextensions.v1beta1.CustomResourceDefinitionList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing CustomResourceDefinitionList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.customResourceDefinitionListMod.CustomResourceDefinitionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.customResourceDefinitionListMod.CustomResourceDefinitionList]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.customResourceDefinitionListMod.CustomResourceDefinitionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.customResourceDefinitionListMod.CustomResourceDefinitionList]
      
      /**
        * Returns true if the given object is an instance of CustomResourceDefinitionList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinitionList.CustomResourceDefinitionList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinitionList.CustomResourceDefinitionList */ Boolean]
    }
  }
}
