package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "extensions")
@js.native
object extensionsNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * AllowedFlexVolume represents a single Flexvolume that is allowed to be used. Deprecated: use
      * AllowedFlexVolume from policy API Group instead.
      */
    trait AllowedFlexVolume extends js.Object {
      /**
        * driver is the name of the Flexvolume driver.
        */
      var driver: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods
      * to use. It requires the path prefix to be defined. Deprecated: use AllowedHostPath from
      * policy API Group instead.
      */
    trait AllowedHostPath extends js.Object {
      /**
        * pathPrefix is the path prefix that the host volume must match. It does not support `*`.
        * Trailing slashes are trimmed when validating the path prefix with a host path.
        *
        * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food`
        * or `/etc/foo`
        */
      var pathPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts
        * are readOnly.
        */
      var readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
      * DEPRECATED - This group version of DaemonSet is deprecated by apps/v1beta2/DaemonSet. See the
      * release notes for more information. DaemonSet represents the configuration of a daemon set.
      */
    trait DaemonSet extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSet]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * A list of daemon sets.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[DaemonSet]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSetList]
          ] = js.undefined
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
        * controlled. If empty, defaulted to labels on Pod template. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
        * An object that describes the pod that will be created. The DaemonSet will create exactly
        * one copy of this pod on every node that matches the template's node selector (or on every
        * node if no node selector is specified). More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
        */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
      /**
        * DEPRECATED. A sequence number representing a specific generation of the template. Populated
        * by the system. It can be set only during the creation.
        */
      var templateGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
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
      var conditions: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[DaemonSetCondition]]]
          ] = js.undefined
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
    
    trait DaemonSetUpdateStrategy extends js.Object {
      /**
        * Rolling update config params. Present only if type = "RollingUpdate".
        */
      var rollingUpdate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RollingUpdateDaemonSet]] = js.undefined
      /**
        * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is OnDelete.
        */
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * Items is the list of Deployments.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Deployment]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DeploymentList]
          ] = js.undefined
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
              org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
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
        * Indicates that the deployment is paused and will not be processed by the deployment
        * controller.
        */
      var paused: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
        * The maximum time in seconds for a deployment to make progress before it is considered to be
        * failed. The deployment controller will continue to process failed deployments and a
        * condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status.
        * Note that progress will not be estimated during the time a deployment is paused. This is
        * set to the max value of int32 (i.e. 2147483647) by default, which means "no deadline".
        */
      var progressDeadlineSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * Number of desired pods. This is a pointer to distinguish between explicit zero and not
        * specified. Defaults to 1.
        */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish
        * between explicit zero and not specified. This is set to the max value of int32 (i.e.
        * 2147483647) by default, which means "retaining all old RelicaSets".
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
      var conditions: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[DeploymentCondition]]]
          ] = js.undefined
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
      * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
      * Deprecated: use FSGroupStrategyOptions from policy API Group instead.
      */
    trait FSGroupStrategyOptions extends js.Object {
      /**
        * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group
        * then supply a single range with the same start and end. Required for MustRunAs.
        */
      var ranges: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[IDRange]]]
          ] = js.undefined
      /**
        * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
        */
      var rule: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are
      * forwarded to the backend.
      */
    trait HTTPIngressPath extends js.Object {
      /**
        * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
        */
      var backend: atPulumiPulumiLib.resourceMod.Input[IngressBackend]
      /**
        * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the
        * egrep/unix syntax, not the perl syntax) matched against the path of an incoming request.
        * Currently it can contain characters disallowed from the conventional "path" part of a URL
        * as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a
        * catch all sending traffic to the backend.
        */
      var path: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example:
      * http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC
      * 3986, this resource will be used to match against everything after the last '/' and before
      * the first '?' or '#'.
      */
    trait HTTPIngressRuleValue extends js.Object {
      /**
        * A collection of paths that map requests to backends.
        */
      var paths: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[HTTPIngressPath]]]
    }
    
    /**
      * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.
      * It requires both the start and end to be defined. Deprecated: use HostPortRange from policy
      * API Group instead.
      */
    trait HostPortRange extends js.Object {
      /**
        * max is the end of the range, inclusive.
        */
      var max: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
        * min is the start of the range, inclusive.
        */
      var min: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
      * IDRange provides a min/max of an allowed range of IDs. Deprecated: use IDRange from policy
      * API Group instead.
      */
    trait IDRange extends js.Object {
      /**
        * max is the end of the range, inclusive.
        */
      var max: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
        * min is the start of the range, inclusive.
        */
      var min: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
      * DEPRECATED 1.9 - This group version of IPBlock is deprecated by networking/v1/IPBlock.
      * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods
      * matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should
      * not be included within this rule.
      */
    trait IPBlock extends js.Object {
      /**
        * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24"
        */
      var cidr: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * Except is a slice of CIDRs that should not be included within an IP Block Valid examples
        * are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
        */
      var except: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
    }
    
    /**
      * Ingress is a collection of rules that allow inbound connections to reach the endpoints
      * defined by a backend. An Ingress can be configured to give services externally-reachable
      * urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
      */
    trait Ingress extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Ingress]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Spec is the desired state of the Ingress. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[IngressSpec]] = js.undefined
      /**
        * Status is the current state of the Ingress. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[IngressStatus]] = js.undefined
    }
    
    /**
      * IngressBackend describes all endpoints for a given service and port.
      */
    trait IngressBackend extends js.Object {
      /**
        * Specifies the name of the referenced service.
        */
      var serviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * Specifies the port of the referenced service.
        */
      var servicePort: atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]
    }
    
    /**
      * IngressList is a collection of Ingress.
      */
    trait IngressList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * Items is the list of Ingress.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Ingress]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.IngressList]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * IngressRule represents the rules mapping the paths under a specified host to the related
      * backend services. Incoming requests are first evaluated for a host match, then routed to the
      * backend associated with the matching IngressRuleValue.
      */
    trait IngressRule extends js.Object {
      /**
        * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the
        * following deviations from the "host" part of the URI as defined in the RFC: 1. IPs are not
        * allowed. Currently an IngressRuleValue can only apply to the
        * 	  IP in the Spec of the parent Ingress.
        * 2. The `:` delimiter is not respected because ports are not allowed.
        * 	  Currently the port of an Ingress is implicitly :80 for http and
        * 	  :443 for https.
        * Both these may change in the future. Incoming requests are matched against the host before
        * the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on
        * the specified IngressRuleValue.
        */
      var host: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var http: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[HTTPIngressRuleValue]] = js.undefined
    }
    
    /**
      * IngressSpec describes the Ingress the user wishes to exist.
      */
    trait IngressSpec extends js.Object {
      /**
        * A default backend capable of servicing requests that don't match any rule. At least one of
        * 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer
        * controller or defaulting logic to specify a global default.
        */
      var backend: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[IngressBackend]] = js.undefined
      /**
        * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all
        * traffic is sent to the default backend.
        */
      var rules: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[IngressRule]]]
          ] = js.undefined
      /**
        * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple
        * members of this list specify different hosts, they will be multiplexed on the same port
        * according to the hostname specified through the SNI TLS extension, if the ingress
        * controller fulfilling the ingress supports SNI.
        */
      var tls: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[IngressTLS]]]
          ] = js.undefined
    }
    
    /**
      * IngressStatus describe the current state of the Ingress.
      */
    trait IngressStatus extends js.Object {
      /**
        * LoadBalancer contains the current status of the load-balancer.
        */
      var loadBalancer: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.LoadBalancerStatus]
          ] = js.undefined
    }
    
    /**
      * IngressTLS describes the transport layer security associated with an Ingress.
      */
    trait IngressTLS extends js.Object {
      /**
        * Hosts are a list of hosts included in the TLS certificate. The values in this list must
        * match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the
        * loadbalancer controller fulfilling this Ingress, if left unspecified.
        */
      var hosts: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * SecretName is the name of the secret used to terminate SSL traffic on 443. Field is left
        * optional to allow SSL routing based on SNI hostname alone. If the SNI host in a listener
        * conflicts with the "Host" header field used by an IngressRule, the SNI host is used for
        * termination and value of the Host header is used for routing.
        */
      var secretName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicy is deprecated by
      * networking/v1/NetworkPolicy. NetworkPolicy describes what network traffic is allowed for a
      * set of Pods
      */
    trait NetworkPolicy extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicy]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the desired behavior for this NetworkPolicy.
        */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[NetworkPolicySpec]] = js.undefined
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicyEgressRule is deprecated by
      * networking/v1/NetworkPolicyEgressRule. NetworkPolicyEgressRule describes a particular set of
      * traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic
      * must match both ports and to. This type is beta-level in 1.8
      */
    trait NetworkPolicyEgressRule extends js.Object {
      /**
        * List of destination ports for outgoing traffic. Each item in this list is combined using a
        * logical OR. If this field is empty or missing, this rule matches all ports (traffic not
        * restricted by port). If this field is present and contains at least one item, then this
        * rule allows traffic only if the traffic matches at least one port in the list.
        */
      var ports: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[NetworkPolicyPort]]]
          ] = js.undefined
      /**
        * List of destinations for outgoing traffic of pods selected for this rule. Items in this
        * list are combined using a logical OR operation. If this field is empty or missing, this
        * rule matches all destinations (traffic not restricted by destination). If this field is
        * present and contains at least one item, this rule allows traffic only if the traffic
        * matches at least one item in the to list.
        */
      var to: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[NetworkPolicyPeer]]]
          ] = js.undefined
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by
      * networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and
      * only if the traffic matches both ports AND from.
      */
    trait NetworkPolicyIngressRule extends js.Object {
      /**
        * List of sources which should be able to access the pods selected for this rule. Items in
        * this list are combined using a logical OR operation. If this field is empty or missing,
        * this rule matches all sources (traffic not restricted by source). If this field is present
        * and contains at least on item, this rule allows traffic only if the traffic matches at
        * least one item in the from list.
        */
      var from: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[NetworkPolicyPeer]]]
          ] = js.undefined
      /**
        * List of ports which should be made accessible on the pods selected for this rule. Each item
        * in this list is combined using a logical OR. If this field is empty or missing, this rule
        * matches all ports (traffic not restricted by port). If this field is present and contains
        * at least one item, then this rule allows traffic only if the traffic matches at least one
        * port in the list.
        */
      var ports: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[NetworkPolicyPort]]]
          ] = js.undefined
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicyList is deprecated by
      * networking/v1/NetworkPolicyList. Network Policy List is a list of NetworkPolicy objects.
      */
    trait NetworkPolicyList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[NetworkPolicy]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicyList]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicyPeer is deprecated by
      * networking/v1/NetworkPolicyPeer.
      */
    trait NetworkPolicyPeer extends js.Object {
      /**
        * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the
        * other fields can be.
        */
      var ipBlock: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[IPBlock]] = js.undefined
      /**
        * Selects Namespaces using cluster-scoped labels. This field follows standard label selector
        * semantics; if present but empty, it selects all namespaces.
        *
        * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching
        * PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods
        * in the Namespaces selected by NamespaceSelector.
        */
      var namespaceSelector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
        * This is a label selector which selects Pods. This field follows standard label selector
        * semantics; if present but empty, it selects all pods.
        *
        * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods
        * matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects
        * the Pods matching PodSelector in the policy's own Namespace.
        */
      var podSelector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by
      * networking/v1/NetworkPolicyPort.
      */
    trait NetworkPolicyPort extends js.Object {
      /**
        * If specified, the port on the given protocol.  This can either be a numerical or named port
        * on a pod.  If this field is not provided, this matches all port names and numbers. If
        * present, only traffic on the specified protocol AND port will be matched.
        */
      var port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
        * Optional.  The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified,
        * this field defaults to TCP.
        */
      var protocol: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * DEPRECATED 1.9 - This group version of NetworkPolicySpec is deprecated by
      * networking/v1/NetworkPolicySpec.
      */
    trait NetworkPolicySpec extends js.Object {
      /**
        * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if
        * there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the
        * traffic), OR if the traffic matches at least one egress rule across all of the
        * NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this
        * NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it
        * selects are isolated by default). This field is beta-level in 1.8
        */
      var egress: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[NetworkPolicyEgressRule]]]
          ] = js.undefined
      /**
        * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if
        * there are no NetworkPolicies selecting the pod OR if the traffic source is the pod's local
        * node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy
        * objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy
        * does not allow any traffic (and serves solely to ensure that the pods it selects are
        * isolated by default).
        */
      var ingress: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[NetworkPolicyIngressRule]]]
          ] = js.undefined
      /**
        * Selects the pods to which this NetworkPolicy object applies.  The array of ingress rules is
        * applied to any pods selected by this field. Multiple network policies can select the same
        * set of pods.  In this case, the ingress rules for each are combined additively. This field
        * is NOT optional and follows standard label selector semantics. An empty podSelector matches
        * all pods in this namespace.
        */
      var podSelector: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
      /**
        * List of rule types that the NetworkPolicy relates to. Valid options are Ingress, Egress, or
        * Ingress,Egress. If this field is not specified, it will default based on the existence of
        * Ingress or Egress rules; policies that contain an Egress section are assumed to affect
        * Egress, and all policies (whether or not they contain an Ingress section) are assumed to
        * affect Ingress. If you want to write an egress-only policy, you must explicitly specify
        * policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no
        * egress is allowed, you must specify a policyTypes value that include "Egress" (since such a
        * policy would not include an Egress section and would otherwise default to just [ "Ingress"
        * ]). This field is beta-level in 1.8
        */
      var policyTypes: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
    }
    
    /**
      * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
      * will be applied to a pod and container. Deprecated: use PodSecurityPolicy from policy API
      * Group instead.
      */
    trait PodSecurityPolicy extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicy]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * spec defines the policy enforced.
        */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodSecurityPolicySpec]] = js.undefined
    }
    
    /**
      * PodSecurityPolicyList is a list of PodSecurityPolicy objects. Deprecated: use
      * PodSecurityPolicyList from policy API Group instead.
      */
    trait PodSecurityPolicyList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * items is a list of schema objects.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[PodSecurityPolicy]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicyList]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * PodSecurityPolicySpec defines the policy enforced. Deprecated: use PodSecurityPolicySpec from
      * policy API Group instead.
      */
    trait PodSecurityPolicySpec extends js.Object {
      /**
        * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If
        * unspecified, defaults to true.
        */
      var allowPrivilegeEscalation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
        * allowedCapabilities is a list of capabilities that can be requested to add to the
        * container. Capabilities in this field may be added at the pod author's discretion. You must
        * not list a capability in both allowedCapabilities and requiredDropCapabilities.
        */
      var allowedCapabilities: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
        * Flexvolumes may be used.  This parameter is effective only when the usage of the
        * Flexvolumes is allowed in the "volumes" field.
        */
      var allowedFlexVolumes: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[AllowedFlexVolume]]]
          ] = js.undefined
      /**
        * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths
        * may be used.
        */
      var allowedHostPaths: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[AllowedHostPath]]]
          ] = js.undefined
      /**
        * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that
        * only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to
        * be enabled.
        */
      var allowedProcMountTypes: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each
        * entry is either a plain sysctl name or ends in "*" in which case it is considered as a
        * prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to
        * whitelist all allowed unsafe sysctls explicitly to avoid rejection.
        *
        * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar",
        * "foo.baz", etc.
        */
      var allowedUnsafeSysctls: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * defaultAddCapabilities is the default set of capabilities that will be added to the
        * container unless the pod spec specifically drops the capability.  You may not list a
        * capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added
        * here are implicitly allowed, and need not be included in the allowedCapabilities list.
        */
      var defaultAddCapabilities: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain
        * more privileges than its parent process.
        */
      var defaultAllowPrivilegeEscalation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
        * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is
        * either a plain sysctl name or ends in "*" in which case it is considered as a prefix of
        * forbidden sysctls. Single * means all sysctls are forbidden.
        *
        * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar",
        * "foo.baz", etc.
        */
      var forbiddenSysctls: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
        */
      var fsGroup: atPulumiPulumiLib.resourceMod.Input[FSGroupStrategyOptions]
      /**
        * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
        */
      var hostIPC: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
        * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
        */
      var hostNetwork: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
        * hostPID determines if the policy allows the use of HostPID in the pod spec.
        */
      var hostPID: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
        * hostPorts determines which host port ranges are allowed to be exposed.
        */
      var hostPorts: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[HostPortRange]]]
          ] = js.undefined
      /**
        * privileged determines if a pod can request to be run as privileged.
        */
      var privileged: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
        * readOnlyRootFilesystem when set to true will force containers to run with a read only root
        * file system.  If the container specifically requests to run with a non-read only root file
        * system the PSP should deny the pod. If set to false the container may run with a read only
        * root file system if it wishes but it will not be forced to.
        */
      var readOnlyRootFilesystem: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
        * requiredDropCapabilities are the capabilities that will be dropped from the container.
        * These are required to be dropped and cannot be added.
        */
      var requiredDropCapabilities: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be
        * set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires
        * the RunAsGroup feature gate to be enabled.
        */
      var runAsGroup: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[RunAsGroupStrategyOptions]] = js.undefined
      /**
        * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
        */
      var runAsUser: atPulumiPulumiLib.resourceMod.Input[RunAsUserStrategyOptions]
      /**
        * seLinux is the strategy that will dictate the allowable labels that may be set.
        */
      var seLinux: atPulumiPulumiLib.resourceMod.Input[SELinuxStrategyOptions]
      /**
        * supplementalGroups is the strategy that will dictate what supplemental groups are used by
        * the SecurityContext.
        */
      var supplementalGroups: atPulumiPulumiLib.resourceMod.Input[SupplementalGroupsStrategyOptions]
      /**
        * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be
        * used. To allow all volumes you may use '*'.
        */
      var volumes: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
    }
    
    /**
      * DEPRECATED - This group version of ReplicaSet is deprecated by apps/v1beta2/ReplicaSet. See
      * the release notes for more information. ReplicaSet ensures that a specified number of pod
      * replicas are running at any given time.
      */
    trait ReplicaSet extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`extensions/v1beta1`]
          ] = js.undefined
      /**
        * List of ReplicaSets. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[ReplicaSet]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSetList]
          ] = js.undefined
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
        * Selector is a label query over pods that should match the replica count. If the selector is
        * empty, it is defaulted to the labels present on the pod template. Label keys and values
        * that must match in order to be controlled by this replica set. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
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
      var conditions: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[ReplicaSetCondition]]]
          ] = js.undefined
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
      * DEPRECATED.
      */
    trait RollbackConfig extends js.Object {
      /**
        * The revision to rollback to. If set to 0, rollback to the last revision.
        */
      var revision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
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
        * By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be
        * scaled up immediately when the rolling update starts, such that the total number of old and
        * new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be
        * scaled up further, ensuring that total number of pods running at any time during the update
        * is atmost 130% of desired pods.
        */
      var maxSurge: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
        * The maximum number of pods that can be unavailable during the update. Value can be an
        * absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is
        * calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By
        * default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be
        * scaled down to 70% of desired pods immediately when the rolling update starts. Once new
        * pods are ready, old RC can be scaled down further, followed by scaling up the new RC,
        * ensuring that the total number of pods available at all times during the update is at least
        * 70% of desired pods.
        */
      var maxUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
    }
    
    /**
      * RunAsGroupStrategyOptions defines the strategy type and any options used to create the
      * strategy. Deprecated: use RunAsGroupStrategyOptions from policy API Group instead.
      */
    trait RunAsGroupStrategyOptions extends js.Object {
      /**
        * ranges are the allowed ranges of gids that may be used. If you would like to force a single
        * gid then supply a single range with the same start and end. Required for MustRunAs.
        */
      var ranges: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[IDRange]]]
          ] = js.undefined
      /**
        * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
        */
      var rule: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * RunAsUserStrategyOptions defines the strategy type and any options used to create the
      * strategy. Deprecated: use RunAsUserStrategyOptions from policy API Group instead.
      */
    trait RunAsUserStrategyOptions extends js.Object {
      /**
        * ranges are the allowed ranges of uids that may be used. If you would like to force a single
        * uid then supply a single range with the same start and end. Required for MustRunAs.
        */
      var ranges: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[IDRange]]]
          ] = js.undefined
      /**
        * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
        */
      var rule: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
      * Deprecated: use SELinuxStrategyOptions from policy API Group instead.
      */
    trait SELinuxStrategyOptions extends js.Object {
      /**
        * rule is the strategy that will dictate the allowable labels that may be set.
        */
      var rule: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * seLinuxOptions required to run as; required for MustRunAs More info:
        * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
        */
      var seLinuxOptions: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.SELinuxOptions]
          ] = js.undefined
    }
    
    /**
      * represents a scaling request for a resource.
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
      * describes the attributes of a scale subresource
      */
    trait ScaleSpec extends js.Object {
      /**
        * desired number of instances for the scaled object.
        */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
      * represents the current status of a scale subresource.
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
              org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
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
      * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the
      * strategy. Deprecated: use SupplementalGroupsStrategyOptions from policy API Group instead.
      */
    trait SupplementalGroupsStrategyOptions extends js.Object {
      /**
        * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
        * supplemental group then supply a single range with the same start and end. Required for
        * MustRunAs.
        */
      var ranges: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[IDRange]]]
          ] = js.undefined
      /**
        * rule is the strategy that will dictate what supplemental groups is used in the
        * SecurityContext.
        */
      var rule: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isDaemonSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.DaemonSet */ scala.Boolean = js.native
    def isDaemonSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.DaemonSetList */ scala.Boolean = js.native
    def isDeployment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.Deployment */ scala.Boolean = js.native
    def isDeploymentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.DeploymentList */ scala.Boolean = js.native
    def isDeploymentRollback(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.DeploymentRollback */ scala.Boolean = js.native
    def isIngress(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.Ingress */ scala.Boolean = js.native
    def isIngressList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.IngressList */ scala.Boolean = js.native
    def isNetworkPolicy(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.NetworkPolicy */ scala.Boolean = js.native
    def isNetworkPolicyList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.NetworkPolicyList */ scala.Boolean = js.native
    def isPodSecurityPolicy(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.PodSecurityPolicy */ scala.Boolean = js.native
    def isPodSecurityPolicyList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.PodSecurityPolicyList */ scala.Boolean = js.native
    def isReplicaSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.ReplicaSet */ scala.Boolean = js.native
    def isReplicaSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.ReplicaSetList */ scala.Boolean = js.native
    def isScale(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.Scale */ scala.Boolean = js.native
  }
  
}

