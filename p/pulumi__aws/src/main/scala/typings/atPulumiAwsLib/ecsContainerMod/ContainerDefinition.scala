package typings
package atPulumiAwsLib.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDefinition extends js.Object {
  var command: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cpu: js.UndefOr[scala.Double] = js.undefined
  var disableNetworking: js.UndefOr[scala.Boolean] = js.undefined
  var dnsSearchDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dnsServers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dockerLabels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var dockerSecurityOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var entryPoint: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var environment: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
  var essential: js.UndefOr[scala.Boolean] = js.undefined
  var extraHosts: js.UndefOr[js.Array[HostEntry]] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var links: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var linuxParameters: js.UndefOr[LinuxParameters] = js.undefined
  var logConfiguration: js.UndefOr[LogConfiguration] = js.undefined
  var memory: js.UndefOr[scala.Double] = js.undefined
  var memoryReservation: js.UndefOr[scala.Double] = js.undefined
  var mountPoints: js.UndefOr[js.Array[MountPoint]] = js.undefined
  var name: java.lang.String
  var portMappings: js.UndefOr[js.Array[PortMapping]] = js.undefined
  var privileged: js.UndefOr[scala.Boolean] = js.undefined
  var readonlyRootFilesystem: js.UndefOr[scala.Boolean] = js.undefined
  var ulimits: js.UndefOr[js.Array[Ulimit]] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
  var volumesFrom: js.UndefOr[js.Array[VolumeFrom]] = js.undefined
  var workingDirectory: js.UndefOr[java.lang.String] = js.undefined
}

object ContainerDefinition {
  @scala.inline
  def apply(
    name: java.lang.String,
    command: js.Array[java.lang.String] = null,
    cpu: scala.Int | scala.Double = null,
    disableNetworking: js.UndefOr[scala.Boolean] = js.undefined,
    dnsSearchDomains: js.Array[java.lang.String] = null,
    dnsServers: js.Array[java.lang.String] = null,
    dockerLabels: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    dockerSecurityOptions: js.Array[java.lang.String] = null,
    entryPoint: js.Array[java.lang.String] = null,
    environment: js.Array[KeyValuePair] = null,
    essential: js.UndefOr[scala.Boolean] = js.undefined,
    extraHosts: js.Array[HostEntry] = null,
    hostname: java.lang.String = null,
    image: java.lang.String = null,
    links: js.Array[java.lang.String] = null,
    linuxParameters: LinuxParameters = null,
    logConfiguration: LogConfiguration = null,
    memory: scala.Int | scala.Double = null,
    memoryReservation: scala.Int | scala.Double = null,
    mountPoints: js.Array[MountPoint] = null,
    portMappings: js.Array[PortMapping] = null,
    privileged: js.UndefOr[scala.Boolean] = js.undefined,
    readonlyRootFilesystem: js.UndefOr[scala.Boolean] = js.undefined,
    ulimits: js.Array[Ulimit] = null,
    user: java.lang.String = null,
    volumesFrom: js.Array[VolumeFrom] = null,
    workingDirectory: java.lang.String = null
  ): ContainerDefinition = {
    val __obj = js.Dynamic.literal(name = name)
    if (command != null) __obj.updateDynamic("command")(command)
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNetworking)) __obj.updateDynamic("disableNetworking")(disableNetworking)
    if (dnsSearchDomains != null) __obj.updateDynamic("dnsSearchDomains")(dnsSearchDomains)
    if (dnsServers != null) __obj.updateDynamic("dnsServers")(dnsServers)
    if (dockerLabels != null) __obj.updateDynamic("dockerLabels")(dockerLabels)
    if (dockerSecurityOptions != null) __obj.updateDynamic("dockerSecurityOptions")(dockerSecurityOptions)
    if (entryPoint != null) __obj.updateDynamic("entryPoint")(entryPoint)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (!js.isUndefined(essential)) __obj.updateDynamic("essential")(essential)
    if (extraHosts != null) __obj.updateDynamic("extraHosts")(extraHosts)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (image != null) __obj.updateDynamic("image")(image)
    if (links != null) __obj.updateDynamic("links")(links)
    if (linuxParameters != null) __obj.updateDynamic("linuxParameters")(linuxParameters)
    if (logConfiguration != null) __obj.updateDynamic("logConfiguration")(logConfiguration)
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (memoryReservation != null) __obj.updateDynamic("memoryReservation")(memoryReservation.asInstanceOf[js.Any])
    if (mountPoints != null) __obj.updateDynamic("mountPoints")(mountPoints)
    if (portMappings != null) __obj.updateDynamic("portMappings")(portMappings)
    if (!js.isUndefined(privileged)) __obj.updateDynamic("privileged")(privileged)
    if (!js.isUndefined(readonlyRootFilesystem)) __obj.updateDynamic("readonlyRootFilesystem")(readonlyRootFilesystem)
    if (ulimits != null) __obj.updateDynamic("ulimits")(ulimits)
    if (user != null) __obj.updateDynamic("user")(user)
    if (volumesFrom != null) __obj.updateDynamic("volumesFrom")(volumesFrom)
    if (workingDirectory != null) __obj.updateDynamic("workingDirectory")(workingDirectory)
    __obj.asInstanceOf[ContainerDefinition]
  }
}

