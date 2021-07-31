package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodSecurityPolicySpec defines the policy enforced. Deprecated: use PodSecurityPolicySpec from policy API Group instead.
  */
trait PodSecurityPolicySpec extends StObject {
  
  /**
    * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
    */
  var allowPrivilegeEscalation: Boolean
  
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes.
    */
  var allowedCSIDrivers: js.Array[AllowedCSIDriver]
  
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  var allowedCapabilities: js.Array[String]
  
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
    */
  var allowedFlexVolumes: js.Array[AllowedFlexVolume]
  
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
    */
  var allowedHostPaths: js.Array[AllowedHostPath]
  
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
    */
  var allowedProcMountTypes: js.Array[String]
  
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
    */
  var allowedUnsafeSysctls: js.Array[String]
  
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  var defaultAddCapabilities: js.Array[String]
  
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
    */
  var defaultAllowPrivilegeEscalation: Boolean
  
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
    */
  var forbiddenSysctls: js.Array[String]
  
  /**
    * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
    */
  var fsGroup: FSGroupStrategyOptions
  
  /**
    * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
    */
  var hostIPC: Boolean
  
  /**
    * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    */
  var hostNetwork: Boolean
  
  /**
    * hostPID determines if the policy allows the use of HostPID in the pod spec.
    */
  var hostPID: Boolean
  
  /**
    * hostPorts determines which host port ranges are allowed to be exposed.
    */
  var hostPorts: js.Array[HostPortRange]
  
  /**
    * privileged determines if a pod can request to be run as privileged.
    */
  var privileged: Boolean
  
  /**
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
    */
  var readOnlyRootFilesystem: Boolean
  
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
    */
  var requiredDropCapabilities: js.Array[String]
  
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
    */
  var runAsGroup: RunAsGroupStrategyOptions
  
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var runAsUser: RunAsUserStrategyOptions
  
  /**
    * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
    */
  var runtimeClass: RuntimeClassStrategyOptions
  
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  var seLinux: SELinuxStrategyOptions
  
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
    */
  var supplementalGroups: SupplementalGroupsStrategyOptions
  
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
    */
  var volumes: js.Array[String]
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
  implicit class PodSecurityPolicySpecMutableBuilder[Self <: PodSecurityPolicySpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPrivilegeEscalation(value: Boolean): Self = StObject.set(x, "allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCSIDrivers(value: js.Array[AllowedCSIDriver]): Self = StObject.set(x, "allowedCSIDrivers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCSIDriversVarargs(value: AllowedCSIDriver*): Self = StObject.set(x, "allowedCSIDrivers", js.Array(value :_*))
    
    @scala.inline
    def setAllowedCapabilities(value: js.Array[String]): Self = StObject.set(x, "allowedCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCapabilitiesVarargs(value: String*): Self = StObject.set(x, "allowedCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setAllowedFlexVolumes(value: js.Array[AllowedFlexVolume]): Self = StObject.set(x, "allowedFlexVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedFlexVolumesVarargs(value: AllowedFlexVolume*): Self = StObject.set(x, "allowedFlexVolumes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHostPaths(value: js.Array[AllowedHostPath]): Self = StObject.set(x, "allowedHostPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHostPathsVarargs(value: AllowedHostPath*): Self = StObject.set(x, "allowedHostPaths", js.Array(value :_*))
    
    @scala.inline
    def setAllowedProcMountTypes(value: js.Array[String]): Self = StObject.set(x, "allowedProcMountTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedProcMountTypesVarargs(value: String*): Self = StObject.set(x, "allowedProcMountTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedUnsafeSysctls(value: js.Array[String]): Self = StObject.set(x, "allowedUnsafeSysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUnsafeSysctlsVarargs(value: String*): Self = StObject.set(x, "allowedUnsafeSysctls", js.Array(value :_*))
    
    @scala.inline
    def setDefaultAddCapabilities(value: js.Array[String]): Self = StObject.set(x, "defaultAddCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAddCapabilitiesVarargs(value: String*): Self = StObject.set(x, "defaultAddCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setDefaultAllowPrivilegeEscalation(value: Boolean): Self = StObject.set(x, "defaultAllowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenSysctls(value: js.Array[String]): Self = StObject.set(x, "forbiddenSysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenSysctlsVarargs(value: String*): Self = StObject.set(x, "forbiddenSysctls", js.Array(value :_*))
    
    @scala.inline
    def setFsGroup(value: FSGroupStrategyOptions): Self = StObject.set(x, "fsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIPC(value: Boolean): Self = StObject.set(x, "hostIPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNetwork(value: Boolean): Self = StObject.set(x, "hostNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPID(value: Boolean): Self = StObject.set(x, "hostPID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPorts(value: js.Array[HostPortRange]): Self = StObject.set(x, "hostPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPortsVarargs(value: HostPortRange*): Self = StObject.set(x, "hostPorts", js.Array(value :_*))
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyRootFilesystem(value: Boolean): Self = StObject.set(x, "readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredDropCapabilities(value: js.Array[String]): Self = StObject.set(x, "requiredDropCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredDropCapabilitiesVarargs(value: String*): Self = StObject.set(x, "requiredDropCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setRunAsGroup(value: RunAsGroupStrategyOptions): Self = StObject.set(x, "runAsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsUser(value: RunAsUserStrategyOptions): Self = StObject.set(x, "runAsUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeClass(value: RuntimeClassStrategyOptions): Self = StObject.set(x, "runtimeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeLinux(value: SELinuxStrategyOptions): Self = StObject.set(x, "seLinux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalGroups(value: SupplementalGroupsStrategyOptions): Self = StObject.set(x, "supplementalGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumes(value: js.Array[String]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesVarargs(value: String*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}
