package typings.atPulumiAws.storagegatewayGetLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocalDiskResult extends js.Object {
  /**
    * The disk identifier. e.g. `pci-0000:03:00.0-scsi-0:0:0:0`
    */
  val diskId: String = js.native
  val diskNode: js.UndefOr[String] = js.native
  val diskPath: js.UndefOr[String] = js.native
  val gatewayArn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetLocalDiskResult {
  @scala.inline
  def apply(diskId: String, gatewayArn: String, id: String, diskNode: String = null, diskPath: String = null): GetLocalDiskResult = {
    val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (diskNode != null) __obj.updateDynamic("diskNode")(diskNode.asInstanceOf[js.Any])
    if (diskPath != null) __obj.updateDynamic("diskPath")(diskPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalDiskResult]
  }
}

