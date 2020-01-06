package typings.atPulumiAws.getAmiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.GetAmiBlockDeviceMapping
import typings.atPulumiAws.typesOutputMod.GetAmiFilter
import typings.atPulumiAws.typesOutputMod.GetAmiProductCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiResult extends js.Object {
  /**
    * The OS architecture of the AMI (ie: `i386` or `x8664`).
    */
  val architecture: String = js.native
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
    * id is the provider-assigned unique ID for this managed resource.
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
  val stateReason: StringDictionary[js.Any] = js.native
  /**
    * Any tags assigned to the image.
    * * `tags.#.key` - The key name of the tag.
    * * `tags.#.value` - The value of the tag.
    */
  val tags: StringDictionary[js.Any] = js.native
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
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], blockDeviceMappings = blockDeviceMappings.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hypervisor = hypervisor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], imageLocation = imageLocation.asInstanceOf[js.Any], imageOwnerAlias = imageOwnerAlias.asInstanceOf[js.Any], imageType = imageType.asInstanceOf[js.Any], kernelId = kernelId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], productCodes = productCodes.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], ramdiskId = ramdiskId.asInstanceOf[js.Any], rootDeviceName = rootDeviceName.asInstanceOf[js.Any], rootDeviceType = rootDeviceType.asInstanceOf[js.Any], rootSnapshotId = rootSnapshotId.asInstanceOf[js.Any], sriovNetSupport = sriovNetSupport.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], virtualizationType = virtualizationType.asInstanceOf[js.Any])
    if (executableUsers != null) __obj.updateDynamic("executableUsers")(executableUsers.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    if (nameRegex != null) __obj.updateDynamic("nameRegex")(nameRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiResult]
  }
}

