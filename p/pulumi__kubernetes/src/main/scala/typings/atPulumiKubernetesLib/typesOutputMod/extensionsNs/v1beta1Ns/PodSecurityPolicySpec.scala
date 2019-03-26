package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodSecurityPolicySpec defines the policy enforced. Deprecated: use PodSecurityPolicySpec from
  * policy API Group instead.
  */
trait PodSecurityPolicySpec extends js.Object {
  /**
    * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If
    * unspecified, defaults to true.
    */
  val allowPrivilegeEscalation: scala.Boolean
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be
    * embedded within a pod spec. An empty value means no CSI drivers can run inline within a pod
    * spec.
    */
  val allowedCSIDrivers: js.Array[AllowedCSIDriver]
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the
    * container. Capabilities in this field may be added at the pod author's discretion. You must
    * not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  val allowedCapabilities: js.Array[java.lang.String]
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
    * Flexvolumes may be used.  This parameter is effective only when the usage of the
    * Flexvolumes is allowed in the "volumes" field.
    */
  val allowedFlexVolumes: js.Array[AllowedFlexVolume]
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths
    * may be used.
    */
  val allowedHostPaths: js.Array[AllowedHostPath]
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that
    * only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to
    * be enabled.
    */
  val allowedProcMountTypes: js.Array[java.lang.String]
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each
    * entry is either a plain sysctl name or ends in "*" in which case it is considered as a
    * prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to
    * whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar",
    * "foo.baz", etc.
    */
  val allowedUnsafeSysctls: js.Array[java.lang.String]
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the
    * container unless the pod spec specifically drops the capability.  You may not list a
    * capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added
    * here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  val defaultAddCapabilities: js.Array[java.lang.String]
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain
    * more privileges than its parent process.
    */
  val defaultAllowPrivilegeEscalation: scala.Boolean
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is
    * either a plain sysctl name or ends in "*" in which case it is considered as a prefix of
    * forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar",
    * "foo.baz", etc.
    */
  val forbiddenSysctls: js.Array[java.lang.String]
  /**
    * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
    */
  val fsGroup: FSGroupStrategyOptions
  /**
    * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
    */
  val hostIPC: scala.Boolean
  /**
    * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    */
  val hostNetwork: scala.Boolean
  /**
    * hostPID determines if the policy allows the use of HostPID in the pod spec.
    */
  val hostPID: scala.Boolean
  /**
    * hostPorts determines which host port ranges are allowed to be exposed.
    */
  val hostPorts: js.Array[HostPortRange]
  /**
    * privileged determines if a pod can request to be run as privileged.
    */
  val privileged: scala.Boolean
  /**
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root
    * file system.  If the container specifically requests to run with a non-read only root file
    * system the PSP should deny the pod. If set to false the container may run with a read only
    * root file system if it wishes but it will not be forced to.
    */
  val readOnlyRootFilesystem: scala.Boolean
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.
    * These are required to be dropped and cannot be added.
    */
  val requiredDropCapabilities: js.Array[java.lang.String]
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be
    * set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires
    * the RunAsGroup feature gate to be enabled.
    */
  val runAsGroup: RunAsGroupStrategyOptions
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  val runAsUser: RunAsUserStrategyOptions
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  val seLinux: SELinuxStrategyOptions
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by
    * the SecurityContext.
    */
  val supplementalGroups: SupplementalGroupsStrategyOptions
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be
    * used. To allow all volumes you may use '*'.
    */
  val volumes: js.Array[java.lang.String]
}

object PodSecurityPolicySpec {
  @scala.inline
  def apply(
    allowPrivilegeEscalation: scala.Boolean,
    allowedCSIDrivers: js.Array[AllowedCSIDriver],
    allowedCapabilities: js.Array[java.lang.String],
    allowedFlexVolumes: js.Array[AllowedFlexVolume],
    allowedHostPaths: js.Array[AllowedHostPath],
    allowedProcMountTypes: js.Array[java.lang.String],
    allowedUnsafeSysctls: js.Array[java.lang.String],
    defaultAddCapabilities: js.Array[java.lang.String],
    defaultAllowPrivilegeEscalation: scala.Boolean,
    forbiddenSysctls: js.Array[java.lang.String],
    fsGroup: FSGroupStrategyOptions,
    hostIPC: scala.Boolean,
    hostNetwork: scala.Boolean,
    hostPID: scala.Boolean,
    hostPorts: js.Array[HostPortRange],
    privileged: scala.Boolean,
    readOnlyRootFilesystem: scala.Boolean,
    requiredDropCapabilities: js.Array[java.lang.String],
    runAsGroup: RunAsGroupStrategyOptions,
    runAsUser: RunAsUserStrategyOptions,
    seLinux: SELinuxStrategyOptions,
    supplementalGroups: SupplementalGroupsStrategyOptions,
    volumes: js.Array[java.lang.String]
  ): PodSecurityPolicySpec = {
    val __obj = js.Dynamic.literal(allowPrivilegeEscalation = allowPrivilegeEscalation, allowedCSIDrivers = allowedCSIDrivers, allowedCapabilities = allowedCapabilities, allowedFlexVolumes = allowedFlexVolumes, allowedHostPaths = allowedHostPaths, allowedProcMountTypes = allowedProcMountTypes, allowedUnsafeSysctls = allowedUnsafeSysctls, defaultAddCapabilities = defaultAddCapabilities, defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation, forbiddenSysctls = forbiddenSysctls, fsGroup = fsGroup, hostIPC = hostIPC, hostNetwork = hostNetwork, hostPID = hostPID, hostPorts = hostPorts, privileged = privileged, readOnlyRootFilesystem = readOnlyRootFilesystem, requiredDropCapabilities = requiredDropCapabilities, runAsGroup = runAsGroup, runAsUser = runAsUser, seLinux = seLinux, supplementalGroups = supplementalGroups, volumes = volumes)
  
    __obj.asInstanceOf[PodSecurityPolicySpec]
  }
}

