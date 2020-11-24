package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
  */
@js.native
trait PodSecurityContext extends js.Object {
  
  /**
    * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
    *
    * 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
    *
    * If unset, the Kubelet will not modify the ownership and permissions of any volume.
    */
  var fsGroup: js.UndefOr[Input[Double]] = js.native
  
  /**
    * fsGroupChangePolicy defines behavior of changing ownership and permission of the volume before being exposed inside Pod. This field will only apply to volume types which support fsGroup based ownership(and permissions). It will have no effect on ephemeral volume types such as: secret, configmaps and emptydir. Valid values are "OnRootMismatch" and "Always". If not specified defaults to "Always".
    */
  var fsGroupChangePolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
    */
  var runAsGroup: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsNonRoot: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
    */
  var runAsUser: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptions]] = js.native
  
  /**
    * The seccomp options to use by the containers in this pod.
    */
  var seccompProfile: js.UndefOr[Input[SeccompProfile]] = js.native
  
  /**
    * A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container.
    */
  var supplementalGroups: js.UndefOr[Input[js.Array[Input[Double]]]] = js.native
  
  /**
    * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch.
    */
  var sysctls: js.UndefOr[Input[js.Array[Input[Sysctl]]]] = js.native
  
  /**
    * The Windows specific settings applied to all containers. If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var windowsOptions: js.UndefOr[Input[WindowsSecurityContextOptions]] = js.native
}
object PodSecurityContext {
  
  @scala.inline
  def apply(): PodSecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodSecurityContext]
  }
  
  @scala.inline
  implicit class PodSecurityContextOps[Self <: PodSecurityContext] (val x: Self) extends AnyVal {
    
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
    def setFsGroup(value: Input[Double]): Self = this.set("fsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsGroup: Self = this.set("fsGroup", js.undefined)
    
    @scala.inline
    def setFsGroupChangePolicy(value: Input[String]): Self = this.set("fsGroupChangePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsGroupChangePolicy: Self = this.set("fsGroupChangePolicy", js.undefined)
    
    @scala.inline
    def setRunAsGroup(value: Input[Double]): Self = this.set("runAsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAsGroup: Self = this.set("runAsGroup", js.undefined)
    
    @scala.inline
    def setRunAsNonRoot(value: Input[Boolean]): Self = this.set("runAsNonRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAsNonRoot: Self = this.set("runAsNonRoot", js.undefined)
    
    @scala.inline
    def setRunAsUser(value: Input[Double]): Self = this.set("runAsUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAsUser: Self = this.set("runAsUser", js.undefined)
    
    @scala.inline
    def setSeLinuxOptions(value: Input[SELinuxOptions]): Self = this.set("seLinuxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeLinuxOptions: Self = this.set("seLinuxOptions", js.undefined)
    
    @scala.inline
    def setSeccompProfile(value: Input[SeccompProfile]): Self = this.set("seccompProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeccompProfile: Self = this.set("seccompProfile", js.undefined)
    
    @scala.inline
    def setSupplementalGroupsVarargs(value: Input[Double]*): Self = this.set("supplementalGroups", js.Array(value :_*))
    
    @scala.inline
    def setSupplementalGroups(value: Input[js.Array[Input[Double]]]): Self = this.set("supplementalGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplementalGroups: Self = this.set("supplementalGroups", js.undefined)
    
    @scala.inline
    def setSysctlsVarargs(value: Input[Sysctl]*): Self = this.set("sysctls", js.Array(value :_*))
    
    @scala.inline
    def setSysctls(value: Input[js.Array[Input[Sysctl]]]): Self = this.set("sysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSysctls: Self = this.set("sysctls", js.undefined)
    
    @scala.inline
    def setWindowsOptions(value: Input[WindowsSecurityContextOptions]): Self = this.set("windowsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsOptions: Self = this.set("windowsOptions", js.undefined)
  }
}
