package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
  var allowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes.
    */
  var allowedCSIDrivers: js.UndefOr[Input[js.Array[Input[AllowedCSIDriver]]]] = js.undefined
  
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  var allowedCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
    */
  var allowedFlexVolumes: js.UndefOr[Input[js.Array[Input[AllowedFlexVolume]]]] = js.undefined
  
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
    */
  var allowedHostPaths: js.UndefOr[Input[js.Array[Input[AllowedHostPath]]]] = js.undefined
  
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
    */
  var allowedProcMountTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
    */
  var allowedUnsafeSysctls: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  var defaultAddCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
    */
  var defaultAllowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
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
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
    */
  var readOnlyRootFilesystem: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
    */
  var requiredDropCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
    */
  var runAsGroup: js.UndefOr[Input[RunAsGroupStrategyOptions]] = js.undefined
  
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var runAsUser: Input[RunAsUserStrategyOptions]
  
  /**
    * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
    */
  var runtimeClass: js.UndefOr[Input[RuntimeClassStrategyOptions]] = js.undefined
  
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  var seLinux: Input[SELinuxStrategyOptions]
  
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
    */
  var supplementalGroups: Input[SupplementalGroupsStrategyOptions]
  
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
    */
  var volumes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
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
  implicit class PodSecurityPolicySpecMutableBuilder[Self <: PodSecurityPolicySpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPrivilegeEscalation(value: Input[Boolean]): Self = StObject.set(x, "allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPrivilegeEscalationUndefined: Self = StObject.set(x, "allowPrivilegeEscalation", js.undefined)
    
    @scala.inline
    def setAllowedCSIDrivers(value: Input[js.Array[Input[AllowedCSIDriver]]]): Self = StObject.set(x, "allowedCSIDrivers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCSIDriversUndefined: Self = StObject.set(x, "allowedCSIDrivers", js.undefined)
    
    @scala.inline
    def setAllowedCSIDriversVarargs(value: Input[AllowedCSIDriver]*): Self = StObject.set(x, "allowedCSIDrivers", js.Array(value :_*))
    
    @scala.inline
    def setAllowedCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCapabilitiesUndefined: Self = StObject.set(x, "allowedCapabilities", js.undefined)
    
    @scala.inline
    def setAllowedCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setAllowedFlexVolumes(value: Input[js.Array[Input[AllowedFlexVolume]]]): Self = StObject.set(x, "allowedFlexVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedFlexVolumesUndefined: Self = StObject.set(x, "allowedFlexVolumes", js.undefined)
    
    @scala.inline
    def setAllowedFlexVolumesVarargs(value: Input[AllowedFlexVolume]*): Self = StObject.set(x, "allowedFlexVolumes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHostPaths(value: Input[js.Array[Input[AllowedHostPath]]]): Self = StObject.set(x, "allowedHostPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHostPathsUndefined: Self = StObject.set(x, "allowedHostPaths", js.undefined)
    
    @scala.inline
    def setAllowedHostPathsVarargs(value: Input[AllowedHostPath]*): Self = StObject.set(x, "allowedHostPaths", js.Array(value :_*))
    
    @scala.inline
    def setAllowedProcMountTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedProcMountTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedProcMountTypesUndefined: Self = StObject.set(x, "allowedProcMountTypes", js.undefined)
    
    @scala.inline
    def setAllowedProcMountTypesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedProcMountTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedUnsafeSysctls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedUnsafeSysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUnsafeSysctlsUndefined: Self = StObject.set(x, "allowedUnsafeSysctls", js.undefined)
    
    @scala.inline
    def setAllowedUnsafeSysctlsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedUnsafeSysctls", js.Array(value :_*))
    
    @scala.inline
    def setDefaultAddCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "defaultAddCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAddCapabilitiesUndefined: Self = StObject.set(x, "defaultAddCapabilities", js.undefined)
    
    @scala.inline
    def setDefaultAddCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "defaultAddCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setDefaultAllowPrivilegeEscalation(value: Input[Boolean]): Self = StObject.set(x, "defaultAllowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAllowPrivilegeEscalationUndefined: Self = StObject.set(x, "defaultAllowPrivilegeEscalation", js.undefined)
    
    @scala.inline
    def setForbiddenSysctls(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "forbiddenSysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForbiddenSysctlsUndefined: Self = StObject.set(x, "forbiddenSysctls", js.undefined)
    
    @scala.inline
    def setForbiddenSysctlsVarargs(value: Input[String]*): Self = StObject.set(x, "forbiddenSysctls", js.Array(value :_*))
    
    @scala.inline
    def setFsGroup(value: Input[FSGroupStrategyOptions]): Self = StObject.set(x, "fsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIPC(value: Input[Boolean]): Self = StObject.set(x, "hostIPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIPCUndefined: Self = StObject.set(x, "hostIPC", js.undefined)
    
    @scala.inline
    def setHostNetwork(value: Input[Boolean]): Self = StObject.set(x, "hostNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNetworkUndefined: Self = StObject.set(x, "hostNetwork", js.undefined)
    
    @scala.inline
    def setHostPID(value: Input[Boolean]): Self = StObject.set(x, "hostPID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPIDUndefined: Self = StObject.set(x, "hostPID", js.undefined)
    
    @scala.inline
    def setHostPorts(value: Input[js.Array[Input[HostPortRange]]]): Self = StObject.set(x, "hostPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPortsUndefined: Self = StObject.set(x, "hostPorts", js.undefined)
    
    @scala.inline
    def setHostPortsVarargs(value: Input[HostPortRange]*): Self = StObject.set(x, "hostPorts", js.Array(value :_*))
    
    @scala.inline
    def setPrivileged(value: Input[Boolean]): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    @scala.inline
    def setReadOnlyRootFilesystem(value: Input[Boolean]): Self = StObject.set(x, "readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyRootFilesystemUndefined: Self = StObject.set(x, "readOnlyRootFilesystem", js.undefined)
    
    @scala.inline
    def setRequiredDropCapabilities(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "requiredDropCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredDropCapabilitiesUndefined: Self = StObject.set(x, "requiredDropCapabilities", js.undefined)
    
    @scala.inline
    def setRequiredDropCapabilitiesVarargs(value: Input[String]*): Self = StObject.set(x, "requiredDropCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setRunAsGroup(value: Input[RunAsGroupStrategyOptions]): Self = StObject.set(x, "runAsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsGroupUndefined: Self = StObject.set(x, "runAsGroup", js.undefined)
    
    @scala.inline
    def setRunAsUser(value: Input[RunAsUserStrategyOptions]): Self = StObject.set(x, "runAsUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeClass(value: Input[RuntimeClassStrategyOptions]): Self = StObject.set(x, "runtimeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeClassUndefined: Self = StObject.set(x, "runtimeClass", js.undefined)
    
    @scala.inline
    def setSeLinux(value: Input[SELinuxStrategyOptions]): Self = StObject.set(x, "seLinux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalGroups(value: Input[SupplementalGroupsStrategyOptions]): Self = StObject.set(x, "supplementalGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Input[String]*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}
