package typings.pulumiAws.getInstanceTypeMod

import typings.pulumiAws.outputMod.ec2.GetInstanceTypeFpga
import typings.pulumiAws.outputMod.ec2.GetInstanceTypeGpus
import typings.pulumiAws.outputMod.ec2.GetInstanceTypeInferenceAccelerator
import typings.pulumiAws.outputMod.ec2.GetInstanceTypeInstanceDisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceTypeResult extends js.Object {
  
  /**
    * `true` if auto recovery is supported.
    */
  val autoRecoverySupported: Boolean = js.native
  
  /**
    * `true` if it is a bare metal instance type.
    */
  val bareMetal: Boolean = js.native
  
  /**
    * `true` if the instance type is a burstable performance instance type.
    */
  val burstablePerformanceSupported: Boolean = js.native
  
  /**
    * `true`  if the instance type is a current generation.
    */
  val currentGeneration: Boolean = js.native
  
  /**
    * `true` if Dedicated Hosts are supported on the instance type.
    */
  val dedicatedHostsSupported: Boolean = js.native
  
  /**
    * The default number of cores for the instance type.
    */
  val defaultCores: Double = js.native
  
  /**
    * The  default  number of threads per core for the instance type.
    */
  val defaultThreadsPerCore: Double = js.native
  
  /**
    * The default number of vCPUs for the instance type.
    */
  val defaultVcpus: Double = js.native
  
  /**
    * Indicates whether Amazon EBS encryption is supported.
    */
  val ebsEncryptionSupport: String = js.native
  
  /**
    * Indicates whether non-volatile memory express (NVMe) is supported.
    */
  val ebsNvmeSupport: String = js.native
  
  /**
    * Indicates that the instance type is Amazon EBS-optimized.
    */
  val ebsOptimizedSupport: String = js.native
  
  /**
    * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
    */
  val ebsPerformanceBaselineBandwidth: Double = js.native
  
  /**
    * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
    */
  val ebsPerformanceBaselineIops: Double = js.native
  
  /**
    * The baseline throughput performance for an EBS-optimized instance type, in MBps.
    */
  val ebsPerformanceBaselineThroughput: Double = js.native
  
  /**
    * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
    */
  val ebsPerformanceMaximumBandwidth: Double = js.native
  
  /**
    * The maximum input/output storage operations per second for an EBS-optimized instance type.
    */
  val ebsPerformanceMaximumIops: Double = js.native
  
  /**
    * The maximum throughput performance for an EBS-optimized instance type, in MBps.
    */
  val ebsPerformanceMaximumThroughput: Double = js.native
  
  /**
    * Indicates whether Elastic Fabric Adapter (EFA) is supported.
    */
  val efaSupported: Boolean = js.native
  
  /**
    * Indicates whether Elastic Network Adapter (ENA) is supported.
    */
  val enaSupport: String = js.native
  
  /**
    * Describes the FPGA accelerator settings for the instance type.
    * * `fpgas.#.count` - The count of FPGA accelerators for the instance type.
    * * `fpgas.#.manufacturer` - The manufacturer of the FPGA accelerator.
    * * `fpgas.#.memory_size` - The size (in MiB) for the memory available to the FPGA accelerator.
    * * `fpgas.#.name` - The name of the FPGA accelerator.
    */
  val fpgas: js.Array[GetInstanceTypeFpga] = js.native
  
  /**
    * `true` if the instance type is eligible for the free tier.
    */
  val freeTierEligible: Boolean = js.native
  
  /**
    * Describes the GPU accelerators for the instance type.
    * * `gpus.#.count` - The number of GPUs for the instance type.
    * * `gpus.#.manufacturer` - The manufacturer of the GPU accelerator.
    * * `gpus.#.memory_size` - The size (in MiB) for the memory available to the GPU accelerator.
    * * `gpus.#.name` - The name of the GPU accelerator.
    */
  val gpuses: js.Array[GetInstanceTypeGpus] = js.native
  
  /**
    * `true` if On-Demand hibernation is supported.
    */
  val hibernationSupported: Boolean = js.native
  
  /**
    * Indicates the hypervisor used for the instance type.
    * * `inferenceAccelerators` Describes the Inference accelerators for the instance type.
    * * `inference_accelerators.#.count` - The number of Inference accelerators for the instance type.
    * * `inference_accelerators.#.manufacturer` - The manufacturer of the Inference accelerator.
    * * `inference_accelerators.#.name` - The name of the Inference accelerator.
    */
  val hypervisor: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val inferenceAccelerators: js.Array[GetInstanceTypeInferenceAccelerator] = js.native
  
  /**
    * Describes the disks for the instance type.
    * * `instance_disks.#.count` - The number of disks with this configuration.
    * * `instance_disks.#.size` - The size of the disk in GB.
    * * `instance_disks.#.type` - The type of disk.
    */
  val instanceDisks: js.Array[GetInstanceTypeInstanceDisk] = js.native
  
  /**
    * `true` if instance storage is supported.
    */
  val instanceStorageSupported: Boolean = js.native
  
  val instanceType: String = js.native
  
  /**
    * `true` if IPv6 is supported.
    */
  val ipv6Supported: Boolean = js.native
  
  /**
    * The maximum number of IPv4 addresses per network interface.
    */
  val maximumIpv4AddressesPerInterface: Double = js.native
  
  /**
    * The maximum number of IPv6 addresses per network interface.
    */
  val maximumIpv6AddressesPerInterface: Double = js.native
  
  /**
    * The maximum number of network interfaces for the instance type.
    */
  val maximumNetworkInterfaces: Double = js.native
  
  /**
    * Size of the instance memory, in MiB.
    */
  val memorySize: Double = js.native
  
  /**
    * Describes the network performance.
    */
  val networkPerformance: String = js.native
  
  /**
    * A list of architectures supported by the instance type.
    */
  val supportedArchitectures: js.Array[String] = js.native
  
  /**
    * A list of supported placement groups types.
    */
  val supportedPlacementStrategies: js.Array[String] = js.native
  
  /**
    * Indicates the supported root device types.
    */
  val supportedRootDeviceTypes: js.Array[String] = js.native
  
  /**
    * Indicates whether the instance type is offered for spot or On-Demand.
    */
  val supportedUsagesClasses: js.Array[String] = js.native
  
  /**
    * The supported virtualization types.
    */
  val supportedVirtualizationTypes: js.Array[String] = js.native
  
  /**
    * The speed of the processor, in GHz.
    */
  val sustainedClockSpeed: Double = js.native
  
  /**
    * The total memory of all FPGA accelerators for the instance type (in MiB).
    */
  val totalFpgaMemory: Double = js.native
  
  /**
    * The total size of the memory for the GPU accelerators for the instance type (in MiB).
    */
  val totalGpuMemory: Double = js.native
  
  /**
    * The total size of the instance disks, in GB.
    */
  val totalInstanceStorage: Double = js.native
  
  /**
    * List of the valid number of cores that can be configured for the instance type.
    */
  val validCores: js.Array[Double] = js.native
  
  /**
    * List of the valid number of threads per core that can be configured for the instance type.
    */
  val validThreadsPerCores: js.Array[Double] = js.native
}
object GetInstanceTypeResult {
  
