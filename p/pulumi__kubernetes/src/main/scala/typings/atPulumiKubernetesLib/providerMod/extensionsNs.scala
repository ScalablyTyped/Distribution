package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "extensions")
@js.native
object extensionsNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * DEPRECATED - This group version of DaemonSet is deprecated by apps/v1beta2/DaemonSet. See the
      * release notes for more information. DaemonSet represents the configuration of a daemon set.
      */
    @js.native
    class DaemonSet protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.DaemonSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.DaemonSet) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.DaemonSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSet] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * The desired behavior of this daemon set. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetSpec] = js.native
      /**
        * The current status of this daemon set. This data may be out of date by some window of time.
        * Populated by the system. Read-only. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSetStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.DaemonSet = js.native
    }
    
    /**
      * DaemonSetList is a collection of daemon sets.
      */
    @js.native
    class DaemonSetList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.DaemonSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.DaemonSetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.DaemonSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * A list of daemon sets.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DaemonSet]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSetList] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.DaemonSetList = js.native
    }
    
    /**
      * DEPRECATED - This group version of Deployment is deprecated by apps/v1beta2/Deployment. See
      * the release notes for more information. Deployment enables declarative updates for Pods and
      * ReplicaSets.
      */
    @js.native
    class Deployment protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.Deployment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.Deployment) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.Deployment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment] = js.native
      /**
        * Standard object metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the desired behavior of the Deployment.
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentSpec] = js.native
      /**
        * Most recently observed status of the Deployment.
        */
      val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.DeploymentStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.Deployment = js.native
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    @js.native
    class DeploymentList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.DeploymentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.DeploymentList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.DeploymentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * Items is the list of Deployments.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Deployment]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList] = js.native
      /**
        * Standard list metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.DeploymentList = js.native
    }
    
    /**
      * Ingress is a collection of rules that allow inbound connections to reach the endpoints
      * defined by a backend. An Ingress can be configured to give services externally-reachable
      * urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
      */
    @js.native
    class Ingress protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.Ingress resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.Ingress) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.Ingress, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Ingress] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec is the desired state of the Ingress. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressSpec] = js.native
      /**
        * Status is the current state of the Ingress. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.IngressStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.Ingress = js.native
    }
    
    /**
      * IngressList is a collection of Ingress.
      */
    @js.native
    class IngressList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.IngressList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.IngressList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.IngressList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * Items is the list of Ingress.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.Ingress]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.IngressList] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.IngressList = js.native
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicy is deprecated by
      * networking/v1/NetworkPolicy. NetworkPolicy describes what network traffic is allowed for a
      * set of Pods
      */
    @js.native
    class NetworkPolicy protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.NetworkPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.NetworkPolicy) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.NetworkPolicy, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicy] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the desired behavior for this NetworkPolicy.
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicySpec] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.NetworkPolicy = js.native
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicyList is deprecated by
      * networking/v1/NetworkPolicyList. Network Policy List is a list of NetworkPolicy objects.
      */
    @js.native
    class NetworkPolicyList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.NetworkPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.NetworkPolicyList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.NetworkPolicyList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * Items is a list of schema objects.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.NetworkPolicy]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicyList] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.NetworkPolicyList = js.native
    }
    
    /**
      * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
      * will be applied to a pod and container. Deprecated: use PodSecurityPolicy from policy API
      * Group instead.
      */
    @js.native
    class PodSecurityPolicy protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.PodSecurityPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.PodSecurityPolicy) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.PodSecurityPolicy, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicy] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * spec defines the policy enforced.
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicySpec
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.PodSecurityPolicy = js.native
    }
    
    /**
      * PodSecurityPolicyList is a list of PodSecurityPolicy objects. Deprecated: use
      * PodSecurityPolicyList from policy API Group instead.
      */
    @js.native
    class PodSecurityPolicyList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.PodSecurityPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * items is a list of schema objects.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.PodSecurityPolicy]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicyList] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList = js.native
    }
    
    /**
      * DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1beta2/ReplicaSet. See
      * the release notes for more information. ReplicaSet ensures that a specified number of pod
      * replicas are running at any given time.
      */
    @js.native
    class ReplicaSet protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.ReplicaSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.ReplicaSet) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.ReplicaSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet] = js.native
      /**
        * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
        * that the ReplicaSet manages. Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetSpec] = js.native
      /**
        * Status is the most recently observed status of the ReplicaSet. This data may be out of date
        * by some window of time. Populated by the system. Read-only. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSetStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.ReplicaSet = js.native
    }
    
    /**
      * ReplicaSetList is a collection of ReplicaSets.
      */
    @js.native
    class ReplicaSetList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a extensions.v1beta1.ReplicaSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.ReplicaSetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.ReplicaSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`] = js.native
      /**
        * List of ReplicaSets. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns.ReplicaSet]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSetList] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.ReplicaSetList = js.native
    }
    
    /**
      * DEPRECATED - This group version of DaemonSet is deprecated by apps/v1beta2/DaemonSet. See the
      * release notes for more information. DaemonSet represents the configuration of a daemon set.
      */
    @js.native
    object DaemonSet extends js.Object {
      /**
        * Get the state of an existing `DaemonSet` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSet = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSet = js.native
    }
    
    /**
      * DaemonSetList is a collection of daemon sets.
      */
    @js.native
    object DaemonSetList extends js.Object {
      /**
        * Get the state of an existing `DaemonSetList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSetList = js.native
    }
    
    /**
      * DEPRECATED - This group version of Deployment is deprecated by apps/v1beta2/Deployment. See
      * the release notes for more information. Deployment enables declarative updates for Pods and
      * ReplicaSets.
      */
    @js.native
    object Deployment extends js.Object {
      /**
        * Get the state of an existing `Deployment` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Deployment = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Deployment = js.native
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    @js.native
    object DeploymentList extends js.Object {
      /**
        * Get the state of an existing `DeploymentList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DeploymentList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DeploymentList = js.native
    }
    
    /**
      * Ingress is a collection of rules that allow inbound connections to reach the endpoints
      * defined by a backend. An Ingress can be configured to give services externally-reachable
      * urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
      */
    @js.native
    object Ingress extends js.Object {
      /**
        * Get the state of an existing `Ingress` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Ingress = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Ingress = js.native
    }
    
    /**
      * IngressList is a collection of Ingress.
      */
    @js.native
    object IngressList extends js.Object {
      /**
        * Get the state of an existing `IngressList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.IngressList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.IngressList = js.native
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicy is deprecated by
      * networking/v1/NetworkPolicy. NetworkPolicy describes what network traffic is allowed for a
      * set of Pods
      */
    @js.native
    object NetworkPolicy extends js.Object {
      /**
        * Get the state of an existing `NetworkPolicy` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicy = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicy = js.native
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicyList is deprecated by
      * networking/v1/NetworkPolicyList. Network Policy List is a list of NetworkPolicy objects.
      */
    @js.native
    object NetworkPolicyList extends js.Object {
      /**
        * Get the state of an existing `NetworkPolicyList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicyList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicyList = js.native
    }
    
    /**
      * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
      * will be applied to a pod and container. Deprecated: use PodSecurityPolicy from policy API
      * Group instead.
      */
    @js.native
    object PodSecurityPolicy extends js.Object {
      /**
        * Get the state of an existing `PodSecurityPolicy` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicy = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicy = js.native
    }
    
    /**
      * PodSecurityPolicyList is a list of PodSecurityPolicy objects. Deprecated: use
      * PodSecurityPolicyList from policy API Group instead.
      */
    @js.native
    object PodSecurityPolicyList extends js.Object {
      /**
        * Get the state of an existing `PodSecurityPolicyList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList = js.native
    }
    
    /**
      * DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1beta2/ReplicaSet. See
      * the release notes for more information. ReplicaSet ensures that a specified number of pod
      * replicas are running at any given time.
      */
    @js.native
    object ReplicaSet extends js.Object {
      /**
        * Get the state of an existing `ReplicaSet` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSet = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSet = js.native
    }
    
    /**
      * ReplicaSetList is a collection of ReplicaSets.
      */
    @js.native
    object ReplicaSetList extends js.Object {
      /**
        * Get the state of an existing `ReplicaSetList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSetList = js.native
    }
    
  }
  
}

