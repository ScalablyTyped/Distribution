package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.runtimeClassListMod.RuntimeClassListArgs
import typings.pulumiKubernetes.runtimeClassMod.RuntimeClassArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes", "node")
@js.native
object node extends js.Object {
  
  @js.native
  object v1alpha1 extends js.Object {
    
    @js.native
    class RuntimeClass protected ()
      extends typings.pulumiKubernetes.pulumiKubernetesMod.v1alpha1.RuntimeClass {
      /**
        * Create a RuntimeClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: RuntimeClassArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: RuntimeClassArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object RuntimeClass extends js.Object {
      
      /**
        * Get an existing RuntimeClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.runtimeClassMod.RuntimeClass = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.runtimeClassMod.RuntimeClass = js.native
      
      /**
        * Returns true if the given object is an instance of RuntimeClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClass.RuntimeClass */ Boolean = js.native
    }
    
    @js.native
    class RuntimeClassList protected ()
      extends typings.pulumiKubernetes.pulumiKubernetesMod.v1alpha1.RuntimeClassList {
      /**
        * Create a RuntimeClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: RuntimeClassListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: RuntimeClassListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object RuntimeClassList extends js.Object {
      
      /**
        * Get an existing RuntimeClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.runtimeClassListMod.RuntimeClassList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.runtimeClassListMod.RuntimeClassList = js.native
      
      /**
        * Returns true if the given object is an instance of RuntimeClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1alpha1/runtimeClassList.RuntimeClassList */ Boolean = js.native
    }
  }
  
  @js.native
  object v1beta1 extends js.Object {
    
    @js.native
    class RuntimeClass protected ()
      extends typings.pulumiKubernetes.pulumiKubernetesMod.v1beta1.RuntimeClass {
      /**
        * Create a RuntimeClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.v1beta1RuntimeClassMod.RuntimeClassArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v1beta1RuntimeClassMod.RuntimeClassArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    @js.native
    object RuntimeClass extends js.Object {
      
      /**
        * Get an existing RuntimeClass resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RuntimeClassMod.RuntimeClass = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RuntimeClassMod.RuntimeClass = js.native
      
      /**
        * Returns true if the given object is an instance of RuntimeClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/runtimeClass.RuntimeClass */ Boolean = js.native
    }
    
    @js.native
    class RuntimeClassList protected ()
      extends typings.pulumiKubernetes.pulumiKubernetesMod.v1beta1.RuntimeClassList {
      /**
        * Create a RuntimeClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.v1beta1RuntimeClassListMod.RuntimeClassListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.v1beta1RuntimeClassListMod.RuntimeClassListArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    /* static members */
    @js.native
    object RuntimeClassList extends js.Object {
      
      /**
        * Get an existing RuntimeClassList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RuntimeClassListMod.RuntimeClassList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RuntimeClassListMod.RuntimeClassList = js.native
      
      /**
        * Returns true if the given object is an instance of RuntimeClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/runtimeClassList.RuntimeClassList */ Boolean = js.native
    }
  }
}
