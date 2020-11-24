package typings.pulumiAws.getAmiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.GetAmiBlockDeviceMapping
import typings.pulumiAws.outputMod.GetAmiFilter
import typings.pulumiAws.outputMod.GetAmiProductCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAmiResult extends js.Object {
  
  /**
    * The OS architecture of the AMI (ie: `i386` or `x8664`).
    */
  val architecture: String = js.native
  
  /**
    * The ARN of the AMI.
    */
  val arn: String = js.native
  
  /**
    * The block device mappings of the AMI.
    * * `block_device_mappings.#.device_name` - The physical name of the device.
    * * `block_device_mappings.#.ebs.delete_on_termination` - `true` if the EBS volume
    * will be deleted on termination.
    * * `block_device_mappings.#.ebs.encrypted` - `true` if the EBS volume
    * is encrypted.
    * * `block_device_mappings.#.ebs.iops` - `0` if the EBS volume is
    * not a provisioned IOPS image, otherwise the supported IOPS count.
    * * `block_device_mappings.#.ebs.snapshot_id` - The ID of the snapshot.
    * * `block_device_mappings.#.ebs.volume_size` - The size of the volume, in GiB.
    * * `block_device_mappings.#.ebs.volume_type` - The volume type.
    * * `block_device_mappings.#.no_device` - Suppresses the specified device
    * included in the block device mapping of the AMI.
    * * `block_device_mappings.#.virtual_name` - The virtual device name (for
    * instance stores).
    */
  val blockDeviceMappings: js.Array[GetAmiBlockDeviceMapping] = js.native
  
  /**
    * The date and time the image was created.
    */
  val creationDate: String = js.native
  
  /**
    * The description of the AMI that was provided during image
    * creation.
    */
  val description: String = js.native
  
  val executableUsers: js.UndefOr[js.Array[String]] = js.native
  
  val filters: js.UndefOr[js.Array[GetAmiFilter]] = js.native
  
  /**
    * The hypervisor type of the image.
    */
  val hypervisor: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The ID of the AMI. Should be the same as the resource `id`.
    */
  val imageId: String = js.native
  
  /**
    * The location of the AMI.
    */
  val imageLocation: String = js.native
  
  /**
    * The AWS account alias (for example, `amazon`, `self`) or
    * the AWS account ID of the AMI owner.
    */
  val imageOwnerAlias: String = js.native
  
  /**
    * The type of image.
    */
  val imageType: String = js.native
  
  /**
    * The kernel associated with the image, if any. Only applicable
    * for machine images.
    */
  val kernelId: String = js.native
  
  val mostRecent: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the AMI that was provided during image creation.
    */
  val name: String = js.native
  
  val nameRegex: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID of the image owner.
    */
  val ownerId: String = js.native
  
  val owners: js.Array[String] = js.native
  
  /**
    * The value is Windows for `Windows` AMIs; otherwise blank.
    */
  val platform: String = js.native
  
  /**
    * Any product codes associated with the AMI.
    * * `product_codes.#.product_code_id` - The product code.
    * * `product_codes.#.product_code_type` - The type of product code.
    */
  val productCodes: js.Array[GetAmiProductCode] = js.native
  
  /**
    * `true` if the image has public launch permissions.
    */
  val public: Boolean = js.native
  
  /**
    * The RAM disk associated with the image, if any. Only applicable
    * for machine images.
    */
  val ramdiskId: String = js.native
  
  /**
    * The device name of the root device.
    */
  val rootDeviceName: String = js.native
  
  /**
    * The type of root device (ie: `ebs` or `instance-store`).
    */
  val rootDeviceType: String = js.native
  
  /**
    * The snapshot id associated with the root device, if any
    * (only applies to `ebs` root devices).
    */
  val rootSnapshotId: String = js.native
  
  /**
    * Specifies whether enhanced networking is enabled.
    */
  val sriovNetSupport: String = js.native
  
  /**
    * The current state of the AMI. If the state is `available`, the image
    * is successfully registered and can be used to launch an instance.
    */
  val state: String = js.native
  
  /**
    * Describes a state change. Fields are `UNSET` if not available.
    * * `state_reason.code` - The reason code for the state change.
    * * `state_reason.message` - The message for the state change.
    */
  val stateReason: StringDictionary[String] = js.native
  
  /**
    * Any tags assigned to the image.
    * * `tags.#.key` - The key name of the tag.
    * * `tags.#.value` - The value of the tag.
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * The type of virtualization of the AMI (ie: `hvm` or
    * `paravirtual`).
    */
  val virtualizationType: String = js.native
}
object GetAmiResult {
  
