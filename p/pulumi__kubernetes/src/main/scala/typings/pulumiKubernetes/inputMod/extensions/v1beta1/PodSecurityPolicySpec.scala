package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
  var allowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be
    * embedded within a pod spec. An empty value indicates that any CSI driver can be used for
    * inline ephemeral volumes.
    */
  var allowedCSIDrivers: js.UndefOr[Input[js.Array[Input[AllowedCSIDriver]]]] = js.undefined
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the
    * container. Capabilities in this field may be added at the pod author's discretion. You must
    * not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  var allowedCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
    * Flexvolumes may be used.  This parameter is effective only when the usage of the
    * Flexvolumes is allowed in the "volumes" field.
    */
  var allowedFlexVolumes: js.UndefOr[Input[js.Array[Input[AllowedFlexVolume]]]] = js.undefined
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths
    * may be used.
    */
  var allowedHostPaths: js.UndefOr[Input[js.Array[Input[AllowedHostPath]]]] = js.undefined
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that
    * only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to
    * be enabled.
    */
  var allowedProcMountTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each
    * entry is either a plain sysctl name or ends in "*" in which case it is considered as a
    * prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to
    * whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar",
    * "foo.baz", etc.
    */
  var allowedUnsafeSysctls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the
    * container unless the pod spec specifically drops the capability.  You may not list a
    * capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added
    * here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  var defaultAddCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain
    * more privileges than its parent process.
    */
  var defaultAllowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is
    * either a plain sysctl name or ends in "*" in which case it is considered as a prefix of
    * forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar",
    * "foo.baz", etc.
    */
  var forbiddenSysctls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
    */
  var fsGroup: Input[FSGroupStrategyOptions]
  /**
    * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
    */
  var hostIPC: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    */
  var hostNetwork: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * hostPID determines if the policy allows the use of HostPID in the pod spec.
    */
  var hostPID: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * hostPorts determines which host port ranges are allowed to be exposed.
    */
  var hostPorts: js.UndefOr[Input[js.Array[Input[HostPortRange]]]] = js.undefined
  /**
    * privileged determines if a pod can request to be run as privileged.
    */
  var privileged: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root
    * file system.  If the container specifically requests to run with a non-read only root file
    * system the PSP should deny the pod. If set to false the container may run with a read only
    * root file system if it wishes but it will not be forced to.
    */
  var readOnlyRootFilesystem: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.
    * These are required to be dropped and cannot be added.
    */
  var requiredDropCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be
    * set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires
    * the RunAsGroup feature gate to be enabled.
    */
  var runAsGroup: js.UndefOr[Input[RunAsGroupStrategyOptions]] = js.undefined
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var runAsUser: Input[RunAsUserStrategyOptions]
  /**
    * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If
    * this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of
    * this field depends on the RuntimeClass feature gate being enabled.
    */
  var runtimeClass: js.UndefOr[Input[RuntimeClassStrategyOptions]] = js.undefined
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  var seLinux: Input[SELinuxStrategyOptions]
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by
    * the SecurityContext.
    */
  var supplementalGroups: Input[SupplementalGroupsStrategyOptions]
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be
    * used. To allow all volumes you may use '*'.
    */
  var volumes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object PodSecurityPolicySpec {
  @scala.inline
  def apply(
    fsGroup: Input[FSGroupStrategyOptions],
    runAsUser: Input[RunAsUserStrategyOptions],
    seLinux: Input[SELinuxStrategyOptions],
    supplementalGroups: Input[SupplementalGroupsStrategyOptions],
    allowPrivilegeEscalation: Input[Boolean] = null,
    allowedCSIDrivers: Input[js.Array[Input[AllowedCSIDriver]]] = null,
    allowedCapabilities: Input[js.Array[Input[String]]] = null,
    allowedFlexVolumes: Input[js.Array[Input[AllowedFlexVolume]]] = null,
    allowedHostPaths: Input[js.Array[Input[AllowedHostPath]]] = null,
    allowedProcMountTypes: Input[js.Array[Input[String]]] = null,
    allowedUnsafeSysctls: Input[js.Array[Input[String]]] = null,
    defaultAddCapabilities: Input[js.Array[Input[String]]] = null,
    defaultAllowPrivilegeEscalation: Input[Boolean] = null,
    forbiddenSysctls: Input[js.Array[Input[String]]] = null,
    hostIPC: Input[Boolean] = null,
    hostNetwork: Input[Boolean] = null,
    hostPID: Input[Boolean] = null,
    hostPorts: Input[js.Array[Input[HostPortRange]]] = null,
    privileged: Input[Boolean] = null,
    readOnlyRootFilesystem: Input[Boolean] = null,
    requiredDropCapabilities: Input[js.Array[Input[String]]] = null,
    runAsGroup: Input[RunAsGroupStrategyOptions] = null,
    runtimeClass: Input[RuntimeClassStrategyOptions] = null,
    volumes: Input[js.Array[Input[String]]] = null
  ): PodSecurityPolicySpec = {
    val __obj = js.Dynamic.literal(fsGroup = fsGroup.asInstanceOf[js.Any], runAsUser = runAsUser.asInstanceOf[js.Any], seLinux = seLinux.asInstanceOf[js.Any], supplementalGroups = supplementalGroups.asInstanceOf[js.Any])
    if (allowPrivilegeEscalation != null) __obj.updateDynamic("allowPrivilegeEscalation")(allowPrivilegeEscalation.asInstanceOf[js.Any])
    if (allowedCSIDrivers != null) __obj.updateDynamic("allowedCSIDrivers")(allowedCSIDrivers.asInstanceOf[js.Any])
    if (allowedCapabilities != null) __obj.updateDynamic("allowedCapabilities")(allowedCapabilities.asInstanceOf[js.Any])
    if (allowedFlexVolumes != null) __obj.updateDynamic("allowedFlexVolumes")(allowedFlexVolumes.asInstanceOf[js.Any])
    if (allowedHostPaths != null) __obj.updateDynamic("allowedHostPaths")(allowedHostPaths.asInstanceOf[js.Any])
    if (allowedProcMountTypes != null) __obj.updateDynamic("allowedProcMountTypes")(allowedProcMountTypes.asInstanceOf[js.Any])
    if (allowedUnsafeSysctls != null) __obj.updateDynamic("allowedUnsafeSysctls")(allowedUnsafeSysctls.asInstanceOf[js.Any])
    if (defaultAddCapabilities != null) __obj.updateDynamic("defaultAddCapabilities")(defaultAddCapabilities.asInstanceOf[js.Any])
    if (defaultAllowPrivilegeEscalation != null) __obj.updateDynamic("defaultAllowPrivilegeEscalation")(defaultAllowPrivilegeEscalation.asInstanceOf[js.Any])
    if (forbiddenSysctls != null) __obj.updateDynamic("forbiddenSysctls")(forbiddenSysctls.asInstanceOf[js.Any])
    if (hostIPC != null) __obj.updateDynamic("hostIPC")(hostIPC.asInstanceOf[js.Any])
    if (hostNetwork != null) __obj.updateDynamic("hostNetwork")(hostNetwork.asInstanceOf[js.Any])
    if (hostPID != null) __obj.updateDynamic("hostPID")(hostPID.asInstanceOf[js.Any])
    if (hostPorts != null) __obj.updateDynamic("hostPorts")(hostPorts.asInstanceOf[js.Any])
    if (privileged != null) __obj.updateDynamic("privileged")(privileged.asInstanceOf[js.Any])
    if (readOnlyRootFilesystem != null) __obj.updateDynamic("readOnlyRootFilesystem")(readOnlyRootFilesystem.asInstanceOf[js.Any])
    if (requiredDropCapabilities != null) __obj.updateDynamic("requiredDropCapabilities")(requiredDropCapabilities.asInstanceOf[js.Any])
    if (runAsGroup != null) __obj.updateDynamic("runAsGroup")(runAsGroup.asInstanceOf[js.Any])
    if (runtimeClass != null) __obj.updateDynamic("runtimeClass")(runtimeClass.asInstanceOf[js.Any])
    if (volumes != null) __obj.updateDynamic("volumes")(volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSecurityPolicySpec]
  }
}