  @scala.inline
  def apply(
    autoRecoverySupported: Boolean,
    bareMetal: Boolean,
    burstablePerformanceSupported: Boolean,
    currentGeneration: Boolean,
    dedicatedHostsSupported: Boolean,
    defaultCores: Double,
    defaultThreadsPerCore: Double,
    defaultVcpus: Double,
    ebsEncryptionSupport: String,
    ebsNvmeSupport: String,
    ebsOptimizedSupport: String,
    ebsPerformanceBaselineBandwidth: Double,
    ebsPerformanceBaselineIops: Double,
    ebsPerformanceBaselineThroughput: Double,
    ebsPerformanceMaximumBandwidth: Double,
    ebsPerformanceMaximumIops: Double,
    ebsPerformanceMaximumThroughput: Double,
    efaSupported: Boolean,
    enaSupport: String,
    fpgas: js.Array[GetInstanceTypeFpga],
    freeTierEligible: Boolean,
    gpuses: js.Array[GetInstanceTypeGpus],
    hibernationSupported: Boolean,
    hypervisor: String,
    id: String,
    inferenceAccelerators: js.Array[GetInstanceTypeInferenceAccelerator],
    instanceDisks: js.Array[GetInstanceTypeInstanceDisk],
    instanceStorageSupported: Boolean,
    instanceType: String,
    ipv6Supported: Boolean,
    maximumIpv4AddressesPerInterface: Double,
    maximumIpv6AddressesPerInterface: Double,
    maximumNetworkInterfaces: Double,
    memorySize: Double,
    networkPerformance: String,
    supportedArchitectures: js.Array[String],
    supportedPlacementStrategies: js.Array[String],
    supportedRootDeviceTypes: js.Array[String],
    supportedUsagesClasses: js.Array[String],
    supportedVirtualizationTypes: js.Array[String],
    sustainedClockSpeed: Double,
    totalFpgaMemory: Double,
    totalGpuMemory: Double,
    totalInstanceStorage: Double,
    validCores: js.Array[Double],
    validThreadsPerCores: js.Array[Double]
  ): GetInstanceTypeResult = {
    val __obj = js.Dynamic.literal(autoRecoverySupported = autoRecoverySupported.asInstanceOf[js.Any], bareMetal = bareMetal.asInstanceOf[js.Any], burstablePerformanceSupported = burstablePerformanceSupported.asInstanceOf[js.Any], currentGeneration = currentGeneration.asInstanceOf[js.Any], dedicatedHostsSupported = dedicatedHostsSupported.asInstanceOf[js.Any], defaultCores = defaultCores.asInstanceOf[js.Any], defaultThreadsPerCore = defaultThreadsPerCore.asInstanceOf[js.Any], defaultVcpus = defaultVcpus.asInstanceOf[js.Any], ebsEncryptionSupport = ebsEncryptionSupport.asInstanceOf[js.Any], ebsNvmeSupport = ebsNvmeSupport.asInstanceOf[js.Any], ebsOptimizedSupport = ebsOptimizedSupport.asInstanceOf[js.Any], ebsPerformanceBaselineBandwidth = ebsPerformanceBaselineBandwidth.asInstanceOf[js.Any], ebsPerformanceBaselineIops = ebsPerformanceBaselineIops.asInstanceOf[js.Any], ebsPerformanceBaselineThroughput = ebsPerformanceBaselineThroughput.asInstanceOf[js.Any], ebsPerformanceMaximumBandwidth = ebsPerformanceMaximumBandwidth.asInstanceOf[js.Any], ebsPerformanceMaximumIops = ebsPerformanceMaximumIops.asInstanceOf[js.Any], ebsPerformanceMaximumThroughput = ebsPerformanceMaximumThroughput.asInstanceOf[js.Any], efaSupported = efaSupported.asInstanceOf[js.Any], enaSupport = enaSupport.asInstanceOf[js.Any], fpgas = fpgas.asInstanceOf[js.Any], freeTierEligible = freeTierEligible.asInstanceOf[js.Any], gpuses = gpuses.asInstanceOf[js.Any], hibernationSupported = hibernationSupported.asInstanceOf[js.Any], hypervisor = hypervisor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inferenceAccelerators = inferenceAccelerators.asInstanceOf[js.Any], instanceDisks = instanceDisks.asInstanceOf[js.Any], instanceStorageSupported = instanceStorageSupported.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], ipv6Supported = ipv6Supported.asInstanceOf[js.Any], maximumIpv4AddressesPerInterface = maximumIpv4AddressesPerInterface.asInstanceOf[js.Any], maximumIpv6AddressesPerInterface = maximumIpv6AddressesPerInterface.asInstanceOf[js.Any], maximumNetworkInterfaces = maximumNetworkInterfaces.asInstanceOf[js.Any], memorySize = memorySize.asInstanceOf[js.Any], networkPerformance = networkPerformance.asInstanceOf[js.Any], supportedArchitectures = supportedArchitectures.asInstanceOf[js.Any], supportedPlacementStrategies = supportedPlacementStrategies.asInstanceOf[js.Any], supportedRootDeviceTypes = supportedRootDeviceTypes.asInstanceOf[js.Any], supportedUsagesClasses = supportedUsagesClasses.asInstanceOf[js.Any], supportedVirtualizationTypes = supportedVirtualizationTypes.asInstanceOf[js.Any], sustainedClockSpeed = sustainedClockSpeed.asInstanceOf[js.Any], totalFpgaMemory = totalFpgaMemory.asInstanceOf[js.Any], totalGpuMemory = totalGpuMemory.asInstanceOf[js.Any], totalInstanceStorage = totalInstanceStorage.asInstanceOf[js.Any], validCores = validCores.asInstanceOf[js.Any], validThreadsPerCores = validThreadsPerCores.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeResult]
  }
  
  @scala.inline
  implicit class GetInstanceTypeResultOps[Self <: GetInstanceTypeResult] (val x: Self) extends AnyVal {
    
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
    def setAutoRecoverySupported(value: Boolean): Self = this.set("autoRecoverySupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBareMetal(value: Boolean): Self = this.set("bareMetal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBurstablePerformanceSupported(value: Boolean): Self = this.set("burstablePerformanceSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGeneration(value: Boolean): Self = this.set("currentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedHostsSupported(value: Boolean): Self = this.set("dedicatedHostsSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCores(value: Double): Self = this.set("defaultCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultThreadsPerCore(value: Double): Self = this.set("defaultThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVcpus(value: Double): Self = this.set("defaultVcpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsEncryptionSupport(value: String): Self = this.set("ebsEncryptionSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsNvmeSupport(value: String): Self = this.set("ebsNvmeSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedSupport(value: String): Self = this.set("ebsOptimizedSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsPerformanceBaselineBandwidth(value: Double): Self = this.set("ebsPerformanceBaselineBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsPerformanceBaselineIops(value: Double): Self = this.set("ebsPerformanceBaselineIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsPerformanceBaselineThroughput(value: Double): Self = this.set("ebsPerformanceBaselineThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsPerformanceMaximumBandwidth(value: Double): Self = this.set("ebsPerformanceMaximumBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsPerformanceMaximumIops(value: Double): Self = this.set("ebsPerformanceMaximumIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsPerformanceMaximumThroughput(value: Double): Self = this.set("ebsPerformanceMaximumThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEfaSupported(value: Boolean): Self = this.set("efaSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnaSupport(value: String): Self = this.set("enaSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgasVarargs(value: GetInstanceTypeFpga*): Self = this.set("fpgas", js.Array(value :_*))
    
    @scala.inline
    def setFpgas(value: js.Array[GetInstanceTypeFpga]): Self = this.set("fpgas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeTierEligible(value: Boolean): Self = this.set("freeTierEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpusesVarargs(value: GetInstanceTypeGpus*): Self = this.set("gpuses", js.Array(value :_*))
    
    @scala.inline
    def setGpuses(value: js.Array[GetInstanceTypeGpus]): Self = this.set("gpuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHibernationSupported(value: Boolean): Self = this.set("hibernationSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHypervisor(value: String): Self = this.set("hypervisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferenceAcceleratorsVarargs(value: GetInstanceTypeInferenceAccelerator*): Self = this.set("inferenceAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setInferenceAccelerators(value: js.Array[GetInstanceTypeInferenceAccelerator]): Self = this.set("inferenceAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceDisksVarargs(value: GetInstanceTypeInstanceDisk*): Self = this.set("instanceDisks", js.Array(value :_*))
    
    @scala.inline
    def setInstanceDisks(value: js.Array[GetInstanceTypeInstanceDisk]): Self = this.set("instanceDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStorageSupported(value: Boolean): Self = this.set("instanceStorageSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6Supported(value: Boolean): Self = this.set("ipv6Supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumIpv4AddressesPerInterface(value: Double): Self = this.set("maximumIpv4AddressesPerInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumIpv6AddressesPerInterface(value: Double): Self = this.set("maximumIpv6AddressesPerInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNetworkInterfaces(value: Double): Self = this.set("maximumNetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySize(value: Double): Self = this.set("memorySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPerformance(value: String): Self = this.set("networkPerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedArchitecturesVarargs(value: String*): Self = this.set("supportedArchitectures", js.Array(value :_*))
    
    @scala.inline
    def setSupportedArchitectures(value: js.Array[String]): Self = this.set("supportedArchitectures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPlacementStrategiesVarargs(value: String*): Self = this.set("supportedPlacementStrategies", js.Array(value :_*))
    
    @scala.inline
    def setSupportedPlacementStrategies(value: js.Array[String]): Self = this.set("supportedPlacementStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedRootDeviceTypesVarargs(value: String*): Self = this.set("supportedRootDeviceTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedRootDeviceTypes(value: js.Array[String]): Self = this.set("supportedRootDeviceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedUsagesClassesVarargs(value: String*): Self = this.set("supportedUsagesClasses", js.Array(value :_*))
    
    @scala.inline
    def setSupportedUsagesClasses(value: js.Array[String]): Self = this.set("supportedUsagesClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedVirtualizationTypesVarargs(value: String*): Self = this.set("supportedVirtualizationTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedVirtualizationTypes(value: js.Array[String]): Self = this.set("supportedVirtualizationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSustainedClockSpeed(value: Double): Self = this.set("sustainedClockSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFpgaMemory(value: Double): Self = this.set("totalFpgaMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalGpuMemory(value: Double): Self = this.set("totalGpuMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalInstanceStorage(value: Double): Self = this.set("totalInstanceStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidCoresVarargs(value: Double*): Self = this.set("validCores", js.Array(value :_*))
    
    @scala.inline
    def setValidCores(value: js.Array[Double]): Self = this.set("validCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidThreadsPerCoresVarargs(value: Double*): Self = this.set("validThreadsPerCores", js.Array(value :_*))
    
    @scala.inline
    def setValidThreadsPerCores(value: js.Array[Double]): Self = this.set("validThreadsPerCores", value.asInstanceOf[js.Any])
  }
}