  @scala.inline
  def apply(
    architecture: String,
    arn: String,
    blockDeviceMappings: js.Array[GetAmiBlockDeviceMapping],
    creationDate: String,
    description: String,
    hypervisor: String,
    id: String,
    imageId: String,
    imageLocation: String,
    imageOwnerAlias: String,
    imageType: String,
    kernelId: String,
    name: String,
    ownerId: String,
    owners: js.Array[String],
    platform: String,
    productCodes: js.Array[GetAmiProductCode],
    public: Boolean,
    ramdiskId: String,
    rootDeviceName: String,
    rootDeviceType: String,
    rootSnapshotId: String,
    sriovNetSupport: String,
    state: String,
    stateReason: StringDictionary[String],
    tags: StringDictionary[String],
    virtualizationType: String
  ): GetAmiResult = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], blockDeviceMappings = blockDeviceMappings.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hypervisor = hypervisor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], imageLocation = imageLocation.asInstanceOf[js.Any], imageOwnerAlias = imageOwnerAlias.asInstanceOf[js.Any], imageType = imageType.asInstanceOf[js.Any], kernelId = kernelId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], productCodes = productCodes.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], ramdiskId = ramdiskId.asInstanceOf[js.Any], rootDeviceName = rootDeviceName.asInstanceOf[js.Any], rootDeviceType = rootDeviceType.asInstanceOf[js.Any], rootSnapshotId = rootSnapshotId.asInstanceOf[js.Any], sriovNetSupport = sriovNetSupport.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], virtualizationType = virtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiResult]
  }
  
  @scala.inline
  implicit class GetAmiResultOps[Self <: GetAmiResult] (val x: Self) extends AnyVal {
    
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
    def setArchitecture(value: String): Self = this.set("architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: GetAmiBlockDeviceMapping*): Self = this.set("blockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: js.Array[GetAmiBlockDeviceMapping]): Self = this.set("blockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHypervisor(value: String): Self = this.set("hypervisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLocation(value: String): Self = this.set("imageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOwnerAlias(value: String): Self = this.set("imageOwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelId(value: String): Self = this.set("kernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodesVarargs(value: GetAmiProductCode*): Self = this.set("productCodes", js.Array(value :_*))
    
    @scala.inline
    def setProductCodes(value: js.Array[GetAmiProductCode]): Self = this.set("productCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamdiskId(value: String): Self = this.set("ramdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDeviceName(value: String): Self = this.set("rootDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDeviceType(value: String): Self = this.set("rootDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootSnapshotId(value: String): Self = this.set("rootSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSriovNetSupport(value: String): Self = this.set("sriovNetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: StringDictionary[String]): Self = this.set("stateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualizationType(value: String): Self = this.set("virtualizationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutableUsersVarargs(value: String*): Self = this.set("executableUsers", js.Array(value :_*))
    
    @scala.inline
    def setExecutableUsers(value: js.Array[String]): Self = this.set("executableUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutableUsers: Self = this.set("executableUsers", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: GetAmiFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetAmiFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
    
    @scala.inline
    def setNameRegex(value: String): Self = this.set("nameRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameRegex: Self = this.set("nameRegex", js.undefined)
  }
}
