package typings
package atPulumiAwsLib.storagegatewayUploadBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadBufferArgs extends js.Object {
  /**
    * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
    */
  val diskId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object UploadBufferArgs {
  @scala.inline
  def apply(
    diskId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    gatewayArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): UploadBufferArgs = {
    val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadBufferArgs]
  }
}

