package typings.pulumiAws.getInstanceTypeMod

import typings.pulumiAws.inputMod.ec2.GetInstanceTypeFpga
import typings.pulumiAws.inputMod.ec2.GetInstanceTypeGpus
import typings.pulumiAws.inputMod.ec2.GetInstanceTypeInferenceAccelerator
import typings.pulumiAws.inputMod.ec2.GetInstanceTypeInstanceDisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceTypeArgs extends js.Object {
  
  /**
    * The default number of cores for the instance type.
    */
  val defaultCores: js.UndefOr[Double] = js.native
  
  /**
    * The  default  number of threads per core for the instance type.
    */
  val defaultThreadsPerCore: js.UndefOr[Double] = js.native
  
  /**
    * Describes the FPGA accelerator settings for the instance type.
    * * `fpgas.#.count` - The count of FPGA accelerators for the instance type.
    * * `fpgas.#.manufacturer` - The manufacturer of the FPGA accelerator.
    * * `fpgas.#.memory_size` - The size (in MiB) for the memory available to the FPGA accelerator.
    * * `fpgas.#.name` - The name of the FPGA accelerator.
    */
  val fpgas: js.UndefOr[js.Array[GetInstanceTypeFpga]] = js.native
  
  /**
    * Describes the GPU accelerators for the instance type.
    * * `gpus.#.count` - The number of GPUs for the instance type.
    * * `gpus.#.manufacturer` - The manufacturer of the GPU accelerator.
    * * `gpus.#.memory_size` - The size (in MiB) for the memory available to the GPU accelerator.
    * * `gpus.#.name` - The name of the GPU accelerator.
    */
  val gpuses: js.UndefOr[js.Array[GetInstanceTypeGpus]] = js.native
  
  /**
    * Indicates the hypervisor used for the instance type.
    * * `inferenceAccelerators` Describes the Inference accelerators for the instance type.
    * * `inference_accelerators.#.count` - The number of Inference accelerators for the instance type.
    * * `inference_accelerators.#.manufacturer` - The manufacturer of the Inference accelerator.
    * * `inference_accelerators.#.name` - The name of the Inference accelerator.
    */
  val hypervisor: js.UndefOr[String] = js.native
  
  val inferenceAccelerators: js.UndefOr[js.Array[GetInstanceTypeInferenceAccelerator]] = js.native
  
  /**
    * Describes the disks for the instance type.
    * * `instance_disks.#.count` - The number of disks with this configuration.
    * * `instance_disks.#.size` - The size of the disk in GB.
    * * `instance_disks.#.type` - The type of disk.
    */
  val instanceDisks: js.UndefOr[js.Array[GetInstanceTypeInstanceDisk]] = js.native
  
  /**
    * Instance
    */
  val instanceType: String = js.native
  
  /**
    * The maximum number of IPv6 addresses per network interface.
    */
  val maximumIpv6AddressesPerInterface: js.UndefOr[Double] = js.native
  
  /**
    * The total memory of all FPGA accelerators for the instance type (in MiB).
    */
  val totalFpgaMemory: js.UndefOr[Double] = js.native
  
  /**
    * The total size of the memory for the GPU accelerators for the instance type (in MiB).
    */
  val totalGpuMemory: js.UndefOr[Double] = js.native
  
  /**
    * The total size of the instance disks, in GB.
    */
  val totalInstanceStorage: js.UndefOr[Double] = js.native
}
object GetInstanceTypeArgs {
  
  @scala.inline
  def apply(instanceType: String): GetInstanceTypeArgs = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeArgs]
  }
  
  @scala.inline
  implicit class GetInstanceTypeArgsOps[Self <: GetInstanceTypeArgs] (val x: Self) extends AnyVal {
    
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
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCores(value: Double): Self = this.set("defaultCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCores: Self = this.set("defaultCores", js.undefined)
    
    @scala.inline
    def setDefaultThreadsPerCore(value: Double): Self = this.set("defaultThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultThreadsPerCore: Self = this.set("defaultThreadsPerCore", js.undefined)
    
    @scala.inline
    def setFpgasVarargs(value: GetInstanceTypeFpga*): Self = this.set("fpgas", js.Array(value :_*))
    
    @scala.inline
    def setFpgas(value: js.Array[GetInstanceTypeFpga]): Self = this.set("fpgas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFpgas: Self = this.set("fpgas", js.undefined)
    
    @scala.inline
    def setGpusesVarargs(value: GetInstanceTypeGpus*): Self = this.set("gpuses", js.Array(value :_*))
    
    @scala.inline
    def setGpuses(value: js.Array[GetInstanceTypeGpus]): Self = this.set("gpuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpuses: Self = this.set("gpuses", js.undefined)
    
    @scala.inline
    def setHypervisor(value: String): Self = this.set("hypervisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHypervisor: Self = this.set("hypervisor", js.undefined)
    
    @scala.inline
    def setInferenceAcceleratorsVarargs(value: GetInstanceTypeInferenceAccelerator*): Self = this.set("inferenceAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setInferenceAccelerators(value: js.Array[GetInstanceTypeInferenceAccelerator]): Self = this.set("inferenceAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferenceAccelerators: Self = this.set("inferenceAccelerators", js.undefined)
    
    @scala.inline
    def setInstanceDisksVarargs(value: GetInstanceTypeInstanceDisk*): Self = this.set("instanceDisks", js.Array(value :_*))
    
    @scala.inline
    def setInstanceDisks(value: js.Array[GetInstanceTypeInstanceDisk]): Self = this.set("instanceDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceDisks: Self = this.set("instanceDisks", js.undefined)
    
    @scala.inline
    def setMaximumIpv6AddressesPerInterface(value: Double): Self = this.set("maximumIpv6AddressesPerInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumIpv6AddressesPerInterface: Self = this.set("maximumIpv6AddressesPerInterface", js.undefined)
    
    @scala.inline
    def setTotalFpgaMemory(value: Double): Self = this.set("totalFpgaMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalFpgaMemory: Self = this.set("totalFpgaMemory", js.undefined)
    
    @scala.inline
    def setTotalGpuMemory(value: Double): Self = this.set("totalGpuMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalGpuMemory: Self = this.set("totalGpuMemory", js.undefined)
    
    @scala.inline
    def setTotalInstanceStorage(value: Double): Self = this.set("totalInstanceStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalInstanceStorage: Self = this.set("totalInstanceStorage", js.undefined)
  }
}
