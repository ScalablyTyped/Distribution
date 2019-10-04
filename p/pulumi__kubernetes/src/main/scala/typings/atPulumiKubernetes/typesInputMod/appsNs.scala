package typings.atPulumiKubernetes.typesInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1beta1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1beta2`
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.ControllerRevision
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.DaemonSet
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.DaemonSetCondition
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.DaemonSetSpec
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.DaemonSetUpdateStrategy
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.Deployment
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.DeploymentCondition
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.DeploymentSpec
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.DeploymentStrategy
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.ReplicaSet
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.ReplicaSetCondition
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.ReplicaSetSpec
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.RollingUpdateDaemonSet
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.RollingUpdateDeployment
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.RollingUpdateStatefulSetStrategy
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.StatefulSet
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.StatefulSetCondition
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.StatefulSetSpec
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1Ns.StatefulSetUpdateStrategy
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.RollbackConfig
import typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.ScaleSpec
import typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim
import typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.PodTemplateSpec
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.LabelSelector
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      /**
        * Data is the serialized representation of the state.
        */
      var data: js.UndefOr[Input[js.Object]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevision]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Revision indicates the revision of the state represented by Data.
        */
      var revision: Input[Double]
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
    trait ControllerRevisionList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      /**
        * Items is the list of ControllerRevisions
        */
      var items: Input[js.Array[Input[ControllerRevision]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevisionList]
          ] = js.undefined
      /**
        * More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * DaemonSet represents the configuration of a daemon set.
      */
    trait DaemonSet extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.DaemonSet]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * The desired behavior of this daemon set. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[DaemonSetSpec]] = js.undefined
    }
    
    /**
      * DaemonSetCondition describes the state of a DaemonSet at a certain point.
      */
    trait DaemonSetCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of DaemonSet condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * DaemonSetList is a collection of daemon sets.
      */
    trait DaemonSetList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      /**
        * A list of daemon sets.
        */
      var items: Input[js.Array[Input[DaemonSet]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.DaemonSetList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The number of old history to retain to allow rollback. This is a pointer to distinguish
        * between explicit zero and not specified. Defaults to 10.
        */
      var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      /**
        * A label query over pods that are managed by the daemon set. Must match in order to be
        * controlled. It must match the pod template's labels. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: Input[LabelSelector]
      /**
        * An object that describes the pod that will be created. The DaemonSet will create exactly
        * one copy of this pod on every node that matches the template's node selector (or on every
        * node if no node selector is specified). More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
        */
      var template: Input[PodTemplateSpec]
      /**
        * An update strategy to replace existing DaemonSet pods with new pods.
        */
      var updateStrategy: js.UndefOr[Input[DaemonSetUpdateStrategy]] = js.undefined
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
      var collisionCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a DaemonSet's current state.
        */
      var conditions: js.UndefOr[Input[js.Array[Input[DaemonSetCondition]]]] = js.undefined
      /**
        * The number of nodes that are running at least 1 daemon pod and are supposed to run the
        * daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
        */
      var currentNumberScheduled: Input[Double]
      /**
        * The total number of nodes that should be running the daemon pod (including nodes correctly
        * running the daemon pod). More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
        */
      var desiredNumberScheduled: Input[Double]
      /**
        * The number of nodes that should be running the daemon pod and have one or more of the
        * daemon pod running and available (ready for at least spec.minReadySeconds)
        */
      var numberAvailable: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
        * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
        */
      var numberMisscheduled: Input[Double]
      /**
        * The number of nodes that should be running the daemon pod and have one or more of the
        * daemon pod running and ready.
        */
      var numberReady: Input[Double]
      /**
        * The number of nodes that should be running the daemon pod and have none of the daemon pod
        * running and available (ready for at least spec.minReadySeconds)
        */
      var numberUnavailable: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The most recent generation observed by the daemon set controller.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The total number of nodes that are running updated daemon pod
        */
      var updatedNumberScheduled: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
      */
    trait DaemonSetUpdateStrategy extends js.Object {
      /**
        * Rolling update config params. Present only if type = "RollingUpdate".
        */
      var rollingUpdate: js.UndefOr[Input[RollingUpdateDaemonSet]] = js.undefined
      /**
        * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * Deployment enables declarative updates for Pods and ReplicaSets.
      */
    trait Deployment extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Deployment]] = js.undefined
      /**
        * Standard object metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Specification of the desired behavior of the Deployment.
        */
      var spec: js.UndefOr[Input[DeploymentSpec]] = js.undefined
    }
    
    /**
      * DeploymentCondition describes the state of a deployment at a certain point.
      */
    trait DeploymentCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * The last time this condition was updated.
        */
      var lastUpdateTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of deployment condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    trait DeploymentList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      /**
        * Items is the list of Deployments.
        */
      var items: Input[js.Array[Input[Deployment]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.DeploymentList]] = js.undefined
      /**
        * Standard list metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Indicates that the deployment is paused.
        */
      var paused: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * The maximum time in seconds for a deployment to make progress before it is considered to be
        * failed. The deployment controller will continue to process failed deployments and a
        * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
        * Note that progress will not be estimated during the time a deployment is paused. Defaults
        * to 600s.
        */
      var progressDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Number of desired pods. This is a pointer to distinguish between explicit zero and not
        * specified. Defaults to 1.
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
        * between explicit zero and not specified. Defaults to 10.
        */
      var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
        * ones affected by this deployment. It must match the pod template's labels.
        */
      var selector: Input[LabelSelector]
      /**
        * The deployment strategy to use to replace existing pods with new ones.
        */
      var strategy: js.UndefOr[Input[DeploymentStrategy]] = js.undefined
      /**
        * Template describes the pods that will be created.
        */
      var template: Input[PodTemplateSpec]
    }
    
    /**
      * DeploymentStatus is the most recently observed status of the Deployment.
      */
    trait DeploymentStatus extends js.Object {
      /**
        * Total number of available pods (ready for at least minReadySeconds) targeted by this
        * deployment.
        */
      var availableReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
        * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
        */
      var collisionCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a deployment's current state.
        */
      var conditions: js.UndefOr[Input[js.Array[Input[DeploymentCondition]]]] = js.undefined
      /**
        * The generation observed by the deployment controller.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of ready pods targeted by this deployment.
        */
      var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of non-terminated pods targeted by this deployment (their labels match the
        * selector).
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of unavailable pods targeted by this deployment. This is the total number of
        * pods that are still required for the deployment to have 100% available capacity. They may
        * either be pods that are running but not yet available or pods that still have not been
        * created.
        */
      var unavailableReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of non-terminated pods targeted by this deployment that have the desired
        * template spec.
        */
      var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * DeploymentStrategy describes how to replace existing pods with new ones.
      */
    trait DeploymentStrategy extends js.Object {
      /**
        * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
        */
      var rollingUpdate: js.UndefOr[Input[RollingUpdateDeployment]] = js.undefined
      /**
        * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
      */
    trait ReplicaSet extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ReplicaSet]] = js.undefined
      /**
        * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
        * that the ReplicaSet manages. Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[ReplicaSetSpec]] = js.undefined
    }
    
    /**
      * ReplicaSetCondition describes the state of a replica set at a certain point.
      */
    trait ReplicaSetCondition extends js.Object {
      /**
        * The last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of replica set condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * ReplicaSetList is a collection of ReplicaSets.
      */
    trait ReplicaSetList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      /**
        * List of ReplicaSets. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
        */
      var items: Input[js.Array[Input[ReplicaSet]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ReplicaSetList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Replicas is the number of desired replicas. This is a pointer to distinguish between
        * explicit zero and unspecified. Defaults to 1. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Selector is a label query over pods that should match the replica count. Label keys and
        * values that must match in order to be controlled by this replica set. It must match the pod
        * template's labels. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: Input[LabelSelector]
      /**
        * Template is the object that describes the pod that will be created if insufficient replicas
        * are detected. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
        */
      var template: js.UndefOr[Input[PodTemplateSpec]] = js.undefined
    }
    
    /**
      * ReplicaSetStatus represents the current status of a ReplicaSet.
      */
    trait ReplicaSetStatus extends js.Object {
      /**
        * The number of available replicas (ready for at least minReadySeconds) for this replica set.
        */
      var availableReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a replica set's current state.
        */
      var conditions: js.UndefOr[Input[js.Array[Input[ReplicaSetCondition]]]] = js.undefined
      /**
        * The number of pods that have labels matching the labels of the pod template of the
        * replicaset.
        */
      var fullyLabeledReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The number of ready replicas for this replica set.
        */
      var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Replicas is the most recently oberved number of replicas. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
        */
      var replicas: Input[Double]
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
      var maxUnavailable: js.UndefOr[Input[Double | String]] = js.undefined
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
      var maxSurge: js.UndefOr[Input[Double | String]] = js.undefined
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
      var maxUnavailable: js.UndefOr[Input[Double | String]] = js.undefined
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
      var partition: js.UndefOr[Input[Double]] = js.undefined
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
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSet]] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec defines the desired identities of pods in this set.
        */
      var spec: js.UndefOr[Input[StatefulSetSpec]] = js.undefined
    }
    
    /**
      * StatefulSetCondition describes the state of a statefulset at a certain point.
      */
    trait StatefulSetCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of statefulset condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
    trait StatefulSetList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1`]] = js.undefined
      var items: Input[js.Array[Input[StatefulSet]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSetList]] = js.undefined
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var podManagementPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * replicas is the desired number of replicas of the given Template. These are replicas in the
        * sense that they are instantiations of the same Template, but individual replicas also have
        * a consistent identity. If unspecified, defaults to 1.
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
        * StatefulSet's revision history. The revision history consists of all revisions not
        * represented by a currently applied StatefulSetSpec version. The default value is 10.
        */
      var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      /**
        * selector is a label query over pods that should match the replica count. It must match the
        * pod template's labels. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: Input[LabelSelector]
      /**
        * serviceName is the name of the service that governs this StatefulSet. This service must
        * exist before the StatefulSet, and is responsible for the network identity of the set. Pods
        * get DNS/hostnames that follow the pattern:
        * pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is
        * managed by the StatefulSet controller.
        */
      var serviceName: Input[String]
      /**
        * template is the object that describes the pod that will be created if insufficient replicas
        * are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have
        * a unique identity from the rest of the StatefulSet.
        */
      var template: Input[PodTemplateSpec]
      /**
        * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods
        * in the StatefulSet when a revision is made to Template.
        */
      var updateStrategy: js.UndefOr[Input[StatefulSetUpdateStrategy]] = js.undefined
      /**
        * volumeClaimTemplates is a list of claims that pods are allowed to reference. The
        * StatefulSet controller is responsible for mapping network identities to claims in a way
        * that maintains the identity of a pod. Every claim in this list must have at least one
        * matching (by name) volumeMount in one container in the template. A claim in this list takes
        * precedence over any volumes in the template, with the same name.
        */
      var volumeClaimTemplates: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaim]]]] = js.undefined
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
      var collisionCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a statefulset's current state.
        */
      var conditions: js.UndefOr[Input[js.Array[Input[StatefulSetCondition]]]] = js.undefined
      /**
        * currentReplicas is the number of Pods created by the StatefulSet controller from the
        * StatefulSet version indicated by currentRevision.
        */
      var currentReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
        * Pods in the sequence [0,currentReplicas).
        */
      var currentRevision: js.UndefOr[Input[String]] = js.undefined
      /**
        * observedGeneration is the most recent generation observed for this StatefulSet. It
        * corresponds to the StatefulSet's generation, which is updated on mutation by the API
        * Server.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
        * Condition.
        */
      var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * replicas is the number of Pods created by the StatefulSet controller.
        */
      var replicas: Input[Double]
      /**
        * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
        * Pods in the sequence [replicas-updatedReplicas,replicas)
        */
      var updateRevision: js.UndefOr[Input[String]] = js.undefined
      /**
        * updatedReplicas is the number of Pods created by the StatefulSet controller from the
        * StatefulSet version indicated by updateRevision.
        */
      var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
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
      var rollingUpdate: js.UndefOr[Input[RollingUpdateStatefulSetStrategy]] = js.undefined
      /**
        * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isControllerRevision(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.ControllerRevision */ Boolean = js.native
    def isControllerRevisionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.ControllerRevisionList */ Boolean = js.native
    def isDaemonSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.DaemonSet */ Boolean = js.native
    def isDaemonSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.DaemonSetList */ Boolean = js.native
    def isDeployment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.Deployment */ Boolean = js.native
    def isDeploymentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.DeploymentList */ Boolean = js.native
    def isReplicaSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.ReplicaSet */ Boolean = js.native
    def isReplicaSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.ReplicaSetList */ Boolean = js.native
    def isStatefulSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.StatefulSet */ Boolean = js.native
    def isStatefulSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.StatefulSetList */ Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * @deprecated apps/v1beta1/ControllerRevision is not supported by Kubernetes 1.16+ clusters.
      * Use apps/v1/ControllerRevision instead.
      *
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
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta1`]] = js.undefined
      /**
        * Data is the serialized representation of the state.
        */
      var data: js.UndefOr[Input[js.Object]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevision]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Revision indicates the revision of the state represented by Data.
        */
      var revision: Input[Double]
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
    trait ControllerRevisionList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta1`]] = js.undefined
      /**
        * Items is the list of ControllerRevisions
        */
      var items: Input[
            js.Array[
              Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.ControllerRevision]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevisionList]
          ] = js.undefined
      /**
        * More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * @deprecated apps/v1beta1/Deployment is not supported by Kubernetes 1.16+ clusters. Use
      * apps/v1/Deployment instead.
      *
      * Deployment enables declarative updates for Pods and ReplicaSets.
      */
    trait Deployment extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Deployment]] = js.undefined
      /**
        * Standard object metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Specification of the desired behavior of the Deployment.
        */
      var spec: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.DeploymentSpec]] = js.undefined
    }
    
    /**
      * DeploymentCondition describes the state of a deployment at a certain point.
      */
    trait DeploymentCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * The last time this condition was updated.
        */
      var lastUpdateTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of deployment condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    trait DeploymentList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta1`]] = js.undefined
      /**
        * Items is the list of Deployments.
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.Deployment]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.DeploymentList]] = js.undefined
      /**
        * Standard list metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
      */
    trait DeploymentRollback extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * Required: This must match the Name of a deployment.
        */
      var name: Input[String]
      /**
        * The config of this deployment rollback.
        */
      var rollbackTo: Input[RollbackConfig]
      /**
        * The annotations to be updated to a deployment
        */
      var updatedAnnotations: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
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
      var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Indicates that the deployment is paused.
        */
      var paused: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * The maximum time in seconds for a deployment to make progress before it is considered to be
        * failed. The deployment controller will continue to process failed deployments and a
        * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
        * Note that progress will not be estimated during the time a deployment is paused. Defaults
        * to 600s.
        */
      var progressDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Number of desired pods. This is a pointer to distinguish between explicit zero and not
        * specified. Defaults to 1.
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
        * between explicit zero and not specified. Defaults to 2.
        */
      var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      /**
        * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback
        * is done.
        */
      var rollbackTo: js.UndefOr[Input[RollbackConfig]] = js.undefined
      /**
        * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
        * ones affected by this deployment.
        */
      var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * The deployment strategy to use to replace existing pods with new ones.
        */
      var strategy: js.UndefOr[
            Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.DeploymentStrategy]
          ] = js.undefined
      /**
        * Template describes the pods that will be created.
        */
      var template: Input[PodTemplateSpec]
    }
    
    /**
      * DeploymentStatus is the most recently observed status of the Deployment.
      */
    trait DeploymentStatus extends js.Object {
      /**
        * Total number of available pods (ready for at least minReadySeconds) targeted by this
        * deployment.
        */
      var availableReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
        * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
        */
      var collisionCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a deployment's current state.
        */
      var conditions: js.UndefOr[
            Input[
              js.Array[
                Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.DeploymentCondition]
              ]
            ]
          ] = js.undefined
      /**
        * The generation observed by the deployment controller.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of ready pods targeted by this deployment.
        */
      var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of non-terminated pods targeted by this deployment (their labels match the
        * selector).
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of unavailable pods targeted by this deployment. This is the total number of
        * pods that are still required for the deployment to have 100% available capacity. They may
        * either be pods that are running but not yet available or pods that still have not been
        * created.
        */
      var unavailableReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of non-terminated pods targeted by this deployment that have the desired
        * template spec.
        */
      var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * DeploymentStrategy describes how to replace existing pods with new ones.
      */
    trait DeploymentStrategy extends js.Object {
      /**
        * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
        */
      var rollingUpdate: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.RollingUpdateDeployment
            ]
          ] = js.undefined
      /**
        * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * DEPRECATED.
      */
    trait RollbackConfig extends js.Object {
      /**
        * The revision to rollback to. If set to 0, rollback to the last revision.
        */
      var revision: js.UndefOr[Input[Double]] = js.undefined
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
      var maxSurge: js.UndefOr[Input[Double | String]] = js.undefined
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
      var maxUnavailable: js.UndefOr[Input[Double | String]] = js.undefined
    }
    
    /**
      * RollingUpdateStatefulSetStrategy is used to communicate parameter for
      * RollingUpdateStatefulSetStrategyType.
      */
    trait RollingUpdateStatefulSetStrategy extends js.Object {
      /**
        * Partition indicates the ordinal at which the StatefulSet should be partitioned.
        */
      var partition: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * Scale represents a scaling request for a resource.
      */
    trait Scale extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * defines the behavior of the scale. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
        */
      var spec: js.UndefOr[Input[ScaleSpec]] = js.undefined
    }
    
    /**
      * ScaleSpec describes the attributes of a scale subresource
      */
    trait ScaleSpec extends js.Object {
      /**
        * desired number of instances for the scaled object.
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * ScaleStatus represents the current status of a scale subresource.
      */
    trait ScaleStatus extends js.Object {
      /**
        * actual number of observed instances of the scaled object.
        */
      var replicas: Input[Double]
      /**
        * label query over pods that should match the replicas count. More info:
        * http://kubernetes.io/docs/user-guide/labels#label-selectors
        */
      var selector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
      /**
        * label selector for pods that should match the replicas count. This is a serializated
        * version of both map-based and more expressive set-based selectors. This is done to avoid
        * introspection in the clients. The string will be in the same format as the query-param
        * syntax. If the target type only supports map-based selectors, both this field and map-based
        * selector field are populated. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var targetSelector: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * @deprecated apps/v1beta1/StatefulSet is not supported by Kubernetes 1.16+ clusters. Use
      * apps/v1/StatefulSet instead.
      *
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
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSet]] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec defines the desired identities of pods in this set.
        */
      var spec: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.StatefulSetSpec]] = js.undefined
    }
    
    /**
      * StatefulSetCondition describes the state of a statefulset at a certain point.
      */
    trait StatefulSetCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of statefulset condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
    trait StatefulSetList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta1`]] = js.undefined
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.StatefulSet]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSetList]] = js.undefined
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var podManagementPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * replicas is the desired number of replicas of the given Template. These are replicas in the
        * sense that they are instantiations of the same Template, but individual replicas also have
        * a consistent identity. If unspecified, defaults to 1.
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
        * StatefulSet's revision history. The revision history consists of all revisions not
        * represented by a currently applied StatefulSetSpec version. The default value is 10.
        */
      var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      /**
        * selector is a label query over pods that should match the replica count. If empty,
        * defaulted to labels on the pod template. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * serviceName is the name of the service that governs this StatefulSet. This service must
        * exist before the StatefulSet, and is responsible for the network identity of the set. Pods
        * get DNS/hostnames that follow the pattern:
        * pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is
        * managed by the StatefulSet controller.
        */
      var serviceName: Input[String]
      /**
        * template is the object that describes the pod that will be created if insufficient replicas
        * are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have
        * a unique identity from the rest of the StatefulSet.
        */
      var template: Input[PodTemplateSpec]
      /**
        * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods
        * in the StatefulSet when a revision is made to Template.
        */
      var updateStrategy: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.StatefulSetUpdateStrategy
            ]
          ] = js.undefined
      /**
        * volumeClaimTemplates is a list of claims that pods are allowed to reference. The
        * StatefulSet controller is responsible for mapping network identities to claims in a way
        * that maintains the identity of a pod. Every claim in this list must have at least one
        * matching (by name) volumeMount in one container in the template. A claim in this list takes
        * precedence over any volumes in the template, with the same name.
        */
      var volumeClaimTemplates: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaim]]]] = js.undefined
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
      var collisionCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a statefulset's current state.
        */
      var conditions: js.UndefOr[
            Input[
              js.Array[
                Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.StatefulSetCondition]
              ]
            ]
          ] = js.undefined
      /**
        * currentReplicas is the number of Pods created by the StatefulSet controller from the
        * StatefulSet version indicated by currentRevision.
        */
      var currentReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
        * Pods in the sequence [0,currentReplicas).
        */
      var currentRevision: js.UndefOr[Input[String]] = js.undefined
      /**
        * observedGeneration is the most recent generation observed for this StatefulSet. It
        * corresponds to the StatefulSet's generation, which is updated on mutation by the API
        * Server.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
        * Condition.
        */
      var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * replicas is the number of Pods created by the StatefulSet controller.
        */
      var replicas: Input[Double]
      /**
        * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
        * Pods in the sequence [replicas-updatedReplicas,replicas)
        */
      var updateRevision: js.UndefOr[Input[String]] = js.undefined
      /**
        * updatedReplicas is the number of Pods created by the StatefulSet controller from the
        * StatefulSet version indicated by updateRevision.
        */
      var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
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
      var rollingUpdate: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta1Ns.RollingUpdateStatefulSetStrategy
            ]
          ] = js.undefined
      /**
        * Type indicates the type of the StatefulSetUpdateStrategy.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isControllerRevision(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.ControllerRevision */ Boolean = js.native
    def isControllerRevisionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.ControllerRevisionList */ Boolean = js.native
    def isDeployment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.Deployment */ Boolean = js.native
    def isDeploymentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.DeploymentList */ Boolean = js.native
    def isDeploymentRollback(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.DeploymentRollback */ Boolean = js.native
    def isScale(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.Scale */ Boolean = js.native
    def isStatefulSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.StatefulSet */ Boolean = js.native
    def isStatefulSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.StatefulSetList */ Boolean = js.native
  }
  
  @JSName("v1beta2")
  @js.native
  object v1beta2Ns extends js.Object {
    /**
      * @deprecated apps/v1beta2/ControllerRevision is not supported by Kubernetes 1.16+ clusters.
      * Use apps/v1/ControllerRevision instead.
      *
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
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      /**
        * Data is the serialized representation of the state.
        */
      var data: js.UndefOr[Input[js.Object]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevision]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Revision indicates the revision of the state represented by Data.
        */
      var revision: Input[Double]
    }
    
    /**
      * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
      */
    trait ControllerRevisionList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      /**
        * Items is the list of ControllerRevisions
        */
      var items: Input[
            js.Array[
              Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.ControllerRevision]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevisionList]
          ] = js.undefined
      /**
        * More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * @deprecated apps/v1beta2/DaemonSet is not supported by Kubernetes 1.16+ clusters. Use
      * apps/v1/DaemonSet instead.
      *
      * DaemonSet represents the configuration of a daemon set.
      */
    trait DaemonSet extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.DaemonSet]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * The desired behavior of this daemon set. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.DaemonSetSpec]] = js.undefined
    }
    
    /**
      * DaemonSetCondition describes the state of a DaemonSet at a certain point.
      */
    trait DaemonSetCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of DaemonSet condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * DaemonSetList is a collection of daemon sets.
      */
    trait DaemonSetList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      /**
        * A list of daemon sets.
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.DaemonSet]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.DaemonSetList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The number of old history to retain to allow rollback. This is a pointer to distinguish
        * between explicit zero and not specified. Defaults to 10.
        */
      var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      /**
        * A label query over pods that are managed by the daemon set. Must match in order to be
        * controlled. It must match the pod template's labels. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: Input[LabelSelector]
      /**
        * An object that describes the pod that will be created. The DaemonSet will create exactly
        * one copy of this pod on every node that matches the template's node selector (or on every
        * node if no node selector is specified). More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
        */
      var template: Input[PodTemplateSpec]
      /**
        * An update strategy to replace existing DaemonSet pods with new pods.
        */
      var updateStrategy: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.DaemonSetUpdateStrategy
            ]
          ] = js.undefined
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
      var collisionCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a DaemonSet's current state.
        */
      var conditions: js.UndefOr[
            Input[
              js.Array[
                Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.DaemonSetCondition]
              ]
            ]
          ] = js.undefined
      /**
        * The number of nodes that are running at least 1 daemon pod and are supposed to run the
        * daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
        */
      var currentNumberScheduled: Input[Double]
      /**
        * The total number of nodes that should be running the daemon pod (including nodes correctly
        * running the daemon pod). More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
        */
      var desiredNumberScheduled: Input[Double]
      /**
        * The number of nodes that should be running the daemon pod and have one or more of the
        * daemon pod running and available (ready for at least spec.minReadySeconds)
        */
      var numberAvailable: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
        * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
        */
      var numberMisscheduled: Input[Double]
      /**
        * The number of nodes that should be running the daemon pod and have one or more of the
        * daemon pod running and ready.
        */
      var numberReady: Input[Double]
      /**
        * The number of nodes that should be running the daemon pod and have none of the daemon pod
        * running and available (ready for at least spec.minReadySeconds)
        */
      var numberUnavailable: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The most recent generation observed by the daemon set controller.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The total number of nodes that are running updated daemon pod
        */
      var updatedNumberScheduled: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
      */
    trait DaemonSetUpdateStrategy extends js.Object {
      /**
        * Rolling update config params. Present only if type = "RollingUpdate".
        */
      var rollingUpdate: js.UndefOr[
            Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.RollingUpdateDaemonSet]
          ] = js.undefined
      /**
        * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * @deprecated apps/v1beta2/Deployment is not supported by Kubernetes 1.16+ clusters. Use
      * apps/v1/Deployment instead.
      *
      * Deployment enables declarative updates for Pods and ReplicaSets.
      */
    trait Deployment extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Deployment]] = js.undefined
      /**
        * Standard object metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Specification of the desired behavior of the Deployment.
        */
      var spec: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.DeploymentSpec]] = js.undefined
    }
    
    /**
      * DeploymentCondition describes the state of a deployment at a certain point.
      */
    trait DeploymentCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * The last time this condition was updated.
        */
      var lastUpdateTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of deployment condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * DeploymentList is a list of Deployments.
      */
    trait DeploymentList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      /**
        * Items is the list of Deployments.
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.Deployment]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.DeploymentList]] = js.undefined
      /**
        * Standard list metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Indicates that the deployment is paused.
        */
      var paused: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * The maximum time in seconds for a deployment to make progress before it is considered to be
        * failed. The deployment controller will continue to process failed deployments and a
        * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
        * Note that progress will not be estimated during the time a deployment is paused. Defaults
        * to 600s.
        */
      var progressDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Number of desired pods. This is a pointer to distinguish between explicit zero and not
        * specified. Defaults to 1.
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
        * between explicit zero and not specified. Defaults to 10.
        */
      var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the
        * ones affected by this deployment. It must match the pod template's labels.
        */
      var selector: Input[LabelSelector]
      /**
        * The deployment strategy to use to replace existing pods with new ones.
        */
      var strategy: js.UndefOr[
            Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.DeploymentStrategy]
          ] = js.undefined
      /**
        * Template describes the pods that will be created.
        */
      var template: Input[PodTemplateSpec]
    }
    
    /**
      * DeploymentStatus is the most recently observed status of the Deployment.
      */
    trait DeploymentStatus extends js.Object {
      /**
        * Total number of available pods (ready for at least minReadySeconds) targeted by this
        * deployment.
        */
      var availableReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
        * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
        */
      var collisionCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a deployment's current state.
        */
      var conditions: js.UndefOr[
            Input[
              js.Array[
                Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.DeploymentCondition]
              ]
            ]
          ] = js.undefined
      /**
        * The generation observed by the deployment controller.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of ready pods targeted by this deployment.
        */
      var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of non-terminated pods targeted by this deployment (their labels match the
        * selector).
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of unavailable pods targeted by this deployment. This is the total number of
        * pods that are still required for the deployment to have 100% available capacity. They may
        * either be pods that are running but not yet available or pods that still have not been
        * created.
        */
      var unavailableReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Total number of non-terminated pods targeted by this deployment that have the desired
        * template spec.
        */
      var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * DeploymentStrategy describes how to replace existing pods with new ones.
      */
    trait DeploymentStrategy extends js.Object {
      /**
        * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
        */
      var rollingUpdate: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.RollingUpdateDeployment
            ]
          ] = js.undefined
      /**
        * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * @deprecated apps/v1beta2/ReplicaSet is not supported by Kubernetes 1.16+ clusters. Use
      * apps/v1/ReplicaSet instead.
      *
      * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
      */
    trait ReplicaSet extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ReplicaSet]] = js.undefined
      /**
        * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
        * that the ReplicaSet manages. Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.ReplicaSetSpec]] = js.undefined
    }
    
    /**
      * ReplicaSetCondition describes the state of a replica set at a certain point.
      */
    trait ReplicaSetCondition extends js.Object {
      /**
        * The last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of replica set condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * ReplicaSetList is a collection of ReplicaSets.
      */
    trait ReplicaSetList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      /**
        * List of ReplicaSets. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.ReplicaSet]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ReplicaSetList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Replicas is the number of desired replicas. This is a pointer to distinguish between
        * explicit zero and unspecified. Defaults to 1. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Selector is a label query over pods that should match the replica count. Label keys and
        * values that must match in order to be controlled by this replica set. It must match the pod
        * template's labels. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: Input[LabelSelector]
      /**
        * Template is the object that describes the pod that will be created if insufficient replicas
        * are detected. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
        */
      var template: js.UndefOr[Input[PodTemplateSpec]] = js.undefined
    }
    
    /**
      * ReplicaSetStatus represents the current status of a ReplicaSet.
      */
    trait ReplicaSetStatus extends js.Object {
      /**
        * The number of available replicas (ready for at least minReadySeconds) for this replica set.
        */
      var availableReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a replica set's current state.
        */
      var conditions: js.UndefOr[
            Input[
              js.Array[
                Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.ReplicaSetCondition]
              ]
            ]
          ] = js.undefined
      /**
        * The number of pods that have labels matching the labels of the pod template of the
        * replicaset.
        */
      var fullyLabeledReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * The number of ready replicas for this replica set.
        */
      var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Replicas is the most recently oberved number of replicas. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
        */
      var replicas: Input[Double]
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
      var maxUnavailable: js.UndefOr[Input[Double | String]] = js.undefined
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
      var maxSurge: js.UndefOr[Input[Double | String]] = js.undefined
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
      var maxUnavailable: js.UndefOr[Input[Double | String]] = js.undefined
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
      var partition: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * Scale represents a scaling request for a resource.
      */
    trait Scale extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * defines the behavior of the scale. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
        */
      var spec: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.ScaleSpec]] = js.undefined
    }
    
    /**
      * ScaleSpec describes the attributes of a scale subresource
      */
    trait ScaleSpec extends js.Object {
      /**
        * desired number of instances for the scaled object.
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * ScaleStatus represents the current status of a scale subresource.
      */
    trait ScaleStatus extends js.Object {
      /**
        * actual number of observed instances of the scaled object.
        */
      var replicas: Input[Double]
      /**
        * label query over pods that should match the replicas count. More info:
        * http://kubernetes.io/docs/user-guide/labels#label-selectors
        */
      var selector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
      /**
        * label selector for pods that should match the replicas count. This is a serializated
        * version of both map-based and more expressive set-based selectors. This is done to avoid
        * introspection in the clients. The string will be in the same format as the query-param
        * syntax. If the target type only supports map-based selectors, both this field and map-based
        * selector field are populated. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var targetSelector: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * @deprecated apps/v1beta2/StatefulSet is not supported by Kubernetes 1.16+ clusters. Use
      * apps/v1/StatefulSet instead.
      *
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
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSet]] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec defines the desired identities of pods in this set.
        */
      var spec: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.StatefulSetSpec]] = js.undefined
    }
    
    /**
      * StatefulSetCondition describes the state of a statefulset at a certain point.
      */
    trait StatefulSetCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * A human readable message indicating details about the transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * The reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type of statefulset condition.
        */
      var `type`: Input[String]
    }
    
    /**
      * StatefulSetList is a collection of StatefulSets.
      */
    trait StatefulSetList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apps/v1beta2`]] = js.undefined
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.StatefulSet]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSetList]] = js.undefined
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var podManagementPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * replicas is the desired number of replicas of the given Template. These are replicas in the
        * sense that they are instantiations of the same Template, but individual replicas also have
        * a consistent identity. If unspecified, defaults to 1.
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * revisionHistoryLimit is the maximum number of revisions that will be maintained in the
        * StatefulSet's revision history. The revision history consists of all revisions not
        * represented by a currently applied StatefulSetSpec version. The default value is 10.
        */
      var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      /**
        * selector is a label query over pods that should match the replica count. It must match the
        * pod template's labels. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: Input[LabelSelector]
      /**
        * serviceName is the name of the service that governs this StatefulSet. This service must
        * exist before the StatefulSet, and is responsible for the network identity of the set. Pods
        * get DNS/hostnames that follow the pattern:
        * pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is
        * managed by the StatefulSet controller.
        */
      var serviceName: Input[String]
      /**
        * template is the object that describes the pod that will be created if insufficient replicas
        * are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have
        * a unique identity from the rest of the StatefulSet.
        */
      var template: Input[PodTemplateSpec]
      /**
        * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods
        * in the StatefulSet when a revision is made to Template.
        */
      var updateStrategy: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.StatefulSetUpdateStrategy
            ]
          ] = js.undefined
      /**
        * volumeClaimTemplates is a list of claims that pods are allowed to reference. The
        * StatefulSet controller is responsible for mapping network identities to claims in a way
        * that maintains the identity of a pod. Every claim in this list must have at least one
        * matching (by name) volumeMount in one container in the template. A claim in this list takes
        * precedence over any volumes in the template, with the same name.
        */
      var volumeClaimTemplates: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaim]]]] = js.undefined
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
      var collisionCount: js.UndefOr[Input[Double]] = js.undefined
      /**
        * Represents the latest available observations of a statefulset's current state.
        */
      var conditions: js.UndefOr[
            Input[
              js.Array[
                Input[typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.StatefulSetCondition]
              ]
            ]
          ] = js.undefined
      /**
        * currentReplicas is the number of Pods created by the StatefulSet controller from the
        * StatefulSet version indicated by currentRevision.
        */
      var currentReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
        * Pods in the sequence [0,currentReplicas).
        */
      var currentRevision: js.UndefOr[Input[String]] = js.undefined
      /**
        * observedGeneration is the most recent generation observed for this StatefulSet. It
        * corresponds to the StatefulSet's generation, which is updated on mutation by the API
        * Server.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
      /**
        * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
        * Condition.
        */
      var readyReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * replicas is the number of Pods created by the StatefulSet controller.
        */
      var replicas: Input[Double]
      /**
        * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
        * Pods in the sequence [replicas-updatedReplicas,replicas)
        */
      var updateRevision: js.UndefOr[Input[String]] = js.undefined
      /**
        * updatedReplicas is the number of Pods created by the StatefulSet controller from the
        * StatefulSet version indicated by updateRevision.
        */
      var updatedReplicas: js.UndefOr[Input[Double]] = js.undefined
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
      var rollingUpdate: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.RollingUpdateStatefulSetStrategy
            ]
          ] = js.undefined
      /**
        * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
        */
      var `type`: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isControllerRevision(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.ControllerRevision */ Boolean = js.native
    def isControllerRevisionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.ControllerRevisionList */ Boolean = js.native
    def isDaemonSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.DaemonSet */ Boolean = js.native
    def isDaemonSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.DaemonSetList */ Boolean = js.native
    def isDeployment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.Deployment */ Boolean = js.native
    def isDeploymentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.DeploymentList */ Boolean = js.native
    def isReplicaSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.ReplicaSet */ Boolean = js.native
    def isReplicaSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.ReplicaSetList */ Boolean = js.native
    def isScale(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.Scale */ Boolean = js.native
    def isStatefulSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.StatefulSet */ Boolean = js.native
    def isStatefulSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.StatefulSetList */ Boolean = js.native
  }
  
}

