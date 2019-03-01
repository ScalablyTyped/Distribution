package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val args: js.Array[java.lang.String]
  /**
    * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if
    * this is not provided. Variable references $(VAR_NAME) are expanded using the container's
    * environment. If a variable cannot be resolved, the reference in the input string will be
    * unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
    * Escaped references will never be expanded, regardless of whether the variable exists or
    * not. Cannot be updated. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  val command: js.Array[java.lang.String]
  /**
    * List of environment variables to set in the container. Cannot be updated.
    */
  val env: js.Array[EnvVar]
  /**
    * List of sources to populate environment variables in the container. The keys defined within
    * a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the
    * container is starting. When a key exists in multiple sources, the value associated with the
    * last source will take precedence. Values defined by an Env with a duplicate key will take
    * precedence. Cannot be updated.
    */
  val envFrom: js.Array[EnvFromSource]
  /**
    * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This
    * field is optional to allow higher level config management to default or override container
    * images in workload controllers like Deployments and StatefulSets.
    */
  val image: java.lang.String
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is
    * specified, or IfNotPresent otherwise. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  val imagePullPolicy: java.lang.String
  /**
    * Actions that the management system should take in response to container lifecycle events.
    * Cannot be updated.
    */
  val lifecycle: Lifecycle
  /**
    * Periodic probe of container liveness. Container will be restarted if the probe fails.
    * Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  val livenessProbe: Probe
  /**
    * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique
    * name (DNS_LABEL). Cannot be updated.
    */
  val name: java.lang.String
  /**
    * List of ports to expose from the container. Exposing a port here gives the system
    * additional information about the network connections a container uses, but is primarily
    * informational. Not specifying a port here DOES NOT prevent that port from being exposed.
    * Any port which is listening on the default "0.0.0.0" address inside a container will be
    * accessible from the network. Cannot be updated.
    */
  val ports: js.Array[ContainerPort]
  /**
    * Periodic probe of container service readiness. Container will be removed from service
    * endpoints if the probe fails. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  val readinessProbe: Probe
  /**
    * Compute Resources required by this container. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  val resources: ResourceRequirements
  /**
    * Security options the pod should run with. More info:
    * https://kubernetes.io/docs/concepts/policy/security-context/ More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  val securityContext: SecurityContext
  /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this
    * is not set, reads from stdin in the container will always result in EOF. Default is false.
    */
  val stdin: scala.Boolean
  /**
    * Whether the container runtime should close the stdin channel after it has been opened by a
    * single attach. When stdin is true the stdin stream will remain open across multiple attach
    * sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until
    * the first client attaches to stdin, and then remains open and accepts data until the client
    * disconnects, at which time stdin is closed and remains closed until the container is
    * restarted. If this flag is false, a container processes that reads from stdin will never
    * receive an EOF. Default is false
    */
  val stdinOnce: scala.Boolean
  /**
    * Optional: Path at which the file to which the container's termination message will be
    * written is mounted into the container's filesystem. Message written is intended to be brief
    * final status, such as an assertion failure message. Will be truncated by the node if
    * greater than 4096 bytes. The total message length across all containers will be limited to
    * 12kb. Defaults to /dev/termination-log. Cannot be updated.
    */
  val terminationMessagePath: java.lang.String
  /**
    * Indicate how the termination message should be populated. File will use the contents of
    * terminationMessagePath to populate the container status message on both success and
    * failure. FallbackToLogsOnError will use the last chunk of container log output if the
    * termination message file is empty and the container exited with an error. The log output is
    * limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be
    * updated.
    */
  val terminationMessagePolicy: java.lang.String
  /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true.
    * Default is false.
    */
  val tty: scala.Boolean
  /**
    * volumeDevices is the list of block devices to be used by the container. This is a beta
    * feature.
    */
  val volumeDevices: js.Array[VolumeDevice]
  /**
    * Pod volumes to mount into the container's filesystem. Cannot be updated.
    */
  val volumeMounts: js.Array[VolumeMount]
  /**
    * Container's working directory. If not specified, the container runtime's default will be
    * used, which might be configured in the container image. Cannot be updated.
    */
  val workingDir: java.lang.String
}

object Container {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String],
    command: js.Array[java.lang.String],
    env: js.Array[EnvVar],
    envFrom: js.Array[EnvFromSource],
    image: java.lang.String,
    imagePullPolicy: java.lang.String,
    lifecycle: Lifecycle,
    livenessProbe: Probe,
    name: java.lang.String,
    ports: js.Array[ContainerPort],
    readinessProbe: Probe,
    resources: ResourceRequirements,
    securityContext: SecurityContext,
    stdin: scala.Boolean,
    stdinOnce: scala.Boolean,
    terminationMessagePath: java.lang.String,
    terminationMessagePolicy: java.lang.String,
    tty: scala.Boolean,
    volumeDevices: js.Array[VolumeDevice],
    volumeMounts: js.Array[VolumeMount],
    workingDir: java.lang.String
  ): Container = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("env")(env)
    __obj.updateDynamic("envFrom")(envFrom)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("imagePullPolicy")(imagePullPolicy)
    __obj.updateDynamic("lifecycle")(lifecycle)
    __obj.updateDynamic("livenessProbe")(livenessProbe)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ports")(ports)
    __obj.updateDynamic("readinessProbe")(readinessProbe)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("securityContext")(securityContext)
    __obj.updateDynamic("stdin")(stdin)
    __obj.updateDynamic("stdinOnce")(stdinOnce)
    __obj.updateDynamic("terminationMessagePath")(terminationMessagePath)
    __obj.updateDynamic("terminationMessagePolicy")(terminationMessagePolicy)
    __obj.updateDynamic("tty")(tty)
    __obj.updateDynamic("volumeDevices")(volumeDevices)
    __obj.updateDynamic("volumeMounts")(volumeMounts)
    __obj.updateDynamic("workingDir")(workingDir)
    __obj.asInstanceOf[Container]
  }
}

