package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An EphemeralContainer is a container that may be added temporarily to an existing pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a pod is removed or restarted. If an ephemeral container causes a pod to exceed its resource allocation, the pod may be evicted. Ephemeral containers may not be added by directly updating the pod spec. They must be added via the pod's ephemeralcontainers subresource, and they will appear in the pod spec once added. This is an alpha feature enabled by the EphemeralContainers feature flag.
  */
@js.native
trait EphemeralContainer extends js.Object {
  
  /**
    * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var command: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * List of environment variables to set in the container. Cannot be updated.
    */
  var env: js.UndefOr[Input[js.Array[Input[EnvVar]]]] = js.native
  
  /**
    * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    */
  var envFrom: js.UndefOr[Input[js.Array[Input[EnvFromSource]]]] = js.native
  
  /**
    * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
    */
  var image: js.UndefOr[Input[String]] = js.native
  
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * Lifecycle is not allowed for ephemeral containers.
    */
  var lifecycle: js.UndefOr[Input[Lifecycle]] = js.native
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var livenessProbe: js.UndefOr[Input[Probe]] = js.native
  
  /**
    * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
    */
  var name: Input[String] = js.native
  
  /**
    * Ports are not allowed for ephemeral containers.
    */
  var ports: js.UndefOr[Input[js.Array[Input[ContainerPort]]]] = js.native
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var readinessProbe: js.UndefOr[Input[Probe]] = js.native
  
  /**
    * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.native
  
  /**
    * SecurityContext is not allowed for ephemeral containers.
    */
  var securityContext: js.UndefOr[Input[SecurityContext]] = js.native
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var startupProbe: js.UndefOr[Input[Probe]] = js.native
  
  /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
    */
  var stdin: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
    */
  var stdinOnce: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container is run in whatever namespaces are shared for the pod. Note that the container runtime must support this feature.
    */
  var targetContainerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
    */
  var terminationMessagePath: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    */
  var terminationMessagePolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
    */
  var tty: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * volumeDevices is the list of block devices to be used by the container.
    */
  var volumeDevices: js.UndefOr[Input[js.Array[Input[VolumeDevice]]]] = js.native
  
  /**
    * Pod volumes to mount into the container's filesystem. Cannot be updated.
    */
  var volumeMounts: js.UndefOr[Input[js.Array[Input[VolumeMount]]]] = js.native
  
  /**
    * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
    */
  var workingDir: js.UndefOr[Input[String]] = js.native
}
object EphemeralContainer {
  
  @scala.inline
  def apply(name: Input[String]): EphemeralContainer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralContainer]
  }
  
  @scala.inline
  implicit class EphemeralContainerOps[Self <: EphemeralContainer] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: Input[String]*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: Input[js.Array[Input[String]]]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: Input[String]*): Self = this.set("command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: Input[js.Array[Input[String]]]): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: Input[EnvVar]*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: Input[js.Array[Input[EnvVar]]]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setEnvFromVarargs(value: Input[EnvFromSource]*): Self = this.set("envFrom", js.Array(value :_*))
    
    @scala.inline
    def setEnvFrom(value: Input[js.Array[Input[EnvFromSource]]]): Self = this.set("envFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvFrom: Self = this.set("envFrom", js.undefined)
    
    @scala.inline
    def setImage(value: Input[String]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImagePullPolicy(value: Input[String]): Self = this.set("imagePullPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePullPolicy: Self = this.set("imagePullPolicy", js.undefined)
    
    @scala.inline
    def setLifecycle(value: Input[Lifecycle]): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycle: Self = this.set("lifecycle", js.undefined)
    
    @scala.inline
    def setLivenessProbe(value: Input[Probe]): Self = this.set("livenessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLivenessProbe: Self = this.set("livenessProbe", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: Input[ContainerPort]*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: Input[js.Array[Input[ContainerPort]]]): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
    
    @scala.inline
    def setReadinessProbe(value: Input[Probe]): Self = this.set("readinessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadinessProbe: Self = this.set("readinessProbe", js.undefined)
    
    @scala.inline
    def setResources(value: Input[ResourceRequirements]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setSecurityContext(value: Input[SecurityContext]): Self = this.set("securityContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityContext: Self = this.set("securityContext", js.undefined)
    
    @scala.inline
    def setStartupProbe(value: Input[Probe]): Self = this.set("startupProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartupProbe: Self = this.set("startupProbe", js.undefined)
    
    @scala.inline
    def setStdin(value: Input[Boolean]): Self = this.set("stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    
    @scala.inline
    def setStdinOnce(value: Input[Boolean]): Self = this.set("stdinOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdinOnce: Self = this.set("stdinOnce", js.undefined)
    
    @scala.inline
    def setTargetContainerName(value: Input[String]): Self = this.set("targetContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetContainerName: Self = this.set("targetContainerName", js.undefined)
    
    @scala.inline
    def setTerminationMessagePath(value: Input[String]): Self = this.set("terminationMessagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationMessagePath: Self = this.set("terminationMessagePath", js.undefined)
    
    @scala.inline
    def setTerminationMessagePolicy(value: Input[String]): Self = this.set("terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationMessagePolicy: Self = this.set("terminationMessagePolicy", js.undefined)
    
    @scala.inline
    def setTty(value: Input[Boolean]): Self = this.set("tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTty: Self = this.set("tty", js.undefined)
    
    @scala.inline
    def setVolumeDevicesVarargs(value: Input[VolumeDevice]*): Self = this.set("volumeDevices", js.Array(value :_*))
    
    @scala.inline
    def setVolumeDevices(value: Input[js.Array[Input[VolumeDevice]]]): Self = this.set("volumeDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeDevices: Self = this.set("volumeDevices", js.undefined)
    
    @scala.inline
    def setVolumeMountsVarargs(value: Input[VolumeMount]*): Self = this.set("volumeMounts", js.Array(value :_*))
    
    @scala.inline
    def setVolumeMounts(value: Input[js.Array[Input[VolumeMount]]]): Self = this.set("volumeMounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeMounts: Self = this.set("volumeMounts", js.undefined)
    
    @scala.inline
    def setWorkingDir(value: Input[String]): Self = this.set("workingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingDir: Self = this.set("workingDir", js.undefined)
  }
}
