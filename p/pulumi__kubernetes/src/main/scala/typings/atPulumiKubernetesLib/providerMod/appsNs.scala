package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "apps")
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Data is the serialized representation of the state.
        */
      val data: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Revision indicates the revision of the state represented by Data.
        */
      val revision: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ControllerRevision = js.native
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
    @js.native
    class ControllerRevisionList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of ControllerRevisions
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ControllerRevision]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ControllerRevisionList = js.native
    }
    
    /**
      * DaemonSet represents the configuration of a daemon set.
      */
    @js.native
    class DaemonSet protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * The desired behavior of this daemon set. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetSpec] = js.native
      /**
        * The current status of this daemon set. This data may be out of date by some window of time.
        * Populated by the system. Read-only. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSetStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DaemonSet = js.native
    }
    
    /**
      * DaemonSetList is a collection of daemon sets.
      */
    @js.native
    class DaemonSetList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * A list of daemon sets.
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSet]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DaemonSetList = js.native
    }
    
    /**
      * Deployment enables declarative updates for Pods and ReplicaSets.
      */
    @js.native
    class Deployment protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the desired behavior of the Deployment.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentSpec] = js.native
      /**
        * Most recently observed status of the Deployment.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DeploymentStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.Deployment = js.native
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    @js.native
    class DeploymentList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of Deployments.
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.Deployment]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DeploymentList = js.native
    }
    
    /**
      * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
      */
    @js.native
    class ReplicaSet protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
        * that the ReplicaSet manages. Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetSpec] = js.native
      /**
        * Status is the most recently observed status of the ReplicaSet. This data may be out of date
        * by some window of time. Populated by the system. Read-only. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSetStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ReplicaSet = js.native
    }
    
    /**
      * ReplicaSetList is a collection of ReplicaSets.
      */
    @js.native
    class ReplicaSetList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * List of ReplicaSets. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.ReplicaSet]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.ReplicaSetList = js.native
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec defines the desired identities of pods in this set.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetSpec] = js.native
      /**
        * Status is the current status of Pods in this StatefulSet. This data may be out of date by
        * some window of time.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSetStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.StatefulSet = js.native
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
    @js.native
    class StatefulSetList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.StatefulSet]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.StatefulSetList = js.native
    }
    
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevision = js.native
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ControllerRevisionList = js.native
    }
    
    /**
      * DaemonSet represents the configuration of a daemon set.
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSet = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DaemonSetList = js.native
    }
    
    /**
      * Deployment enables declarative updates for Pods and ReplicaSets.
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.Deployment = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.DeploymentList = js.native
    }
    
    /**
      * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSet = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.ReplicaSetList = js.native
    }
    
    /**
      * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
      *  - Network: A single stable DNS and hostname.
      *  - Storage: As many VolumeClaims as requested.
      * The StatefulSet guarantees that a given network identity will always map to the same storage
      * identity.
      */
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSet = js.native
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1Ns.StatefulSetList = js.native
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Data is the serialized representation of the state.
        */
      val data: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Revision indicates the revision of the state represented by Data.
        */
      val revision: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevision = js.native
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
    @js.native
    class ControllerRevisionList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of ControllerRevisions
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ControllerRevision]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevisionList = js.native
    }
    
    /**
      * DEPRECATED - This group version of Deployment is deprecated by apps/v1beta2/Deployment. See
      * the release notes for more information. Deployment enables declarative updates for Pods and
      * ReplicaSets.
      */
    @js.native
    class Deployment protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the desired behavior of the Deployment.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentSpec] = js.native
      /**
        * Most recently observed status of the Deployment.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.DeploymentStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.Deployment = js.native
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    @js.native
    class DeploymentList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of Deployments.
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.Deployment]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.DeploymentList = js.native
    }
    
    /**
      * DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
      */
    @js.native
    class DeploymentRollback protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a apps.v1beta1.DeploymentRollback resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.DeploymentRollback) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.DeploymentRollback, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Required: This must match the Name of a deployment.
        */
      val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * The config of this deployment rollback.
        */
      val rollbackTo: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.RollbackConfig] = js.native
      /**
        * The annotations to be updated to a deployment
        */
      val updatedAnnotations: atPulumiPulumiLib.pulumiMod.Output[
            org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.DeploymentRollback = js.native
    }
    
    /**
      * Scale represents a scaling request for a resource.
      */
    @js.native
    class Scale protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a apps.v1beta1.Scale resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.Scale) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.Scale, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * defines the behavior of the scale. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ScaleSpec] = js.native
      /**
        * current status of the scale. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        * Read-only.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.ScaleStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.Scale = js.native
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec defines the desired identities of pods in this set.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetSpec] = js.native
      /**
        * Status is the current status of Pods in this StatefulSet. This data may be out of date by
        * some window of time.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSetStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSet = js.native
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
    @js.native
    class StatefulSetList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta1Ns.StatefulSet]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSetList = js.native
    }
    
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevision = js.native
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.ControllerRevisionList = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.Deployment = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.DeploymentList = js.native
    }
    
    /**
      * DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
      */
    @js.native
    object DeploymentRollback extends js.Object {
      /**
        * Get the state of an existing `DeploymentRollback` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.DeploymentRollback = js.native
    }
    
    /**
      * Scale represents a scaling request for a resource.
      */
    @js.native
    object Scale extends js.Object {
      /**
        * Get the state of an existing `Scale` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.Scale = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSet = js.native
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta1Ns.StatefulSetList = js.native
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Data is the serialized representation of the state.
        */
      val data: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Revision indicates the revision of the state represented by Data.
        */
      val revision: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ControllerRevision = js.native
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
    @js.native
    class ControllerRevisionList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of ControllerRevisions
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ControllerRevision]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ControllerRevisionList = js.native
    }
    
    /**
      * DEPRECATED - This group version of DaemonSet is deprecated by apps/v1/DaemonSet. See the
      * release notes for more information. DaemonSet represents the configuration of a daemon set.
      */
    @js.native
    class DaemonSet protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * The desired behavior of this daemon set. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetSpec] = js.native
      /**
        * The current status of this daemon set. This data may be out of date by some window of time.
        * Populated by the system. Read-only. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSetStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.DaemonSet = js.native
    }
    
    /**
      * DaemonSetList is a collection of daemon sets.
      */
    @js.native
    class DaemonSetList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * A list of daemon sets.
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DaemonSet]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.DaemonSetList = js.native
    }
    
    /**
      * DEPRECATED - This group version of Deployment is deprecated by apps/v1/Deployment. See the
      * release notes for more information. Deployment enables declarative updates for Pods and
      * ReplicaSets.
      */
    @js.native
    class Deployment protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the desired behavior of the Deployment.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentSpec] = js.native
      /**
        * Most recently observed status of the Deployment.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.DeploymentStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.Deployment = js.native
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    @js.native
    class DeploymentList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is the list of Deployments.
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.Deployment]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.DeploymentList = js.native
    }
    
    /**
      * DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1/ReplicaSet. See the
      * release notes for more information. ReplicaSet ensures that a specified number of pod
      * replicas are running at any given time.
      */
    @js.native
    class ReplicaSet protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
        * that the ReplicaSet manages. Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetSpec] = js.native
      /**
        * Status is the most recently observed status of the ReplicaSet. This data may be out of date
        * by some window of time. Populated by the system. Read-only. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSetStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ReplicaSet = js.native
    }
    
    /**
      * ReplicaSetList is a collection of ReplicaSets.
      */
    @js.native
    class ReplicaSetList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * List of ReplicaSets. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ReplicaSet]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ReplicaSetList = js.native
    }
    
    /**
      * Scale represents a scaling request for a resource.
      */
    @js.native
    class Scale protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a apps.v1beta2.Scale resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.Scale) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.Scale, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * defines the behavior of the scale. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ScaleSpec] = js.native
      /**
        * current status of the scale. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        * Read-only.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.ScaleStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.Scale = js.native
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec defines the desired identities of pods in this set.
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetSpec] = js.native
      /**
        * Status is the current status of Pods in this StatefulSet. This data may be out of date by
        * some window of time.
        */
      val status: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSetStatus] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.StatefulSet = js.native
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
    @js.native
    class StatefulSetList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns.StatefulSet]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.StatefulSetList = js.native
    }
    
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevision = js.native
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ControllerRevisionList = js.native
    }
    
    /**
      * DEPRECATED - This group version of DaemonSet is deprecated by apps/v1/DaemonSet. See the
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSet = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DaemonSetList = js.native
    }
    
    /**
      * DEPRECATED - This group version of Deployment is deprecated by apps/v1/Deployment. See the
      * release notes for more information. Deployment enables declarative updates for Pods and
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.Deployment = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.DeploymentList = js.native
    }
    
    /**
      * DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1/ReplicaSet. See the
      * release notes for more information. ReplicaSet ensures that a specified number of pod
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSet = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.ReplicaSetList = js.native
    }
    
    /**
      * Scale represents a scaling request for a resource.
      */
    @js.native
    object Scale extends js.Object {
      /**
        * Get the state of an existing `Scale` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.Scale = js.native
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSet = js.native
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
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
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.appsNs.v1beta2Ns.StatefulSetList = js.native
    }
    
  }
  
}

