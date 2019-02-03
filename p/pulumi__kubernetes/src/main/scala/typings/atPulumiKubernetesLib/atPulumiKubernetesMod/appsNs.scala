package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "apps")
@js.native
object appsNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * ControllerRevision implements an immutable snapshot of state data. Clients are responsible
      * for serializing and deserializing the objects that contain their internal state. Once a
      * ControllerRevision has been successfully created, it can not be updated. The API Server will
      * fail validation of all requests that attempt to mutate the Data field. ControllerRevisions
      * may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet
      * controllers for update and rollback, this object is beta. However, it may be subject to name
      * and representation changes in future releases, and clients should not depend on its
      * stability. It is primarily for internal use by controllers.
      */
    @js.native
    class ControllerRevision protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevision {
      /**
        * Create a apps.v1.ControllerRevision resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ControllerRevision) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ControllerRevision, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
    @js.native
    class ControllerRevisionList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevisionList {
      /**
        * Create a apps.v1.ControllerRevisionList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ControllerRevisionList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ControllerRevisionList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DaemonSet represents the configuration of a daemon set.
      */
    @js.native
    class DaemonSet protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSet {
      /**
        * Create a apps.v1.DaemonSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DaemonSet) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DaemonSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DaemonSetList is a collection of daemon sets.
      */
    @js.native
    class DaemonSetList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSetList {
      /**
        * Create a apps.v1.DaemonSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DaemonSetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DaemonSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Deployment enables declarative updates for Pods and ReplicaSets.
      */
    @js.native
    class Deployment protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.Deployment {
      /**
        * Create a apps.v1.Deployment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.Deployment) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.Deployment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    @js.native
    class DeploymentList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DeploymentList {
      /**
        * Create a apps.v1.DeploymentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DeploymentList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DeploymentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
      */
    @js.native
    class ReplicaSet protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSet {
      /**
        * Create a apps.v1.ReplicaSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ReplicaSet) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ReplicaSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ReplicaSetList is a collection of ReplicaSets.
      */
    @js.native
    class ReplicaSetList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSetList {
      /**
        * Create a apps.v1.ReplicaSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ReplicaSetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ReplicaSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
      *  - Network: A single stable DNS and hostname.
      *  - Storage: As many VolumeClaims as requested.
      * The StatefulSet guarantees that a given network identity will always map to the same storage
      * identity.
      */
    @js.native
    class StatefulSet protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSet {
      /**
        * Create a apps.v1.StatefulSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.StatefulSet) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.StatefulSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
    @js.native
    class StatefulSetList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSetList {
      /**
        * Create a apps.v1.StatefulSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.StatefulSetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.StatefulSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object ControllerRevision extends js.Object {
      /**
        * Get the state of an existing `ControllerRevision` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevision = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevision = js.native
    }
    
    /* static members */
    @js.native
    object ControllerRevisionList extends js.Object {
      /**
        * Get the state of an existing `ControllerRevisionList` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevisionList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevisionList = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSet = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSet = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSetList = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.Deployment = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.Deployment = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DeploymentList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DeploymentList = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSet = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSet = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSetList = js.native
    }
    
    /* static members */
    @js.native
    object StatefulSet extends js.Object {
      /**
        * Get the state of an existing `StatefulSet` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSet = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSet = js.native
    }
    
    /* static members */
    @js.native
    object StatefulSetList extends js.Object {
      /**
        * Get the state of an existing `StatefulSetList` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSetList = js.native
    }
    
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * DEPRECATED - This group version of ControllerRevision is deprecated by
      * apps/v1beta2/ControllerRevision. See the release notes for more information.
      * ControllerRevision implements an immutable snapshot of state data. Clients are responsible
      * for serializing and deserializing the objects that contain their internal state. Once a
      * ControllerRevision has been successfully created, it can not be updated. The API Server will
      * fail validation of all requests that attempt to mutate the Data field. ControllerRevisions
      * may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet
      * controllers for update and rollback, this object is beta. However, it may be subject to name
      * and representation changes in future releases, and clients should not depend on its
      * stability. It is primarily for internal use by controllers.
      */
    @js.native
    class ControllerRevision protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevision {
      /**
        * Create a apps.v1beta1.ControllerRevision resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevision) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevision, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
    @js.native
    class ControllerRevisionList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevisionList {
      /**
        * Create a apps.v1beta1.ControllerRevisionList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevisionList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevisionList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DEPRECATED - This group version of Deployment is deprecated by apps/v1beta2/Deployment. See
      * the release notes for more information. Deployment enables declarative updates for Pods and
      * ReplicaSets.
      */
    @js.native
    class Deployment protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.Deployment {
      /**
        * Create a apps.v1beta1.Deployment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.Deployment) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.Deployment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    @js.native
    class DeploymentList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.DeploymentList {
      /**
        * Create a apps.v1beta1.DeploymentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.DeploymentList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.DeploymentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DEPRECATED - This group version of StatefulSet is deprecated by apps/v1beta2/StatefulSet. See
      * the release notes for more information. StatefulSet represents a set of pods with consistent
      * identities. Identities are defined as:
      *  - Network: A single stable DNS and hostname.
      *  - Storage: As many VolumeClaims as requested.
      * The StatefulSet guarantees that a given network identity will always map to the same storage
      * identity.
      */
    @js.native
    class StatefulSet protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSet {
      /**
        * Create a apps.v1beta1.StatefulSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSet) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
    @js.native
    class StatefulSetList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSetList {
      /**
        * Create a apps.v1beta1.StatefulSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object ControllerRevision extends js.Object {
      /**
        * Get the state of an existing `ControllerRevision` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevision = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevision = js.native
    }
    
    /* static members */
    @js.native
    object ControllerRevisionList extends js.Object {
      /**
        * Get the state of an existing `ControllerRevisionList` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevisionList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevisionList = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.Deployment = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.Deployment = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.DeploymentList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.DeploymentList = js.native
    }
    
    /* static members */
    @js.native
    object StatefulSet extends js.Object {
      /**
        * Get the state of an existing `StatefulSet` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSet = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSet = js.native
    }
    
    /* static members */
    @js.native
    object StatefulSetList extends js.Object {
      /**
        * Get the state of an existing `StatefulSetList` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSetList = js.native
    }
    
  }
  
  @JSName("v1beta2")
  @js.native
  object v1beta2Ns extends js.Object {
    /**
      * DEPRECATED - This group version of ControllerRevision is deprecated by
      * apps/v1/ControllerRevision. See the release notes for more information. ControllerRevision
      * implements an immutable snapshot of state data. Clients are responsible for serializing and
      * deserializing the objects that contain their internal state. Once a ControllerRevision has
      * been successfully created, it can not be updated. The API Server will fail validation of all
      * requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted.
      * Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and
      * rollback, this object is beta. However, it may be subject to name and representation changes
      * in future releases, and clients should not depend on its stability. It is primarily for
      * internal use by controllers.
      */
    @js.native
    class ControllerRevision protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevision {
      /**
        * Create a apps.v1beta2.ControllerRevision resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ControllerRevision) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ControllerRevision, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
    @js.native
    class ControllerRevisionList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevisionList {
      /**
        * Create a apps.v1beta2.ControllerRevisionList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ControllerRevisionList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ControllerRevisionList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DEPRECATED - This group version of DaemonSet is deprecated by apps/v1/DaemonSet. See the
      * release notes for more information. DaemonSet represents the configuration of a daemon set.
      */
    @js.native
    class DaemonSet protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSet {
      /**
        * Create a apps.v1beta2.DaemonSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.DaemonSet) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.DaemonSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DaemonSetList is a collection of daemon sets.
      */
    @js.native
    class DaemonSetList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSetList {
      /**
        * Create a apps.v1beta2.DaemonSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.DaemonSetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.DaemonSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DEPRECATED - This group version of Deployment is deprecated by apps/v1/Deployment. See the
      * release notes for more information. Deployment enables declarative updates for Pods and
      * ReplicaSets.
      */
    @js.native
    class Deployment protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.Deployment {
      /**
        * Create a apps.v1beta2.Deployment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.Deployment) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.Deployment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    @js.native
    class DeploymentList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DeploymentList {
      /**
        * Create a apps.v1beta2.DeploymentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.DeploymentList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.DeploymentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1/ReplicaSet. See the
      * release notes for more information. ReplicaSet ensures that a specified number of pod
      * replicas are running at any given time.
      */
    @js.native
    class ReplicaSet protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSet {
      /**
        * Create a apps.v1beta2.ReplicaSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ReplicaSet) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ReplicaSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ReplicaSetList is a collection of ReplicaSets.
      */
    @js.native
    class ReplicaSetList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSetList {
      /**
        * Create a apps.v1beta2.ReplicaSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ReplicaSetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ReplicaSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DEPRECATED - This group version of StatefulSet is deprecated by apps/v1/StatefulSet. See the
      * release notes for more information. StatefulSet represents a set of pods with consistent
      * identities. Identities are defined as:
      *  - Network: A single stable DNS and hostname.
      *  - Storage: As many VolumeClaims as requested.
      * The StatefulSet guarantees that a given network identity will always map to the same storage
      * identity.
      */
    @js.native
    class StatefulSet protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSet {
      /**
        * Create a apps.v1beta2.StatefulSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.StatefulSet) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.StatefulSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
    @js.native
    class StatefulSetList protected ()
      extends atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSetList {
      /**
        * Create a apps.v1beta2.StatefulSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.StatefulSetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.StatefulSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object ControllerRevision extends js.Object {
      /**
        * Get the state of an existing `ControllerRevision` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevision = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevision = js.native
    }
    
    /* static members */
    @js.native
    object ControllerRevisionList extends js.Object {
      /**
        * Get the state of an existing `ControllerRevisionList` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevisionList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevisionList = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSet = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSet = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSetList = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.Deployment = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.Deployment = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DeploymentList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DeploymentList = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSet = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSet = js.native
    }
    
    /* static members */
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSetList = js.native
    }
    
    /* static members */
    @js.native
    object StatefulSet extends js.Object {
      /**
        * Get the state of an existing `StatefulSet` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSet = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSet = js.native
    }
    
    /* static members */
    @js.native
    object StatefulSetList extends js.Object {
      /**
        * Get the state of an existing `StatefulSetList` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSetList = js.native
    }
    
  }
  
}

