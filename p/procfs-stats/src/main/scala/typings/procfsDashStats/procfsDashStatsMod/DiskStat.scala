package typings.procfsDashStats.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskStat extends js.Object {
  var device: String
  var device_number: String
  var device_number_minor: String
  var ios_pending: String
  var ms_io: String
  var ms_reading: String
  var ms_weighted_io: String
  var ms_writing: String
  var reads_completed: String
  var reads_merged: String
  var sectors_read: String
  var sectors_written: String
  var writes_completed: String
  var writes_merged: String
}

object DiskStat {
  @scala.inline
  def apply(
    device: String,
    device_number: String,
    device_number_minor: String,
    ios_pending: String,
    ms_io: String,
    ms_reading: String,
    ms_weighted_io: String,
    ms_writing: String,
    reads_completed: String,
    reads_merged: String,
    sectors_read: String,
    sectors_written: String,
    writes_completed: String,
    writes_merged: String
  ): DiskStat = {
    val __obj = js.Dynamic.literal(device = device, device_number = device_number, device_number_minor = device_number_minor, ios_pending = ios_pending, ms_io = ms_io, ms_reading = ms_reading, ms_weighted_io = ms_weighted_io, ms_writing = ms_writing, reads_completed = reads_completed, reads_merged = reads_merged, sectors_read = sectors_read, sectors_written = sectors_written, writes_completed = writes_completed, writes_merged = writes_merged)
  
    __obj.asInstanceOf[DiskStat]
  }
}

