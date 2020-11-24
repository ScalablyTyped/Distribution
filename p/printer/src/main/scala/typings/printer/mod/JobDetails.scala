package typings.printer.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobDetails extends js.Object {
  
  var completedTime: Date = js.native
  
  var creationTime: Date = js.native
  
  var format: String = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var printerName: String = js.native
  
  var priority: Double = js.native
  
  var processingTime: Date = js.native
  
  var size: Double = js.native
  
  var status: js.Array[JobStatus] = js.native
  
  var user: String = js.native
}
object JobDetails {
  
  @scala.inline
  def apply(
    completedTime: Date,
    creationTime: Date,
    format: String,
    id: Double,
    name: String,
    printerName: String,
    priority: Double,
    processingTime: Date,
    size: Double,
    status: js.Array[JobStatus],
    user: String
  ): JobDetails = {
    val __obj = js.Dynamic.literal(completedTime = completedTime.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], processingTime = processingTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDetails]
  }
  
  @scala.inline
  implicit class JobDetailsOps[Self <: JobDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompletedTime(value: Date): Self = this.set("completedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: Date): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinterName(value: String): Self = this.set("printerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTime(value: Date): Self = this.set("processingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusVarargs(value: JobStatus*): Self = this.set("status", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: js.Array[JobStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
