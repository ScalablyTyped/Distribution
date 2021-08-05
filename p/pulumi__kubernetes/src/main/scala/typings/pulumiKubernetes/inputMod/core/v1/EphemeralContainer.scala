package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var command: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * List of environment variables to set in the container. Cannot be updated.
    */
  var env: js.UndefOr[Input[js.Array[Input[EnvVar]]]] = js.undefined
  
  /**
    * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    */
  var envFrom: js.UndefOr[Input[js.Array[Input[EnvFromSource]]]] = js.undefined
  
  /**
    * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
    */
  var image: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Lifecycle is not allowed for ephemeral containers.
    */
  var lifecycle: js.UndefOr[Input[Lifecycle]] = js.undefined
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var livenessProbe: js.UndefOr[Input[Probe]] = js.undefined
  
  /**
    * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
    */
  var name: Input[String]
  
  /**
    * Ports are not allowed for ephemeral containers.
    */
  var ports: js.UndefOr[Input[js.Array[Input[ContainerPort]]]] = js.undefined
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var readinessProbe: js.UndefOr[Input[Probe]] = js.undefined
  
  /**
    * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.undefined
  
  /**
    * SecurityContext is not allowed for ephemeral containers.
    */
  var securityContext: js.UndefOr[Input[SecurityContext]] = js.undefined
  
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var startupProbe: js.UndefOr[Input[Probe]] = js.undefined
  
  /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
    */
  var stdin: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
    */
  var stdinOnce: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container is run in whatever namespaces are shared for the pod. Note that the container runtime must support this feature.
    */
  var targetContainerName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
    */
  var terminationMessagePath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    */
  var terminationMessagePolicy: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
    */
  var tty: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * volumeDevices is the list of block devices to be used by the container.
    */
  var volumeDevices: js.UndefOr[Input[js.Array[Input[VolumeDevice]]]] = js.undefined
  
  /**
    * Pod volumes to mount into the container's filesystem. Cannot be updated.
    */
  var volumeMounts: js.UndefOr[Input[js.Array[Input[VolumeMount]]]] = js.undefined
  
  /**
    * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
    */
  var workingDir: js.UndefOr[Input[String]] = js.undefined
}
object EphemeralContainer {
  
  inline def apply(name: Input[String]): EphemeralContainer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralContainer]
  }
  
  extension [Self <: EphemeralContainer](x: Self) {
    
    inline def setArgs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Input[String]*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setCommand(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: Input[String]*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    inline def setEnv(value: Input[js.Array[Input[EnvVar]]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvFrom(value: Input[js.Array[Input[EnvFromSource]]]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
    
    inline def setEnvFromUndefined: Self = StObject.set(x, "envFrom", js.undefined)
    
    inline def setEnvFromVarargs(value: Input[EnvFromSource]*): Self = StObject.set(x, "envFrom", js.Array(value :_*))
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVarargs(value: Input[EnvVar]*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    inline def setImage(value: Input[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImagePullPolicy(value: Input[String]): Self = StObject.set(x, "imagePullPolicy", value.asInstanceOf[js.Any])
    
    inline def setImagePullPolicyUndefined: Self = StObject.set(x, "imagePullPolicy", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLifecycle(value: Input[Lifecycle]): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    inline def setLivenessProbe(value: Input[Probe]): Self = StObject.set(x, "livenessProbe", value.asInstanceOf[js.Any])
    
    inline def setLivenessProbeUndefined: Self = StObject.set(x, "livenessProbe", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: Input[js.Array[Input[ContainerPort]]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: Input[ContainerPort]*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    inline def setReadinessProbe(value: Input[Probe]): Self = StObject.set(x, "readinessProbe", value.asInstanceOf[js.Any])
    
    inline def setReadinessProbeUndefined: Self = StObject.set(x, "readinessProbe", js.undefined)
    
    inline def setResources(value: Input[ResourceRequirements]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setSecurityContext(value: Input[SecurityContext]): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    inline def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    inline def setStartupProbe(value: Input[Probe]): Self = StObject.set(x, "startupProbe", value.asInstanceOf[js.Any])
    
    inline def setStartupProbeUndefined: Self = StObject.set(x, "startupProbe", js.undefined)
    
    inline def setStdin(value: Input[Boolean]): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinOnce(value: Input[Boolean]): Self = StObject.set(x, "stdinOnce", value.asInstanceOf[js.Any])
    
    inline def setStdinOnceUndefined: Self = StObject.set(x, "stdinOnce", js.undefined)
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setTargetContainerName(value: Input[String]): Self = StObject.set(x, "targetContainerName", value.asInstanceOf[js.Any])
    
    inline def setTargetContainerNameUndefined: Self = StObject.set(x, "targetContainerName", js.undefined)
    
    inline def setTerminationMessagePath(value: Input[String]): Self = StObject.set(x, "terminationMessagePath", value.asInstanceOf[js.Any])
    
    inline def setTerminationMessagePathUndefined: Self = StObject.set(x, "terminationMessagePath", js.undefined)
    
    inline def setTerminationMessagePolicy(value: Input[String]): Self = StObject.set(x, "terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    inline def setTerminationMessagePolicyUndefined: Self = StObject.set(x, "terminationMessagePolicy", js.undefined)
    
    inline def setTty(value: Input[Boolean]): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    inline def setTtyUndefined: Self = StObject.set(x, "tty", js.undefined)
    
    inline def setVolumeDevices(value: Input[js.Array[Input[VolumeDevice]]]): Self = StObject.set(x, "volumeDevices", value.asInstanceOf[js.Any])
    
    inline def setVolumeDevicesUndefined: Self = StObject.set(x, "volumeDevices", js.undefined)
    
    inline def setVolumeDevicesVarargs(value: Input[VolumeDevice]*): Self = StObject.set(x, "volumeDevices", js.Array(value :_*))
    
    inline def setVolumeMounts(value: Input[js.Array[Input[VolumeMount]]]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
    
    inline def setVolumeMountsUndefined: Self = StObject.set(x, "volumeMounts", js.undefined)
    
    inline def setVolumeMountsVarargs(value: Input[VolumeMount]*): Self = StObject.set(x, "volumeMounts", js.Array(value :_*))
    
    inline def setWorkingDir(value: Input[String]): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
  }
}
