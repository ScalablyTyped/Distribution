package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerDefinition extends StObject {
  
  var command: js.UndefOr[js.Array[String]] = js.undefined
  
  var cpu: js.UndefOr[Double] = js.undefined
  
  var dependsOn: js.UndefOr[js.Array[ContainerDependency]] = js.undefined
  
  var disableNetworking: js.UndefOr[Boolean] = js.undefined
  
  var dnsSearchDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  var dnsServers: js.UndefOr[js.Array[String]] = js.undefined
  
  var dockerLabels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var dockerSecurityOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var entryPoint: js.UndefOr[js.Array[String]] = js.undefined
  
  var environment: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
  
  var essential: js.UndefOr[Boolean] = js.undefined
  
  var extraHosts: js.UndefOr[js.Array[HostEntry]] = js.undefined
  
  var firelensConfiguration: js.UndefOr[FirelensConfiguration] = js.undefined
  
  var healthCheck: js.UndefOr[HealthCheck] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var links: js.UndefOr[js.Array[String]] = js.undefined
  
  var linuxParameters: js.UndefOr[LinuxParameters] = js.undefined
  
  var logConfiguration: js.UndefOr[LogConfiguration] = js.undefined
  
  var memory: js.UndefOr[Double] = js.undefined
  
  var memoryReservation: js.UndefOr[Double] = js.undefined
  
  var mountPoints: js.UndefOr[js.Array[MountPoint]] = js.undefined
  
  var name: String
  
  var portMappings: js.UndefOr[js.Array[PortMapping]] = js.undefined
  
  var privileged: js.UndefOr[Boolean] = js.undefined
  
  var pseudoTerminal: js.UndefOr[Boolean] = js.undefined
  
  var readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined
  
  var repositoryCredentials: js.UndefOr[RepositoryCredentials] = js.undefined
  
  var resourceRequirements: js.UndefOr[js.Array[ResourceRequirements]] = js.undefined
  
  var secrets: js.UndefOr[js.Array[Secret]] = js.undefined
  
  var startTimeout: js.UndefOr[Double] = js.undefined
  
  var stopTimeout: js.UndefOr[Double] = js.undefined
  
  var systemControls: js.UndefOr[js.Array[SystemControl]] = js.undefined
  
  var ulimits: js.UndefOr[js.Array[Ulimit]] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
  
  var volumesFrom: js.UndefOr[js.Array[VolumeFrom]] = js.undefined
  
  var workingDirectory: js.UndefOr[String] = js.undefined
}
object ContainerDefinition {
  
