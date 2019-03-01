package typings
package atPulumiAwsLib.storagegatewayGetLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocalDiskArgs extends js.Object {
  /**
    * The device node of the local disk to retrieve. For example, `/dev/sdb`.
    */
  val diskNode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The device path of the local disk to retrieve. For example, `/dev/xvdb` or `/dev/nvme1n1`.
    */
  val diskPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: java.lang.String
}

object GetLocalDiskArgs {
  @scala.inline
  def apply(gatewayArn: java.lang.String, diskNode: java.lang.String = null, diskPath: java.lang.String = null): GetLocalDiskArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gatewayArn")(gatewayArn)
    if (diskNode != null) __obj.updateDynamic("diskNode")(diskNode)
    if (diskPath != null) __obj.updateDynamic("diskPath")(diskPath)
    __obj.asInstanceOf[GetLocalDiskArgs]
  }
}

