package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerDefinition extends StObject {
  
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
  def apply(name: String): ContainerDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDefinition]
  }
  
  @scala.inline
  implicit class ContainerDefinitionMutableBuilder[Self <: ContainerDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    @scala.inline
    def setDependsOn(value: js.Array[ContainerDependency]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: ContainerDependency*): Self = StObject.set(x, "dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setDisableNetworking(value: Boolean): Self = StObject.set(x, "disableNetworking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableNetworkingUndefined: Self = StObject.set(x, "disableNetworking", js.undefined)
    
    @scala.inline
    def setDnsSearchDomains(value: js.Array[String]): Self = StObject.set(x, "dnsSearchDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSearchDomainsUndefined: Self = StObject.set(x, "dnsSearchDomains", js.undefined)
    
    @scala.inline
    def setDnsSearchDomainsVarargs(value: String*): Self = StObject.set(x, "dnsSearchDomains", js.Array(value :_*))
    
    @scala.inline
    def setDnsServers(value: js.Array[String]): Self = StObject.set(x, "dnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsServersUndefined: Self = StObject.set(x, "dnsServers", js.undefined)
    
    @scala.inline
    def setDnsServersVarargs(value: String*): Self = StObject.set(x, "dnsServers", js.Array(value :_*))
    
    @scala.inline
    def setDockerLabels(value: StringDictionary[String]): Self = StObject.set(x, "dockerLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerLabelsUndefined: Self = StObject.set(x, "dockerLabels", js.undefined)
    
    @scala.inline
    def setDockerSecurityOptions(value: js.Array[String]): Self = StObject.set(x, "dockerSecurityOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerSecurityOptionsUndefined: Self = StObject.set(x, "dockerSecurityOptions", js.undefined)
    
    @scala.inline
    def setDockerSecurityOptionsVarargs(value: String*): Self = StObject.set(x, "dockerSecurityOptions", js.Array(value :_*))
    
    @scala.inline
    def setEntryPoint(value: js.Array[String]): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    @scala.inline
    def setEntryPointVarargs(value: String*): Self = StObject.set(x, "entryPoint", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment(value: js.Array[KeyValuePair]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setEnvironmentVarargs(value: KeyValuePair*): Self = StObject.set(x, "environment", js.Array(value :_*))
    
    @scala.inline
    def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEssentialUndefined: Self = StObject.set(x, "essential", js.undefined)
    
    @scala.inline
    def setExtraHosts(value: js.Array[HostEntry]): Self = StObject.set(x, "extraHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraHostsUndefined: Self = StObject.set(x, "extraHosts", js.undefined)
    
    @scala.inline
    def setExtraHostsVarargs(value: HostEntry*): Self = StObject.set(x, "extraHosts", js.Array(value :_*))
    
    @scala.inline
    def setFirelensConfiguration(value: FirelensConfiguration): Self = StObject.set(x, "firelensConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirelensConfigurationUndefined: Self = StObject.set(x, "firelensConfiguration", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setLinuxParameters(value: LinuxParameters): Self = StObject.set(x, "linuxParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinuxParametersUndefined: Self = StObject.set(x, "linuxParameters", js.undefined)
    
    @scala.inline
    def setLogConfiguration(value: LogConfiguration): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    @scala.inline
    def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservation(value: Double): Self = StObject.set(x, "memoryReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservationUndefined: Self = StObject.set(x, "memoryReservation", js.undefined)
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    @scala.inline
    def setMountPoints(value: js.Array[MountPoint]): Self = StObject.set(x, "mountPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPointsUndefined: Self = StObject.set(x, "mountPoints", js.undefined)
    
    @scala.inline
    def setMountPointsVarargs(value: MountPoint*): Self = StObject.set(x, "mountPoints", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortMappings(value: js.Array[PortMapping]): Self = StObject.set(x, "portMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortMappingsUndefined: Self = StObject.set(x, "portMappings", js.undefined)
    
    @scala.inline
    def setPortMappingsVarargs(value: PortMapping*): Self = StObject.set(x, "portMappings", js.Array(value :_*))
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = StObject.set(x, "privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegedUndefined: Self = StObject.set(x, "privileged", js.undefined)
    
    @scala.inline
    def setPseudoTerminal(value: Boolean): Self = StObject.set(x, "pseudoTerminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoTerminalUndefined: Self = StObject.set(x, "pseudoTerminal", js.undefined)
    
    @scala.inline
    def setReadonlyRootFilesystem(value: Boolean): Self = StObject.set(x, "readonlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyRootFilesystemUndefined: Self = StObject.set(x, "readonlyRootFilesystem", js.undefined)
    
    @scala.inline
    def setRepositoryCredentials(value: RepositoryCredentials): Self = StObject.set(x, "repositoryCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryCredentialsUndefined: Self = StObject.set(x, "repositoryCredentials", js.undefined)
    
    @scala.inline
    def setResourceRequirements(value: js.Array[ResourceRequirements]): Self = StObject.set(x, "resourceRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRequirementsUndefined: Self = StObject.set(x, "resourceRequirements", js.undefined)
    
    @scala.inline
    def setResourceRequirementsVarargs(value: ResourceRequirements*): Self = StObject.set(x, "resourceRequirements", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: js.Array[Secret]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: Secret*): Self = StObject.set(x, "secrets", js.Array(value :_*))
    
    @scala.inline
    def setStartTimeout(value: Double): Self = StObject.set(x, "startTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeoutUndefined: Self = StObject.set(x, "startTimeout", js.undefined)
    
    @scala.inline
    def setStopTimeout(value: Double): Self = StObject.set(x, "stopTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimeoutUndefined: Self = StObject.set(x, "stopTimeout", js.undefined)
    
    @scala.inline
    def setSystemControls(value: js.Array[SystemControl]): Self = StObject.set(x, "systemControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemControlsUndefined: Self = StObject.set(x, "systemControls", js.undefined)
    
    @scala.inline
    def setSystemControlsVarargs(value: SystemControl*): Self = StObject.set(x, "systemControls", js.Array(value :_*))
    
    @scala.inline
    def setUlimits(value: js.Array[Ulimit]): Self = StObject.set(x, "ulimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUlimitsUndefined: Self = StObject.set(x, "ulimits", js.undefined)
    
    @scala.inline
    def setUlimitsVarargs(value: Ulimit*): Self = StObject.set(x, "ulimits", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setVolumesFrom(value: js.Array[VolumeFrom]): Self = StObject.set(x, "volumesFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesFromUndefined: Self = StObject.set(x, "volumesFrom", js.undefined)
    
    @scala.inline
    def setVolumesFromVarargs(value: VolumeFrom*): Self = StObject.set(x, "volumesFrom", js.Array(value :_*))
    
    @scala.inline
    def setWorkingDirectory(value: String): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
