package typings.pulumiKubernetes

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/networking", JSImport.Namespace)
@js.native
object networkingMod extends js.Object {
  @js.native
  object v1 extends js.Object {
    @js.native
    class NetworkPolicy protected ()
      extends typings.pulumiKubernetes.networkingV1Mod.NetworkPolicy {
      /**
        * Create a networking.v1.NetworkPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.networking.v1.NetworkPolicy) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.networking.v1.NetworkPolicy,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class NetworkPolicyList protected ()
      extends typings.pulumiKubernetes.networkingV1Mod.NetworkPolicyList {
      /**
        * Create a networking.v1.NetworkPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.networking.v1.NetworkPolicyList) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.networking.v1.NetworkPolicyList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object NetworkPolicy extends js.Object {
      /**
        * Get the state of an existing `NetworkPolicy` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1NetworkPolicyMod.NetworkPolicy = js.native
      /**
        * Returns true if the given object is an instance of NetworkPolicy.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/NetworkPolicy.NetworkPolicy */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object NetworkPolicyList extends js.Object {
      /**
        * Get the state of an existing `NetworkPolicyList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1NetworkPolicyListMod.NetworkPolicyList = js.native
      /**
        * Returns true if the given object is an instance of NetworkPolicyList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1/NetworkPolicyList.NetworkPolicyList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class Ingress protected ()
      extends typings.pulumiKubernetes.networkingV1beta1Mod.Ingress {
      /**
        * Create a networking.v1beta1.Ingress resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.networking.v1beta1.Ingress) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.networking.v1beta1.Ingress,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class IngressClass protected ()
      extends typings.pulumiKubernetes.networkingV1beta1Mod.IngressClass {
      /**
        * Create a networking.v1beta1.IngressClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.networking.v1beta1.IngressClass) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.networking.v1beta1.IngressClass,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class IngressClassList protected ()
      extends typings.pulumiKubernetes.networkingV1beta1Mod.IngressClassList {
      /**
        * Create a networking.v1beta1.IngressClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.networking.v1beta1.IngressClassList) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.networking.v1beta1.IngressClassList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class IngressList protected ()
      extends typings.pulumiKubernetes.networkingV1beta1Mod.IngressList {
      /**
        * Create a networking.v1beta1.IngressList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.networking.v1beta1.IngressList) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.networking.v1beta1.IngressList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object Ingress extends js.Object {
      /**
        * Get the state of an existing `Ingress` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1IngressMod.Ingress = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1IngressMod.Ingress = js.native
      /**
        * Returns true if the given object is an instance of Ingress.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/Ingress.Ingress */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object IngressClass extends js.Object {
      /**
        * Get the state of an existing `IngressClass` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.ingressClassMod.IngressClass = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.ingressClassMod.IngressClass = js.native
      /**
        * Returns true if the given object is an instance of IngressClass.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/IngressClass.IngressClass */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object IngressClassList extends js.Object {
      /**
        * Get the state of an existing `IngressClassList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.ingressClassListMod.IngressClassList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.ingressClassListMod.IngressClassList = js.native
      /**
        * Returns true if the given object is an instance of IngressClassList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/IngressClassList.IngressClassList */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object IngressList extends js.Object {
      /**
        * Get the state of an existing `IngressList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1IngressListMod.IngressList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1IngressListMod.IngressList = js.native
      /**
        * Returns true if the given object is an instance of IngressList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/networking/v1beta1/IngressList.IngressList */ Boolean = js.native
    }
    
  }
  
}

