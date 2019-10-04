package typings.atPulumiAws.getAmiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.GetAmiBlockDeviceMapping
import typings.atPulumiAws.typesOutputMod.GetAmiFilter
import typings.atPulumiAws.typesOutputMod.GetAmiProductCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiResult extends js.Object {
  /**
    * The OS architecture of the AMI (ie: `i386` or `x8664`).
    */
  val architecture: String
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
  val blockDeviceMappings: js.Array[GetAmiBlockDeviceMapping]
  /**
    * The date and time the image was created.
    */
  val creationDate: String
  /**
    * The description of the AMI that was provided during image
    * creation.
    */
  val description: String
  val executableUsers: js.UndefOr[js.Array[String]] = js.undefined
  val filters: js.UndefOr[js.Array[GetAmiFilter]] = js.undefined
  /**
    * The hypervisor type of the image.
    */
  val hypervisor: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The ID of the AMI. Should be the same as the resource `id`.
    */
  val imageId: String
  /**
    * The location of the AMI.
    */
  val imageLocation: String
  /**
    * The AWS account alias (for example, `amazon`, `self`) or
    * the AWS account ID of the AMI owner.
    */
  val imageOwnerAlias: String
  /**
    * The type of image.
    */
  val imageType: String
  /**
    * The kernel associated with the image, if any. Only applicable
    * for machine images.
    */
  val kernelId: String
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the AMI that was provided during image creation.
    */
  val name: String
  val nameRegex: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the image owner.
    */
  val ownerId: String
  val owners: js.Array[String]
  /**
    * The value is Windows for `Windows` AMIs; otherwise blank.
    */
  val platform: String
  /**
    * Any product codes associated with the AMI.
    * * `product_codes.#.product_code_id` - The product code.
    * * `product_codes.#.product_code_type` - The type of product code.
    */
  val productCodes: js.Array[GetAmiProductCode]
  /**
    * `true` if the image has public launch permissions.
    */
  val public: Boolean
  /**
    * The RAM disk associated with the image, if any. Only applicable
    * for machine images.
    */
  val ramdiskId: String
  /**
    * The device name of the root device.
    */
  val rootDeviceName: String
  /**
    * The type of root device (ie: `ebs` or `instance-store`).
    */
  val rootDeviceType: String
  /**
    * The snapshot id associated with the root device, if any
    * (only applies to `ebs` root devices).
    */
  val rootSnapshotId: String
  /**
    * Specifies whether enhanced networking is enabled.
    */
  val sriovNetSupport: String
  /**
    * The current state of the AMI. If the state is `available`, the image
    * is successfully registered and can be used to launch an instance.
    */
  val state: String
  /**
    * Describes a state change. Fields are `UNSET` if not available.
    * * `state_reason.code` - The reason code for the state change.
    * * `state_reason.message` - The message for the state change.
    */
  val stateReason: StringDictionary[js.Any]
  /**
    * Any tags assigned to the image.
    * * `tags.#.key` - The key name of the tag.
    * * `tags.#.value` - The value of the tag.
    */
  val tags: StringDictionary[js.Any]
  /**
    * The type of virtualization of the AMI (ie: `hvm` or
    * `paravirtual`).
    */
  val virtualizationType: String
}

object GetAmiResult {
  @scala.inline
  def apply(
    architecture: String,
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
    stateReason: StringDictionary[js.Any],
    tags: StringDictionary[js.Any],
    virtualizationType: String,
    executableUsers: js.Array[String] = null,
    filters: js.Array[GetAmiFilter] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    nameRegex: String = null
  ): GetAmiResult = {
    val __obj = js.Dynamic.literal(architecture = architecture, blockDeviceMappings = blockDeviceMappings, creationDate = creationDate, description = description, hypervisor = hypervisor, id = id, imageId = imageId, imageLocation = imageLocation, imageOwnerAlias = imageOwnerAlias, imageType = imageType, kernelId = kernelId, name = name, ownerId = ownerId, owners = owners, platform = platform, productCodes = productCodes, public = public, ramdiskId = ramdiskId, rootDeviceName = rootDeviceName, rootDeviceType = rootDeviceType, rootSnapshotId = rootSnapshotId, sriovNetSupport = sriovNetSupport, state = state, stateReason = stateReason, tags = tags, virtualizationType = virtualizationType)
    if (executableUsers != null) __obj.updateDynamic("executableUsers")(executableUsers)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (nameRegex != null) __obj.updateDynamic("nameRegex")(nameRegex)
    __obj.asInstanceOf[GetAmiResult]
  }
}

