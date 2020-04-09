package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhpAppLayerEbsVolume extends js.Object {
  var encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The path to mount the EBS volume on the layer's instances.
    */
  var mountPoint: Input[String] = js.native
  /**
    * The number of disks to use for the EBS volume.
    */
  var numberOfDisks: Input[Double] = js.native
  /**
    * The RAID level to use for the volume.
    */
  var raidLevel: js.UndefOr[Input[String]] = js.native
  /**
    * The size of the volume in gigabytes.
    */
  var size: Input[Double] = js.native
  /**
    * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object PhpAppLayerEbsVolume {
  @scala.inline
  def apply(
    mountPoint: Input[String],
    numberOfDisks: Input[Double],
    size: Input[Double],
    encrypted: Input[Boolean] = null,
    iops: Input[Double] = null,
    raidLevel: Input[String] = null,
    `type`: Input[String] = null
  ): PhpAppLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint.asInstanceOf[js.Any], numberOfDisks = numberOfDisks.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (raidLevel != null) __obj.updateDynamic("raidLevel")(raidLevel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhpAppLayerEbsVolume]
  }
}

