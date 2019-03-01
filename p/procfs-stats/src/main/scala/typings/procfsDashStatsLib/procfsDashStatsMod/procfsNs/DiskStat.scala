package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskStat extends js.Object {
  var device: java.lang.String
  var device_number: java.lang.String
  var device_number_minor: java.lang.String
  var ios_pending: java.lang.String
  var ms_io: java.lang.String
  var ms_reading: java.lang.String
  var ms_weighted_io: java.lang.String
  var ms_writing: java.lang.String
  var reads_completed: java.lang.String
  var reads_merged: java.lang.String
  var sectors_read: java.lang.String
  var sectors_written: java.lang.String
  var writes_completed: java.lang.String
  var writes_merged: java.lang.String
}

object DiskStat {
  @scala.inline
  def apply(
    device: java.lang.String,
    device_number: java.lang.String,
    device_number_minor: java.lang.String,
    ios_pending: java.lang.String,
    ms_io: java.lang.String,
    ms_reading: java.lang.String,
    ms_weighted_io: java.lang.String,
    ms_writing: java.lang.String,
    reads_completed: java.lang.String,
    reads_merged: java.lang.String,
    sectors_read: java.lang.String,
    sectors_written: java.lang.String,
    writes_completed: java.lang.String,
    writes_merged: java.lang.String
  ): DiskStat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("device_number")(device_number)
    __obj.updateDynamic("device_number_minor")(device_number_minor)
    __obj.updateDynamic("ios_pending")(ios_pending)
    __obj.updateDynamic("ms_io")(ms_io)
    __obj.updateDynamic("ms_reading")(ms_reading)
    __obj.updateDynamic("ms_weighted_io")(ms_weighted_io)
    __obj.updateDynamic("ms_writing")(ms_writing)
    __obj.updateDynamic("reads_completed")(reads_completed)
    __obj.updateDynamic("reads_merged")(reads_merged)
    __obj.updateDynamic("sectors_read")(sectors_read)
    __obj.updateDynamic("sectors_written")(sectors_written)
    __obj.updateDynamic("writes_completed")(writes_completed)
    __obj.updateDynamic("writes_merged")(writes_merged)
    __obj.asInstanceOf[DiskStat]
  }
}

