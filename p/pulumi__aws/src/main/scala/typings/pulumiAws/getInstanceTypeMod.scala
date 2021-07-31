package typings.pulumiAws

import typings.pulumiAws.inputMod.ec2.GetInstanceTypeFpga
import typings.pulumiAws.inputMod.ec2.GetInstanceTypeGpus
import typings.pulumiAws.inputMod.ec2.GetInstanceTypeInferenceAccelerator
import typings.pulumiAws.inputMod.ec2.GetInstanceTypeInstanceDisk
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceTypeMod {
  
  @JSImport("@pulumi/aws/ec2/getInstanceType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getInstanceType(args: GetInstanceTypeArgs): js.Promise[GetInstanceTypeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceType")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInstanceTypeResult]]
  @scala.inline
  def getInstanceType(args: GetInstanceTypeArgs, opts: InvokeOptions): js.Promise[GetInstanceTypeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceType")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstanceTypeResult]]
  
  trait GetInstanceTypeArgs extends StObject {
    
    /**
      * The default number of cores for the instance type.
      */
    val defaultCores: js.UndefOr[Double] = js.undefined
    
    /**
      * The  default  number of threads per core for the instance type.
      */
    val defaultThreadsPerCore: js.UndefOr[Double] = js.undefined
    
    /**
      * Describes the FPGA accelerator settings for the instance type.
      * * `fpgas.#.count` - The count of FPGA accelerators for the instance type.
      * * `fpgas.#.manufacturer` - The manufacturer of the FPGA accelerator.
      * * `fpgas.#.memory_size` - The size (in MiB) for the memory available to the FPGA accelerator.
      * * `fpgas.#.name` - The name of the FPGA accelerator.
      */
    val fpgas: js.UndefOr[js.Array[GetInstanceTypeFpga]] = js.undefined
    
    /**
      * Describes the GPU accelerators for the instance type.
      * * `gpus.#.count` - The number of GPUs for the instance type.
      * * `gpus.#.manufacturer` - The manufacturer of the GPU accelerator.
      * * `gpus.#.memory_size` - The size (in MiB) for the memory available to the GPU accelerator.
      * * `gpus.#.name` - The name of the GPU accelerator.
      */
    val gpuses: js.UndefOr[js.Array[GetInstanceTypeGpus]] = js.undefined
    
    /**
      * Indicates the hypervisor used for the instance type.
      * * `inferenceAccelerators` Describes the Inference accelerators for the instance type.
      * * `inference_accelerators.#.count` - The number of Inference accelerators for the instance type.
      * * `inference_accelerators.#.manufacturer` - The manufacturer of the Inference accelerator.
      * * `inference_accelerators.#.name` - The name of the Inference accelerator.
      */
    val hypervisor: js.UndefOr[String] = js.undefined
    
    val inferenceAccelerators: js.UndefOr[js.Array[GetInstanceTypeInferenceAccelerator]] = js.undefined
    
    /**
      * Describes the disks for the instance type.
      * * `instance_disks.#.count` - The number of disks with this configuration.
      * * `instance_disks.#.size` - The size of the disk in GB.
      * * `instance_disks.#.type` - The type of disk.
      */
    val instanceDisks: js.UndefOr[js.Array[GetInstanceTypeInstanceDisk]] = js.undefined
    
    /**
      * Instance
      */
    val instanceType: String
    
    /**
      * The maximum number of IPv6 addresses per network interface.
      */
    val maximumIpv6AddressesPerInterface: js.UndefOr[Double] = js.undefined
    
    /**
      * The total memory of all FPGA accelerators for the instance type (in MiB).
      */
    val totalFpgaMemory: js.UndefOr[Double] = js.undefined
    
    /**
      * The total size of the memory for the GPU accelerators for the instance type (in MiB).
      */
    val totalGpuMemory: js.UndefOr[Double] = js.undefined
    
    /**
      * The total size of the instance disks, in GB.
      */
    val totalInstanceStorage: js.UndefOr[Double] = js.undefined
  }
  object GetInstanceTypeArgs {
    
    @scala.inline
    def apply(instanceType: String): GetInstanceTypeArgs = {
      val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceTypeArgs]
    }
    
    @scala.inline
    implicit class GetInstanceTypeArgsMutableBuilder[Self <: GetInstanceTypeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultCores(value: Double): Self = StObject.set(x, "defaultCores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCoresUndefined: Self = StObject.set(x, "defaultCores", js.undefined)
      
      @scala.inline
      def setDefaultThreadsPerCore(value: Double): Self = StObject.set(x, "defaultThreadsPerCore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultThreadsPerCoreUndefined: Self = StObject.set(x, "defaultThreadsPerCore", js.undefined)
      
      @scala.inline
      def setFpgas(value: js.Array[GetInstanceTypeFpga]): Self = StObject.set(x, "fpgas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFpgasUndefined: Self = StObject.set(x, "fpgas", js.undefined)
      
      @scala.inline
      def setFpgasVarargs(value: GetInstanceTypeFpga*): Self = StObject.set(x, "fpgas", js.Array(value :_*))
      
      @scala.inline
      def setGpuses(value: js.Array[GetInstanceTypeGpus]): Self = StObject.set(x, "gpuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGpusesUndefined: Self = StObject.set(x, "gpuses", js.undefined)
      
      @scala.inline
      def setGpusesVarargs(value: GetInstanceTypeGpus*): Self = StObject.set(x, "gpuses", js.Array(value :_*))
      
      @scala.inline
      def setHypervisor(value: String): Self = StObject.set(x, "hypervisor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHypervisorUndefined: Self = StObject.set(x, "hypervisor", js.undefined)
      
      @scala.inline
      def setInferenceAccelerators(value: js.Array[GetInstanceTypeInferenceAccelerator]): Self = StObject.set(x, "inferenceAccelerators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInferenceAcceleratorsUndefined: Self = StObject.set(x, "inferenceAccelerators", js.undefined)
      
      @scala.inline
      def setInferenceAcceleratorsVarargs(value: GetInstanceTypeInferenceAccelerator*): Self = StObject.set(x, "inferenceAccelerators", js.Array(value :_*))
      
      @scala.inline
      def setInstanceDisks(value: js.Array[GetInstanceTypeInstanceDisk]): Self = StObject.set(x, "instanceDisks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceDisksUndefined: Self = StObject.set(x, "instanceDisks", js.undefined)
      
      @scala.inline
      def setInstanceDisksVarargs(value: GetInstanceTypeInstanceDisk*): Self = StObject.set(x, "instanceDisks", js.Array(value :_*))
      
      @scala.inline
      def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumIpv6AddressesPerInterface(value: Double): Self = StObject.set(x, "maximumIpv6AddressesPerInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumIpv6AddressesPerInterfaceUndefined: Self = StObject.set(x, "maximumIpv6AddressesPerInterface", js.undefined)
      
      @scala.inline
      def setTotalFpgaMemory(value: Double): Self = StObject.set(x, "totalFpgaMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalFpgaMemoryUndefined: Self = StObject.set(x, "totalFpgaMemory", js.undefined)
      
      @scala.inline
      def setTotalGpuMemory(value: Double): Self = StObject.set(x, "totalGpuMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalGpuMemoryUndefined: Self = StObject.set(x, "totalGpuMemory", js.undefined)
      
      @scala.inline
      def setTotalInstanceStorage(value: Double): Self = StObject.set(x, "totalInstanceStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalInstanceStorageUndefined: Self = StObject.set(x, "totalInstanceStorage", js.undefined)
    }
  }
  
  trait GetInstanceTypeResult extends StObject {
    
    /**
      * `true` if auto recovery is supported.
      */
    val autoRecoverySupported: Boolean
    
    /**
      * `true` if it is a bare metal instance type.
      */
    val bareMetal: Boolean
    
    /**
      * `true` if the instance type is a burstable performance instance type.
      */
    val burstablePerformanceSupported: Boolean
    
    /**
      * `true`  if the instance type is a current generation.
      */
    val currentGeneration: Boolean
    
    /**
      * `true` if Dedicated Hosts are supported on the instance type.
      */
    val dedicatedHostsSupported: Boolean
    
    /**
      * The default number of cores for the instance type.
      */
    val defaultCores: Double
    
    /**
      * The  default  number of threads per core for the instance type.
      */
    val defaultThreadsPerCore: Double
    
    /**
      * The default number of vCPUs for the instance type.
      */
    val defaultVcpus: Double
    
    /**
      * Indicates whether Amazon EBS encryption is supported.
      */
    val ebsEncryptionSupport: String
    
    /**
      * Indicates whether non-volatile memory express (NVMe) is supported.
      */
    val ebsNvmeSupport: String
    
    /**
      * Indicates that the instance type is Amazon EBS-optimized.
      */
    val ebsOptimizedSupport: String
    
    /**
      * The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.
      */
    val ebsPerformanceBaselineBandwidth: Double
    
    /**
      * The baseline input/output storage operations per seconds for an EBS-optimized instance type.
      */
    val ebsPerformanceBaselineIops: Double
    
    /**
      * The baseline throughput performance for an EBS-optimized instance type, in MBps.
      */
    val ebsPerformanceBaselineThroughput: Double
    
    /**
      * The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.
      */
    val ebsPerformanceMaximumBandwidth: Double
    
    /**
      * The maximum input/output storage operations per second for an EBS-optimized instance type.
      */
    val ebsPerformanceMaximumIops: Double
    
    /**
      * The maximum throughput performance for an EBS-optimized instance type, in MBps.
      */
    val ebsPerformanceMaximumThroughput: Double
    
    /**
      * Indicates whether Elastic Fabric Adapter (EFA) is supported.
      */
    val efaSupported: Boolean
    
    /**
      * Indicates whether Elastic Network Adapter (ENA) is supported.
      */
    val enaSupport: String
    
    /**
      * Describes the FPGA accelerator settings for the instance type.
      * * `fpgas.#.count` - The count of FPGA accelerators for the instance type.
      * * `fpgas.#.manufacturer` - The manufacturer of the FPGA accelerator.
      * * `fpgas.#.memory_size` - The size (in MiB) for the memory available to the FPGA accelerator.
      * * `fpgas.#.name` - The name of the FPGA accelerator.
      */
    val fpgas: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeFpga]
    
    /**
      * `true` if the instance type is eligible for the free tier.
      */
    val freeTierEligible: Boolean
    
    /**
      * Describes the GPU accelerators for the instance type.
      * * `gpus.#.count` - The number of GPUs for the instance type.
      * * `gpus.#.manufacturer` - The manufacturer of the GPU accelerator.
      * * `gpus.#.memory_size` - The size (in MiB) for the memory available to the GPU accelerator.
      * * `gpus.#.name` - The name of the GPU accelerator.
      */
    val gpuses: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeGpus]
    
    /**
      * `true` if On-Demand hibernation is supported.
      */
    val hibernationSupported: Boolean
    
    /**
      * Indicates the hypervisor used for the instance type.
      * * `inferenceAccelerators` Describes the Inference accelerators for the instance type.
      * * `inference_accelerators.#.count` - The number of Inference accelerators for the instance type.
      * * `inference_accelerators.#.manufacturer` - The manufacturer of the Inference accelerator.
      * * `inference_accelerators.#.name` - The name of the Inference accelerator.
      */
    val hypervisor: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val inferenceAccelerators: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeInferenceAccelerator]
    
    /**
      * Describes the disks for the instance type.
      * * `instance_disks.#.count` - The number of disks with this configuration.
      * * `instance_disks.#.size` - The size of the disk in GB.
      * * `instance_disks.#.type` - The type of disk.
      */
    val instanceDisks: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeInstanceDisk]
    
    /**
      * `true` if instance storage is supported.
      */
    val instanceStorageSupported: Boolean
    
    val instanceType: String
    
    /**
      * `true` if IPv6 is supported.
      */
    val ipv6Supported: Boolean
    
    /**
      * The maximum number of IPv4 addresses per network interface.
      */
    val maximumIpv4AddressesPerInterface: Double
    
    /**
      * The maximum number of IPv6 addresses per network interface.
      */
    val maximumIpv6AddressesPerInterface: Double
    
    /**
      * The maximum number of network interfaces for the instance type.
      */
    val maximumNetworkInterfaces: Double
    
    /**
      * Size of the instance memory, in MiB.
      */
    val memorySize: Double
    
    /**
      * Describes the network performance.
      */
    val networkPerformance: String
    
    /**
      * A list of architectures supported by the instance type.
      */
    val supportedArchitectures: js.Array[String]
    
    /**
      * A list of supported placement groups types.
      */
    val supportedPlacementStrategies: js.Array[String]
    
    /**
      * Indicates the supported root device types.
      */
    val supportedRootDeviceTypes: js.Array[String]
    
    /**
      * Indicates whether the instance type is offered for spot or On-Demand.
      */
    val supportedUsagesClasses: js.Array[String]
    
    /**
      * The supported virtualization types.
      */
    val supportedVirtualizationTypes: js.Array[String]
    
    /**
      * The speed of the processor, in GHz.
      */
    val sustainedClockSpeed: Double
    
    /**
      * The total memory of all FPGA accelerators for the instance type (in MiB).
      */
    val totalFpgaMemory: Double
    
    /**
      * The total size of the memory for the GPU accelerators for the instance type (in MiB).
      */
    val totalGpuMemory: Double
    
    /**
      * The total size of the instance disks, in GB.
      */
    val totalInstanceStorage: Double
    
    /**
      * List of the valid number of cores that can be configured for the instance type.
      */
    val validCores: js.Array[Double]
    
    /**
      * List of the valid number of threads per core that can be configured for the instance type.
      */
    val validThreadsPerCores: js.Array[Double]
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
      fpgas: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeFpga],
      freeTierEligible: Boolean,
      gpuses: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeGpus],
      hibernationSupported: Boolean,
      hypervisor: String,
      id: String,
      inferenceAccelerators: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeInferenceAccelerator],
      instanceDisks: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeInstanceDisk],
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
    implicit class GetInstanceTypeResultMutableBuilder[Self <: GetInstanceTypeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRecoverySupported(value: Boolean): Self = StObject.set(x, "autoRecoverySupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBareMetal(value: Boolean): Self = StObject.set(x, "bareMetal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBurstablePerformanceSupported(value: Boolean): Self = StObject.set(x, "burstablePerformanceSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentGeneration(value: Boolean): Self = StObject.set(x, "currentGeneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDedicatedHostsSupported(value: Boolean): Self = StObject.set(x, "dedicatedHostsSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCores(value: Double): Self = StObject.set(x, "defaultCores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultThreadsPerCore(value: Double): Self = StObject.set(x, "defaultThreadsPerCore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVcpus(value: Double): Self = StObject.set(x, "defaultVcpus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsEncryptionSupport(value: String): Self = StObject.set(x, "ebsEncryptionSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsNvmeSupport(value: String): Self = StObject.set(x, "ebsNvmeSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptimizedSupport(value: String): Self = StObject.set(x, "ebsOptimizedSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsPerformanceBaselineBandwidth(value: Double): Self = StObject.set(x, "ebsPerformanceBaselineBandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsPerformanceBaselineIops(value: Double): Self = StObject.set(x, "ebsPerformanceBaselineIops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsPerformanceBaselineThroughput(value: Double): Self = StObject.set(x, "ebsPerformanceBaselineThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsPerformanceMaximumBandwidth(value: Double): Self = StObject.set(x, "ebsPerformanceMaximumBandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsPerformanceMaximumIops(value: Double): Self = StObject.set(x, "ebsPerformanceMaximumIops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsPerformanceMaximumThroughput(value: Double): Self = StObject.set(x, "ebsPerformanceMaximumThroughput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEfaSupported(value: Boolean): Self = StObject.set(x, "efaSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnaSupport(value: String): Self = StObject.set(x, "enaSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFpgas(value: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeFpga]): Self = StObject.set(x, "fpgas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFpgasVarargs(value: typings.pulumiAws.outputMod.ec2.GetInstanceTypeFpga*): Self = StObject.set(x, "fpgas", js.Array(value :_*))
      
      @scala.inline
      def setFreeTierEligible(value: Boolean): Self = StObject.set(x, "freeTierEligible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGpuses(value: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeGpus]): Self = StObject.set(x, "gpuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGpusesVarargs(value: typings.pulumiAws.outputMod.ec2.GetInstanceTypeGpus*): Self = StObject.set(x, "gpuses", js.Array(value :_*))
      
      @scala.inline
      def setHibernationSupported(value: Boolean): Self = StObject.set(x, "hibernationSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHypervisor(value: String): Self = StObject.set(x, "hypervisor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInferenceAccelerators(value: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeInferenceAccelerator]): Self = StObject.set(x, "inferenceAccelerators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInferenceAcceleratorsVarargs(value: typings.pulumiAws.outputMod.ec2.GetInstanceTypeInferenceAccelerator*): Self = StObject.set(x, "inferenceAccelerators", js.Array(value :_*))
      
      @scala.inline
      def setInstanceDisks(value: js.Array[typings.pulumiAws.outputMod.ec2.GetInstanceTypeInstanceDisk]): Self = StObject.set(x, "instanceDisks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceDisksVarargs(value: typings.pulumiAws.outputMod.ec2.GetInstanceTypeInstanceDisk*): Self = StObject.set(x, "instanceDisks", js.Array(value :_*))
      
      @scala.inline
      def setInstanceStorageSupported(value: Boolean): Self = StObject.set(x, "instanceStorageSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6Supported(value: Boolean): Self = StObject.set(x, "ipv6Supported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumIpv4AddressesPerInterface(value: Double): Self = StObject.set(x, "maximumIpv4AddressesPerInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumIpv6AddressesPerInterface(value: Double): Self = StObject.set(x, "maximumIpv6AddressesPerInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumNetworkInterfaces(value: Double): Self = StObject.set(x, "maximumNetworkInterfaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemorySize(value: Double): Self = StObject.set(x, "memorySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkPerformance(value: String): Self = StObject.set(x, "networkPerformance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedArchitectures(value: js.Array[String]): Self = StObject.set(x, "supportedArchitectures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedArchitecturesVarargs(value: String*): Self = StObject.set(x, "supportedArchitectures", js.Array(value :_*))
      
      @scala.inline
      def setSupportedPlacementStrategies(value: js.Array[String]): Self = StObject.set(x, "supportedPlacementStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedPlacementStrategiesVarargs(value: String*): Self = StObject.set(x, "supportedPlacementStrategies", js.Array(value :_*))
      
      @scala.inline
      def setSupportedRootDeviceTypes(value: js.Array[String]): Self = StObject.set(x, "supportedRootDeviceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedRootDeviceTypesVarargs(value: String*): Self = StObject.set(x, "supportedRootDeviceTypes", js.Array(value :_*))
      
      @scala.inline
      def setSupportedUsagesClasses(value: js.Array[String]): Self = StObject.set(x, "supportedUsagesClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedUsagesClassesVarargs(value: String*): Self = StObject.set(x, "supportedUsagesClasses", js.Array(value :_*))
      
      @scala.inline
      def setSupportedVirtualizationTypes(value: js.Array[String]): Self = StObject.set(x, "supportedVirtualizationTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedVirtualizationTypesVarargs(value: String*): Self = StObject.set(x, "supportedVirtualizationTypes", js.Array(value :_*))
      
      @scala.inline
      def setSustainedClockSpeed(value: Double): Self = StObject.set(x, "sustainedClockSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalFpgaMemory(value: Double): Self = StObject.set(x, "totalFpgaMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalGpuMemory(value: Double): Self = StObject.set(x, "totalGpuMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalInstanceStorage(value: Double): Self = StObject.set(x, "totalInstanceStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidCores(value: js.Array[Double]): Self = StObject.set(x, "validCores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidCoresVarargs(value: Double*): Self = StObject.set(x, "validCores", js.Array(value :_*))
      
      @scala.inline
      def setValidThreadsPerCores(value: js.Array[Double]): Self = StObject.set(x, "validThreadsPerCores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidThreadsPerCoresVarargs(value: Double*): Self = StObject.set(x, "validThreadsPerCores", js.Array(value :_*))
    }
  }
}
