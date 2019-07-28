package typings.atPulumiAws.storagegatewayGetLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocalDiskArgs extends js.Object {
  /**
    * The device node of the local disk to retrieve. For example, `/dev/sdb`.
    */
  val diskNode: js.UndefOr[String] = js.undefined
  /**
    * The device path of the local disk to retrieve. For example, `/dev/xvdb` or `/dev/nvme1n1`.
    */
  val diskPath: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: String
}

object GetLocalDiskArgs {
  @scala.inline
  def apply(gatewayArn: String, diskNode: String = null, diskPath: String = null): GetLocalDiskArgs = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn)
    if (diskNode != null) __obj.updateDynamic("diskNode")(diskNode)
    if (diskPath != null) __obj.updateDynamic("diskPath")(diskPath)
    __obj.asInstanceOf[GetLocalDiskArgs]
  }
}

