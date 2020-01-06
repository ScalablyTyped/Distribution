package typings.atPulumiAws.storagegatewayWorkingStorageMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkingStorageArgs extends js.Object {
  /**
    * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
    */
  val diskId: Input[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: Input[String] = js.native
}

object WorkingStorageArgs {
  @scala.inline
  def apply(diskId: Input[String], gatewayArn: Input[String]): WorkingStorageArgs = {
    val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkingStorageArgs]
  }
}

