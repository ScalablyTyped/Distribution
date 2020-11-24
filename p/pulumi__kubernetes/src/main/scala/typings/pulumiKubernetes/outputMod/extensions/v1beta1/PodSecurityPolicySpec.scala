package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodSecurityPolicySpec defines the policy enforced. Deprecated: use PodSecurityPolicySpec from policy API Group instead.
  */
@js.native
trait PodSecurityPolicySpec extends js.Object {
  
  /**
    * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
    */
  var allowPrivilegeEscalation: Boolean = js.native
  
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes.
    */
  var allowedCSIDrivers: js.Array[AllowedCSIDriver] = js.native
  
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  var allowedCapabilities: js.Array[String] = js.native
  
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
    */
  var allowedFlexVolumes: js.Array[AllowedFlexVolume] = js.native
  
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
    */
  var allowedHostPaths: js.Array[AllowedHostPath] = js.native
  
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
    */
  var allowedProcMountTypes: js.Array[String] = js.native
  
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
    */
  var allowedUnsafeSysctls: js.Array[String] = js.native
  
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  var defaultAddCapabilities: js.Array[String] = js.native
  
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
    */
  var defaultAllowPrivilegeEscalation: Boolean = js.native
  
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
    */
  var forbiddenSysctls: js.Array[String] = js.native
  
  /**
    * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
    */
  var fsGroup: FSGroupStrategyOptions = js.native
  
  /**
    * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
    */
  var hostIPC: Boolean = js.native
  
  /**
    * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    */
  var hostNetwork: Boolean = js.native
  
  /**
    * hostPID determines if the policy allows the use of HostPID in the pod spec.
    */
  var hostPID: Boolean = js.native
  
  /**
    * hostPorts determines which host port ranges are allowed to be exposed.
    */
  var hostPorts: js.Array[HostPortRange] = js.native
  
  /**
    * privileged determines if a pod can request to be run as privileged.
    */
  var privileged: Boolean = js.native
  
  /**
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
    */
  var readOnlyRootFilesystem: Boolean = js.native
  
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
    */
  var requiredDropCapabilities: js.Array[String] = js.native
  
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
    */
  var runAsGroup: RunAsGroupStrategyOptions = js.native
  
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var runAsUser: RunAsUserStrategyOptions = js.native
  
  /**
    * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
    */
  var runtimeClass: RuntimeClassStrategyOptions = js.native
  
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  var seLinux: SELinuxStrategyOptions = js.native
  
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
    */
  var supplementalGroups: SupplementalGroupsStrategyOptions = js.native
  
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
    */
  var volumes: js.Array[String] = js.native
}
object PodSecurityPolicySpec {
  
