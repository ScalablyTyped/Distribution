package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single application container that you want to run within a pod.
  */
trait Container extends js.Object {
  /**
    * Arguments to the entrypoint. The docker image's CMD is used if this is not provided.
    * Variable references $(VAR_NAME) are expanded using the container's environment. If a
    * variable cannot be resolved, the reference in the input string will be unchanged. The
    * $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references
    * will never be expanded, regardless of whether the variable exists or not. Cannot be
    * updated. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if
    * this is not provided. Variable references $(VAR_NAME) are expanded using the container's
    * environment. If a variable cannot be resolved, the reference in the input string will be
    * unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
    * Escaped references will never be expanded, regardless of whether the variable exists or
    * not. Cannot be updated. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var command: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * List of environment variables to set in the container. Cannot be updated.
    */
  var env: js.UndefOr[Input[js.Array[Input[EnvVar]]]] = js.undefined
  /**
    * List of sources to populate environment variables in the container. The keys defined within
    * a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the
    * container is starting. When a key exists in multiple sources, the value associated with the
    * last source will take precedence. Values defined by an Env with a duplicate key will take
    * precedence. Cannot be updated.
    */
  var envFrom: js.UndefOr[Input[js.Array[Input[EnvFromSource]]]] = js.undefined
  /**
    * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This
    * field is optional to allow higher level config management to default or override container
    * images in workload controllers like Deployments and StatefulSets.
    */
  var image: js.UndefOr[Input[String]] = js.undefined
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is
    * specified, or IfNotPresent otherwise. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * Actions that the management system should take in response to container lifecycle events.
    * Cannot be updated.
    */
  var lifecycle: js.UndefOr[Input[Lifecycle]] = js.undefined
  /**
    * Periodic probe of container liveness. Container will be restarted if the probe fails.
    * Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var livenessProbe: js.UndefOr[Input[Probe]] = js.undefined
  /**
    * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique
    * name (DNS_LABEL). Cannot be updated.
    */
  var name: Input[String]
  /**
    * List of ports to expose from the container. Exposing a port here gives the system
    * additional information about the network connections a container uses, but is primarily
    * informational. Not specifying a port here DOES NOT prevent that port from being exposed.
    * Any port which is listening on the default "0.0.0.0" address inside a container will be
    * accessible from the network. Cannot be updated.
    */
  var ports: js.UndefOr[Input[js.Array[Input[ContainerPort]]]] = js.undefined
  /**
    * Periodic probe of container service readiness. Container will be removed from service
    * endpoints if the probe fails. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var readinessProbe: js.UndefOr[Input[Probe]] = js.undefined
  /**
    * Compute Resources required by this container. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.undefined
  /**
    * Security options the pod should run with. More info:
    * https://kubernetes.io/docs/concepts/policy/security-context/ More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var securityContext: js.UndefOr[Input[SecurityContext]] = js.undefined
  /**
    * StartupProbe indicates that the Pod has successfully initialized. If specified, no other
    * probes are executed until this completes successfully. If this probe fails, the Pod will be
    * restarted, just as if the livenessProbe failed. This can be used to provide different probe
    * parameters at the beginning of a Pod's lifecycle, when it might take a long time to load
    * data or warm a cache, than during steady-state operation. This cannot be updated. This is
    * an alpha feature enabled by the StartupProbe feature flag. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var startupProbe: js.UndefOr[Input[Probe]] = js.undefined
  /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this
    * is not set, reads from stdin in the container will always result in EOF. Default is false.
    */
  var stdin: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Whether the container runtime should close the stdin channel after it has been opened by a
    * single attach. When stdin is true the stdin stream will remain open across multiple attach
    * sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until
    * the first client attaches to stdin, and then remains open and accepts data until the client
    * disconnects, at which time stdin is closed and remains closed until the container is
    * restarted. If this flag is false, a container processes that reads from stdin will never
    * receive an EOF. Default is false
    */
  var stdinOnce: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Optional: Path at which the file to which the container's termination message will be
    * written is mounted into the container's filesystem. Message written is intended to be brief
    * final status, such as an assertion failure message. Will be truncated by the node if
    * greater than 4096 bytes. The total message length across all containers will be limited to
    * 12kb. Defaults to /dev/termination-log. Cannot be updated.
    */
  var terminationMessagePath: js.UndefOr[Input[String]] = js.undefined
  /**
    * Indicate how the termination message should be populated. File will use the contents of
    * terminationMessagePath to populate the container status message on both success and
    * failure. FallbackToLogsOnError will use the last chunk of container log output if the
    * termination message file is empty and the container exited with an error. The log output is
    * limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be
    * updated.
    */
  var terminationMessagePolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true.
    * Default is false.
    */
  var tty: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * volumeDevices is the list of block devices to be used by the container. This is a beta
    * feature.
    */
  var volumeDevices: js.UndefOr[Input[js.Array[Input[VolumeDevice]]]] = js.undefined
  /**
    * Pod volumes to mount into the container's filesystem. Cannot be updated.
    */
  var volumeMounts: js.UndefOr[Input[js.Array[Input[VolumeMount]]]] = js.undefined
  /**
    * Container's working directory. If not specified, the container runtime's default will be
    * used, which might be configured in the container image. Cannot be updated.
    */
  var workingDir: js.UndefOr[Input[String]] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    name: Input[String],
    args: Input[js.Array[Input[String]]] = null,
    command: Input[js.Array[Input[String]]] = null,
    env: Input[js.Array[Input[EnvVar]]] = null,
    envFrom: Input[js.Array[Input[EnvFromSource]]] = null,
    image: Input[String] = null,
    imagePullPolicy: Input[String] = null,
    lifecycle: Input[Lifecycle] = null,
    livenessProbe: Input[Probe] = null,
    ports: Input[js.Array[Input[ContainerPort]]] = null,
    readinessProbe: Input[Probe] = null,
    resources: Input[ResourceRequirements] = null,
    securityContext: Input[SecurityContext] = null,
    startupProbe: Input[Probe] = null,
    stdin: Input[Boolean] = null,
    stdinOnce: Input[Boolean] = null,
    terminationMessagePath: Input[String] = null,
    terminationMessagePolicy: Input[String] = null,
    tty: Input[Boolean] = null,
    volumeDevices: Input[js.Array[Input[VolumeDevice]]] = null,
    volumeMounts: Input[js.Array[Input[VolumeMount]]] = null,
    workingDir: Input[String] = null
  ): Container = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (envFrom != null) __obj.updateDynamic("envFrom")(envFrom.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imagePullPolicy != null) __obj.updateDynamic("imagePullPolicy")(imagePullPolicy.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle.asInstanceOf[js.Any])
    if (livenessProbe != null) __obj.updateDynamic("livenessProbe")(livenessProbe.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (readinessProbe != null) __obj.updateDynamic("readinessProbe")(readinessProbe.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (securityContext != null) __obj.updateDynamic("securityContext")(securityContext.asInstanceOf[js.Any])
    if (startupProbe != null) __obj.updateDynamic("startupProbe")(startupProbe.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stdinOnce != null) __obj.updateDynamic("stdinOnce")(stdinOnce.asInstanceOf[js.Any])
    if (terminationMessagePath != null) __obj.updateDynamic("terminationMessagePath")(terminationMessagePath.asInstanceOf[js.Any])
    if (terminationMessagePolicy != null) __obj.updateDynamic("terminationMessagePolicy")(terminationMessagePolicy.asInstanceOf[js.Any])
    if (tty != null) __obj.updateDynamic("tty")(tty.asInstanceOf[js.Any])
    if (volumeDevices != null) __obj.updateDynamic("volumeDevices")(volumeDevices.asInstanceOf[js.Any])
    if (volumeMounts != null) __obj.updateDynamic("volumeMounts")(volumeMounts.asInstanceOf[js.Any])
    if (workingDir != null) __obj.updateDynamic("workingDir")(workingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

