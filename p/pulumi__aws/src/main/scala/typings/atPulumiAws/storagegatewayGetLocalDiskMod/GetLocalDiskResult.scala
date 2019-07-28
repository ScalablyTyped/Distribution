package typings.atPulumiAws.storagegatewayGetLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocalDiskResult extends js.Object {
  /**
    * The disk identifier. e.g. `pci-0000:03:00.0-scsi-0:0:0:0`
    */
  val diskId: String
  val diskNode: js.UndefOr[String] = js.undefined
  val diskPath: js.UndefOr[String] = js.undefined
  val gatewayArn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
}

object GetLocalDiskResult {
  @scala.inline
  def apply(diskId: String, gatewayArn: String, id: String, diskNode: String = null, diskPath: String = null): GetLocalDiskResult = {
    val __obj = js.Dynamic.literal(diskId = diskId, gatewayArn = gatewayArn, id = id)
    if (diskNode != null) __obj.updateDynamic("diskNode")(diskNode)
    if (diskPath != null) __obj.updateDynamic("diskPath")(diskPath)
    __obj.asInstanceOf[GetLocalDiskResult]
  }
}

