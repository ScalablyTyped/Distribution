package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  var deviceName: java.lang.String
  var encrypted: scala.Boolean
  var iops: scala.Double
  var noDevice: js.UndefOr[scala.Boolean] = js.undefined
  var snapshotId: java.lang.String
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDevice {
  @scala.inline
  def apply(
    deviceName: java.lang.String,
    encrypted: scala.Boolean,
    iops: scala.Double,
    snapshotId: java.lang.String,
    volumeSize: scala.Double,
    volumeType: java.lang.String,
    deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    noDevice: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceName")(deviceName)
    __obj.updateDynamic("encrypted")(encrypted)
    __obj.updateDynamic("iops")(iops)
    __obj.updateDynamic("snapshotId")(snapshotId)
    __obj.updateDynamic("volumeSize")(volumeSize)
    __obj.updateDynamic("volumeType")(volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    if (!js.isUndefined(noDevice)) __obj.updateDynamic("noDevice")(noDevice)
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncryptedIopsNoDevice]
  }
}

