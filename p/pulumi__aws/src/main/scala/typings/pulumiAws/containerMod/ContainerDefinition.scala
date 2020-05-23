package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDefinition extends js.Object {
  var command: js.UndefOr[js.Array[String]] = js.native
  var cpu: js.UndefOr[Double] = js.native
  var dependsOn: js.UndefOr[js.Array[ContainerDependency]] = js.native
  var disableNetworking: js.UndefOr[Boolean] = js.native
  var dnsSearchDomains: js.UndefOr[js.Array[String]] = js.native
  var dnsServers: js.UndefOr[js.Array[String]] = js.native
  var dockerLabels: js.UndefOr[StringDictionary[String]] = js.native
  var dockerSecurityOptions: js.UndefOr[js.Array[String]] = js.native
  var entryPoint: js.UndefOr[js.Array[String]] = js.native
  var environment: js.UndefOr[js.Array[KeyValuePair]] = js.native
  var essential: js.UndefOr[Boolean] = js.native
  var extraHosts: js.UndefOr[js.Array[HostEntry]] = js.native
  var firelensConfiguration: js.UndefOr[FirelensConfiguration] = js.native
  var healthCheck: js.UndefOr[HealthCheck] = js.native
  var hostname: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var interactive: js.UndefOr[Boolean] = js.native
  var links: js.UndefOr[js.Array[String]] = js.native
  var linuxParameters: js.UndefOr[LinuxParameters] = js.native
  var logConfiguration: js.UndefOr[LogConfiguration] = js.native
  var memory: js.UndefOr[Double] = js.native
  var memoryReservation: js.UndefOr[Double] = js.native
  var mountPoints: js.UndefOr[js.Array[MountPoint]] = js.native
  var name: String = js.native
  var portMappings: js.UndefOr[js.Array[PortMapping]] = js.native
  var privileged: js.UndefOr[Boolean] = js.native
  var pseudoTerminal: js.UndefOr[Boolean] = js.native
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.native
  var repositoryCredentials: js.UndefOr[RepositoryCredentials] = js.native
  var resourceRequirements: js.UndefOr[js.Array[ResourceRequirements]] = js.native
  var secrets: js.UndefOr[js.Array[Secret]] = js.native
  var startTimeout: js.UndefOr[Double] = js.native
  var stopTimeout: js.UndefOr[Double] = js.native
  var systemControls: js.UndefOr[js.Array[SystemControl]] = js.native
  var ulimits: js.UndefOr[js.Array[Ulimit]] = js.native
  var user: js.UndefOr[String] = js.native
  var volumesFrom: js.UndefOr[js.Array[VolumeFrom]] = js.native
  var workingDirectory: js.UndefOr[String] = js.native
}

