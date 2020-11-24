package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single application container that you want to run within a pod.
  */
@js.native
trait Container extends js.Object {
  
  /**
    * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.Array[String] = js.native
  
  /**
    * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var command: js.Array[String] = js.native
  
  /**
    * List of environment variables to set in the container. Cannot be updated.
    */
  var env: js.Array[EnvVar] = js.native
  
  /**
    * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    */
  var envFrom: js.Array[EnvFromSource] = js.native
  
  /**
    * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
    */
  var image: String = js.native
  
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: String = js.native
  
  /**
    * Actions that the management system should take in response to container lifecycle events. Cannot be updated.
    */
  var lifecycle: Lifecycle = js.native
  
  /**
    * Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var livenessProbe: Probe = js.native
  
  /**
    * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
    */
  var name: String = js.native
  
  /**
    * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network. Cannot be updated.
    */
  var ports: js.Array[ContainerPort] = js.native
  
  /**
    * Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var readinessProbe: Probe = js.native
  
  /**
    * Compute Resources required by this container. Cannot be updated. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var resources: ResourceRequirements = js.native
  
  /**
    * Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var securityContext: SecurityContext = js.native
  
  /**
    * StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load data or warm a cache, than during steady-state operation. This cannot be updated. This is a beta feature enabled by the StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var startupProbe: Probe = js.native
  
  /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
    */
  var stdin: Boolean = js.native
  
  /**
    * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
    */
  var stdinOnce: Boolean = js.native
  
  /**
    * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
    */
  var terminationMessagePath: String = js.native
  
  /**
    * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    */
  var terminationMessagePolicy: String = js.native
  
  /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
    */
  var tty: Boolean = js.native
  
  /**
    * volumeDevices is the list of block devices to be used by the container.
    */
  var volumeDevices: js.Array[VolumeDevice] = js.native
  
  /**
    * Pod volumes to mount into the container's filesystem. Cannot be updated.
    */
  var volumeMounts: js.Array[VolumeMount] = js.native
  
  /**
    * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
    */
  var workingDir: String = js.native
}
object Container {
  
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
    terminationMessagePath: String,
    terminationMessagePolicy: String,
    tty: Boolean,
    volumeDevices: js.Array[VolumeDevice],
    volumeMounts: js.Array[VolumeMount],
    workingDir: String
  ): Container = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], envFrom = envFrom.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imagePullPolicy = imagePullPolicy.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], livenessProbe = livenessProbe.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], readinessProbe = readinessProbe.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], securityContext = securityContext.asInstanceOf[js.Any], startupProbe = startupProbe.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdinOnce = stdinOnce.asInstanceOf[js.Any], terminationMessagePath = terminationMessagePath.asInstanceOf[js.Any], terminationMessagePolicy = terminationMessagePolicy.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], volumeDevices = volumeDevices.asInstanceOf[js.Any], volumeMounts = volumeMounts.asInstanceOf[js.Any], workingDir = workingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = this.set("command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVarargs(value: EnvVar*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[EnvVar]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFromVarargs(value: EnvFromSource*): Self = this.set("envFrom", js.Array(value :_*))
    
    @scala.inline
    def setEnvFrom(value: js.Array[EnvFromSource]): Self = this.set("envFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullPolicy(value: String): Self = this.set("imagePullPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycle(value: Lifecycle): Self = this.set("lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivenessProbe(value: Probe): Self = this.set("livenessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsVarargs(value: ContainerPort*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[ContainerPort]): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadinessProbe(value: Probe): Self = this.set("readinessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: ResourceRequirements): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityContext(value: SecurityContext): Self = this.set("securityContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartupProbe(value: Probe): Self = this.set("startupProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdin(value: Boolean): Self = this.set("stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinOnce(value: Boolean): Self = this.set("stdinOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePath(value: String): Self = this.set("terminationMessagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePolicy(value: String): Self = this.set("terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTty(value: Boolean): Self = this.set("tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeDevicesVarargs(value: VolumeDevice*): Self = this.set("volumeDevices", js.Array(value :_*))
    
    @scala.inline
    def setVolumeDevices(value: js.Array[VolumeDevice]): Self = this.set("volumeDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeMountsVarargs(value: VolumeMount*): Self = this.set("volumeMounts", js.Array(value :_*))
    
    @scala.inline
    def setVolumeMounts(value: js.Array[VolumeMount]): Self = this.set("volumeMounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDir(value: String): Self = this.set("workingDir", value.asInstanceOf[js.Any])
  }
}
