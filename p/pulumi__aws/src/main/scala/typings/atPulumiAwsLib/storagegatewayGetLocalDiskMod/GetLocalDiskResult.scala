package typings
package atPulumiAwsLib.storagegatewayGetLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocalDiskResult extends js.Object {
  /**
    * The disk identifier. e.g. `pci-0000:03:00.0-scsi-0:0:0:0`
    */
  val diskId: java.lang.String
  val diskNode: js.UndefOr[java.lang.String] = js.undefined
  val diskPath: js.UndefOr[java.lang.String] = js.undefined
  val gatewayArn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetLocalDiskResult {
  @scala.inline
  def apply(
    diskId: java.lang.String,
    gatewayArn: java.lang.String,
    id: java.lang.String,
    diskNode: java.lang.String = null,
    diskPath: java.lang.String = null
  ): GetLocalDiskResult = {
    val __obj = js.Dynamic.literal(diskId = diskId, gatewayArn = gatewayArn, id = id)
    if (diskNode != null) __obj.updateDynamic("diskNode")(diskNode)
    if (diskPath != null) __obj.updateDynamic("diskPath")(diskPath)
    __obj.asInstanceOf[GetLocalDiskResult]
  }
}

