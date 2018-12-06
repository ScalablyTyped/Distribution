package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "apps")
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
    
    trait ControllerRevision extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Data is the serialized representation of the state.
                   */
      var data: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.pkgNs.runtimeNs.RawExtension]
          ] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Revision indicates the revision of the state represented by Data.
                   */
      var revision: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
             */
    
    trait ControllerRevisionList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of ControllerRevisions
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ControllerRevision]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * DaemonSet represents the configuration of a daemon set.
             */
    
    trait DaemonSet extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * The desired behavior of this daemon set. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DaemonSetSpec]] = js.undefined
      /**
                   * The current status of this daemon set. This data may be out of date by some window of time.
                   * Populated by the system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DaemonSetStatus]] = js.undefined
    }
    
    /**
             * DaemonSetCondition describes the state of a DaemonSet at a certain point.
             */
    
    trait DaemonSetCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of DaemonSet condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * DaemonSetList is a collection of daemon sets.
             */
    
    trait DaemonSetList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A list of daemon sets.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[DaemonSet]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * DaemonSetSpec is the specification of a daemon set.
             */
    
    trait DaemonSetSpec extends js.Object {
      /**
                   * The minimum number of seconds for which a newly created DaemonSet pod should be ready
                   * without any of its container crashing, for it to be considered available. Defaults to 0
                   * (pod will be considered available as soon as it is ready).
                   */
      var minReadySeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of old history to retain to allow rollback. This is a pointer to distinguish
                   * between explicit zero and not specified. Defaults to 10.
                   */
      var revisionHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * A label query over pods that are managed by the daemon set. Must match in order to be
                   * controlled. It must match the pod template's labels. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var selector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
                   * An object that describes the pod that will be created. The DaemonSet will create exactly
                   * one copy of this pod on every node that matches the template's node selector (or on every
                   * node if no node selector is specified). More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
                   */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
      /**
                   * An update strategy to replace existing DaemonSet pods with new pods.
                   */
      var updateStrategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DaemonSetUpdateStrategy]] = js.undefined
    }
    
    /**
             * DaemonSetStatus represents the current status of a daemon set.
             */
    
    trait DaemonSetStatus extends js.Object {
      /**
                   * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a
                   * collision avoidance mechanism when it needs to create the name for the newest
                   * ControllerRevision.
                   */
      var collisionCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a DaemonSet's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[DaemonSetCondition]]] = js.undefined
      /**
                   * The number of nodes that are running at least 1 daemon pod and are supposed to run the
                   * daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
                   */
      var currentNumberScheduled: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The total number of nodes that should be running the daemon pod (including nodes correctly
                   * running the daemon pod). More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
                   */
      var desiredNumberScheduled: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The number of nodes that should be running the daemon pod and have one or more of the
                   * daemon pod running and available (ready for at least spec.minReadySeconds)
                   */
      var numberAvailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
                   * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
                   */
      var numberMisscheduled: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The number of nodes that should be running the daemon pod and have one or more of the
                   * daemon pod running and ready.
                   */
      var numberReady: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The number of nodes that should be running the daemon pod and have none of the daemon pod
                   * running and available (ready for at least spec.minReadySeconds)
                   */
      var numberUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The most recent generation observed by the daemon set controller.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The total number of nodes that are running updated daemon pod
                   */
      var updatedNumberScheduled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
             */
    
    trait DaemonSetUpdateStrategy extends js.Object {
      /**
                   * Rolling update config params. Present only if type = "RollingUpdate".
                   */
      var rollingUpdate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollingUpdateDaemonSet]] = js.undefined
      /**
                   * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * Deployment enables declarative updates for Pods and ReplicaSets.
             */
    
    trait Deployment extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Specification of the desired behavior of the Deployment.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DeploymentSpec]] = js.undefined
      /**
                   * Most recently observed status of the Deployment.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DeploymentStatus]] = js.undefined
    }
    
    /**
             * DeploymentCondition describes the state of a deployment at a certain point.
             */
    
    trait DeploymentCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The last time this condition was updated.
                   */
      var lastUpdateTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of deployment condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * DeploymentList is a list of Deployments.
             */
    
    trait DeploymentList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of Deployments.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Deployment]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * DeploymentSpec is the specification of the desired behavior of the Deployment.
             */
    
    trait DeploymentSpec extends js.Object {
      /**
                   * Minimum number of seconds for which a newly created pod should be ready without any of its
                   * container crashing, for it to be considered available. Defaults to 0 (pod will be
                   * considered available as soon as it is ready)
                   */
      var minReadySeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Indicates that the deployment is paused.
                   */
      var paused: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * The maximum time in seconds for a deployment to make progress before it is considered to be
                   * failed. The deployment controller will continue to process failed deployments and a
                   * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
                   * Note that progress will not be estimated during the time a deployment is paused. Defaults
                   * to 600s.
                   */
      var progressDeadlineSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Number of desired pods. This is a pointer to distinguish between explicit zero and not
                   * specified. Defaults to 1.
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
                   * between explicit zero and not specified. Defaults to 10.
                   */
      var revisionHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
                   * ones affected by this deployment. It must match the pod template's labels.
                   */
      var selector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
                   * The deployment strategy to use to replace existing pods with new ones.
                   */
      var strategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DeploymentStrategy]] = js.undefined
      /**
                   * Template describes the pods that will be created.
                   */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
    }
    
    /**
             * DeploymentStatus is the most recently observed status of the Deployment.
             */
    
    trait DeploymentStatus extends js.Object {
      /**
                   * Total number of available pods (ready for at least minReadySeconds) targeted by this
                   * deployment.
                   */
      var availableReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
                   * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
                   */
      var collisionCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a deployment's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[DeploymentCondition]]] = js.undefined
      /**
                   * The generation observed by the deployment controller.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of ready pods targeted by this deployment.
                   */
      var readyReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of non-terminated pods targeted by this deployment (their labels match the
                   * selector).
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of unavailable pods targeted by this deployment. This is the total number of
                   * pods that are still required for the deployment to have 100% available capacity. They may
                   * either be pods that are running but not yet available or pods that still have not been
                   * created.
                   */
      var unavailableReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of non-terminated pods targeted by this deployment that have the desired
                   * template spec.
                   */
      var updatedReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * DeploymentStrategy describes how to replace existing pods with new ones.
             */
    
    trait DeploymentStrategy extends js.Object {
      /**
                   * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
                   */
      var rollingUpdate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollingUpdateDeployment]] = js.undefined
      /**
                   * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
             */
    
    trait ReplicaSet extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
                   * that the ReplicaSet manages. Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ReplicaSetSpec]] = js.undefined
      /**
                   * Status is the most recently observed status of the ReplicaSet. This data may be out of date
                   * by some window of time. Populated by the system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ReplicaSetStatus]] = js.undefined
    }
    
    /**
             * ReplicaSetCondition describes the state of a replica set at a certain point.
             */
    
    trait ReplicaSetCondition extends js.Object {
      /**
                   * The last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of replica set condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ReplicaSetList is a collection of ReplicaSets.
             */
    
    trait ReplicaSetList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of ReplicaSets. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ReplicaSet]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ReplicaSetSpec is the specification of a ReplicaSet.
             */
    
    trait ReplicaSetSpec extends js.Object {
      /**
                   * Minimum number of seconds for which a newly created pod should be ready without any of its
                   * container crashing, for it to be considered available. Defaults to 0 (pod will be
                   * considered available as soon as it is ready)
                   */
      var minReadySeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Replicas is the number of desired replicas. This is a pointer to distinguish between
                   * explicit zero and unspecified. Defaults to 1. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Selector is a label query over pods that should match the replica count. Label keys and
                   * values that must match in order to be controlled by this replica set. It must match the pod
                   * template's labels. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var selector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
                   * Template is the object that describes the pod that will be created if insufficient replicas
                   * are detected. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
                   */
      var template: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
          ] = js.undefined
    }
    
    /**
             * ReplicaSetStatus represents the current status of a ReplicaSet.
             */
    
    trait ReplicaSetStatus extends js.Object {
      /**
                   * The number of available replicas (ready for at least minReadySeconds) for this replica set.
                   */
      var availableReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a replica set's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ReplicaSetCondition]]] = js.undefined
      /**
                   * The number of pods that have labels matching the labels of the pod template of the
                   * replicaset.
                   */
      var fullyLabeledReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of ready replicas for this replica set.
                   */
      var readyReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Replicas is the most recently oberved number of replicas. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
                   */
      var replicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * Spec to control the desired behavior of daemon set rolling update.
             */
    
    trait RollingUpdateDaemonSet extends js.Object {
      /**
                   * The maximum number of DaemonSet pods that can be unavailable during the update. Value can
                   * be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the
                   * start of the update (ex: 10%). Absolute number is calculated from percentage by rounding
                   * up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of
                   * the total number of nodes that should be running the daemon pod (i.e.
                   * status.desiredNumberScheduled) can have their pods stopped for an update at any given time.
                   * The update starts by stopping at most 30% of those DaemonSet pods and then brings up new
                   * DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other
                   * DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are
                   * available at all times during the update.
                   */
      var maxUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
    }
    
    /**
             * Spec to control the desired behavior of rolling update.
             */
    
    trait RollingUpdateDeployment extends js.Object {
      /**
                   * The maximum number of pods that can be scheduled above the desired number of pods. Value
                   * can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not
                   * be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up.
                   * Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up
                   * immediately when the rolling update starts, such that the total number of old and new pods
                   * do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be
                   * scaled up further, ensuring that total number of pods running at any time during the update
                   * is at most 130% of desired pods.
                   */
      var maxSurge: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
                   * The maximum number of pods that can be unavailable during the update. Value can be an
                   * absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is
                   * calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults
                   * to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of
                   * desired pods immediately when the rolling update starts. Once new pods are ready, old
                   * ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring
                   * that the total number of pods available at all times during the update is at least 70% of
                   * desired pods.
                   */
      var maxUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
    }
    
    /**
             * RollingUpdateStatefulSetStrategy is used to communicate parameter for
             * RollingUpdateStatefulSetStrategyType.
             */
    
    trait RollingUpdateStatefulSetStrategy extends js.Object {
      /**
                   * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default
                   * value is 0.
                   */
      var partition: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
             *  - Network: A single stable DNS and hostname.
             *  - Storage: As many VolumeClaims as requested.
             * The StatefulSet guarantees that a given network identity will always map to the same storage
             * identity.
             */
    
    trait StatefulSet extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the desired identities of pods in this set.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StatefulSetSpec]] = js.undefined
      /**
                   * Status is the current status of Pods in this StatefulSet. This data may be out of date by
                   * some window of time.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StatefulSetStatus]] = js.undefined
    }
    
    /**
             * StatefulSetCondition describes the state of a statefulset at a certain point.
             */
    
    trait StatefulSetCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of statefulset condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * StatefulSetList is a collection of StatefulSets.
             */
    
    trait StatefulSetList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[StatefulSet]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * A StatefulSetSpec is the specification of a StatefulSet.
             */
    
    trait StatefulSetSpec extends js.Object {
      /**
                   * podManagementPolicy controls how pods are created during initial scale up, when replacing
                   * pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are
                   * created in increasing order (pod-0, then pod-1, etc) and the controller will wait until
                   * each pod is ready before continuing. When scaling down, the pods are removed in the
                   * opposite order. The alternative policy is `Parallel` which will create pods in parallel to
                   * match the desired scale without waiting, and on scale down will delete all pods at once.
                   */
      var podManagementPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * replicas is the desired number of replicas of the given Template. These are replicas in the
                   * sense that they are instantiations of the same Template, but individual replicas also have
                   * a consistent identity. If unspecified, defaults to 1.
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
                   * StatefulSet's revision history. The revision history consists of all revisions not
                   * represented by a currently applied StatefulSetSpec version. The default value is 10.
                   */
      var revisionHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * selector is a label query over pods that should match the replica count. It must match the
                   * pod template's labels. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var selector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
                   * serviceName is the name of the service that governs this StatefulSet. This service must
                   * exist before the StatefulSet, and is responsible for the network identity of the set. Pods
                   * get DNS/hostnames that follow the pattern:
                   * pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is
                   * managed by the StatefulSet controller.
                   */
      var serviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * template is the object that describes the pod that will be created if insufficient replicas
                   * are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have
                   * a unique identity from the rest of the StatefulSet.
                   */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
      /**
                   * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods
                   * in the StatefulSet when a revision is made to Template.
                   */
      var updateStrategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StatefulSetUpdateStrategy]] = js.undefined
      /**
                   * volumeClaimTemplates is a list of claims that pods are allowed to reference. The
                   * StatefulSet controller is responsible for mapping network identities to claims in a way
                   * that maintains the identity of a pod. Every claim in this list must have at least one
                   * matching (by name) volumeMount in one container in the template. A claim in this list takes
                   * precedence over any volumes in the template, with the same name.
                   */
      var volumeClaimTemplates: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim]]
          ] = js.undefined
    }
    
    /**
             * StatefulSetStatus represents the current state of a StatefulSet.
             */
    
    trait StatefulSetStatus extends js.Object {
      /**
                   * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet
                   * controller uses this field as a collision avoidance mechanism when it needs to create the
                   * name for the newest ControllerRevision.
                   */
      var collisionCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a statefulset's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[StatefulSetCondition]]] = js.undefined
      /**
                   * currentReplicas is the number of Pods created by the StatefulSet controller from the
                   * StatefulSet version indicated by currentRevision.
                   */
      var currentReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
                   * Pods in the sequence [0,currentReplicas).
                   */
      var currentRevision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * observedGeneration is the most recent generation observed for this StatefulSet. It
                   * corresponds to the StatefulSet's generation, which is updated on mutation by the API
                   * Server.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
                   * Condition.
                   */
      var readyReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * replicas is the number of Pods created by the StatefulSet controller.
                   */
      var replicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
                   * Pods in the sequence [replicas-updatedReplicas,replicas)
                   */
      var updateRevision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * updatedReplicas is the number of Pods created by the StatefulSet controller from the
                   * StatefulSet version indicated by updateRevision.
                   */
      var updatedReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to
             * perform updates. It includes any additional parameters necessary to perform the update for
             * the indicated strategy.
             */
    
    trait StatefulSetUpdateStrategy extends js.Object {
      /**
                   * RollingUpdate is used to communicate parameters when Type is
                   * RollingUpdateStatefulSetStrategyType.
                   */
      var rollingUpdate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollingUpdateStatefulSetStrategy]] = js.undefined
      /**
                   * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isControllerRevision(o: js.Any): /* is ControllerRevision */scala.Boolean = js.native
    def isControllerRevisionList(o: js.Any): /* is ControllerRevisionList */scala.Boolean = js.native
    def isDaemonSet(o: js.Any): /* is DaemonSet */scala.Boolean = js.native
    def isDaemonSetList(o: js.Any): /* is DaemonSetList */scala.Boolean = js.native
    def isDeployment(o: js.Any): /* is Deployment */scala.Boolean = js.native
    def isDeploymentList(o: js.Any): /* is DeploymentList */scala.Boolean = js.native
    def isReplicaSet(o: js.Any): /* is ReplicaSet */scala.Boolean = js.native
    def isReplicaSetList(o: js.Any): /* is ReplicaSetList */scala.Boolean = js.native
    def isStatefulSet(o: js.Any): /* is StatefulSet */scala.Boolean = js.native
    def isStatefulSetList(o: js.Any): /* is StatefulSetList */scala.Boolean = js.native
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
    
    trait ControllerRevision extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Data is the serialized representation of the state.
                   */
      var data: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.pkgNs.runtimeNs.RawExtension]
          ] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Revision indicates the revision of the state represented by Data.
                   */
      var revision: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
             */
    
    trait ControllerRevisionList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of ControllerRevisions
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ControllerRevision]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * DEPRECATED - This group version of Deployment is deprecated by apps/v1beta2/Deployment. See
             * the release notes for more information. Deployment enables declarative updates for Pods and
             * ReplicaSets.
             */
    
    trait Deployment extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Specification of the desired behavior of the Deployment.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DeploymentSpec]] = js.undefined
      /**
                   * Most recently observed status of the Deployment.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DeploymentStatus]] = js.undefined
    }
    
    /**
             * DeploymentCondition describes the state of a deployment at a certain point.
             */
    
    trait DeploymentCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The last time this condition was updated.
                   */
      var lastUpdateTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of deployment condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * DeploymentList is a list of Deployments.
             */
    
    trait DeploymentList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of Deployments.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Deployment]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
             */
    
    trait DeploymentRollback extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Required: This must match the Name of a deployment.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * The config of this deployment rollback.
                   */
      var rollbackTo: atPulumiPulumiLib.resourceMod.Input[RollbackConfig]
      /**
                   * The annotations to be updated to a deployment
                   */
      var updatedAnnotations: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
    }
    
    /**
             * DeploymentSpec is the specification of the desired behavior of the Deployment.
             */
    
    trait DeploymentSpec extends js.Object {
      /**
                   * Minimum number of seconds for which a newly created pod should be ready without any of its
                   * container crashing, for it to be considered available. Defaults to 0 (pod will be
                   * considered available as soon as it is ready)
                   */
      var minReadySeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Indicates that the deployment is paused.
                   */
      var paused: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * The maximum time in seconds for a deployment to make progress before it is considered to be
                   * failed. The deployment controller will continue to process failed deployments and a
                   * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
                   * Note that progress will not be estimated during the time a deployment is paused. Defaults
                   * to 600s.
                   */
      var progressDeadlineSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Number of desired pods. This is a pointer to distinguish between explicit zero and not
                   * specified. Defaults to 1.
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
                   * between explicit zero and not specified. Defaults to 2.
                   */
      var revisionHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback
                   * is done.
                   */
      var rollbackTo: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollbackConfig]] = js.undefined
      /**
                   * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
                   * ones affected by this deployment.
                   */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
                   * The deployment strategy to use to replace existing pods with new ones.
                   */
      var strategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DeploymentStrategy]] = js.undefined
      /**
                   * Template describes the pods that will be created.
                   */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
    }
    
    /**
             * DeploymentStatus is the most recently observed status of the Deployment.
             */
    
    trait DeploymentStatus extends js.Object {
      /**
                   * Total number of available pods (ready for at least minReadySeconds) targeted by this
                   * deployment.
                   */
      var availableReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
                   * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
                   */
      var collisionCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a deployment's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[DeploymentCondition]]] = js.undefined
      /**
                   * The generation observed by the deployment controller.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of ready pods targeted by this deployment.
                   */
      var readyReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of non-terminated pods targeted by this deployment (their labels match the
                   * selector).
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of unavailable pods targeted by this deployment. This is the total number of
                   * pods that are still required for the deployment to have 100% available capacity. They may
                   * either be pods that are running but not yet available or pods that still have not been
                   * created.
                   */
      var unavailableReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of non-terminated pods targeted by this deployment that have the desired
                   * template spec.
                   */
      var updatedReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * DeploymentStrategy describes how to replace existing pods with new ones.
             */
    
    trait DeploymentStrategy extends js.Object {
      /**
                   * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
                   */
      var rollingUpdate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollingUpdateDeployment]] = js.undefined
      /**
                   * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * DEPRECATED.
             */
    
    trait RollbackConfig extends js.Object {
      /**
                   * The revision to rollback to. If set to 0, rollback to the last revision.
                   */
      var revision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * Spec to control the desired behavior of rolling update.
             */
    
    trait RollingUpdateDeployment extends js.Object {
      /**
                   * The maximum number of pods that can be scheduled above the desired number of pods. Value
                   * can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not
                   * be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up.
                   * Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up
                   * immediately when the rolling update starts, such that the total number of old and new pods
                   * do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be
                   * scaled up further, ensuring that total number of pods running at any time during the update
                   * is atmost 130% of desired pods.
                   */
      var maxSurge: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
                   * The maximum number of pods that can be unavailable during the update. Value can be an
                   * absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is
                   * calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults
                   * to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of
                   * desired pods immediately when the rolling update starts. Once new pods are ready, old
                   * ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring
                   * that the total number of pods available at all times during the update is at least 70% of
                   * desired pods.
                   */
      var maxUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
    }
    
    /**
             * RollingUpdateStatefulSetStrategy is used to communicate parameter for
             * RollingUpdateStatefulSetStrategyType.
             */
    
    trait RollingUpdateStatefulSetStrategy extends js.Object {
      /**
                   * Partition indicates the ordinal at which the StatefulSet should be partitioned.
                   */
      var partition: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * Scale represents a scaling request for a resource.
             */
    
    trait Scale extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata; More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * defines the behavior of the scale. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ScaleSpec]] = js.undefined
      /**
                   * current status of the scale. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
                   * Read-only.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ScaleStatus]] = js.undefined
    }
    
    /**
             * ScaleSpec describes the attributes of a scale subresource
             */
    
    trait ScaleSpec extends js.Object {
      /**
                   * desired number of instances for the scaled object.
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * ScaleStatus represents the current status of a scale subresource.
             */
    
    trait ScaleStatus extends js.Object {
      /**
                   * actual number of observed instances of the scaled object.
                   */
      var replicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * label query over pods that should match the replicas count. More info:
                   * http://kubernetes.io/docs/user-guide/labels#label-selectors
                   */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * label selector for pods that should match the replicas count. This is a serializated
                   * version of both map-based and more expressive set-based selectors. This is done to avoid
                   * introspection in the clients. The string will be in the same format as the query-param
                   * syntax. If the target type only supports map-based selectors, both this field and map-based
                   * selector field are populated. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var targetSelector: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
    
    trait StatefulSet extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the desired identities of pods in this set.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StatefulSetSpec]] = js.undefined
      /**
                   * Status is the current status of Pods in this StatefulSet. This data may be out of date by
                   * some window of time.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StatefulSetStatus]] = js.undefined
    }
    
    /**
             * StatefulSetCondition describes the state of a statefulset at a certain point.
             */
    
    trait StatefulSetCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of statefulset condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * StatefulSetList is a collection of StatefulSets.
             */
    
    trait StatefulSetList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[StatefulSet]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * A StatefulSetSpec is the specification of a StatefulSet.
             */
    
    trait StatefulSetSpec extends js.Object {
      /**
                   * podManagementPolicy controls how pods are created during initial scale up, when replacing
                   * pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are
                   * created in increasing order (pod-0, then pod-1, etc) and the controller will wait until
                   * each pod is ready before continuing. When scaling down, the pods are removed in the
                   * opposite order. The alternative policy is `Parallel` which will create pods in parallel to
                   * match the desired scale without waiting, and on scale down will delete all pods at once.
                   */
      var podManagementPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * replicas is the desired number of replicas of the given Template. These are replicas in the
                   * sense that they are instantiations of the same Template, but individual replicas also have
                   * a consistent identity. If unspecified, defaults to 1.
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
                   * StatefulSet's revision history. The revision history consists of all revisions not
                   * represented by a currently applied StatefulSetSpec version. The default value is 10.
                   */
      var revisionHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * selector is a label query over pods that should match the replica count. If empty,
                   * defaulted to labels on the pod template. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
                   * serviceName is the name of the service that governs this StatefulSet. This service must
                   * exist before the StatefulSet, and is responsible for the network identity of the set. Pods
                   * get DNS/hostnames that follow the pattern:
                   * pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is
                   * managed by the StatefulSet controller.
                   */
      var serviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * template is the object that describes the pod that will be created if insufficient replicas
                   * are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have
                   * a unique identity from the rest of the StatefulSet.
                   */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
      /**
                   * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods
                   * in the StatefulSet when a revision is made to Template.
                   */
      var updateStrategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StatefulSetUpdateStrategy]] = js.undefined
      /**
                   * volumeClaimTemplates is a list of claims that pods are allowed to reference. The
                   * StatefulSet controller is responsible for mapping network identities to claims in a way
                   * that maintains the identity of a pod. Every claim in this list must have at least one
                   * matching (by name) volumeMount in one container in the template. A claim in this list takes
                   * precedence over any volumes in the template, with the same name.
                   */
      var volumeClaimTemplates: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim]]
          ] = js.undefined
    }
    
    /**
             * StatefulSetStatus represents the current state of a StatefulSet.
             */
    
    trait StatefulSetStatus extends js.Object {
      /**
                   * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet
                   * controller uses this field as a collision avoidance mechanism when it needs to create the
                   * name for the newest ControllerRevision.
                   */
      var collisionCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a statefulset's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[StatefulSetCondition]]] = js.undefined
      /**
                   * currentReplicas is the number of Pods created by the StatefulSet controller from the
                   * StatefulSet version indicated by currentRevision.
                   */
      var currentReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
                   * Pods in the sequence [0,currentReplicas).
                   */
      var currentRevision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * observedGeneration is the most recent generation observed for this StatefulSet. It
                   * corresponds to the StatefulSet's generation, which is updated on mutation by the API
                   * Server.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
                   * Condition.
                   */
      var readyReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * replicas is the number of Pods created by the StatefulSet controller.
                   */
      var replicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
                   * Pods in the sequence [replicas-updatedReplicas,replicas)
                   */
      var updateRevision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * updatedReplicas is the number of Pods created by the StatefulSet controller from the
                   * StatefulSet version indicated by updateRevision.
                   */
      var updatedReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to
             * perform updates. It includes any additional parameters necessary to perform the update for
             * the indicated strategy.
             */
    
    trait StatefulSetUpdateStrategy extends js.Object {
      /**
                   * RollingUpdate is used to communicate parameters when Type is
                   * RollingUpdateStatefulSetStrategyType.
                   */
      var rollingUpdate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollingUpdateStatefulSetStrategy]] = js.undefined
      /**
                   * Type indicates the type of the StatefulSetUpdateStrategy.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isControllerRevision(o: js.Any): /* is ControllerRevision */scala.Boolean = js.native
    def isControllerRevisionList(o: js.Any): /* is ControllerRevisionList */scala.Boolean = js.native
    def isDeployment(o: js.Any): /* is Deployment */scala.Boolean = js.native
    def isDeploymentList(o: js.Any): /* is DeploymentList */scala.Boolean = js.native
    def isDeploymentRollback(o: js.Any): /* is DeploymentRollback */scala.Boolean = js.native
    def isScale(o: js.Any): /* is Scale */scala.Boolean = js.native
    def isStatefulSet(o: js.Any): /* is StatefulSet */scala.Boolean = js.native
    def isStatefulSetList(o: js.Any): /* is StatefulSetList */scala.Boolean = js.native
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
    
    trait ControllerRevision extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Data is the serialized representation of the state.
                   */
      var data: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.pkgNs.runtimeNs.RawExtension]
          ] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Revision indicates the revision of the state represented by Data.
                   */
      var revision: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
             */
    
    trait ControllerRevisionList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of ControllerRevisions
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ControllerRevision]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * DEPRECATED - This group version of DaemonSet is deprecated by apps/v1/DaemonSet. See the
             * release notes for more information. DaemonSet represents the configuration of a daemon set.
             */
    
    trait DaemonSet extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * The desired behavior of this daemon set. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DaemonSetSpec]] = js.undefined
      /**
                   * The current status of this daemon set. This data may be out of date by some window of time.
                   * Populated by the system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DaemonSetStatus]] = js.undefined
    }
    
    /**
             * DaemonSetCondition describes the state of a DaemonSet at a certain point.
             */
    
    trait DaemonSetCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of DaemonSet condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * DaemonSetList is a collection of daemon sets.
             */
    
    trait DaemonSetList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A list of daemon sets.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[DaemonSet]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * DaemonSetSpec is the specification of a daemon set.
             */
    
    trait DaemonSetSpec extends js.Object {
      /**
                   * The minimum number of seconds for which a newly created DaemonSet pod should be ready
                   * without any of its container crashing, for it to be considered available. Defaults to 0
                   * (pod will be considered available as soon as it is ready).
                   */
      var minReadySeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of old history to retain to allow rollback. This is a pointer to distinguish
                   * between explicit zero and not specified. Defaults to 10.
                   */
      var revisionHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * A label query over pods that are managed by the daemon set. Must match in order to be
                   * controlled. It must match the pod template's labels. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var selector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
                   * An object that describes the pod that will be created. The DaemonSet will create exactly
                   * one copy of this pod on every node that matches the template's node selector (or on every
                   * node if no node selector is specified). More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
                   */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
      /**
                   * An update strategy to replace existing DaemonSet pods with new pods.
                   */
      var updateStrategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DaemonSetUpdateStrategy]] = js.undefined
    }
    
    /**
             * DaemonSetStatus represents the current status of a daemon set.
             */
    
    trait DaemonSetStatus extends js.Object {
      /**
                   * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a
                   * collision avoidance mechanism when it needs to create the name for the newest
                   * ControllerRevision.
                   */
      var collisionCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a DaemonSet's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[DaemonSetCondition]]] = js.undefined
      /**
                   * The number of nodes that are running at least 1 daemon pod and are supposed to run the
                   * daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
                   */
      var currentNumberScheduled: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The total number of nodes that should be running the daemon pod (including nodes correctly
                   * running the daemon pod). More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
                   */
      var desiredNumberScheduled: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The number of nodes that should be running the daemon pod and have one or more of the
                   * daemon pod running and available (ready for at least spec.minReadySeconds)
                   */
      var numberAvailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
                   * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
                   */
      var numberMisscheduled: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The number of nodes that should be running the daemon pod and have one or more of the
                   * daemon pod running and ready.
                   */
      var numberReady: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * The number of nodes that should be running the daemon pod and have none of the daemon pod
                   * running and available (ready for at least spec.minReadySeconds)
                   */
      var numberUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The most recent generation observed by the daemon set controller.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The total number of nodes that are running updated daemon pod
                   */
      var updatedNumberScheduled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
             */
    
    trait DaemonSetUpdateStrategy extends js.Object {
      /**
                   * Rolling update config params. Present only if type = "RollingUpdate".
                   */
      var rollingUpdate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollingUpdateDaemonSet]] = js.undefined
      /**
                   * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * DEPRECATED - This group version of Deployment is deprecated by apps/v1/Deployment. See the
             * release notes for more information. Deployment enables declarative updates for Pods and
             * ReplicaSets.
             */
    
    trait Deployment extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Specification of the desired behavior of the Deployment.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DeploymentSpec]] = js.undefined
      /**
                   * Most recently observed status of the Deployment.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DeploymentStatus]] = js.undefined
    }
    
    /**
             * DeploymentCondition describes the state of a deployment at a certain point.
             */
    
    trait DeploymentCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The last time this condition was updated.
                   */
      var lastUpdateTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of deployment condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * DeploymentList is a list of Deployments.
             */
    
    trait DeploymentList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is the list of Deployments.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Deployment]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * DeploymentSpec is the specification of the desired behavior of the Deployment.
             */
    
    trait DeploymentSpec extends js.Object {
      /**
                   * Minimum number of seconds for which a newly created pod should be ready without any of its
                   * container crashing, for it to be considered available. Defaults to 0 (pod will be
                   * considered available as soon as it is ready)
                   */
      var minReadySeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Indicates that the deployment is paused.
                   */
      var paused: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * The maximum time in seconds for a deployment to make progress before it is considered to be
                   * failed. The deployment controller will continue to process failed deployments and a
                   * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
                   * Note that progress will not be estimated during the time a deployment is paused. Defaults
                   * to 600s.
                   */
      var progressDeadlineSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Number of desired pods. This is a pointer to distinguish between explicit zero and not
                   * specified. Defaults to 1.
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
                   * between explicit zero and not specified. Defaults to 10.
                   */
      var revisionHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
                   * ones affected by this deployment. It must match the pod template's labels.
                   */
      var selector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
                   * The deployment strategy to use to replace existing pods with new ones.
                   */
      var strategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[DeploymentStrategy]] = js.undefined
      /**
                   * Template describes the pods that will be created.
                   */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
    }
    
    /**
             * DeploymentStatus is the most recently observed status of the Deployment.
             */
    
    trait DeploymentStatus extends js.Object {
      /**
                   * Total number of available pods (ready for at least minReadySeconds) targeted by this
                   * deployment.
                   */
      var availableReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
                   * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
                   */
      var collisionCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a deployment's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[DeploymentCondition]]] = js.undefined
      /**
                   * The generation observed by the deployment controller.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of ready pods targeted by this deployment.
                   */
      var readyReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of non-terminated pods targeted by this deployment (their labels match the
                   * selector).
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of unavailable pods targeted by this deployment. This is the total number of
                   * pods that are still required for the deployment to have 100% available capacity. They may
                   * either be pods that are running but not yet available or pods that still have not been
                   * created.
                   */
      var unavailableReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Total number of non-terminated pods targeted by this deployment that have the desired
                   * template spec.
                   */
      var updatedReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * DeploymentStrategy describes how to replace existing pods with new ones.
             */
    
    trait DeploymentStrategy extends js.Object {
      /**
                   * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
                   */
      var rollingUpdate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollingUpdateDeployment]] = js.undefined
      /**
                   * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1/ReplicaSet. See the
             * release notes for more information. ReplicaSet ensures that a specified number of pod
             * replicas are running at any given time.
             */
    
    trait ReplicaSet extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
                   * that the ReplicaSet manages. Standard object's metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ReplicaSetSpec]] = js.undefined
      /**
                   * Status is the most recently observed status of the ReplicaSet. This data may be out of date
                   * by some window of time. Populated by the system. Read-only. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ReplicaSetStatus]] = js.undefined
    }
    
    /**
             * ReplicaSetCondition describes the state of a replica set at a certain point.
             */
    
    trait ReplicaSetCondition extends js.Object {
      /**
                   * The last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of replica set condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ReplicaSetList is a collection of ReplicaSets.
             */
    
    trait ReplicaSetList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of ReplicaSets. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ReplicaSet]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ReplicaSetSpec is the specification of a ReplicaSet.
             */
    
    trait ReplicaSetSpec extends js.Object {
      /**
                   * Minimum number of seconds for which a newly created pod should be ready without any of its
                   * container crashing, for it to be considered available. Defaults to 0 (pod will be
                   * considered available as soon as it is ready)
                   */
      var minReadySeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Replicas is the number of desired replicas. This is a pointer to distinguish between
                   * explicit zero and unspecified. Defaults to 1. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Selector is a label query over pods that should match the replica count. Label keys and
                   * values that must match in order to be controlled by this replica set. It must match the pod
                   * template's labels. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var selector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
                   * Template is the object that describes the pod that will be created if insufficient replicas
                   * are detected. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
                   */
      var template: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
          ] = js.undefined
    }
    
    /**
             * ReplicaSetStatus represents the current status of a ReplicaSet.
             */
    
    trait ReplicaSetStatus extends js.Object {
      /**
                   * The number of available replicas (ready for at least minReadySeconds) for this replica set.
                   */
      var availableReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a replica set's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[ReplicaSetCondition]]] = js.undefined
      /**
                   * The number of pods that have labels matching the labels of the pod template of the
                   * replicaset.
                   */
      var fullyLabeledReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * The number of ready replicas for this replica set.
                   */
      var readyReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Replicas is the most recently oberved number of replicas. More info:
                   * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
                   */
      var replicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * Spec to control the desired behavior of daemon set rolling update.
             */
    
    trait RollingUpdateDaemonSet extends js.Object {
      /**
                   * The maximum number of DaemonSet pods that can be unavailable during the update. Value can
                   * be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the
                   * start of the update (ex: 10%). Absolute number is calculated from percentage by rounding
                   * up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of
                   * the total number of nodes that should be running the daemon pod (i.e.
                   * status.desiredNumberScheduled) can have their pods stopped for an update at any given time.
                   * The update starts by stopping at most 30% of those DaemonSet pods and then brings up new
                   * DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other
                   * DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are
                   * available at all times during the update.
                   */
      var maxUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
    }
    
    /**
             * Spec to control the desired behavior of rolling update.
             */
    
    trait RollingUpdateDeployment extends js.Object {
      /**
                   * The maximum number of pods that can be scheduled above the desired number of pods. Value
                   * can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not
                   * be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up.
                   * Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up
                   * immediately when the rolling update starts, such that the total number of old and new pods
                   * do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be
                   * scaled up further, ensuring that total number of pods running at any time during the update
                   * is atmost 130% of desired pods.
                   */
      var maxSurge: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
                   * The maximum number of pods that can be unavailable during the update. Value can be an
                   * absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is
                   * calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults
                   * to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of
                   * desired pods immediately when the rolling update starts. Once new pods are ready, old
                   * ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring
                   * that the total number of pods available at all times during the update is at least 70% of
                   * desired pods.
                   */
      var maxUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
    }
    
    /**
             * RollingUpdateStatefulSetStrategy is used to communicate parameter for
             * RollingUpdateStatefulSetStrategyType.
             */
    
    trait RollingUpdateStatefulSetStrategy extends js.Object {
      /**
                   * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default
                   * value is 0.
                   */
      var partition: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * Scale represents a scaling request for a resource.
             */
    
    trait Scale extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata; More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * defines the behavior of the scale. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ScaleSpec]] = js.undefined
      /**
                   * current status of the scale. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
                   * Read-only.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ScaleStatus]] = js.undefined
    }
    
    /**
             * ScaleSpec describes the attributes of a scale subresource
             */
    
    trait ScaleSpec extends js.Object {
      /**
                   * desired number of instances for the scaled object.
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * ScaleStatus represents the current status of a scale subresource.
             */
    
    trait ScaleStatus extends js.Object {
      /**
                   * actual number of observed instances of the scaled object.
                   */
      var replicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * label query over pods that should match the replicas count. More info:
                   * http://kubernetes.io/docs/user-guide/labels#label-selectors
                   */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              ScalablyTyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
            ]
          ] = js.undefined
      /**
                   * label selector for pods that should match the replicas count. This is a serializated
                   * version of both map-based and more expressive set-based selectors. This is done to avoid
                   * introspection in the clients. The string will be in the same format as the query-param
                   * syntax. If the target type only supports map-based selectors, both this field and map-based
                   * selector field are populated. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var targetSelector: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
    
    trait StatefulSet extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the desired identities of pods in this set.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StatefulSetSpec]] = js.undefined
      /**
                   * Status is the current status of Pods in this StatefulSet. This data may be out of date by
                   * some window of time.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StatefulSetStatus]] = js.undefined
    }
    
    /**
             * StatefulSetCondition describes the state of a statefulset at a certain point.
             */
    
    trait StatefulSetCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * A human readable message indicating details about the transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status of the condition, one of True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type of statefulset condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * StatefulSetList is a collection of StatefulSets.
             */
    
    trait StatefulSetList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[StatefulSet]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * A StatefulSetSpec is the specification of a StatefulSet.
             */
    
    trait StatefulSetSpec extends js.Object {
      /**
                   * podManagementPolicy controls how pods are created during initial scale up, when replacing
                   * pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are
                   * created in increasing order (pod-0, then pod-1, etc) and the controller will wait until
                   * each pod is ready before continuing. When scaling down, the pods are removed in the
                   * opposite order. The alternative policy is `Parallel` which will create pods in parallel to
                   * match the desired scale without waiting, and on scale down will delete all pods at once.
                   */
      var podManagementPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * replicas is the desired number of replicas of the given Template. These are replicas in the
                   * sense that they are instantiations of the same Template, but individual replicas also have
                   * a consistent identity. If unspecified, defaults to 1.
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
                   * StatefulSet's revision history. The revision history consists of all revisions not
                   * represented by a currently applied StatefulSetSpec version. The default value is 10.
                   */
      var revisionHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * selector is a label query over pods that should match the replica count. It must match the
                   * pod template's labels. More info:
                   * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
                   */
      var selector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
                   * serviceName is the name of the service that governs this StatefulSet. This service must
                   * exist before the StatefulSet, and is responsible for the network identity of the set. Pods
                   * get DNS/hostnames that follow the pattern:
                   * pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is
                   * managed by the StatefulSet controller.
                   */
      var serviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * template is the object that describes the pod that will be created if insufficient replicas
                   * are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have
                   * a unique identity from the rest of the StatefulSet.
                   */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
      /**
                   * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods
                   * in the StatefulSet when a revision is made to Template.
                   */
      var updateStrategy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[StatefulSetUpdateStrategy]] = js.undefined
      /**
                   * volumeClaimTemplates is a list of claims that pods are allowed to reference. The
                   * StatefulSet controller is responsible for mapping network identities to claims in a way
                   * that maintains the identity of a pod. Every claim in this list must have at least one
                   * matching (by name) volumeMount in one container in the template. A claim in this list takes
                   * precedence over any volumes in the template, with the same name.
                   */
      var volumeClaimTemplates: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim]]
          ] = js.undefined
    }
    
    /**
             * StatefulSetStatus represents the current state of a StatefulSet.
             */
    
    trait StatefulSetStatus extends js.Object {
      /**
                   * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet
                   * controller uses this field as a collision avoidance mechanism when it needs to create the
                   * name for the newest ControllerRevision.
                   */
      var collisionCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * Represents the latest available observations of a statefulset's current state.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[StatefulSetCondition]]] = js.undefined
      /**
                   * currentReplicas is the number of Pods created by the StatefulSet controller from the
                   * StatefulSet version indicated by currentRevision.
                   */
      var currentReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
                   * Pods in the sequence [0,currentReplicas).
                   */
      var currentRevision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * observedGeneration is the most recent generation observed for this StatefulSet. It
                   * corresponds to the StatefulSet's generation, which is updated on mutation by the API
                   * Server.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
                   * Condition.
                   */
      var readyReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * replicas is the number of Pods created by the StatefulSet controller.
                   */
      var replicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
                   * Pods in the sequence [replicas-updatedReplicas,replicas)
                   */
      var updateRevision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * updatedReplicas is the number of Pods created by the StatefulSet controller from the
                   * StatefulSet version indicated by updateRevision.
                   */
      var updatedReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to
             * perform updates. It includes any additional parameters necessary to perform the update for
             * the indicated strategy.
             */
    
    trait StatefulSetUpdateStrategy extends js.Object {
      /**
                   * RollingUpdate is used to communicate parameters when Type is
                   * RollingUpdateStatefulSetStrategyType.
                   */
      var rollingUpdate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollingUpdateStatefulSetStrategy]] = js.undefined
      /**
                   * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
                   */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isControllerRevision(o: js.Any): /* is ControllerRevision */scala.Boolean = js.native
    def isControllerRevisionList(o: js.Any): /* is ControllerRevisionList */scala.Boolean = js.native
    def isDaemonSet(o: js.Any): /* is DaemonSet */scala.Boolean = js.native
    def isDaemonSetList(o: js.Any): /* is DaemonSetList */scala.Boolean = js.native
    def isDeployment(o: js.Any): /* is Deployment */scala.Boolean = js.native
    def isDeploymentList(o: js.Any): /* is DeploymentList */scala.Boolean = js.native
    def isReplicaSet(o: js.Any): /* is ReplicaSet */scala.Boolean = js.native
    def isReplicaSetList(o: js.Any): /* is ReplicaSetList */scala.Boolean = js.native
    def isScale(o: js.Any): /* is Scale */scala.Boolean = js.native
    def isStatefulSet(o: js.Any): /* is StatefulSet */scala.Boolean = js.native
    def isStatefulSetList(o: js.Any): /* is StatefulSetList */scala.Boolean = js.native
  }
  
}

