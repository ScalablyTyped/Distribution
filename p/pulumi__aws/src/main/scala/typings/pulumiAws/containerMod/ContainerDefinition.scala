package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(name: String): ContainerDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDefinition]
  }
  
  @scala.inline
  implicit class ContainerDefinitionOps[Self <: ContainerDefinition] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = this.set("command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setCpu(value: Double): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    
    @scala.inline
    def setDependsOnVarargs(value: ContainerDependency*): Self = this.set("dependsOn", js.Array(value :_*))
    
    @scala.inline
    def setDependsOn(value: js.Array[ContainerDependency]): Self = this.set("dependsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependsOn: Self = this.set("dependsOn", js.undefined)
    
    @scala.inline
    def setDisableNetworking(value: Boolean): Self = this.set("disableNetworking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNetworking: Self = this.set("disableNetworking", js.undefined)
    
    @scala.inline
    def setDnsSearchDomainsVarargs(value: String*): Self = this.set("dnsSearchDomains", js.Array(value :_*))
    
    @scala.inline
    def setDnsSearchDomains(value: js.Array[String]): Self = this.set("dnsSearchDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSearchDomains: Self = this.set("dnsSearchDomains", js.undefined)
    
    @scala.inline
    def setDnsServersVarargs(value: String*): Self = this.set("dnsServers", js.Array(value :_*))
    
    @scala.inline
    def setDnsServers(value: js.Array[String]): Self = this.set("dnsServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsServers: Self = this.set("dnsServers", js.undefined)
    
    @scala.inline
    def setDockerLabels(value: StringDictionary[String]): Self = this.set("dockerLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerLabels: Self = this.set("dockerLabels", js.undefined)
    
    @scala.inline
    def setDockerSecurityOptionsVarargs(value: String*): Self = this.set("dockerSecurityOptions", js.Array(value :_*))
    
    @scala.inline
    def setDockerSecurityOptions(value: js.Array[String]): Self = this.set("dockerSecurityOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerSecurityOptions: Self = this.set("dockerSecurityOptions", js.undefined)
    
    @scala.inline
    def setEntryPointVarargs(value: String*): Self = this.set("entryPoint", js.Array(value :_*))
    
    @scala.inline
    def setEntryPoint(value: js.Array[String]): Self = this.set("entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPoint: Self = this.set("entryPoint", js.undefined)
    
    @scala.inline
    def setEnvironmentVarargs(value: KeyValuePair*): Self = this.set("environment", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment(value: js.Array[KeyValuePair]): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setEssential(value: Boolean): Self = this.set("essential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEssential: Self = this.set("essential", js.undefined)
    
    @scala.inline
    def setExtraHostsVarargs(value: HostEntry*): Self = this.set("extraHosts", js.Array(value :_*))
    
    @scala.inline
    def setExtraHosts(value: js.Array[HostEntry]): Self = this.set("extraHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraHosts: Self = this.set("extraHosts", js.undefined)
    
    @scala.inline
    def setFirelensConfiguration(value: FirelensConfiguration): Self = this.set("firelensConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirelensConfiguration: Self = this.set("firelensConfiguration", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: HealthCheck): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: String*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[String]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setLinuxParameters(value: LinuxParameters): Self = this.set("linuxParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinuxParameters: Self = this.set("linuxParameters", js.undefined)
    
    @scala.inline
    def setLogConfiguration(value: LogConfiguration): Self = this.set("logConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConfiguration: Self = this.set("logConfiguration", js.undefined)
    
    @scala.inline
    def setMemory(value: Double): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    
    @scala.inline
    def setMemoryReservation(value: Double): Self = this.set("memoryReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryReservation: Self = this.set("memoryReservation", js.undefined)
    
    @scala.inline
    def setMountPointsVarargs(value: MountPoint*): Self = this.set("mountPoints", js.Array(value :_*))
    
    @scala.inline
    def setMountPoints(value: js.Array[MountPoint]): Self = this.set("mountPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountPoints: Self = this.set("mountPoints", js.undefined)
    
    @scala.inline
    def setPortMappingsVarargs(value: PortMapping*): Self = this.set("portMappings", js.Array(value :_*))
    
    @scala.inline
    def setPortMappings(value: js.Array[PortMapping]): Self = this.set("portMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortMappings: Self = this.set("portMappings", js.undefined)
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = this.set("privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivileged: Self = this.set("privileged", js.undefined)
    
    @scala.inline
    def setPseudoTerminal(value: Boolean): Self = this.set("pseudoTerminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePseudoTerminal: Self = this.set("pseudoTerminal", js.undefined)
    
    @scala.inline
    def setReadonlyRootFilesystem(value: Boolean): Self = this.set("readonlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonlyRootFilesystem: Self = this.set("readonlyRootFilesystem", js.undefined)
    
    @scala.inline
    def setRepositoryCredentials(value: RepositoryCredentials): Self = this.set("repositoryCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryCredentials: Self = this.set("repositoryCredentials", js.undefined)
    
    @scala.inline
    def setResourceRequirementsVarargs(value: ResourceRequirements*): Self = this.set("resourceRequirements", js.Array(value :_*))
    
    @scala.inline
    def setResourceRequirements(value: js.Array[ResourceRequirements]): Self = this.set("resourceRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRequirements: Self = this.set("resourceRequirements", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: Secret*): Self = this.set("secrets", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: js.Array[Secret]): Self = this.set("secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecrets: Self = this.set("secrets", js.undefined)
    
    @scala.inline
    def setStartTimeout(value: Double): Self = this.set("startTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeout: Self = this.set("startTimeout", js.undefined)
    
    @scala.inline
    def setStopTimeout(value: Double): Self = this.set("stopTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopTimeout: Self = this.set("stopTimeout", js.undefined)
    
    @scala.inline
    def setSystemControlsVarargs(value: SystemControl*): Self = this.set("systemControls", js.Array(value :_*))
    
    @scala.inline
    def setSystemControls(value: js.Array[SystemControl]): Self = this.set("systemControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemControls: Self = this.set("systemControls", js.undefined)
    
    @scala.inline
    def setUlimitsVarargs(value: Ulimit*): Self = this.set("ulimits", js.Array(value :_*))
    
    @scala.inline
    def setUlimits(value: js.Array[Ulimit]): Self = this.set("ulimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUlimits: Self = this.set("ulimits", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setVolumesFromVarargs(value: VolumeFrom*): Self = this.set("volumesFrom", js.Array(value :_*))
    
    @scala.inline
    def setVolumesFrom(value: js.Array[VolumeFrom]): Self = this.set("volumesFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumesFrom: Self = this.set("volumesFrom", js.undefined)
    
    @scala.inline
    def setWorkingDirectory(value: String): Self = this.set("workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingDirectory: Self = this.set("workingDirectory", js.undefined)
  }
}
