package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.customResourceMod.CustomResourceArgs
import typings.pulumiKubernetes.customResourceMod.CustomResourceGetOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "apiextensions")
@js.native
object apiextensions extends js.Object {
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
  @js.native
  object CustomResource extends js.Object {
    /**
      * Get the state of an existing `CustomResource`, as identified by `id`.
      * Typically this ID  is of the form [namespace]/[name]; if [namespace] is omitted, then (per
      * Kubernetes convention) the ID becomes default/[name].
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, opts: CustomResourceGetOptions): typings.pulumiKubernetes.customResourceMod.CustomResource = js.native
  }
  
  @js.native
  object v1 extends js.Object {
    @js.native
    class CustomResourceDefinition protected ()
      extends typings.pulumiKubernetes.apiextensionsMod.v1.CustomResourceDefinition {
      /**
        * Create a apiextensions.v1.CustomResourceDefinition resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.apiextensions.v1.CustomResourceDefinition) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.apiextensions.v1.CustomResourceDefinition,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class CustomResourceDefinitionList protected ()
      extends typings.pulumiKubernetes.apiextensionsMod.v1.CustomResourceDefinitionList {
      /**
        * Create a apiextensions.v1.CustomResourceDefinitionList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.apiextensions.v1.CustomResourceDefinitionList
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.apiextensions.v1.CustomResourceDefinitionList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object CustomResourceDefinition extends js.Object {
      /**
        * Get the state of an existing `CustomResourceDefinition` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinition = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CustomResourceDefinitionMod.CustomResourceDefinition = js.native
      /**
        * Returns true if the given object is an instance of CustomResourceDefinition.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1/CustomResourceDefinition.CustomResourceDefinition */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object CustomResourceDefinitionList extends js.Object {
      /**
        * Get the state of an existing `CustomResourceDefinitionList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1CustomResourceDefinitionListMod.CustomResourceDefinitionList = js.native
      /**
        * Returns true if the given object is an instance of CustomResourceDefinitionList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1/CustomResourceDefinitionList.CustomResourceDefinitionList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class CustomResourceDefinition protected ()
      extends typings.pulumiKubernetes.apiextensionsMod.v1beta1.CustomResourceDefinition {
      /**
        * Create a apiextensions.v1beta1.CustomResourceDefinition resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.apiextensions.v1beta1.CustomResourceDefinition
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.apiextensions.v1beta1.CustomResourceDefinition,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class CustomResourceDefinitionList protected ()
      extends typings.pulumiKubernetes.apiextensionsMod.v1beta1.CustomResourceDefinitionList {
      /**
        * Create a apiextensions.v1beta1.CustomResourceDefinitionList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.apiextensions.v1beta1.CustomResourceDefinitionList
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.apiextensions.v1beta1.CustomResourceDefinitionList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object CustomResourceDefinition extends js.Object {
      /**
        * Get the state of an existing `CustomResourceDefinition` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.customResourceDefinitionMod.CustomResourceDefinition = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.customResourceDefinitionMod.CustomResourceDefinition = js.native
      /**
        * Returns true if the given object is an instance of CustomResourceDefinition.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/CustomResourceDefinition.CustomResourceDefinition */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object CustomResourceDefinitionList extends js.Object {
      /**
        * Get the state of an existing `CustomResourceDefinitionList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.customResourceDefinitionListMod.CustomResourceDefinitionList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.customResourceDefinitionListMod.CustomResourceDefinitionList = js.native
      /**
        * Returns true if the given object is an instance of CustomResourceDefinitionList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/CustomResourceDefinitionList.CustomResourceDefinitionList */ Boolean = js.native
    }
    
  }
  
}

