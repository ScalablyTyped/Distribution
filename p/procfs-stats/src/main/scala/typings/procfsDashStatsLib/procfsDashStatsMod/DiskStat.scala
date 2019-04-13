package typings
package procfsDashStatsLib.procfsDashStatsMod

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
    val __obj = js.Dynamic.literal(device = device, device_number = device_number, device_number_minor = device_number_minor, ios_pending = ios_pending, ms_io = ms_io, ms_reading = ms_reading, ms_weighted_io = ms_weighted_io, ms_writing = ms_writing, reads_completed = reads_completed, reads_merged = reads_merged, sectors_read = sectors_read, sectors_written = sectors_written, writes_completed = writes_completed, writes_merged = writes_merged)
  
    __obj.asInstanceOf[DiskStat]
  }
}

