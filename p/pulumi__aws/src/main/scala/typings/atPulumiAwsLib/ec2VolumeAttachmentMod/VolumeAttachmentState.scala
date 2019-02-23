package typings
package atPulumiAwsLib.ec2VolumeAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeAttachmentState extends js.Object {
  /**
    * The device name to expose to the instance (for
    * example, `/dev/sdh` or `xvdh`)
    */
  val deviceName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Set to `true` if you want to force the
    * volume to detach. Useful if previous attempts failed, but use this option only
    * as a last resort, as this can result in **data loss**. See
    * [Detaching an Amazon EBS Volume from an Instance][1] for more information.
    */
  val forceDetach: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * ID of the Instance to attach to
    */
  val instanceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Set this to true if you do not wish
    * to detach the volume from the instance to which it is attached at destroy
    * time, and instead just remove the attachment from Terraform state. This is
    * useful when destroying an instance which has volumes created by some other
    * means attached.
    */
  val skipDestroy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * ID of the Volume to be attached
    */
  val volumeId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

