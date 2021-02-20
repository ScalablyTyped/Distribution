package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskStat extends StObject {
  
  var device: String = js.native
  
  var device_number: String = js.native
  
  var device_number_minor: String = js.native
  
  var ios_pending: String = js.native
  
  var ms_io: String = js.native
  
  var ms_reading: String = js.native
  
  var ms_weighted_io: String = js.native
  
  var ms_writing: String = js.native
  
  var reads_completed: String = js.native
  
  var reads_merged: String = js.native
  
  var sectors_read: String = js.native
  
  var sectors_written: String = js.native
  
  var writes_completed: String = js.native
  
  var writes_merged: String = js.native
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
  
  @scala.inline
  implicit class DiskStatMutableBuilder[Self <: DiskStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_number(value: String): Self = StObject.set(x, "device_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_number_minor(value: String): Self = StObject.set(x, "device_number_minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIos_pending(value: String): Self = StObject.set(x, "ios_pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMs_io(value: String): Self = StObject.set(x, "ms_io", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMs_reading(value: String): Self = StObject.set(x, "ms_reading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMs_weighted_io(value: String): Self = StObject.set(x, "ms_weighted_io", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMs_writing(value: String): Self = StObject.set(x, "ms_writing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReads_completed(value: String): Self = StObject.set(x, "reads_completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReads_merged(value: String): Self = StObject.set(x, "reads_merged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectors_read(value: String): Self = StObject.set(x, "sectors_read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectors_written(value: String): Self = StObject.set(x, "sectors_written", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrites_completed(value: String): Self = StObject.set(x, "writes_completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrites_merged(value: String): Self = StObject.set(x, "writes_merged", value.asInstanceOf[js.Any])
  }
}
