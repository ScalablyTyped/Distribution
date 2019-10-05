package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecurityContext holds security configuration that will be applied to a container. Some fields
  * are present in both SecurityContext and PodSecurityContext.  When both are set, the values in
  * SecurityContext take precedence.
  */
trait SecurityContext extends js.Object {
  /**
    * AllowPrivilegeEscalation controls whether a process can gain more privileges than its
    * parent process. This bool directly controls if the no_new_privs flag will be set on the
    * container process. AllowPrivilegeEscalation is true always when the container is: 1) run as
    * Privileged 2) has CAP_SYS_ADMIN
    */
  var allowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The capabilities to add/drop when running containers. Defaults to the default set of
    * capabilities granted by the container runtime.
    */
  var capabilities: js.UndefOr[Input[Capabilities]] = js.undefined
  /**
    * Run container in privileged mode. Processes in privileged containers are essentially
    * equivalent to root on the host. Defaults to false.
    */
  var privileged: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * procMount denotes the type of proc mount to use for the containers. The default is
    * DefaultProcMount which uses the container runtime defaults for readonly paths and masked
    * paths. This requires the ProcMountType feature flag to be enabled.
    */
  var procMount: js.UndefOr[Input[String]] = js.undefined
  /**
    * Whether this container has a read-only root filesystem. Default is false.
    */
  var readOnlyRootFilesystem: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The GID to run the entrypoint of the container process. Uses runtime default if unset. May
    * also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext,
    * the value specified in SecurityContext takes precedence.
    */
  var runAsGroup: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Indicates that the container must run as a non-root user. If true, the Kubelet will
    * validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to
    * start the container if it does. If unset or false, no such validation will be performed.
    * May also be set in PodSecurityContext.  If set in both SecurityContext and
    * PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsNonRoot: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The UID to run the entrypoint of the container process. Defaults to user specified in image
    * metadata if unspecified. May also be set in PodSecurityContext.  If set in both
    * SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
    * precedence.
    */
  var runAsUser: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The SELinux context to be applied to the container. If unspecified, the container runtime
    * will allocate a random SELinux context for each container.  May also be set in
    * PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value
    * specified in SecurityContext takes precedence.
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptions]] = js.undefined
  /**
    * The Windows specific settings applied to all containers. If unspecified, the options from
    * the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext,
    * the value specified in SecurityContext takes precedence.
    */
  var windowsOptions: js.UndefOr[Input[WindowsSecurityContextOptions]] = js.undefined
}

object SecurityContext {
  @scala.inline
  def apply(
    allowPrivilegeEscalation: Input[Boolean] = null,
    capabilities: Input[Capabilities] = null,
    privileged: Input[Boolean] = null,
    procMount: Input[String] = null,
    readOnlyRootFilesystem: Input[Boolean] = null,
    runAsGroup: Input[Double] = null,
    runAsNonRoot: Input[Boolean] = null,
    runAsUser: Input[Double] = null,
    seLinuxOptions: Input[SELinuxOptions] = null,
    windowsOptions: Input[WindowsSecurityContextOptions] = null
  ): SecurityContext = {
    val __obj = js.Dynamic.literal()
    if (allowPrivilegeEscalation != null) __obj.updateDynamic("allowPrivilegeEscalation")(allowPrivilegeEscalation.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (privileged != null) __obj.updateDynamic("privileged")(privileged.asInstanceOf[js.Any])
    if (procMount != null) __obj.updateDynamic("procMount")(procMount.asInstanceOf[js.Any])
    if (readOnlyRootFilesystem != null) __obj.updateDynamic("readOnlyRootFilesystem")(readOnlyRootFilesystem.asInstanceOf[js.Any])
    if (runAsGroup != null) __obj.updateDynamic("runAsGroup")(runAsGroup.asInstanceOf[js.Any])
    if (runAsNonRoot != null) __obj.updateDynamic("runAsNonRoot")(runAsNonRoot.asInstanceOf[js.Any])
    if (runAsUser != null) __obj.updateDynamic("runAsUser")(runAsUser.asInstanceOf[js.Any])
    if (seLinuxOptions != null) __obj.updateDynamic("seLinuxOptions")(seLinuxOptions.asInstanceOf[js.Any])
    if (windowsOptions != null) __obj.updateDynamic("windowsOptions")(windowsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityContext]
  }
}

