package typings.pulumiKubernetes.inputMod.policy.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodSecurityPolicySpec defines the policy enforced.
  */
@js.native
trait PodSecurityPolicySpec extends js.Object {
  /**
    * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
    */
  var allowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only honored if the API server enables the CSIInlineVolume feature gate.
    */
  var allowedCSIDrivers: js.UndefOr[Input[js.Array[Input[AllowedCSIDriver]]]] = js.native
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  var allowedCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
    */
  var allowedFlexVolumes: js.UndefOr[Input[js.Array[Input[AllowedFlexVolume]]]] = js.native
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
    */
  var allowedHostPaths: js.UndefOr[Input[js.Array[Input[AllowedHostPath]]]] = js.native
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
    */
  var allowedProcMountTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
    */
  var allowedUnsafeSysctls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  var defaultAddCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
    */
  var defaultAllowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
    */
  var forbiddenSysctls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
    */
  var fsGroup: Input[FSGroupStrategyOptions] = js.native
  /**
    * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
    */
  var hostIPC: js.UndefOr[Input[Boolean]] = js.native
  /**
    * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    */
  var hostNetwork: js.UndefOr[Input[Boolean]] = js.native
  /**
    * hostPID determines if the policy allows the use of HostPID in the pod spec.
    */
  var hostPID: js.UndefOr[Input[Boolean]] = js.native
  /**
    * hostPorts determines which host port ranges are allowed to be exposed.
    */
  var hostPorts: js.UndefOr[Input[js.Array[Input[HostPortRange]]]] = js.native
  /**
    * privileged determines if a pod can request to be run as privileged.
    */
  var privileged: js.UndefOr[Input[Boolean]] = js.native
  /**
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
    */
  var readOnlyRootFilesystem: js.UndefOr[Input[Boolean]] = js.native
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
    */
  var requiredDropCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
    */
  var runAsGroup: js.UndefOr[Input[RunAsGroupStrategyOptions]] = js.native
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var runAsUser: Input[RunAsUserStrategyOptions] = js.native
  /**
    * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
    */
  var runtimeClass: js.UndefOr[Input[RuntimeClassStrategyOptions]] = js.native
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  var seLinux: Input[SELinuxStrategyOptions] = js.native
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
    */
  var supplementalGroups: Input[SupplementalGroupsStrategyOptions] = js.native
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
    */
  var volumes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object PodSecurityPolicySpec {
  @scala.inline
  def apply(
    fsGroup: Input[FSGroupStrategyOptions],
    runAsUser: Input[RunAsUserStrategyOptions],
    seLinux: Input[SELinuxStrategyOptions],
    supplementalGroups: Input[SupplementalGroupsStrategyOptions]
  ): PodSecurityPolicySpec = {
    val __obj = js.Dynamic.literal(fsGroup = fsGroup.asInstanceOf[js.Any], runAsUser = runAsUser.asInstanceOf[js.Any], seLinux = seLinux.asInstanceOf[js.Any], supplementalGroups = supplementalGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSecurityPolicySpec]
  }
  @scala.inline
  implicit class PodSecurityPolicySpecOps[Self <: PodSecurityPolicySpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFsGroup(value: Input[FSGroupStrategyOptions]): Self = this.set("fsGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunAsUser(value: Input[RunAsUserStrategyOptions]): Self = this.set("runAsUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeLinux(value: Input[SELinuxStrategyOptions]): Self = this.set("seLinux", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupplementalGroups(value: Input[SupplementalGroupsStrategyOptions]): Self = this.set("supplementalGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowPrivilegeEscalation(value: Input[Boolean]): Self = this.set("allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPrivilegeEscalation: Self = this.set("allowPrivilegeEscalation", js.undefined)
    @scala.inline
    def setAllowedCSIDriversVarargs(value: Input[AllowedCSIDriver]*): Self = this.set("allowedCSIDrivers", js.Array(value :_*))
    @scala.inline
    def setAllowedCSIDrivers(value: Input[js.Array[Input[AllowedCSIDriver]]]): Self = this.set("allowedCSIDrivers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedCSIDrivers: Self = this.set("allowedCSIDrivers", js.undefined)
    @scala.inline
    def setAllowedCapabilitiesVarargs(value: Input[String]*): Self = this.set("allowedCapabilities", js.Array(value :_*))
    @scala.inline
    def setAllowedCapabilities(value: Input[js.Array[Input[String]]]): Self = this.set("allowedCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedCapabilities: Self = this.set("allowedCapabilities", js.undefined)
    @scala.inline
    def setAllowedFlexVolumesVarargs(value: Input[AllowedFlexVolume]*): Self = this.set("allowedFlexVolumes", js.Array(value :_*))
    @scala.inline
    def setAllowedFlexVolumes(value: Input[js.Array[Input[AllowedFlexVolume]]]): Self = this.set("allowedFlexVolumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedFlexVolumes: Self = this.set("allowedFlexVolumes", js.undefined)
    @scala.inline
    def setAllowedHostPathsVarargs(value: Input[AllowedHostPath]*): Self = this.set("allowedHostPaths", js.Array(value :_*))
    @scala.inline
    def setAllowedHostPaths(value: Input[js.Array[Input[AllowedHostPath]]]): Self = this.set("allowedHostPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedHostPaths: Self = this.set("allowedHostPaths", js.undefined)
    @scala.inline
    def setAllowedProcMountTypesVarargs(value: Input[String]*): Self = this.set("allowedProcMountTypes", js.Array(value :_*))
    @scala.inline
    def setAllowedProcMountTypes(value: Input[js.Array[Input[String]]]): Self = this.set("allowedProcMountTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedProcMountTypes: Self = this.set("allowedProcMountTypes", js.undefined)
    @scala.inline
    def setAllowedUnsafeSysctlsVarargs(value: Input[String]*): Self = this.set("allowedUnsafeSysctls", js.Array(value :_*))
    @scala.inline
    def setAllowedUnsafeSysctls(value: Input[js.Array[Input[String]]]): Self = this.set("allowedUnsafeSysctls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedUnsafeSysctls: Self = this.set("allowedUnsafeSysctls", js.undefined)
    @scala.inline
    def setDefaultAddCapabilitiesVarargs(value: Input[String]*): Self = this.set("defaultAddCapabilities", js.Array(value :_*))
    @scala.inline
    def setDefaultAddCapabilities(value: Input[js.Array[Input[String]]]): Self = this.set("defaultAddCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAddCapabilities: Self = this.set("defaultAddCapabilities", js.undefined)
    @scala.inline
    def setDefaultAllowPrivilegeEscalation(value: Input[Boolean]): Self = this.set("defaultAllowPrivilegeEscalation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAllowPrivilegeEscalation: Self = this.set("defaultAllowPrivilegeEscalation", js.undefined)
    @scala.inline
    def setForbiddenSysctlsVarargs(value: Input[String]*): Self = this.set("forbiddenSysctls", js.Array(value :_*))
    @scala.inline
    def setForbiddenSysctls(value: Input[js.Array[Input[String]]]): Self = this.set("forbiddenSysctls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForbiddenSysctls: Self = this.set("forbiddenSysctls", js.undefined)
    @scala.inline
    def setHostIPC(value: Input[Boolean]): Self = this.set("hostIPC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostIPC: Self = this.set("hostIPC", js.undefined)
    @scala.inline
    def setHostNetwork(value: Input[Boolean]): Self = this.set("hostNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostNetwork: Self = this.set("hostNetwork", js.undefined)
    @scala.inline
    def setHostPID(value: Input[Boolean]): Self = this.set("hostPID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostPID: Self = this.set("hostPID", js.undefined)
    @scala.inline
    def setHostPortsVarargs(value: Input[HostPortRange]*): Self = this.set("hostPorts", js.Array(value :_*))
    @scala.inline
    def setHostPorts(value: Input[js.Array[Input[HostPortRange]]]): Self = this.set("hostPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostPorts: Self = this.set("hostPorts", js.undefined)
    @scala.inline
    def setPrivileged(value: Input[Boolean]): Self = this.set("privileged", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivileged: Self = this.set("privileged", js.undefined)
    @scala.inline
    def setReadOnlyRootFilesystem(value: Input[Boolean]): Self = this.set("readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnlyRootFilesystem: Self = this.set("readOnlyRootFilesystem", js.undefined)
    @scala.inline
    def setRequiredDropCapabilitiesVarargs(value: Input[String]*): Self = this.set("requiredDropCapabilities", js.Array(value :_*))
    @scala.inline
    def setRequiredDropCapabilities(value: Input[js.Array[Input[String]]]): Self = this.set("requiredDropCapabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredDropCapabilities: Self = this.set("requiredDropCapabilities", js.undefined)
    @scala.inline
    def setRunAsGroup(value: Input[RunAsGroupStrategyOptions]): Self = this.set("runAsGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunAsGroup: Self = this.set("runAsGroup", js.undefined)
    @scala.inline
    def setRuntimeClass(value: Input[RuntimeClassStrategyOptions]): Self = this.set("runtimeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeClass: Self = this.set("runtimeClass", js.undefined)
    @scala.inline
    def setVolumesVarargs(value: Input[String]*): Self = this.set("volumes", js.Array(value :_*))
    @scala.inline
    def setVolumes(value: Input[js.Array[Input[String]]]): Self = this.set("volumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
  }
  
}

