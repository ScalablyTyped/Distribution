package typings
package atPulumiAwsLib.getAmiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiResult extends js.Object {
  /**
    * The OS architecture of the AMI (ie: `i386` or `x86_64`).
    */
  val architecture: java.lang.String
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
  val blockDeviceMappings: js.Array[atPulumiAwsLib.Anon_DeviceNameEbsKey]
  /**
    * The date and time the image was created.
    */
  val creationDate: java.lang.String
  /**
    * The description of the AMI that was provided during image
    * creation.
    */
  val description: java.lang.String
  /**
    * The hypervisor type of the image.
    */
  val hypervisor: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ID of the AMI. Should be the same as the resource `id`.
    */
  val imageId: java.lang.String
  /**
    * The location of the AMI.
    */
  val imageLocation: java.lang.String
  /**
    * The AWS account alias (for example, `amazon`, `self`) or
    * the AWS account ID of the AMI owner.
    */
  val imageOwnerAlias: java.lang.String
  /**
    * The type of image.
    */
  val imageType: java.lang.String
  /**
    * The kernel associated with the image, if any. Only applicable
    * for machine images.
    */
  val kernelId: java.lang.String
  /**
    * The name of the AMI that was provided during image creation.
    */
  val name: java.lang.String
  /**
    * The AWS account ID of the image owner.
    */
  val ownerId: java.lang.String
  /**
    * The value is Windows for `Windows` AMIs; otherwise blank.
    */
  val platform: java.lang.String
  /**
    * Any product codes associated with the AMI.
    * * `product_codes.#.product_code_id` - The product code.
    * * `product_codes.#.product_code_type` - The type of product code.
    */
  val productCodes: js.Array[atPulumiAwsLib.Anon_ProductCodeId]
  /**
    * `true` if the image has public launch permissions.
    */
  val public: scala.Boolean
  /**
    * The RAM disk associated with the image, if any. Only applicable
    * for machine images.
    */
  val ramdiskId: java.lang.String
  /**
    * The device name of the root device.
    */
  val rootDeviceName: java.lang.String
  /**
    * The type of root device (ie: `ebs` or `instance-store`).
    */
  val rootDeviceType: java.lang.String
  /**
    * The snapshot id associated with the root device, if any
    * (only applies to `ebs` root devices).
    */
  val rootSnapshotId: java.lang.String
  /**
    * Specifies whether enhanced networking is enabled.
    */
  val sriovNetSupport: java.lang.String
  /**
    * The current state of the AMI. If the state is `available`, the image
    * is successfully registered and can be used to launch an instance.
    */
  val state: java.lang.String
  /**
    * Describes a state change. Fields are `UNSET` if not available.
    * * `state_reason.code` - The reason code for the state change.
    * * `state_reason.message` - The message for the state change.
    */
  val stateReason: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Any tags assigned to the image.
    * * `tags.#.key` - The key name of the tag.
    * * `tags.#.value` - The value of the tag.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The type of virtualization of the AMI (ie: `hvm` or
    * `paravirtual`).
    */
  val virtualizationType: java.lang.String
}