  inline def apply(name: String): ContainerDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDefinition]
  }
  
  extension [Self <: ContainerDefinition](x: Self) {
    
    inline def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setDependsOn(value: js.Array[ContainerDependency]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: ContainerDependency*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
    
    inline def setDisableNetworking(value: Boolean): Self = StObject.set(x, "disableNetworking", value.asInstanceOf[js.Any])
    
    inline def setDisableNetworkingUndefined: Self = StObject.set(x, "disableNetworking", js.undefined)
    
    inline def setDnsSearchDomains(value: js.Array[String]): Self = StObject.set(x, "dnsSearchDomains", value.asInstanceOf[js.Any])
    
    inline def setDnsSearchDomainsUndefined: Self = StObject.set(x, "dnsSearchDomains", js.undefined)
    
    inline def setDnsSearchDomainsVarargs(value: String*): Self = StObject.set(x, "dnsSearchDomains", js.Array(value :_*))
    
    inline def setDnsServers(value: js.Array[String]): Self = StObject.set(x, "dnsServers", value.asInstanceOf[js.Any])
    
    inline def setDnsServersUndefined: Self = StObject.set(x, "dnsServers", js.undefined)
    
    inline def setDnsServersVarargs(value: String*): Self = StObject.set(x, "dnsServers", js.Array(value :_*))
    
    inline def setDockerLabels(value: StringDictionary[String]): Self = StObject.set(x, "dockerLabels", value.asInstanceOf[js.Any])
    
    inline def setDockerLabelsUndefined: Self = StObject.set(x, "dockerLabels", js.undefined)
    
    inline def setDockerSecurityOptions(value: js.Array[String]): Self = StObject.set(x, "dockerSecurityOptions", value.asInstanceOf[js.Any])
    
    inline def setDockerSecurityOptionsUndefined: Self = StObject.set(x, "dockerSecurityOptions", js.undefined)
    
    inline def setDockerSecurityOptionsVarargs(value: String*): Self = StObject.set(x, "dockerSecurityOptions", js.Array(value :_*))
    
    inline def setEntryPoint(value: js.Array[String]): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setEntryPointVarargs(value: String*): Self = StObject.set(x, "entryPoint", js.Array(value :_*))
    
    inline def setEnvironment(value: js.Array[KeyValuePair]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setEnvironmentVarargs(value: KeyValuePair*): Self = StObject.set(x, "environment", js.Array(value :_*))
    
    inline def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    
    inline def setEssentialUndefined: Self = StObject.set(x, "essential", js.undefined)
    
    inline def setExtraHosts(value: js.Array[HostEntry]): Self = StObject.set(x, "extraHosts", value.asInstanceOf[js.Any])
    
    inline def setExtraHostsUndefined: Self = StObject.set(x, "extraHosts", js.undefined)
    
    inline def setExtraHostsVarargs(value: HostEntry*): Self = StObject.set(x, "extraHosts", js.Array(value :_*))
    
    inline def setFirelensConfiguration(value: FirelensConfiguration): Self = StObject.set(x, "firelensConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFirelensConfigurationUndefined: Self = StObject.set(x, "firelensConfiguration", js.undefined)
    
    inline def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setLinuxParameters(value: LinuxParameters): Self = StObject.set(x, "linuxParameters", value.asInstanceOf[js.Any])
    
    inline def setLinuxParametersUndefined: Self = StObject.set(x, "linuxParameters", js.undefined)
    
    inline def setLogConfiguration(value: LogConfiguration): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservation(value: Double): Self = StObject.set(x, "memoryReservation", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservationUndefined: Self = StObject.set(x, "memoryReservation", js.undefined)
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setMountPoints(value: js.Array[MountPoint]): Self = StObject.set(x, "mountPoints", value.asInstanceOf[js.Any])
    
    inline def setMountPointsUndefined: Self = StObject.set(x, "mountPoints", js.undefined)
    
    inline def setMountPointsVarargs(value: MountPoint*): Self = StObject.set(x, "mountPoints", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPortMappings(value: js.Array[PortMapping]): Self = StObject.set(x, "portMappings", value.asInstanceOf[js.Any])
    
    inline def setPortMappingsUndefined: Self = StObject.set(x, "portMappings", js.undefined)
    
    inline def setPortMappingsVarargs(value: PortMapping*): Self = StObject.set(x, "portMappings", js.Array(value :_*))
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    inline def setPseudoTerminal(value: Boolean): Self = StObject.set(x, "pseudoTerminal", value.asInstanceOf[js.Any])
    
    inline def setPseudoTerminalUndefined: Self = StObject.set(x, "pseudoTerminal", js.undefined)
    
    inline def setReadonlyRootFilesystem(value: Boolean): Self = StObject.set(x, "readonlyRootFilesystem", value.asInstanceOf[js.Any])
    
    inline def setReadonlyRootFilesystemUndefined: Self = StObject.set(x, "readonlyRootFilesystem", js.undefined)
    
    inline def setRepositoryCredentials(value: RepositoryCredentials): Self = StObject.set(x, "repositoryCredentials", value.asInstanceOf[js.Any])
    
    inline def setRepositoryCredentialsUndefined: Self = StObject.set(x, "repositoryCredentials", js.undefined)
    
    inline def setResourceRequirements(value: js.Array[ResourceRequirements]): Self = StObject.set(x, "resourceRequirements", value.asInstanceOf[js.Any])
    
    inline def setResourceRequirementsUndefined: Self = StObject.set(x, "resourceRequirements", js.undefined)
    
    inline def setResourceRequirementsVarargs(value: ResourceRequirements*): Self = StObject.set(x, "resourceRequirements", js.Array(value :_*))
    
    inline def setSecrets(value: js.Array[Secret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSecretsVarargs(value: Secret*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    
    inline def setStartTimeout(value: Double): Self = StObject.set(x, "startTimeout", value.asInstanceOf[js.Any])
    
    inline def setStartTimeoutUndefined: Self = StObject.set(x, "startTimeout", js.undefined)
    
    inline def setStopTimeout(value: Double): Self = StObject.set(x, "stopTimeout", value.asInstanceOf[js.Any])
    
    inline def setStopTimeoutUndefined: Self = StObject.set(x, "stopTimeout", js.undefined)
    
    inline def setSystemControls(value: js.Array[SystemControl]): Self = StObject.set(x, "systemControls", value.asInstanceOf[js.Any])
    
    inline def setSystemControlsUndefined: Self = StObject.set(x, "systemControls", js.undefined)
    
    inline def setSystemControlsVarargs(value: SystemControl*): Self = StObject.set(x, "systemControls", js.Array(value :_*))
    
    inline def setUlimits(value: js.Array[Ulimit]): Self = StObject.set(x, "ulimits", value.asInstanceOf[js.Any])
    
    inline def setUlimitsUndefined: Self = StObject.set(x, "ulimits", js.undefined)
    
    inline def setUlimitsVarargs(value: Ulimit*): Self = StObject.set(x, "ulimits", js.Array(value :_*))
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setVolumesFrom(value: js.Array[VolumeFrom]): Self = StObject.set(x, "volumesFrom", value.asInstanceOf[js.Any])
    
    inline def setVolumesFromUndefined: Self = StObject.set(x, "volumesFrom", js.undefined)
    
    inline def setVolumesFromVarargs(value: VolumeFrom*): Self = StObject.set(x, "volumesFrom", js.Array(value :_*))
    
    inline def setWorkingDirectory(value: String): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