object ContainerDefinition {
  @scala.inline
  def apply(
    name: String,
    command: js.Array[String] = null,
    cpu: js.UndefOr[Double] = js.undefined,
    dependsOn: js.Array[ContainerDependency] = null,
    disableNetworking: js.UndefOr[Boolean] = js.undefined,
    dnsSearchDomains: js.Array[String] = null,
    dnsServers: js.Array[String] = null,
    dockerLabels: StringDictionary[String] = null,
    dockerSecurityOptions: js.Array[String] = null,
    entryPoint: js.Array[String] = null,
    environment: js.Array[KeyValuePair] = null,
    essential: js.UndefOr[Boolean] = js.undefined,
    extraHosts: js.Array[HostEntry] = null,
    firelensConfiguration: FirelensConfiguration = null,
    healthCheck: HealthCheck = null,
    hostname: String = null,
    image: String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    links: js.Array[String] = null,
    linuxParameters: LinuxParameters = null,
    logConfiguration: LogConfiguration = null,
    memory: js.UndefOr[Double] = js.undefined,
    memoryReservation: js.UndefOr[Double] = js.undefined,
    mountPoints: js.Array[MountPoint] = null,
    portMappings: js.Array[PortMapping] = null,
    privileged: js.UndefOr[Boolean] = js.undefined,
    pseudoTerminal: js.UndefOr[Boolean] = js.undefined,
    readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
    repositoryCredentials: RepositoryCredentials = null,
    resourceRequirements: js.Array[ResourceRequirements] = null,
    secrets: js.Array[Secret] = null,
    startTimeout: js.UndefOr[Double] = js.undefined,
    stopTimeout: js.UndefOr[Double] = js.undefined,
    systemControls: js.Array[SystemControl] = null,
    ulimits: js.Array[Ulimit] = null,
    user: String = null,
    volumesFrom: js.Array[VolumeFrom] = null,
    workingDirectory: String = null
  ): ContainerDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (!js.isUndefined(cpu)) __obj.updateDynamic("cpu")(cpu.get.asInstanceOf[js.Any])
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNetworking)) __obj.updateDynamic("disableNetworking")(disableNetworking.get.asInstanceOf[js.Any])
    if (dnsSearchDomains != null) __obj.updateDynamic("dnsSearchDomains")(dnsSearchDomains.asInstanceOf[js.Any])
    if (dnsServers != null) __obj.updateDynamic("dnsServers")(dnsServers.asInstanceOf[js.Any])
    if (dockerLabels != null) __obj.updateDynamic("dockerLabels")(dockerLabels.asInstanceOf[js.Any])
    if (dockerSecurityOptions != null) __obj.updateDynamic("dockerSecurityOptions")(dockerSecurityOptions.asInstanceOf[js.Any])
    if (entryPoint != null) __obj.updateDynamic("entryPoint")(entryPoint.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (!js.isUndefined(essential)) __obj.updateDynamic("essential")(essential.get.asInstanceOf[js.Any])
    if (extraHosts != null) __obj.updateDynamic("extraHosts")(extraHosts.asInstanceOf[js.Any])
    if (firelensConfiguration != null) __obj.updateDynamic("firelensConfiguration")(firelensConfiguration.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (linuxParameters != null) __obj.updateDynamic("linuxParameters")(linuxParameters.asInstanceOf[js.Any])
    if (logConfiguration != null) __obj.updateDynamic("logConfiguration")(logConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryReservation)) __obj.updateDynamic("memoryReservation")(memoryReservation.get.asInstanceOf[js.Any])
    if (mountPoints != null) __obj.updateDynamic("mountPoints")(mountPoints.asInstanceOf[js.Any])
    if (portMappings != null) __obj.updateDynamic("portMappings")(portMappings.asInstanceOf[js.Any])
    if (!js.isUndefined(privileged)) __obj.updateDynamic("privileged")(privileged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pseudoTerminal)) __obj.updateDynamic("pseudoTerminal")(pseudoTerminal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readonlyRootFilesystem)) __obj.updateDynamic("readonlyRootFilesystem")(readonlyRootFilesystem.get.asInstanceOf[js.Any])
    if (repositoryCredentials != null) __obj.updateDynamic("repositoryCredentials")(repositoryCredentials.asInstanceOf[js.Any])
    if (resourceRequirements != null) __obj.updateDynamic("resourceRequirements")(resourceRequirements.asInstanceOf[js.Any])
    if (secrets != null) __obj.updateDynamic("secrets")(secrets.asInstanceOf[js.Any])
    if (!js.isUndefined(startTimeout)) __obj.updateDynamic("startTimeout")(startTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopTimeout)) __obj.updateDynamic("stopTimeout")(stopTimeout.get.asInstanceOf[js.Any])
    if (systemControls != null) __obj.updateDynamic("systemControls")(systemControls.asInstanceOf[js.Any])
    if (ulimits != null) __obj.updateDynamic("ulimits")(ulimits.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (volumesFrom != null) __obj.updateDynamic("volumesFrom")(volumesFrom.asInstanceOf[js.Any])
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDefinition]
  }
}

