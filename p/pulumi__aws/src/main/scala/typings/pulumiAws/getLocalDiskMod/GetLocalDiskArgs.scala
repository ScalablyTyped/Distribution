package typings.pulumiAws.getLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocalDiskArgs extends js.Object {
  /**
    * The device node of the local disk to retrieve. For example, `/dev/sdb`.
    */
  val diskNode: js.UndefOr[String] = js.native
  /**
    * The device path of the local disk to retrieve. For example, `/dev/xvdb` or `/dev/nvme1n1`.
    */
  val diskPath: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: String = js.native
}

object GetLocalDiskArgs {
  @scala.inline
  def apply(gatewayArn: String, diskNode: String = null, diskPath: String = null): GetLocalDiskArgs = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any])
    if (diskNode != null) __obj.updateDynamic("diskNode")(diskNode.asInstanceOf[js.Any])
    if (diskPath != null) __obj.updateDynamic("diskPath")(diskPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalDiskArgs]
  }
}

