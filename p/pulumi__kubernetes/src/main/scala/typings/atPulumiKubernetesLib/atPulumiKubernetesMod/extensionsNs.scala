package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "extensions")
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
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSet {
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
    }
    
    /**
      * DaemonSetList is a collection of daemon sets.
      */
    @js.native
    class DaemonSetList protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DaemonSetList {
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
    }
    
    /**
      * DEPRECATED - This group version of Deployment is deprecated by apps/v1beta2/Deployment. See
      * the release notes for more information. Deployment enables declarative updates for Pods and
      * ReplicaSets.
      */
    @js.native
    class Deployment protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Deployment {
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
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    @js.native
    class DeploymentList protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.DeploymentList {
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
    }
    
    /**
      * Ingress is a collection of rules that allow inbound connections to reach the endpoints
      * defined by a backend. An Ingress can be configured to give services externally-reachable
      * urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
      */
    @js.native
    class Ingress protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.Ingress {
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
    }
    
    /**
      * IngressList is a collection of Ingress.
      */
    @js.native
    class IngressList protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.IngressList {
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
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicy is deprecated by
      * networking/v1/NetworkPolicy. NetworkPolicy describes what network traffic is allowed for a
      * set of Pods
      */
    @js.native
    class NetworkPolicy protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicy {
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
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicyList is deprecated by
      * networking/v1/NetworkPolicyList. Network Policy List is a list of NetworkPolicy objects.
      */
    @js.native
    class NetworkPolicyList protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.NetworkPolicyList {
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
    }
    
    /**
      * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
      * will be applied to a pod and container. Deprecated: use PodSecurityPolicy from policy API
      * Group instead.
      */
    @js.native
    class PodSecurityPolicy protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicy {
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
    }
    
    /**
      * PodSecurityPolicyList is a list of PodSecurityPolicy objects. Deprecated: use
      * PodSecurityPolicyList from policy API Group instead.
      */
    @js.native
    class PodSecurityPolicyList protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.PodSecurityPolicyList {
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
    }
    
    /**
      * DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1beta2/ReplicaSet. See
      * the release notes for more information. ReplicaSet ensures that a specified number of pod
      * replicas are running at any given time.
      */
    @js.native
    class ReplicaSet protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSet {
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
    }
    
    /**
      * ReplicaSetList is a collection of ReplicaSets.
      */
    @js.native
    class ReplicaSetList protected ()
      extends atPulumiKubernetesLib.providerMod.extensionsNs.v1beta1Ns.ReplicaSetList {
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

