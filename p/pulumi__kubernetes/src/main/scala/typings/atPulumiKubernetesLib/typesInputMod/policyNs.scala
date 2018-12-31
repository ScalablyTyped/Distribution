package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "policy")
@js.native
object policyNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
      */
    trait AllowedFlexVolume extends js.Object {
      /**
        * driver is the name of the Flexvolume driver.
        */
      var driver: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods
      * to use. It requires the path prefix to be defined.
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
      * Eviction evicts a pod from its node subject to certain policies and safety constraints. This
      * is a subresource of Pod.  A request to cause such an eviction is created by POSTing to
      * .../pods/<pod name>/evictions.
      */
    trait Eviction extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * DeleteOptions may be provided
        */
      var deleteOptions: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.DeleteOptions]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * ObjectMeta describes the pod that is being evicted.
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
    }
    
    /**
      * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
      */
    trait FSGroupStrategyOptions extends js.Object {
      /**
        * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group
        * then supply a single range with the same start and end. Required for MustRunAs.
        */
      var ranges: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[IDRange]]] = js.undefined
      /**
        * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
        */
      var rule: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.
      * It requires both the start and end to be defined.
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
      * IDRange provides a min/max of an allowed range of IDs.
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
      * PodDisruptionBudget is an object to define the max disruption that can be caused to a
      * collection of pods
      */
    trait PodDisruptionBudget extends js.Object {
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
        * Specification of the desired behavior of the PodDisruptionBudget.
        */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodDisruptionBudgetSpec]] = js.undefined
      /**
        * Most recently observed status of the PodDisruptionBudget.
        */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodDisruptionBudgetStatus]] = js.undefined
    }
    
    /**
      * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
      */
    trait PodDisruptionBudgetList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[PodDisruptionBudget]]
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
      * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
      */
    trait PodDisruptionBudgetSpec extends js.Object {
      /**
        * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are
        * unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one
        * can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting
        * with "minAvailable".
        */
      var maxUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
        * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be
        * available after the eviction, i.e. even in the absence of the evicted pod.  So for example
        * you can prevent all voluntary evictions by specifying "100%".
        */
      var minAvailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
        * Label query over pods whose evictions are managed by the disruption budget.
        */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
    }
    
    /**
      * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget.
      * Status may trail the actual state of a system.
      */
    trait PodDisruptionBudgetStatus extends js.Object {
      /**
        * current number of healthy pods
        */
      var currentHealthy: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
        * minimum desired number of healthy pods
        */
      var desiredHealthy: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
        * DisruptedPods contains information about pods whose eviction was processed by the API
        * server eviction subresource handler but has not yet been observed by the
        * PodDisruptionBudget controller. A pod will be in this map from the time when the API server
        * processed the eviction request to the time when the pod is seen by PDB controller as having
        * been marked for deletion (or after a timeout). The key in the map is the name of the pod
        * and the value is the time when the API server processed the eviction request. If the
        * deletion didn't occur and a pod is still there it will be removed from the list
        * automatically by PodDisruptionBudget controller after some time. If everything goes smooth
        * this map should be empty for the most of the time. Large number of entries in the map may
        * indicate problems with pod deletions.
        */
      var disruptedPods: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
        * Number of pod disruptions that are currently allowed.
        */
      var disruptionsAllowed: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
        * total number of pods counted by this disruption budget
        */
      var expectedPods: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
        * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and
        * other status informatio is valid only if observedGeneration equals to PDB's object
        * generation.
        */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
      * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
      * will be applied to a pod and container.
      */
    trait PodSecurityPolicy extends js.Object {
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
        * spec defines the policy enforced.
        */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodSecurityPolicySpec]] = js.undefined
    }
    
    /**
      * PodSecurityPolicyList is a list of PodSecurityPolicy objects.
      */
    trait PodSecurityPolicyList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * items is a list of schema objects.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[PodSecurityPolicy]]
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
      * PodSecurityPolicySpec defines the policy enforced.
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
      var allowedCapabilities: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
        * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
        * Flexvolumes may be used.  This parameter is effective only when the usage of the
        * Flexvolumes is allowed in the "volumes" field.
        */
      var allowedFlexVolumes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[AllowedFlexVolume]]] = js.undefined
      /**
        * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths
        * may be used.
        */
      var allowedHostPaths: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[AllowedHostPath]]] = js.undefined
      /**
        * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that
        * only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to
        * be enabled.
        */
      var allowedProcMountTypes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
        * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each
        * entry is either a plain sysctl name or ends in "*" in which case it is considered as a
        * prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to
        * whitelist all allowed unsafe sysctls explicitly to avoid rejection.
        *
        * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar",
        * "foo.baz", etc.
        */
      var allowedUnsafeSysctls: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
        * defaultAddCapabilities is the default set of capabilities that will be added to the
        * container unless the pod spec specifically drops the capability.  You may not list a
        * capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added
        * here are implicitly allowed, and need not be included in the allowedCapabilities list.
        */
      var defaultAddCapabilities: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
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
      var forbiddenSysctls: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
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
      var hostPorts: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[HostPortRange]]] = js.undefined
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
      var requiredDropCapabilities: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
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
      var volumes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
      * RunAsGroupStrategyOptions defines the strategy type and any options used to create the
      * strategy.
      */
    trait RunAsGroupStrategyOptions extends js.Object {
      /**
        * ranges are the allowed ranges of gids that may be used. If you would like to force a single
        * gid then supply a single range with the same start and end. Required for MustRunAs.
        */
      var ranges: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[IDRange]]] = js.undefined
      /**
        * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
        */
      var rule: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * RunAsUserStrategyOptions defines the strategy type and any options used to create the
      * strategy.
      */
    trait RunAsUserStrategyOptions extends js.Object {
      /**
        * ranges are the allowed ranges of uids that may be used. If you would like to force a single
        * uid then supply a single range with the same start and end. Required for MustRunAs.
        */
      var ranges: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[IDRange]]] = js.undefined
      /**
        * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
        */
      var rule: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
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
      * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the
      * strategy.
      */
    trait SupplementalGroupsStrategyOptions extends js.Object {
      /**
        * ranges are the allowed ranges of supplemental groups.  If you would like to force a single
        * supplemental group then supply a single range with the same start and end. Required for
        * MustRunAs.
        */
      var ranges: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[IDRange]]] = js.undefined
      /**
        * rule is the strategy that will dictate what supplemental groups is used in the
        * SecurityContext.
        */
      var rule: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isEviction(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.Eviction */ scala.Boolean = js.native
    def isPodDisruptionBudget(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.PodDisruptionBudget */ scala.Boolean = js.native
    def isPodDisruptionBudgetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.PodDisruptionBudgetList */ scala.Boolean = js.native
    def isPodSecurityPolicy(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.PodSecurityPolicy */ scala.Boolean = js.native
    def isPodSecurityPolicyList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.PodSecurityPolicyList */ scala.Boolean = js.native
  }
  
}

