package typings.atPulumiAws.ec2AmiFromInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.AmiFromInstanceEbsBlockDevice
import typings.atPulumiAws.typesInputMod.ec2.AmiFromInstanceEphemeralBlockDevice
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiFromInstanceArgs extends js.Object {
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]]] = js.native
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]]] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean that overrides the behavior of stopping
    * the instance before snapshotting. This is risky since it may cause a snapshot of an
    * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
    * guarantees that no filesystem writes will be underway at the time of snapshot.
    */
  val snapshotWithoutReboot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The id of the instance to use as the basis of the AMI.
    */
  val sourceInstanceId: Input[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AmiFromInstanceArgs {
  @scala.inline
  def apply(
    sourceInstanceId: Input[String],
    description: Input[String] = null,
    ebsBlockDevices: Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]] = null,
    ephemeralBlockDevices: Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]] = null,
    name: Input[String] = null,
    snapshotWithoutReboot: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null
  ): AmiFromInstanceArgs = {
    val __obj = js.Dynamic.literal(sourceInstanceId = sourceInstanceId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (snapshotWithoutReboot != null) __obj.updateDynamic("snapshotWithoutReboot")(snapshotWithoutReboot.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiFromInstanceArgs]
  }
}

