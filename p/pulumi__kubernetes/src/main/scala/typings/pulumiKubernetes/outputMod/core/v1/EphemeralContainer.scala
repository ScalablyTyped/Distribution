package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An EphemeralContainer is a container that may be added temporarily to an existing pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a pod is removed or restarted. If an ephemeral container causes a pod to exceed its resource allocation, the pod may be evicted. Ephemeral containers may not be added by directly updating the pod spec. They must be added via the pod's ephemeralcontainers subresource, and they will appear in the pod spec once added. This is an alpha feature enabled by the EphemeralContainers feature flag.
  */
trait EphemeralContainer extends StObject {
  
  /**
    * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.Array[String]
  
  /**
    * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var command: js.Array[String]
  
  /**
    * List of environment variables to set in the container. Cannot be updated.
    */
  var env: js.Array[EnvVar]
  
  /**
    * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    */
  var envFrom: js.Array[EnvFromSource]
  
  /**
    * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
    */
  var image: String
  
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: String
  
  /**
    * Lifecycle is not allowed for ephemeral containers.
    */
  var lifecycle: Lifecycle
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var livenessProbe: Probe
  
  /**
    * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
    */
  var name: String
  
  /**
    * Ports are not allowed for ephemeral containers.
    */
  var ports: js.Array[ContainerPort]
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var readinessProbe: Probe
  
  /**
    * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
    */
  var resources: ResourceRequirements
  
  /**
    * SecurityContext is not allowed for ephemeral containers.
    */
  var securityContext: SecurityContext
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var startupProbe: Probe
  
  /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
    */
  var stdin: Boolean
  
  /**
    * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
    */
  var stdinOnce: Boolean
  
  /**
    * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container is run in whatever namespaces are shared for the pod. Note that the container runtime must support this feature.
    */
  var targetContainerName: String
  
  /**
    * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
    */
  var terminationMessagePath: String
  
  /**
    * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    */
  var terminationMessagePolicy: String
  
  /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
    */
  var tty: Boolean
  
  /**
    * volumeDevices is the list of block devices to be used by the container.
    */
  var volumeDevices: js.Array[VolumeDevice]
  
  /**
    * Pod volumes to mount into the container's filesystem. Cannot be updated.
    */
  var volumeMounts: js.Array[VolumeMount]
  
  /**
    * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
    */
  var workingDir: String
}
object EphemeralContainer {
  
  @scala.inline
  def apply(
    args: js.Array[String],
    command: js.Array[String],
    env: js.Array[EnvVar],
    envFrom: js.Array[EnvFromSource],
    image: String,
    imagePullPolicy: String,
    lifecycle: Lifecycle,
    livenessProbe: Probe,
    name: String,
    ports: js.Array[ContainerPort],
    readinessProbe: Probe,
    resources: ResourceRequirements,
    securityContext: SecurityContext,
    startupProbe: Probe,
    stdin: Boolean,
    stdinOnce: Boolean,
    targetContainerName: String,
    terminationMessagePath: String,
    terminationMessagePolicy: String,
    tty: Boolean,
    volumeDevices: js.Array[VolumeDevice],
    volumeMounts: js.Array[VolumeMount],
    workingDir: String
  ): EphemeralContainer = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], envFrom = envFrom.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imagePullPolicy = imagePullPolicy.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], livenessProbe = livenessProbe.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], readinessProbe = readinessProbe.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], securityContext = securityContext.asInstanceOf[js.Any], startupProbe = startupProbe.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdinOnce = stdinOnce.asInstanceOf[js.Any], targetContainerName = targetContainerName.asInstanceOf[js.Any], terminationMessagePath = terminationMessagePath.asInstanceOf[js.Any], terminationMessagePolicy = terminationMessagePolicy.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], volumeDevices = volumeDevices.asInstanceOf[js.Any], volumeMounts = volumeMounts.asInstanceOf[js.Any], workingDir = workingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralContainer]
  }
  
  @scala.inline
  implicit class EphemeralContainerMutableBuilder[Self <: EphemeralContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[EnvVar]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFrom(value: js.Array[EnvFromSource]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFromVarargs(value: EnvFromSource*): Self = StObject.set(x, "envFrom", js.Array(value :_*))
    
    @scala.inline
    def setEnvVarargs(value: EnvVar*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullPolicy(value: String): Self = StObject.set(x, "imagePullPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycle(value: Lifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivenessProbe(value: Probe): Self = StObject.set(x, "livenessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPorts(value: js.Array[ContainerPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsVarargs(value: ContainerPort*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setReadinessProbe(value: Probe): Self = StObject.set(x, "readinessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: ResourceRequirements): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityContext(value: SecurityContext): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartupProbe(value: Probe): Self = StObject.set(x, "startupProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinOnce(value: Boolean): Self = StObject.set(x, "stdinOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetContainerName(value: String): Self = StObject.set(x, "targetContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePath(value: String): Self = StObject.set(x, "terminationMessagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePolicy(value: String): Self = StObject.set(x, "terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTty(value: Boolean): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeDevices(value: js.Array[VolumeDevice]): Self = StObject.set(x, "volumeDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeDevicesVarargs(value: VolumeDevice*): Self = StObject.set(x, "volumeDevices", js.Array(value :_*))
    
    @scala.inline
    def setVolumeMounts(value: js.Array[VolumeMount]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeMountsVarargs(value: VolumeMount*): Self = StObject.set(x, "volumeMounts", js.Array(value :_*))
    
    @scala.inline
    def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
  }
}
