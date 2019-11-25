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
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], device_number = device_number.asInstanceOf[js.Any], device_number_minor = device_number_minor.asInstanceOf[js.Any], ios_pending = ios_pending.asInstanceOf[js.Any], ms_io = ms_io.asInstanceOf[js.Any], ms_reading = ms_reading.asInstanceOf[js.Any], ms_weighted_io = ms_weighted_io.asInstanceOf[js.Any], ms_writing = ms_writing.asInstanceOf[js.Any], reads_completed = reads_completed.asInstanceOf[js.Any], reads_merged = reads_merged.asInstanceOf[js.Any], sectors_read = sectors_read.asInstanceOf[js.Any], sectors_written = sectors_written.asInstanceOf[js.Any], writes_completed = writes_completed.asInstanceOf[js.Any], writes_merged = writes_merged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DiskStat]
  }
}

