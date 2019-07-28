package typings.atPulumiAws.storagegatewayWorkingStorageMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkingStorageState extends js.Object {
  /**
    * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
    */
  val diskId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: js.UndefOr[Input[String]] = js.undefined
}

object WorkingStorageState {
  @scala.inline
  def apply(diskId: Input[String] = null, gatewayArn: Input[String] = null): WorkingStorageState = {
    val __obj = js.Dynamic.literal()
    if (diskId != null) __obj.updateDynamic("diskId")(diskId.asInstanceOf[js.Any])
    if (gatewayArn != null) __obj.updateDynamic("gatewayArn")(gatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkingStorageState]
  }
}