  @scala.inline
  def apply(
    allowPrivilegeEscalation: Boolean,
    allowedCSIDrivers: js.Array[AllowedCSIDriver],
    allowedCapabilities: js.Array[String],
    allowedFlexVolumes: js.Array[AllowedFlexVolume],
    allowedHostPaths: js.Array[AllowedHostPath],
    allowedProcMountTypes: js.Array[String],
    allowedUnsafeSysctls: js.Array[String],
    defaultAddCapabilities: js.Array[String],
    defaultAllowPrivilegeEscalation: Boolean,
    forbiddenSysctls: js.Array[String],
    fsGroup: FSGroupStrategyOptions,
    hostIPC: Boolean,
    hostNetwork: Boolean,
    hostPID: Boolean,
    hostPorts: js.Array[HostPortRange],
    privileged: Boolean,
    readOnlyRootFilesystem: Boolean,
    requiredDropCapabilities: js.Array[String],
    runAsGroup: RunAsGroupStrategyOptions,
    runAsUser: RunAsUserStrategyOptions,
    runtimeClass: RuntimeClassStrategyOptions,
    seLinux: SELinuxStrategyOptions,
    supplementalGroups: SupplementalGroupsStrategyOptions,
    volumes: js.Array[String]
  ): PodSecurityPolicySpec = {
    val __obj = js.Dynamic.literal(allowPrivilegeEscalation = allowPrivilegeEscalation.asInstanceOf[js.Any], allowedCSIDrivers = allowedCSIDrivers.asInstanceOf[js.Any], allowedCapabilities = allowedCapabilities.asInstanceOf[js.Any], allowedFlexVolumes = allowedFlexVolumes.asInstanceOf[js.Any], allowedHostPaths = allowedHostPaths.asInstanceOf[js.Any], allowedProcMountTypes = allowedProcMountTypes.asInstanceOf[js.Any], allowedUnsafeSysctls = allowedUnsafeSysctls.asInstanceOf[js.Any], defaultAddCapabilities = defaultAddCapabilities.asInstanceOf[js.Any], defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation.asInstanceOf[js.Any], forbiddenSysctls = forbiddenSysctls.asInstanceOf[js.Any], fsGroup = fsGroup.asInstanceOf[js.Any], hostIPC = hostIPC.asInstanceOf[js.Any], hostNetwork = hostNetwork.asInstanceOf[js.Any], hostPID = hostPID.asInstanceOf[js.Any], hostPorts = hostPorts.asInstanceOf[js.Any], privileged = privileged.asInstanceOf[js.Any], readOnlyRootFilesystem = readOnlyRootFilesystem.asInstanceOf[js.Any], requiredDropCapabilities = requiredDropCapabilities.asInstanceOf[js.Any], runAsGroup = runAsGroup.asInstanceOf[js.Any], runAsUser = runAsUser.asInstanceOf[js.Any], runtimeClass = runtimeClass.asInstanceOf[js.Any], seLinux = seLinux.asInstanceOf[js.Any], supplementalGroups = supplementalGroups.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
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
    def setAllowPrivilegeEscalation(value: Boolean): Self = this.set("allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCSIDriversVarargs(value: AllowedCSIDriver*): Self = this.set("allowedCSIDrivers", js.Array(value :_*))
    
    @scala.inline
    def setAllowedCSIDrivers(value: js.Array[AllowedCSIDriver]): Self = this.set("allowedCSIDrivers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCapabilitiesVarargs(value: String*): Self = this.set("allowedCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setAllowedCapabilities(value: js.Array[String]): Self = this.set("allowedCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedFlexVolumesVarargs(value: AllowedFlexVolume*): Self = this.set("allowedFlexVolumes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedFlexVolumes(value: js.Array[AllowedFlexVolume]): Self = this.set("allowedFlexVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHostPathsVarargs(value: AllowedHostPath*): Self = this.set("allowedHostPaths", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHostPaths(value: js.Array[AllowedHostPath]): Self = this.set("allowedHostPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedProcMountTypesVarargs(value: String*): Self = this.set("allowedProcMountTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedProcMountTypes(value: js.Array[String]): Self = this.set("allowedProcMountTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUnsafeSysctlsVarargs(value: String*): Self = this.set("allowedUnsafeSysctls", js.Array(value :_*))
    
    @scala.inline
    def setAllowedUnsafeSysctls(value: js.Array[String]): Self = this.set("allowedUnsafeSysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAddCapabilitiesVarargs(value: String*): Self = this.set("defaultAddCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setDefaultAddCapabilities(value: js.Array[String]): Self = this.set("defaultAddCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAllowPrivilegeEscalation(value: Boolean): Self = this.set("defaultAllowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenSysctlsVarargs(value: String*): Self = this.set("forbiddenSysctls", js.Array(value :_*))
    
    @scala.inline
    def setForbiddenSysctls(value: js.Array[String]): Self = this.set("forbiddenSysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsGroup(value: FSGroupStrategyOptions): Self = this.set("fsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIPC(value: Boolean): Self = this.set("hostIPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNetwork(value: Boolean): Self = this.set("hostNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPID(value: Boolean): Self = this.set("hostPID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPortsVarargs(value: HostPortRange*): Self = this.set("hostPorts", js.Array(value :_*))
    
    @scala.inline
    def setHostPorts(value: js.Array[HostPortRange]): Self = this.set("hostPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = this.set("privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyRootFilesystem(value: Boolean): Self = this.set("readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredDropCapabilitiesVarargs(value: String*): Self = this.set("requiredDropCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setRequiredDropCapabilities(value: js.Array[String]): Self = this.set("requiredDropCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsGroup(value: RunAsGroupStrategyOptions): Self = this.set("runAsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsUser(value: RunAsUserStrategyOptions): Self = this.set("runAsUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeClass(value: RuntimeClassStrategyOptions): Self = this.set("runtimeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeLinux(value: SELinuxStrategyOptions): Self = this.set("seLinux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalGroups(value: SupplementalGroupsStrategyOptions): Self = this.set("supplementalGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesVarargs(value: String*): Self = this.set("volumes", js.Array(value :_*))
    
    @scala.inline
    def setVolumes(value: js.Array[String]): Self = this.set("volumes", value.asInstanceOf[js.Any])
  }
}
